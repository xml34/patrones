public class Fachada{
	private Cpu miCpu;

	public Fachada(){
		miCpu =  new Cpu();
	}
	public void encenderCpu(){
		miCpu.enviarVoltaje(110);
		miCpu.enviaEnergiaDispositivos();
		miCpu.reseteaContadores();
		miCpu.revisaBios();
		miCpu.revisaHardware();
		miCpu.asignaCanales();
		miCpu.revisaMemoria();
		miCpu.revisaEntradas();
		miCpu.buscaSectorArranque();
		miCpu.cargaBoot();
		miCpu.cargaSO();
		if(miCpu.cpuLista()){
			System.out.println("Cpu encendida y lista");
		}
	}
}