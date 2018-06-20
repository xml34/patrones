public class Main{
	public static void main(String[] args){
		Vehiculo misVehiculos[] = new Vehiculo[4];

		misVehiculos[0] = new Vehiculo("87CEFA","NISSAN","A89");
		misVehiculos[1] = new VehiculoTurismo(4,"XML34","HIUNDAY","B14"); //polimorfismo
		misVehiculos[2] = new VehiculoDeportivo(500,"HUI","TOYOTA","J9"); //
		misVehiculos[3] = new VehiculoFurgoneta(2000,"ABC12","AUDI","70");//

		for(Vehiculo vehiculos: misVehiculos){
			System.out.println(vehiculos.mostrarDatos());
		}

	}
}