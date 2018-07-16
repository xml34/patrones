

// la gran caracteristica de esta clase es que no nos interesa saber
// donde se encuentra la clase personaRemota ya que el que se encarga 
// de saberlo es el objeto persona 
public class PruebaProxy{
	PersonaProxy persona;

	public PruebaProxy(){
		persona = new PersonaProxy();
		persona.saludar();
		persona.decirEstado();
		persona.despedirse();
	}
	public static void main(String... args){
		PruebaProxy pp = new PruebaProxy();
	}
}