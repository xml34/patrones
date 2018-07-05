public final class Singleton{

	private static final Singleton singleton = new Singleton();
	int cont=0;

	private Singleton(){
		System.out.println("Hola, he sido instanciado una sola vez");
	}

	public static Singleton obtenerSingleton(){
		return singleton;
	}

	public void Set(int c){
		cont =c;
	}

	public int Get(){
		return cont;
	}
}