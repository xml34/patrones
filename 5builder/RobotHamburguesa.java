import java.util.*;

public class RobotHamburguesa implements Robot{
	//Lista de acciones a realizar
	List<Integer> acciones; 

	public RobotHamburguesa(){}

	private void iniciar(){
		System.out.println("Iniciando la Hamburguesa");
	}

	private void getIngredientes(){
		System.out.println("Buscando: Pan, Hamburguesa, Salsas");
	}

	private void armar(){
		System.out.println("Armando la Hamburguesa");
	}

	private void revisar(){
		System.out.println("Revisando proceso Hamburguesa");
	}

	private void terminar(){
		System.out.println("ambuerguesa terminada");	
	}

	/*
	metodo sobreescrito encargado de cargar las acciones 
	solicitadas por el builder en tiempo de ejecucion 
	*/
	@Override 
	public void cargaAcciones(List<Integer> accion){
		this.acciones = accion;
	}

	@Override
	public void trabajar(){
		iniciar();
		for(Integer i:acciones){
			switch(i){
				case 1:
					getIngredientes();
				break;

				case 2:
					armar();
				break;

				case 3:
					revisar();
				break;

				default:
					System.out.println("No existe la accion indicada");
			}
		}
		terminar();
	}


}