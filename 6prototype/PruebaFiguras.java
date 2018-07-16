import java.util.Scanner;
public class PruebaFiguras{
	public static void main(String... args){
		Scanner leer = new Scanner(System.in);
		int opcion, posX,posY;

		Circulo ci = new Circulo();   // crea un circulo
		Cuadrado cu = new Cuadrado(); // y un cuadrado
		Figura figura;

		ci.setNombre("Circulo 1");   // asigna nombre y posicion
		ci.mover(12,34);

		cu.setNombre("Cuadrado 1");  //nombre y posicion
		cu.mover(200,200);

		//muetra las figuras, sus nombre y posiciones
		System.out.println("Estas son las figuras originales: ");
		System.out.println("Circulo: "+ci.getNombre());
		System.out.println("Cuadrado: "+cu.getNombre());
		System.out.println("Estas son las posiciones originales");
		ci.getPosition();
		cu.getPosition();

		//clona la nueva figura
		System.out.println("Digite la opcion que desea clonar");
		System.out.println("Circulo = 1,  else Cuadrado");
		opcion = leer.nextInt();

		if(opcion == 1){
			figura = ci.clonar();
		}else{
			figura = cu.clonar();
		}

		//nuevo nombre y posicion a la figura clonada 
		figura.setNombre(figura.getNombre()+" clonado");
		System.out.println("Digite la nueva posicion en X");
		posX = leer.nextInt();
		System.out.println("Digite la nueva posicion en Y");
		posY = leer.nextInt();
		figura.mover(posX,posY);

		//muestra la figura clonada
		System.out.println("Esta es la figura clonada");
		System.out.println(figura.getNombre());
		System.out.println("Esta es su posicion:");
		figura.getPosition();

		//de nuevo muestra las figuras para conparar con la clonada
		//observar que al modificar la clonada no se afecta las
		//originales 
		System.out.println("Estas son las figuras originales: ");
		System.out.println("Circulo: "+ci.getNombre());
		System.out.println("Cuadrado: "+cu.getNombre());
		System.out.println("Estas son las posiciones originales");
		ci.getPosition();
		cu.getPosition();
	}
}