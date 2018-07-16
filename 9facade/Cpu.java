public class Cpu{
	private int contadores = -1;
	private int memoriaRam = 0;
	private int[] canales = new int[4];
	private boolean voltajeOk, energiaDispositivosOk,
					contadoresOk, biosOk, hardwareOk,
					entradasOk, sectorArranqueOk,
					bootOk, soOk, listoOk;

	public Cpu(){}

	public Boolean enviarVoltaje(int voltaje){
		if(voltaje >= 100 && voltaje <=120){
			voltajeOk = true;
		}
		return voltajeOk;
	}
	public Boolean enviaEnergiaDispositivos(){
		if(voltajeOk){
			energiaDispositivosOk = true;
		}
		return energiaDispositivosOk;
	}
	public Boolean reseteaContadores(){
		if(energiaDispositivosOk){
			contadores =0;
			contadoresOk = true;
		}
		return contadoresOk;
	}
	public Boolean revisaBios(){
		if(voltajeOk && energiaDispositivosOk && contadoresOk){
			biosOk = true;
		}
		return biosOk;
	}
	public Boolean revisaHardware(){
		if(biosOk){
			hardwareOk = true;
		}
		return hardwareOk;
	}
	public void asignaCanales(){
		if(hardwareOk){
			for(int i =0; i<canales.length; i++){
				canales[i] = (i*4);
			}
		}
	}
	public void revisaMemoria(){
		if(canales[1]==4){
			memoriaRam = 2048;
		}
	}
	public Boolean revisaEntradas(){
		if(memoriaRam > 0){
			entradasOk = true;
		}
		return entradasOk;
	}
	public Boolean buscaSectorArranque(){
		if(entradasOk){
			sectorArranqueOk = true;
		}
		return sectorArranqueOk;
	}
	public Boolean cargaBoot(){
		if(sectorArranqueOk){
			bootOk = true;
		}
		return bootOk;
	}
	public Boolean cargaSO(){
		if(bootOk){
			soOk = true;
		}
		return soOk;
	}
	public Boolean cpuLista(){
		if(soOk){
			listoOk = true;
		}
		return listoOk;
	}
}
