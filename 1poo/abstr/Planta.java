public class Planta extends SerVivo {

	public Planta(){
		vivo=true;
	}

	@Override
	public void alimentarse(){
		if(vivo)
			System.out.println("me alimento a través de la fotosintesis");
	}
}
