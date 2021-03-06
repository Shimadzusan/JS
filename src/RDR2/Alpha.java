package RDR2;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

class Alpha {
	Web web = new Web();
	Web2 web2 = new Web2();
	Alpha() {
		long start_time_alpha = System.currentTimeMillis();
//VACANCY
		String[] address = new String[9];
	
		address[0] = "https://hh.ru/search/vacancy?text=Java&only_with_salary=false&specialization=1.221&area=1002&enable_snippets=true&clusters=true&no_magic=true&salary=&from=suggest_post";
		address[1] = "https://hh.ru/search/vacancy?text=C%2B%2B&only_with_salary=false&specialization=1.221&area=1002&enable_snippets=true&clusters=true&no_magic=true&salary=&from=suggest_post";
		address[2] = "https://hh.ru/search/vacancy?text=Java+junior&only_with_salary=false&specialization=1.221&area=1002&enable_snippets=true&clusters=true&no_magic=true&salary=&from=suggest_post";
		
		address[3] = "https://hh.ru/search/vacancy?text=Java&only_with_salary=false&specialization=1.221&area=1&enable_snippets=true&clusters=true&no_magic=true&salary=&from=suggest_post";
		address[4] = "https://hh.ru/search/vacancy?text=C%2B%2B&only_with_salary=false&specialization=1.221&area=1&enable_snippets=true&clusters=true&no_magic=true&salary=&from=suggest_post";
		address[5] = "https://hh.ru/search/vacancy?text=Java+junior&only_with_salary=false&specialization=1.221&area=1&enable_snippets=true&clusters=true&no_magic=true&salary=&from=suggest_post";
		
		address[6] = "https://hh.ru/search/vacancy?text=Java&only_with_salary=false&specialization=1.221&area=2&enable_snippets=true&clusters=true&no_magic=true&salary=&from=suggest_post";
		address[7] = "https://hh.ru/search/vacancy?text=C%2B%2B&only_with_salary=false&specialization=1.221&area=2&enable_snippets=true&clusters=true&no_magic=true&salary=&from=suggest_post";
		address[8] = "https://hh.ru/search/vacancy?text=Java+junior&only_with_salary=false&specialization=1.221&area=2&enable_snippets=true&clusters=true&no_magic=true&salary=&from=suggest_post";
		
//RESULT for writing to db
		String[] value = new String[9];
		for(int i = 0; i < address.length; i++) {
			value[i] = method_alpha(address[i]);
		}
		System.out.println(System.currentTimeMillis() - start_time_alpha);
		
//		for(int i = 0; i < value.length; i++) {
//			System.out.println(value[i]);
//		}
//		
//		//RESUME
/////////////////////////////////////////////////////////////////////////////////////////////////
		String[] address_r = new String[9];
		
		address_r[0] = "https://hh.ru/search/resume?text=Java&logic=normal&pos=full_text&exp_period=all_time&specialization=1.221&area=1002&relocation=living_or_relocation&salary_from=&salary_to=&currency_code=RUR&education=none&age_from=&age_to=&gender=unknown&order_by=publication_time&search_period=0&items_on_page=20&from=suggest_post";
		address_r[1] = "https://hh.ru/search/resume?text=C%2B%2B&clusters=true&exp_period=all_time&logic=normal&pos=full_text&order_by=publication_time&specialization=1.221&area=1002&clusters=true&from=suggest_post";
		address_r[2] = "https://hh.ru/search/resume?text=Java+Junior&logic=normal&pos=full_text&exp_period=all_time&specialization=1.221&area=1002&relocation=living_or_relocation&salary_from=&salary_to=&currency_code=RUR&education=none&age_from=&age_to=&gender=unknown&order_by=publication_time&search_period=0&items_on_page=20&from=suggest_post";
		
		address_r[3] = "https://hh.ru/search/resume?text=Java&logic=normal&pos=full_text&exp_period=all_time&specialization=1.221&area=1&relocation=living_or_relocation&salary_from=&salary_to=&currency_code=RUR&education=none&age_from=&age_to=&gender=unknown&order_by=publication_time&search_period=0&items_on_page=20&from=suggest_post";
		address_r[4] = "https://hh.ru/search/resume?text=C%2B%2B&clusters=true&exp_period=all_time&logic=normal&pos=full_text&order_by=publication_time&specialization=1.221&area=1&clusters=true&from=suggest_post";
		address_r[5] = "https://hh.ru/search/resume?text=Java+Junior&logic=normal&pos=full_text&exp_period=all_time&specialization=1.221&area=1&relocation=living_or_relocation&salary_from=&salary_to=&currency_code=RUR&education=none&age_from=&age_to=&gender=unknown&order_by=publication_time&search_period=0&items_on_page=20&from=suggest_post";
		
		address_r[6] = "https://hh.ru/search/resume?text=Java&logic=normal&pos=full_text&exp_period=all_time&specialization=1.221&area=2&relocation=living_or_relocation&salary_from=&salary_to=&currency_code=RUR&education=none&age_from=&age_to=&gender=unknown&order_by=publication_time&search_period=0&items_on_page=20&from=suggest_post";
		address_r[7] = "https://hh.ru/search/resume?text=C%2B%2B&clusters=true&exp_period=all_time&logic=normal&pos=full_text&order_by=publication_time&specialization=1.221&area=2&clusters=true&from=suggest_post";
		address_r[8] = "https://hh.ru/search/resume?text=Java+Junior&logic=normal&pos=full_text&exp_period=all_time&specialization=1.221&area=2&relocation=living_or_relocation&salary_from=&salary_to=&currency_code=RUR&education=none&age_from=&age_to=&gender=unknown&order_by=publication_time&search_period=0&items_on_page=20&from=suggest_post";
		
//Resul for write to data bases
		String[] value_r = new String[9];
		for(int i = 0; i < address_r.length; i++) {
			value_r[i] = method_betta(address_r[i]);
		}
		
//		for(int i = 0; i < value_r.length; i++) {
//			System.out.println(value_r[i]);
//		}
		
//	////////////////////////////////////////////////////////////////////////////////////////////////
//
		System.out.println();
		System.out.println("*********************************************************************");
		System.out.println();
		System.out.println("VACANCY");
		System.out.println("Minsk, Java: " + value[0] + ", C++: " + value[1] + ", Java junior: " + value[2]);
		System.out.println("Moscow, Java: " + value[3] + ", C++:  " + value[4] + ", Java junior: " + value[5]);
		System.out.println("S. Petersburg, Java: " + value[6] + ", C++: " + value[7] + ", Java junior: " + value[8]);
		
		System.out.println("-------------------------------");
		
		System.out.println("RESUME");
		System.out.println("Minsk, Java: " + value_r[0] + ", C++: " + value_r[1] + ", Java junior: " + value_r[2]);
		System.out.println("Moscow, Java: " + value_r[3] + ", C++: " + value_r[4] + ", Java junior: " + value_r[5]);
		System.out.println("S. Petersburg, Java: " + value_r[6] + ", C++: " + value_r[7] + ", Java junior: " + value_r[8]);
		System.out.println();
		System.out.println("*********************************************************************");
		System.out.println();
//		Web_db webdb = new Web_db();
//		webdb.web_db();
		
	}

	private String method_betta(String string) {
		
		web2.web(string);
		
		return web2.s10;
	}

	private String method_alpha(String string) {
		
		web.web(string);
		
		return web.s10;
	}
}