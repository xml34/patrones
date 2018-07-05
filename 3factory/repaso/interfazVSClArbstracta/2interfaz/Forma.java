public abstract class Forma{
	protected int posX,posY;

	protected void mover(int posX,int posY){
		this.posX = posX;
		this.posY = posY;
	}

	protected void dondeEstoy(){
		String lugar = "Estoy en X: " +posX+ 
		" En Y: "+posY;
		System.out.println(lugar);
	}

	protected abstract void dibujar();
	protected abstract void redimensionar();
}