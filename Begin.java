import java.io.IOException;
import java.sql.SQLException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class Begin {
	
 ///////////////////// BLOCK OF MAIN VARIABLES ////////////////////////////////////
	
/*
 310 156
1509 911
772 508

11-05-2018
 */
	////////first try to commit
	//VACANCY
	
	static String mnsk_java = "https://hh.ru/search/vacancy?text=Java&only_with_salary=false&specialization=1.221&area=1002&enable_snippets=true&clusters=true&no_magic=true&salary=&from=suggest_post";
	static String mnsk_c =    "https://hh.ru/search/vacancy?text=C%2B%2B&only_with_salary=false&specialization=1.221&area=1002&enable_snippets=true&clusters=true&no_magic=true&salary=&from=suggest_post";
	static String mnsk_java_jun = "https://hh.ru/search/vacancy?text=Java+junior&only_with_salary=false&specialization=1.221&area=1002&enable_snippets=true&clusters=true&no_magic=true&salary=&from=suggest_post";
	
	static String msk_java = "https://hh.ru/search/vacancy?text=Java&only_with_salary=false&specialization=1.221&area=1&enable_snippets=true&clusters=true&no_magic=true&salary=&from=suggest_post";
	static String msk_c = "https://hh.ru/search/vacancy?text=C%2B%2B&only_with_salary=false&specialization=1.221&area=1&enable_snippets=true&clusters=true&no_magic=true&salary=&from=suggest_post";
	static String msk_java_jun = "https://hh.ru/search/vacancy?text=Java+junior&only_with_salary=false&specialization=1.221&area=1&enable_snippets=true&clusters=true&no_magic=true&salary=&from=suggest_post";
	
	static String spb_java = "https://hh.ru/search/vacancy?text=Java&only_with_salary=false&specialization=1.221&area=2&enable_snippets=true&clusters=true&no_magic=true&salary=&from=suggest_post";
	static String spb_c = "https://hh.ru/search/vacancy?text=C%2B%2B&only_with_salary=false&specialization=1.221&area=2&enable_snippets=true&clusters=true&no_magic=true&salary=&from=suggest_post";
	static String spb_java_jun = "https://hh.ru/search/vacancy?text=Java+junior&only_with_salary=false&specialization=1.221&area=2&enable_snippets=true&clusters=true&no_magic=true&salary=&from=suggest_post";
	
	//RESULT for writing to db
	static String mnsk_java_bd;
	static String mnsk_c_bd;
	static String mnsk_java_jun_bd;
	
	static String msk_java_bd;
	static String msk_c_bd;
	static String msk_java_jun_bd;
	
	static String spb_java_bd;
	static String spb_c_bd;
	static String spb_java_jun_bd;
	
	//RESUME
/////////////////////////////////////////////////////////////////////////////////////////////////
	
	static String r_mnsk_java = "https://hh.ru/search/resume?text=Java&logic=normal&pos=full_text&exp_period=all_time&specialization=1.221&area=1002&relocation=living_or_relocation&salary_from=&salary_to=&currency_code=RUR&education=none&age_from=&age_to=&gender=unknown&order_by=publication_time&search_period=0&items_on_page=20&from=suggest_post";
	static String r_mnsk_c = "https://hh.ru/search/resume?text=C%2B%2B&clusters=true&exp_period=all_time&logic=normal&pos=full_text&order_by=publication_time&specialization=1.221&area=1002&clusters=true&from=suggest_post";
	static String r_mnsk_java_jun = "https://hh.ru/search/resume?text=Java+Junior&logic=normal&pos=full_text&exp_period=all_time&specialization=1.221&area=1002&relocation=living_or_relocation&salary_from=&salary_to=&currency_code=RUR&education=none&age_from=&age_to=&gender=unknown&order_by=publication_time&search_period=0&items_on_page=20&from=suggest_post";
	
	static String r_msk_java = "https://hh.ru/search/resume?text=Java&logic=normal&pos=full_text&exp_period=all_time&specialization=1.221&area=1&relocation=living_or_relocation&salary_from=&salary_to=&currency_code=RUR&education=none&age_from=&age_to=&gender=unknown&order_by=publication_time&search_period=0&items_on_page=20&from=suggest_post";
	static String r_msk_c = "https://hh.ru/search/resume?text=C%2B%2B&clusters=true&exp_period=all_time&logic=normal&pos=full_text&order_by=publication_time&specialization=1.221&area=1&clusters=true&from=suggest_post";
	static String r_msk_java_jun = "https://hh.ru/search/resume?text=Java+Junior&logic=normal&pos=full_text&exp_period=all_time&specialization=1.221&area=1&relocation=living_or_relocation&salary_from=&salary_to=&currency_code=RUR&education=none&age_from=&age_to=&gender=unknown&order_by=publication_time&search_period=0&items_on_page=20&from=suggest_post";
	
	static String r_spb_java = "https://hh.ru/search/resume?text=Java&logic=normal&pos=full_text&exp_period=all_time&specialization=1.221&area=2&relocation=living_or_relocation&salary_from=&salary_to=&currency_code=RUR&education=none&age_from=&age_to=&gender=unknown&order_by=publication_time&search_period=0&items_on_page=20&from=suggest_post";
	static String r_spb_c = "https://hh.ru/search/resume?text=C%2B%2B&clusters=true&exp_period=all_time&logic=normal&pos=full_text&order_by=publication_time&specialization=1.221&area=2&clusters=true&from=suggest_post";
	static String r_spb_java_jun = "https://hh.ru/search/resume?text=Java+Junior&logic=normal&pos=full_text&exp_period=all_time&specialization=1.221&area=2&relocation=living_or_relocation&salary_from=&salary_to=&currency_code=RUR&education=none&age_from=&age_to=&gender=unknown&order_by=publication_time&search_period=0&items_on_page=20&from=suggest_post";
	
	//Resul for write to data bases
	
	static String r_mnsk_java_bd;
	static String r_mnsk_c_bd;
	static String r_mnsk_java_jun_bd;
	
	static String r_msk_java_bd;
	static String r_msk_c_bd;
	static String r_msk_java_jun_bd;
	
	static String r_spb_java_bd;
	static String r_spb_c_bd;
	static String r_spb_java_jun_bd;
	
////////////////////////////////////////////////////////////////////////////////////////////////

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
	System.out.println("Hello Universe!");
	

	Web web = new Web();
	
	web.web(mnsk_java);
	mnsk_java_bd = web.s10;
	
	web.web(mnsk_c);
	mnsk_c_bd = web.s10;
	
	web.web(mnsk_java_jun);
	mnsk_java_jun_bd = web.s10;
	
///////////////////////////////////////////////////////////////////////////////////////
	web.web(msk_java);
	msk_java_bd = web.s10;
	
	web.web(msk_c);
	msk_c_bd = web.s10;
	
	web.web(msk_java_jun);
	msk_java_jun_bd = web.s10;
	
	
//////////////////////////////////////////////////////////////////////////////////////
	
	web.web(spb_java);
	spb_java_bd = web.s10;
	
	web.web(spb_c);
	spb_c_bd = web.s10;
	
	web.web(spb_java_jun);
	spb_java_jun_bd = web.s10;
	
////////////////////////////////////RESUME////////////////////////////////////////////
	System.out.println("*BLOCK RESUME*");
	
	Web2 web2 = new Web2();
	
	web2.web(r_mnsk_java);
	r_mnsk_java_bd = web2.s10;
	
	web2.web(r_mnsk_c);
	r_mnsk_c_bd = web2.s10;
	
	web2.web(r_mnsk_java_jun);
	r_mnsk_java_jun_bd = web2.s10;
	
//////////////////////////////////MSK///////////////////////////////////////////////////
	
	web2.web(r_msk_java);
	r_msk_java_bd = web2.s10;
	
	web2.web(r_msk_c);
	r_msk_c_bd = web2.s10;
	
	web2.web(r_msk_java_jun);
	r_msk_java_jun_bd = web2.s10;
	
///////////////////////////////////SPB//////////////////////////////////////////////////
	
	web2.web(r_spb_java);
	r_spb_java_bd = web2.s10;
	
	web2.web(r_spb_c);
	r_spb_c_bd = web2.s10;
	
	web2.web(r_spb_java_jun);
	r_spb_java_jun_bd = web2.s10;
	


//	web.work();
//	web.search();
//	web.extract();
	//web.exemple();
	
	//////////////////////////ÂÛÇÛÂÀÅÌ ÌÅÒÎÄ ÇÀÏÈÑÈ Â ÁÀÇÓ ÄÀÍÍÛÕ!!!
	
	//ÌÅÒÎÄ ÁÀÇÛ ÄÀÍÍÛÕ
	method_db();
	
	}
	
