public class HeredaAbs extends ClaseAbs{

	public HeredaAbs(){
		darNombre("Cuchey");
		saludar();
		despedirse();
	}

	@Override
	public void despedirse(){
		//nombre = "may"; esto afecta el super y el local
		System.out.println(nombre + " dice adios"+super.nombre);
	}

	public void darNombre(String nombre){
		super.nombre = nombre;
	}

	public static void main(String... args){
		HeredaAbs ha = new HeredaAbs(); 
	}
}