import java.util.Scanner;

public class Pagos{

	public static void main(String arg[]){
		Scanner sc = new Scanner(System.in);
		FabricaHeredada miFabrica;
		Conexion miConexion;

		System.out.print("Digite la BD (oracle, SqlServer, MySql, postgress): ");
		String tipo = sc.nextLine();

		miFabrica = new FabricaHeredada();
		miConexion = miFabrica.creaConexion(tipo);

		String salida = "Esta conectado con: "+ miConexion.descripcion();
		System.out.println(salida);
	}

}