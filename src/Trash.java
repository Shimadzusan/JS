import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class Trash {
	public static String result;
	public static String work;
	public static String symb;
	public static String s10;
	static public int a;

	public static void main(String[] args) {

		System.out.println("метод 1. Извлечение текста");
		
	String s = "GET https://api.hh.ru/vacancies/?employer_id=foo";
		
		//String s = mnsk_java;
		
		Document doc = null;
		try {
			doc = Jsoup.connect(s).get();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//String title2 = doc.html();
		////////+++/////////////////////
		
		result = doc.text(); //result ---> Исходный текст
//		
		System.out.println(result); //Вывод текста в консоль
//		System.out.println();
//		System.out.println(result.length());
	}}