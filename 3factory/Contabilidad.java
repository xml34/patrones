import java.util.Scanner;

public class Contabilidad{
	public static 	void main(String args[]){
		Scanner sc = new Scanner(System.in);
		Fabrica miFabrica;
		Conexion miConexion;

		System.out.println("Digite la BD: Oracle SqlServer MySql and defaul postgres");
		String tipo = sc.nextLine();

		miFabrica = new Fabrica(tipo);
		miConexion = miFabrica.creaConexion();

		String salida = "Esta conectado con: "+miConexion.descripcion();
		System.out.println(salida); 
	}
}