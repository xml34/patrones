public class Hereda implements Interface{
	public Hereda(){
		saludar();
	}

	@Override
	public void saludar(){
		System.out.println("Hola "+getNombre());
	}

	@Override
	public String getNombre(){
		return miNombre;
	} 

	public static void main(String... args){
		Hereda hereda = new Hereda();
	}
}