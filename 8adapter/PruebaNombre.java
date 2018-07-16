import java.util.Scanner;

public class PruebaNombre{
	public static void main(String... args){
		Scanner leer = new Scanner(System.in);
		Nombre claseQnoSe = new Nombre();

		System.out.println("SIN ADAPTADOR");
		System.out.println("Digite su nombre y apellido");
		claseQnoSe.setNombreCompleto(leer.nextLine());
		System.out.println();
		System.out.println("Su nombre completo es: ");
		System.out.println(claseQnoSe.getNombreCompleto());

		//_________________________________________________
		System.out.println("CON ADAPTADOR");
		NombreAdapter adaptador = new NombreAdapter();
		System.out.println("Digite su nombre y apellido");
		adaptador.setNombreCompleto(leer.nextLine());
		System.out.println();
		System.out.println("Su nombre completo es: ");
		System.out.println(adaptador.getNombreCompleto());

		System.out.println("	METODOS EXTRA");
		System.out.println("	Su nombre es: ");
		System.out.println("	"+adaptador.getNombre());
		System.out.println("	Su apellido es: ");
		System.out.println("	"+adaptador.getApellidos());

	}
}