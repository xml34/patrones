public class AnimalCarnivoro extends Animal{

	public AnimalCarnivoro(){
		vivo=true;
	}

	@Override
	public void alimentarse(){
		if(vivo)
			System.out.println("me alimento de carne");
	}

	@Override
	public void desplazarse(){
		if(vivo)
			System.out.println("a demás me desplazo pa cazar");
	}
}