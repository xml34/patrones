import java.util.Scanner;

public class Juego{
	

	public static void main(String... args){
		Marcianos marcianos = Marcianos.getMarcianos();
		Computadora computadora= new Computadora();
		Jugador jugador =  new Jugador();
		Scanner sc = new Scanner(System.in);

		int disparos;

		do{
			marcianos.cuantosQuedan();
			System.out.println("Digite los disparos");
			disparos =  sc.nextInt();
			for(int i=0; i<disparos;i++){
				jugador.destruirMarciano();
			}
			computadora.creaMarcianos();
		}while (disparos !=0);
	}
}