

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.sql.Statement;
	import java.util.Date;


	public class Conn15 {
		public static Connection conn;
		public static Statement statmt;
		public static ResultSet resSet;
		//public  static String s = "INSERT INTO 'users' ('time', 'syria', 'russia', 'usa') VALUES ('12:48','Masha', 'Pascha', 'Jok'); ";
		 private static final String SQL = "DELETE FROM users WHERE id = \"3\"";
		
		// --------����������� � ���� ������--------
		public static void Conn() throws ClassNotFoundException, SQLException 
		   {
			   conn = null;
			   
			   Class.forName("org.sqlite.JDBC");			//������� (java-class) ������� �� ���������� ---> "org.sqlite.JDBC"
			   
			   
			   conn = DriverManager.getConnection("jdbc:sqlite:js2_data_base.s3db", "root", "123"); //...
			      
			   System.out.println("connect to js2_data_base ...complete");
		   }
		
		// --------�������� �������--------
		public static void CreateDB() throws ClassNotFoundException, SQLException
		   {
			//conn.
			
			
			statmt = conn.createStatement();
			statmt.execute("CREATE TABLE if not exists 'users' ('id' INTEGER PRIMARY KEY AUTOINCREMENT, 'time' text, 'v_mnsk_j' text,'v_mnsk_c' text, 'v_mnsk_jj' text, 'v_msk_j' text,  'v_msk_c' text, 'v_msk_jj' text, 'v_spb_j' text, 'v_spb_c' text, 'v_spb_jj' text, 'r_mnsk_j' text,'r_mnsk_c' text, 'r_mnsk_jj' text, 'r_msk_j' text,  'r_msk_c' text, 'r_msk_jj' text, 'r_spb_j' text, 'r_spb_c' text, 'r_spb_jj' text);");
			
		   }
		
		// --------���������� �������--------
		
		public static void WriteDB() throws SQLException
		{
	
			Begin begin = new Begin();
			
			//////////////////////////////////////////////////////////////////////////////////////
			
			Date date = new Date();
			int hours = date.getHours();
			int min = date.getMinutes();
			
			int day = date.getDate();
			int month = date.getMonth();
			String moon = "";
			
			switch(month){
			case 0: moon = "January"; break;
			case 1: moon = "February"; break;
			case 2: moon = "March"; break;
			case 3: moon = "April"; break;
			case 4: moon = "May"; break;
			case 5: moon = "June"; break;
			case 6: moon = "July"; break;
			case 7: moon = "August"; break;
			case 8: moon = "September"; break;
			case 9: moon = "October"; break;
			case 10: moon = "November"; break;
			case 11: moon = "December"; break;
			}
			
			
			//String data_time = hours + ":"+ min;
			String data_time = day + " "+ moon;
			
///////////////////////////////////////////////////////////////////////////////////////
			
			//VACANCY
			
			String v_mnsk_j = begin.mnsk_java_bd;
			String v_mnsk_c = begin.mnsk_c_bd;
			String v_mnsk_jj = begin.mnsk_java_jun_bd;
			
			String v_msk_j = begin.msk_java_bd;
			String v_msk_c = begin.msk_c_bd;
			String v_msk_jj = begin.msk_java_jun_bd;
			
			String v_spb_j = begin.spb_java_bd;
			String v_spb_c = begin.spb_c_bd;
			String v_spb_jj = begin.spb_java_jun_bd;
			
			
			//RESUME
			
			
			String r_mnsk_j = begin.r_mnsk_java_bd;
			String r_mnsk_c = begin.r_mnsk_c_bd;
			String r_mnsk_jj = begin.r_mnsk_java_jun_bd;
			
			String r_msk_j = begin.r_msk_java_bd;
			String r_msk_c = begin.r_msk_c_bd;
			String r_msk_jj = begin.r_msk_java_jun_bd;
			
			String r_spb_j = begin.r_spb_java_bd;
			String r_spb_c = begin.r_spb_c_bd;
			String r_spb_jj = begin.r_spb_java_jun_bd;
			
//////////////////////////////////////////////////////////////////////////////////////
			
			String s = "INSERT INTO 'users' ('time', 'v_mnsk_j', 'v_mnsk_c', 'v_mnsk_jj', 'v_msk_j', 'v_msk_c', 'v_msk_jj', 'v_spb_j', 'v_spb_c', 'v_spb_jj', 'r_mnsk_j', 'r_mnsk_c', 'r_mnsk_jj', 'r_msk_j', 'r_msk_c', 'r_msk_jj', 'r_spb_j', 'r_spb_c', 'r_spb_jj') VALUES ('" + data_time + "','" + v_mnsk_j + "', '" + v_mnsk_c + "', '" + v_mnsk_jj + "', '" + v_msk_j + "', '" + v_msk_c + "', '" + v_msk_jj + "', '" + v_spb_j + "', '" + v_spb_c + "', '" + v_spb_jj + "','" + r_mnsk_j + "', '" + r_mnsk_c + "', '" + r_mnsk_jj + "', '" + r_msk_j + "', '" + r_msk_c + "', '" + r_msk_jj + "', '" + r_spb_j + "', '" + r_spb_c + "', '" + r_spb_jj + "'); ";
			
			   statmt.execute(s);
//			  
			   System.out.println("writing to js2_data_base ...complete");
		}
		
		
		// -------- ����� �������--------
		public static void ReadDB() throws ClassNotFoundException, SQLException
		   {
			// statmt.executeUpdate(SQL);
			resSet = statmt.executeQuery("SELECT * FROM users");
			
			//int i = 0;
			while(resSet.next())
			{
				//i++;
				int id = resSet.getInt("id");
				String  time = resSet.getString("time");
				String  syria = resSet.getString("syria");
				String  russia = resSet.getString("russia");
				String  usa = resSet.getString("usa");
				String  america = resSet.getString("america");
				
				//System.out.println( "(!!!) REAL ID = " + i );
				
		         System.out.println( "ID = " + id );
		         System.out.println( "Time = " + time );
		         System.out.println( "Syria = " + syria );
		         System.out.println( "Russia = " + russia );
		         System.out.println( "USA = " + usa );
		         System.out.println( "America = " + america );
		         System.out.println();
		         
//		         if (id ==5) {
//		        	 resSet.deleteRow();
//		         }
			}	
			
			System.out.println("������� ��������");
		    }
		
			// --------��������--------
			public static void CloseDB() throws ClassNotFoundException, SQLException
			   {
				conn.close();
				statmt.close();
				resSet.close();
				
				System.out.println("js2_data_base is closed");
			   }

	}