//	public static void Method(){
//		
//String s = mnsk_java;
//	
//	Document doc = null;
//	try {
//		doc = Jsoup.connect(s).get();
//	} catch (IOException e) {
//		e.printStackTrace();
//	}
//	
//	//String title2 = doc.html();
//	////////+++/////////////////////
//	
//	String result = doc.text(); //result ---> Èñõîäíûé òåêñò
//	
//	System.out.println(result);
//	System.out.println();
//	System.out.println(result.length());
////////////////////////////////////////////////CLEAR/////////////////////////////////
//
//	}

	public static void method_db() throws ClassNotFoundException, SQLException{
		System.out.println();
		System.out.println("*********************************************************************");
		System.out.println();
		System.out.println("VACANCY");
		System.out.println("Minsk, Java: " + mnsk_java_bd + ", C++: " + mnsk_c_bd + ", Java junior: " + mnsk_java_jun_bd);
		System.out.println("Moscow, Java: " + msk_java_bd + ", C++:  " + msk_c_bd + ", Java junior: " + msk_java_jun_bd);
		System.out.println("S. Petersburg, Java: " + spb_java_bd + ", C++: " + spb_c_bd + ", Java junior: " + spb_java_jun_bd);
		
		System.out.println("-------------------------------");
		
		System.out.println("RESUME");
		System.out.println("Minsk, Java: " + r_mnsk_java_bd + ", C++: " + r_mnsk_c_bd + ", Java junior: " + r_mnsk_java_jun_bd);

		System.out.println("Moscow, Java: " + r_msk_java_bd + ", C++: " + r_msk_c_bd + ", Java junior: " + r_msk_java_jun_bd);
		System.out.println("S. Petersburg, Java: " + r_spb_java_bd + ", C++: " + r_spb_c_bd + ", Java junior: " + r_spb_java_jun_bd);
		System.out.println();
		System.out.println("*********************************************************************");
		System.out.println();
//		System.out.println(r_msk_java_bd + " " + r_msk_c_bd);
//		System.out.println(r_spb_java_bd + " " + r_spb_c_bd);
//		System.out.println();
//		System.out.println("Junior");
//		//System.out.println("mnsk: " +  + " msk: " + msk_java_jun_bd + " spb: " + spb_java_jun_bd);
//		System.out.println("Junior RESUME");
//		System.out.println("mnsk: " + r_mnsk_java_jun_bd + " msk: " + r_msk_java_jun_bd + " spb: " + r_spb_java_jun_bd);
//		
		/////////////////////////////////////////////////////////////////////////////
		Web_db webdb = new Web_db();
		webdb.web_db();
	}
	
}
