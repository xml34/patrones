public class ClienteSinFachada{
	private Cpu miCpu;

	public ClienteSinFachada(){
		miCpu =  new Cpu();
	}
	public void encenderCpu(){
		System.out.println("Reviso voltaje");
		miCpu.enviarVoltaje(110);
		System.out.println("Reviso energia en dispositivos");
		miCpu.enviaEnergiaDispositivos();
		System.out.println("reseteo contadores");
		miCpu.reseteaContadores();
		System.out.println("Reviso Bios");
		miCpu.revisaBios();
		System.out.println("Reviso hardware");
		miCpu.revisaHardware();
		System.out.println("asigno canales");
		miCpu.asignaCanales();
		System.out.println("Reviso memoria");
		miCpu.revisaMemoria();
		System.out.println("Reviso entradas");
		miCpu.revisaEntradas();
		System.out.println("busco sector de arranque");
		miCpu.buscaSectorArranque();
		System.out.println("cargo el boot");
		miCpu.cargaBoot();
		System.out.println("cargo S.O.");
		miCpu.cargaSO();

		if(miCpu.cpuLista()){
			System.out.println("Cpu encendida y lista");
		}
	}
	public void trabajar(){
		System.out.println("Comienzo a trabajar con mi cpu");
	}
	public static void main(String args[]){
		ClienteSinFachada cliente = new ClienteSinFachada();
		cliente.encenderCpu();
		cliente.trabajar(); 
	}
}