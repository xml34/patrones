import java.io.*;
import java.net.*;


//esta clase hace de servidor
public class PersonaRemota implements Runnable{
	private Thread thread; //se encarga de estar escuchando las peticiones del proxy
	private ServerSocket socket; //abre un puerto para escuchar las peticiones que se realizen
	private PrintWriter salida; //se encarga de devolver la info que ejecuta este objeto
	private Socket cammunicationSocket; // se encarga de optener el String que recibamos del obj proxy

	public PersonaRemota(){
		try{
			socket = new ServerSocket(45454);//debe ser un puerto > 1024 que que el resto
			//esta reservado por el S.O.
			cammunicationSocket = socket.accept(); // aceptamos la nonexion
			salida =  new PrintWriter(cammunicationSocket.getOutputStream(), true); //salia
			// devolvera la info que genere este objeto remoto
			thread = new Thread(this);
			thread.start();
		}catch (Exception e){
			System.out.println("Ha ocurrido un error"+e.getMessage());
		}
	}

	//este metodo estará encargado de ejecutar todas la accion del hilo
	@Override
	public void run(){
		String textoEntrada;
		try{
			//usamos el bufferReader para capturar la cadena de caracteres que envia el proxy			
			BufferedReader in = new BufferedReader(new InputStreamReader
				(cammunicationSocket.getInputStream()));
			//mietras exista info en lo que envia el proxy osea != null
			//validamos si la cadena es "saludar", "desisEstado" ó "despedirse"
			while((textoEntrada = in.readLine()) != null){
				if(textoEntrada.equals("saludar")){
					saludar();
				}else if(textoEntrada.equals("decirEstado")){
					decirEstado();
				}else if(textoEntrada.equals("despedirse")){
					despedirse();
				}
			}
		}catch(Exception e){
			System.out.println("Error general"+e.getMessage());
		}
	}

	public void saludar(){
		salida.println("Hola!!!");
	}
	public void decirEstado(){
		salida.println("Feliz! como una lombriz");
	}
	public void despedirse(){
		salida.println("bye bye");
	}

	public static void main(String args[]){
		PersonaRemota pr = new PersonaRemota();
	}
}