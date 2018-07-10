import java.util.*;

public class Builder {

	//robot a construir
	Robot robot;

	//acciones a realizar
	List<Integer> acciones;

	//construcctor que inicializa las opciones vacias
	public Builder(){
		acciones = new ArrayList<Integer>();
	}

	//metodo que crea el robot
	//dependiendo de la solicutud del cliente
	public void setRobot(int i){
		if(i==1){
			robot = new RobotHamburguesa();
		}else if(i==2){
			robot = new RobotHotdog();
		}else{
			System.out.println("Error el Robot no existe, Fin");
			System.exit(0);
		}
	}

	/*
	Metodos que pueden solicitar los clientes
	en tiempo de ejecucion y que organizaran 
	los procesos a realizar el robot
	*/

	public void addGetIngredientes(){
		acciones.add(1);
	}

	public void addArmar(){
		acciones.add(2);
	}

	public void addRevisar(){
		acciones.add(3);
	}

	public void addImposible(){
		acciones.add(99);
	}

	public Robot getRobot(){
		robot.cargaAcciones(acciones);
		return robot;
	}

}