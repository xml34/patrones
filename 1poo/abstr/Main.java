public class Main{
	public static void main(String[] args){
		Planta planta = new Planta();
		AnimalCarnivoro carnivoro = new AnimalCarnivoro();
		AnimalHervivoro herviviro = new AnimalHervivoro();
		//las clases SerVivo y Animal no pueden ser instacciadas
		
		System.out.println("");

		System.out.println("Planta");
		planta.alimentarse();
		System.out.println("");

		System.out.println("Carnivoro");
		carnivoro.alimentarse();
		carnivoro.desplazarse();
		System.out.println("");

		System.out.println("hervivoro");
		herviviro.alimentarse();
		herviviro.desplazarse();
		System.out.println("");	
	}
}