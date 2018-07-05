public class Planta extends SerVivo {

	public Planta(){
		printVivo("Planta");
	}

	@Override
	public void alimentarse(){
		if(vivo)
			System.out.println("me alimento a través de la fotosintesis");
	}
}
