import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class Web {
	public static String result;
	public static String work;
	public static String symb;
	public static String s10;
	static public int a;

	public static void main(String[] args) {

		System.out.println("метод 1. Извлечение текста");
		//web("Hello");
		System.out.println("метод 2. Поиск комбинации символов Х");
		System.out.println("метод 3. Извлечение комбинации символов");
		System.out.println("метод 4. Распознавание образа, символа, извлечение числа");
		System.out.println("метод 5. Запись числа(значения) в БД");

	}
	
	//Извлечение текста по URL
	
	public static void web(String s){
		
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
//		System.out.println(result); //Вывод текста в консоль
//		System.out.println();
//		System.out.println(result.length());
		
///////////////////////////////////////////////////////////////////////////////
		
		work();
		search();
		extract();
		
		//return("a");
///////////////////////////////////////////////////////////////////////////////////		
		
//		
	}
	
	//ПРЕОБРАЗОВАНИЕ, УДАЛЕНИЕ ПРОБЕЛОВ И ПРИВЕДЕНИЕ К НИЖНЕМУ РЕГИСТРУ
	
	public static void work(){
		
//////////////////////////////LOWER/////////////////////////////////////////////////
	
		String s = result;
		
String j = s;
//String result2 = "";



///////////////////////////////////////////////////////////////////////////////////////////
String[] text5 = s.split(" "); //УДАЛЕНИЕ ПРОБЕЛОВ

for(int i = 0; i < text5.length; i++) {
//System.out.println(text5[i]);
}
//System.out.println(j);
String lower = j.toLowerCase();
//System.out.println(lower + "I am LOWER");
String [] kk = lower.split(" ");
System.out.println("------------------------------");
for(int i = 0; i < kk.length; i++) {
//System.out.println(kk[i]+" ooo");
work = work + kk[i];

// work - это текст без пробелов с нижним регистром


}

	//System.out.println(work);	
	}
	
	//Поиск
	
	public static void search(){
		
		char[] mass = work.toCharArray();
//		int sir = 0;
//		int rus = 0;
//		int us = 0;
//		int am = 0;
		String s1 = "";
		
		for(int i = 0; i < mass.length; i++){
			//System.out.println("Im SYRIA");
			//!!! СИРИЯ !!!
			//накарте307вакансий
			
				if(mass[i] == 'н' && mass[i+1] == 'а' && mass[i+2] == 'к' && mass[i+3] == 'а' && mass[i+4] == 'р' && mass[i+5] == 'т' && mass[i+6] == 'е'){
					System.out.println("+++ZZZ+++");
					s1 = "" + mass[i] + mass[i+1] + mass[i+2] + mass[i+3] + mass[i+4]+ mass[i+5] + mass[i+6] + mass[i+7] + mass[i+8] + mass[i+9] + mass[i+10] + mass[i+11] + mass[i+12];
					
					//sir++;
				
			}
				
				
				
			}
		
		System.out.println(s1);
		//нашли кусок интересующего нас текста и извлекли его присвоив некоторой переменной String
		symb = s1;
		
	}
	
	public static void extract(){
		
		//из извлеченного куска, что нас интересует извлекается число и преобразуется в тип INT
		
		System.out.println("I am Exemple!");
		//System.out.println(result);
		
		String s5 = "";
		
		char[] mass5 = symb.toCharArray();
		
		for(int i = 0; i < mass5.length; i++){
			
			if(mass5[i] == 'е'){
				if(mass5[i+1] != 'в'){s5 = "" + mass5[i+1];}else{break;}
				if(mass5[i+2] != 'в'){s5 = "" + mass5[i+1] + mass5[i+2];}else{break;}
				if(mass5[i+3] != 'в'){s5 = "" + mass5[i+1] + mass5[i+2] + mass5[i+3];}else{break;}
				if(mass5[i+4] != 'в'){s5 = "" + mass5[i+1] + mass5[i+2] + mass5[i+3] + mass5[i+4];}else{break;}
				if(mass5[i+5] != 'в'){s5 = "" + mass5[i+1] + mass5[i+2] + mass5[i+3] + mass5[i+4] + mass5[i+5];}else{break;}
				
			}
		}
		System.out.println(s5);
		int a = Integer.parseInt(s5);
		System.out.println("I am Integer! ---> " + a);
		s10 = s5;
		
	}

}
