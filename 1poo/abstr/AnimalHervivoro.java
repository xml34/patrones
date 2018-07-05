public class AnimalHervivoro extends Animal{

	public AnimalHervivoro(){
		printVivo("Herviv");
	}
	
	@Override
	public void alimentarse(){
		if(vivo)
			System.out.println("me alimento de plantas");
	}

	@Override
	public void desplazarse(){
		if(vivo)
			System.out.println("a demás me desplazo pa huir");
	}
}