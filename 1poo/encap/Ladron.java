public class Ladron{
	

	public static void main (String[] args){

		Clase1 c1 = new Clase1();
		Clase2 c2 = new Clase2();
		
		// descomentar y compilar, no podra compillar ya que no puedo rrobar a c2
        //c1.dinero = 0;
        System.out.println("no robé a c1");

        if(c1.getCantidadDinero() > 0){
			c1.setCantidadDinero(0);
			System.out.println("asi toca pedir prestado a c1");
        }

        c2.dinero = 0;
        System.out.println("robé a c2");

		if(c2.getCantidadDinero() > 0){
			c2.setCantidadDinero(0);
			System.out.println("asi toca pedir prestado a c2");
		}
	
	}
}