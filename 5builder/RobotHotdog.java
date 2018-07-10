import java.util.*;


public class RobotHotdog implements Robot{
	List<Integer> acciones; 

	public RobotHotdog(){}

	private void start(){
		System.out.println("Iniciando el Hotdog");
	}

	private void getParts(){
		System.out.println("Buscando: Pan, salchicha, Salsas");
	}

	private void build(){
		System.out.println("Armando la Hamburguesa");
	}

	private void check(){
		System.out.println("Revisando proceso Hotdog");
	}

	private void finish(){
		System.out.println("Hotdog terminado");	
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
		start();
		for(Integer i:acciones){
			switch(i){
				case 1:
					getParts();
				break;

				case 2:
					build();
				break;

				case 3:
					check();
				break;

				default:
					System.out.println("No existe la accion indicada");
			}
		}
		finish();
	}
}