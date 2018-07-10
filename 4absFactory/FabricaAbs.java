public abstract class FabricaAbs{
	public FabricaAbs(){}
		//metodo que será implementado
		//por cada clase hija, y sera especifico
		protected abstract Conexion creaConexion(String tipo);
}