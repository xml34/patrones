public class Fabrica{
	protected String tipo;

	public Fabrica(String t){
		tipo=t;
	}

	public Conexion creaConexion(){
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