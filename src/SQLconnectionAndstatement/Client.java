package SQLconnectionAndstatement;


public class Client {
	public static void main(String[] args){
		try{
			DBFactory db;
			Connection con;
			Statement state;
			db=(DBFactory)XMLUtil.getBean();
			con=db.createConnection();
			state=db.createStatement();
			con.connect();
			state.executeStatement();
			}catch(Exception ee){
			System.out.println(ee.getMessage());
		}
	}
}
