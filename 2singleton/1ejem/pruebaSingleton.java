
public class pruebaSingleton{
	public static void main (String... args){
		Singleton miSingleton = Singleton.obtenerSingleton();
		Singleton miSingleton1 = Singleton.obtenerSingleton();
		Singleton miSingleton2 = Singleton.obtenerSingleton();
		Singleton miSingleton3 = Singleton.obtenerSingleton();

		miSingleton.Set(5);
		System.out.println(miSingleton.Get());
		System.out.println(miSingleton1.Get());
		System.out.println(miSingleton2.Get());
		System.out.println(miSingleton3.Get());

	}

}