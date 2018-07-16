import java.util.Scanner;

public class PruebaReferencias{
	public static void main(String... args){
		Scanner leer =  new Scanner(System.in);
		String newName;

		Persona uno = new Persona("Daniel");
		System.out.println("El nombre del objeto 1 es: "+uno.getNombre());

		Persona dos = new Persona("");
		dos=uno;
		System.out.println("El nombre del clonado es: "+dos.getNombre());

		System.out.println("Digite nombre para el objeto clonado");
		newName = leer.nextLine();
		dos.setNombre(newName);// se observa que al cambiar a dos cambia uno
		System.out.println("El nombre del clonado es: "+dos.getNombre());
		System.out.println("rayos el nombre del obj1 se altero : "+uno.getNombre());

	}
}