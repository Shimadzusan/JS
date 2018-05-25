

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.sql.Statement;
	import java.util.Date;


	public class Conn20 {
		public static Connection conn;
		public static Statement statmt;
		public static ResultSet resSet;
		//public  static String s = "INSERT INTO 'users' ('time', 'syria', 'russia', 'usa') VALUES ('12:48','Masha', 'Pascha', 'Jok'); ";
		 private static final String SQL = "DELETE FROM users WHERE id = \"3\"";
		
		// --------ПОДКЛЮЧЕНИЕ К БАЗЕ ДАННЫХ--------
		public static void Conn() throws ClassNotFoundException, SQLException 
		   {
			   conn = null;
			   
			   Class.forName("org.sqlite.JDBC");			//Драйвер (java-class) которым мы пользуемся ---> "org.sqlite.JDBC"
			   
			   
			   conn = DriverManager.getConnection("jdbc:sqlite:TEST55.s3db", "root", "123"); //...
			   
			   //передача сведений о подключении к базе данных в виде URL-адреса подключения "jdbc:sqlite:TEST5.s3db"
			   
			   
			   System.out.println("База Подключена!");
		   }
		
		// --------Создание таблицы--------
		
		public static void CreateDB() throws ClassNotFoundException, SQLException
		   {
			//conn.
			
			
			statmt = conn.createStatement();
			statmt.execute("CREATE TABLE if not exists 'users' ('id' INTEGER PRIMARY KEY AUTOINCREMENT, 'time' text, 'v_mnsk_j' text,'v_mnsk_c' text, 'v_mnsk_jj' text, 'v_msk_j' text,  'v_msk_c' text, 'v_msk_jj' text, 'v_spb_j' text, 'v_spb_c' text, 'v_spb_jj' text, 'r_mnsk_j' text,'r_mnsk_c' text, 'r_mnsk_jj' text, 'r_msk_j' text,  'r_msk_c' text, 'r_msk_jj' text, 'r_spb_j' text, 'r_spb_c' text, 'r_spb_jj' text);");
			
			System.out.println("Таблица создана или уже существует.");
		   }
		/*
		// --------Заполнение таблицы--------
		
		public static void WriteDB() throws SQLException
		{
			
			
			
			//////////////////////////////////////////////////////////////////////////////////////
			
			Begin begin = new Begin();
			
			//////////////////////////////////////////////////////////////////////////////////////
			
			Date day = new Date();
			int hours = day.getHours();
			int min = day.getMinutes();
			
			String data_time = hours + ":"+ min;
			
			///////////////////////////////////////////////////////////////////////////////////////
			
			System.out.println("I am Last!!!");
			//Sar sar = new Sar();
			//sar.main(null);
			
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
			
			
			System.out.println();
			System.out.println("*************************************");
			//System.out.println(a + " " + b + " " + c + " " + d);
			
			//String write = "Syria: " + a + "Russia: " + b + "USA: " + c + "America: " + d;
			
			//////////////////////////////////////////////////////////////////////////////////////
			
			String s = "INSERT INTO 'users' ('time', 'v_mnsk_j', 'v_mnsk_c', 'v_mnsk_jj', 'v_msk_j', 'v_msk_c', 'v_msk_jj', 'v_spb_j', 'v_spb_c', 'v_spb_jj', 'r_mnsk_j', 'r_mnsk_c', 'r_mnsk_jj', 'r_msk_j', 'r_msk_c', 'r_msk_jj', 'r_spb_j', 'r_spb_c', 'r_spb_jj') VALUES ('" + data_time + "','" + v_mnsk_j + "', '" + v_mnsk_c + "', '" + v_mnsk_jj + "', '" + v_msk_j + "', '" + v_msk_c + "', '" + v_msk_jj + "', '" + v_spb_j + "', '" + v_spb_c + "', '" + v_spb_jj + "','" + r_mnsk_j + "', '" + r_mnsk_c + "', '" + r_mnsk_jj + "', '" + r_msk_j + "', '" + r_msk_c + "', '" + r_msk_jj + "', '" + r_spb_j + "', '" + r_spb_c + "', '" + r_spb_jj + "'); ";
			
			
			//////////////////////////////////////////////////////////////////////////////////////
			
			//statmt.executeUpdate( "DELETE FROM users WHERE user_id = \"1\"");
			//   "DELETE FROM users WHERE user_id = \"1\""
			 //statmt.executeUpdate(SQL);
				//resSet.deleteRow();
//				String f = "INSERT INTO 'users' ('name', 'adress', 'phone') VALUES ('Petya', 'NY', 4568);";
//			   statmt.execute(f);
//			   statmt.execute("INSERT INTO 'users' ('name', 'phone') VALUES ('Vasya', 321789); ");
			   //statmt.execute("INSERT INTO 'users' ('syria', 'russia', 'usa') VALUES ('Masha', 'Pascha', 'Jok'); ");
			   statmt.execute(s);
//			  
			   System.out.println("Таблица заполнена");
		}
		
		*/
		// -------- Вывод таблицы--------
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
				
				String  v_mnsk_j = resSet.getString("v_mnsk_j");
				String  v_mnsk_c = resSet.getString("v_mnsk_c");
				String  v_mnsk_jj = resSet.getString("v_mnsk_jj");
				
				String  v_msk_j = resSet.getString("v_msk_j");
				String  v_msk_c = resSet.getString("v_msk_c");
				String  v_msk_jj = resSet.getString("v_msk_jj");
				
				String  v_spb_j = resSet.getString("v_spb_j");
				String  v_spb_c = resSet.getString("v_spb_c");
				String  v_spb_jj = resSet.getString("v_spb_jj");
				
				//System.out.println( "(!!!) REAL ID = " + i );
				
				//RESUME
				
				String  r_mnsk_j = resSet.getString("r_mnsk_j");
				String  r_mnsk_c = resSet.getString("r_mnsk_c");
				String  r_mnsk_jj = resSet.getString("r_mnsk_jj");
				
				String  r_msk_j = resSet.getString("r_msk_j");
				String  r_msk_c = resSet.getString("r_msk_c");
				String  r_msk_jj = resSet.getString("r_msk_jj");
				
				String  r_spb_j = resSet.getString("r_spb_j");
				String  r_spb_c = resSet.getString("r_spb_c");
				String  r_spb_jj = resSet.getString("r_spb_jj");
				
				System.out.println();
		 		System.out.println("*********************************************************************");
		 		
				
		         System.out.println( "ID = " + id );
		         System.out.println( "Time = " + time );
		         
		        System.out.println();
		 		System.out.println("VACANCY");
		 		System.out.println("Minsk, Java: " + v_mnsk_j + ", C++: " + v_mnsk_c + ", Java junior: " + v_mnsk_jj);
		 		System.out.println("Moscow, Java: " + v_msk_j + ", C++:  " + v_msk_c + ", Java junior: " + v_msk_jj);
		 		System.out.println("S. Petersburg, Java: " + v_spb_j + ", C++: " + v_spb_c + ", Java junior: " + v_spb_jj);
		 		
		 		System.out.println("-------------------------------");
		 		
		 		System.out.println("RESUME");
		 		System.out.println("Minsk, Java: " + r_mnsk_j + ", C++: " + r_mnsk_c + ", Java junior: " + r_mnsk_jj);
		 		System.out.println("Moscow, Java: " + r_msk_j + ", C++: " + r_msk_c + ", Java junior: " + r_msk_jj);
		 		System.out.println("S. Petersburg, Java: " + r_spb_j + ", C++: " + r_spb_c + ", Java junior: " + r_spb_jj);
		 		System.out.println();
		 		System.out.println("*********************************************************************");
		 		System.out.println();
		         
//		         ///
//		         System.out.println( "Minsk = " + syria );
//		         System.out.println( "Russia = " + russia );
//		         System.out.println( "USA = " + usa );
//		         System.out.println( "America = " + america );
//		         System.out.println();
//		         
//		         if (id ==5) {
//		        	 resSet.deleteRow();
//		         }
			}	
			
			System.out.println("Таблица выведена");
		    }
		
			// --------Закрытие--------
			public static void CloseDB() throws ClassNotFoundException, SQLException
			   {
				conn.close();
				statmt.close();
				resSet.close();
				
				System.out.println("Соединения закрыты");
			   }

	}



