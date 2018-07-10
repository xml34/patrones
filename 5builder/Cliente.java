import java.util.Scanner;

public class Cliente{
	public static void main(String... args){
		Scanner leer = new Scanner(System.in);
		Builder constructor = new Builder();
		Robot robot;
		int tipoRobot;

		System.out.println("Digite el tipo de robot");
		System.out.println("Hamburguesa 1, Hotdog 2");
		tipoRobot= leer.nextInt();

		constructor.setRobot(tipoRobot);
		constructor.addRevisar();
		constructor.addImposible();
		constructor.addGetIngredientes();
		constructor.addArmar();
		constructor.addRevisar();

		robot = constructor.getRobot();
		robot.trabajar();

	}
}