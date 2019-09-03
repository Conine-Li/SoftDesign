package SQLconnectionAndstatement;

public class MySQLFactory implements DBFactory {
	public Connection createConnection(){
		return new MySQLConection();
	}
	public Statement createStatement(){
		return  new MySQLStatement();
	}
}
