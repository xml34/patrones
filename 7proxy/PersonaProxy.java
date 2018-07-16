import java.io.*;
import java.net.*;
/*
utiliza el hilo para enviar la info que se esta solicitando
y estar escuchando permanentemente lo responde el objeto remoto
*/
public class PersonaProxy implements Runnable{
	private Thread thread; //se encarga de estar escuchando las peticiones del proxy
	private Socket socket; //este socket de conexion es para conectarse con el servidor
	private InputStream in; // recibe lo que responda el servidor 
	private PrintWriter salida; //para enviar al servidor las peticiones
	private int character; //vamos a guardar cada uno de los caracteres que nos responda el servidor
	private int permiso = 0; //privado para que Pruebaproxy no lo cambie

	public PersonaProxy(){
		try{
			socket = new Socket("127.0.0.1", 45454);//direccion a intentar conectarse 
			//al servidor y que puerto
			System.out.println("Conectando...");
			in = socket.getInputStream(); //recibimos la conexion del socket del servidor
			salida = new PrintWriter(socket.getOutputStream(),true); //objeto salida de 
			//tipo printWriter con el que vamos a comunicarnos al servidor(lo que vamos
			//a enviarle al servidor)
			thread = new Thread(this);
			thread.start();

		}catch (IOException ioe){
			System.out.println("Error al conectarse: "+ioe.getMessage());
		}
		/*catch (IOException e){
			System.out.println("Error general: "+e.getMessage());
		}*/

		if(socket != null && socket.isConnected()){
			System.out.println("Conectado!!!");	
		}
	}
	@Override
	public void run(){
		try{
			while((character = in.read()) != -1){
				System.out.print((char) character);
			}

		}catch(Exception ex){
			System.out.println(ex.getMessage());
		}
	}

	public void saludar(){
		if(permiso == 1){
			salida.println("saludar");    //le dice que hacer al P.remota	
		}else{
			System.out.println("Ud no tiene los permisos necesarios");
		}
		
	}
	public void decirEstado(){
		salida.println("decirEstado");//le dice que hacer al P.remota
	}
	public void despedirse(){
		salida.println("despedirse");//le dice que hacer al P.remota
	}
}