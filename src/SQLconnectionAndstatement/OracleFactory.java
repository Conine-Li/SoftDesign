package SQLconnectionAndstatement;

public class OracleFactory implements DBFactory {
	public Connection createConnection(){
		return new OracleConnection();
		//System.out.print("创建Oracle数据库连接");
	}
	public Statement createStatement(){
		return new OracleStatement();
		//System.out.print("创建Oracle数据库语句");
	}
}
