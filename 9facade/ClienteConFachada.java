public class ClienteConFachada{
	private Fachada miFachada;

	public ClienteConFachada(){
		miFachada = new Fachada();
	}

	public void encenderCpu(){
		System.out.println("Enciendo cpu..");
		miFachada.encenderCpu();
		System.out.println("Comienzo a trabajar");
	}
	public static void main(String args[]){
		ClienteConFachada ccf = new ClienteConFachada();
		ccf.encenderCpu();
	}
}