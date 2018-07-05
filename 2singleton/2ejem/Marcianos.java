public final class Marcianos{
	private static final Marcianos marcianos = new Marcianos();
	private static int cantidad;

	private Marcianos(){
		cantidad = 10;
	} 

	public static Marcianos getMarcianos(){
		return marcianos; 
	}

	public static void derribaMarcianos(){
		System.out.println("Soy el bueno, derrive un marciano");
		if(cantidad>0) cantidad --;
	}

	public static void creaMarcianos(){
		System.out.println("Soy el malo, cree un marciano");
		if(cantidad>0) cantidad ++;
	}

	public static void cuantosQuedan(){
		if(cantidad > 0){
			System.out.println("Quedan: "+cantidad+" marcianos");
		} else {
			System.out.println("Felicidades, Ganaste"); 
		}
	}
}