public class FabricaHeredada extends FabricaAbs{

	//se implementa el método en esta fabrica específica
	@Override
	protected Conexion creaConexion(String tipo){
		if(tipo.equalsIgnoreCase("Oracle")){
			return new OracleConexion();
		}else if (tipo.equalsIgnoreCase("SqlServer")){
			return new SqlServerConexion();
		}else if (tipo.equalsIgnoreCase("MySql")){
			return new MySqlConexion();
		}else{
			return new PostgresqlConexion();
		}
	}

}