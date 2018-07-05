public class Rectangulo extends Forma{
	public Rectangulo(){
		mover(5,8);
		dondeEstoy();
	}

	@Override
	public void dibujar(){
		System.out.println("drawing a rectangle");
	}

	@Override
	public void redimensionar(){
		System.out.println("im getting bigger");	
	}
}