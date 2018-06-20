public class VehiculoTurismo extends Vehiculo{
	private int nPuertas;

	public VehiculoTurismo(int nPuertas,String matricula, String marca, String modelo){
		super(matricula,marca,modelo);
		this.nPuertas = nPuertas;

	}

	public int getnPuertas(){
		return nPuertas;
	}

	@Override
	public String mostrarDatos(){
		return "Matricula: "+matricula+" Marca: "+marca+" Modelo "+modelo+" #Puertas "+nPuertas;
	}

}