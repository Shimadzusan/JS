import java.sql.SQLException;

public class Analys_db {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		analys_db();
	}
	
public static void analys_db() throws ClassNotFoundException, SQLException {
		
		
		
		Conn20.Conn();
		Conn20.CreateDB();
		//Conn15.WriteDB();
		Conn20.ReadDB();
		Conn20.CloseDB();
	}

}
