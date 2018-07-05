public abstract class ClaseAbs{
	public String nombre;

	public void saludar(){
		System.out.println("Hola" +nombre);   // se hereda
	}

	public abstract void despedirse();		 //  se implementa
}