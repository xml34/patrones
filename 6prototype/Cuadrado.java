public class Cuadrado implements Figura{
	private String nombre;
	private int positionX, positionY;

	public Cuadrado(){}

	@Override
	public void setNombre(String n){
		this.nombre=n;
	}

	@Override
	public String getNombre(){
		return this.nombre;
	}

	@Override
	public void mover(int x, int y){
		this.positionX = x;
		this.positionY = y;
	}

	@Override
	public void getPosition(){
		System.out.println("positionX: "+positionX+" positionY: "+positionY);
	}

	@Override
	public Figura clonar(){
		Figura figura = new Cuadrado();
		figura.setNombre(this.nombre);
		figura.mover(this.positionX,this.positionY);

		return figura; 
	}
}