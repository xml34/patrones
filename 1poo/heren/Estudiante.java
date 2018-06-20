public class Estudiante extends Persona{

	private int codigoEst;
	private float notaFinal;

	public Estudiante(String nombre, String apellido, int edad, int codigoEst, float notaFinal){
		super(nombre,apellido,edad);
		this.codigoEst = codigoEst;
		this.notaFinal = notaFinal;
	}

	public void mostrarDatos(){
		//Este Sys puede usarse si el padre tiene las variables nombre ap, y edad protected

		//System.out.println("Nombre; "+nombre +"/nApellido: "+apellido+"/nEdad: 
		//	"+edad+"/nCodigo "+codigoEst+"/nNota: "+notaFinal);

		System.out.println("Nombre: "+getNombre()+"/n Apellido: "+getApellido()+"/n Edad: "
			+getEdad()+"/n Codigo "+getCodigoEst()+"/n Nota: "+getNotaFinal());
	}

	public int getCodigoEst(){
		return codigoEst;
	}

	public float getNotaFinal(){
		return notaFinal;
	}
}