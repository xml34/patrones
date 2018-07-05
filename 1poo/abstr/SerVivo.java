public abstract class SerVivo {
	public boolean vivo;

	public SerVivo(){vivo=true;}   //Const
	public abstract void alimentarse();  //
	public void printVivo(String w){System.out.println(w+" is alive");}
}