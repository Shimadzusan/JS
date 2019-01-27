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
		
		Document doc = null;
		try {
			doc = Jsoup.connect(s).get();
		} catch (IOException e) {
			e.printStackTrace();
		}

			result = doc.text(); //result ---> Исходный текст
//		System.out.println(result); //Вывод текста в консоль
			
///////////////////////////////////////////////////////////////////////////////
		
		work();
		search();
		extract();
			
	}
	
//ПРЕОБРАЗОВАНИЕ, УДАЛЕНИЕ ПРОБЕЛОВ И ПРИВЕДЕНИЕ К НИЖНЕМУ РЕГИСТРУ, для удобства дальнейшего поиска
	
	public static void work(){
//////////////////////////////LOWER/////////////////////////////////////////////////
	
		String s = result;
		
		String j = s;
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
	}
	
	//Поиск
	
	public static void search(){
		
		char[] mass = work.toCharArray();

		String s1 = "";
		
		for(int i = 0; i < mass.length; i++){
			
			//накарте307вакансий
			
				if(mass[i] == 'д' && mass[i+1] == 'р' && mass[i+2] == 'о' && mass[i+3] == 'б' && mass[i+4] == 'н' && mass[i+5] == 'е' && mass[i+6] == 'е'){
					
					s1 = "" + mass[i+7] + mass[i+8] + mass[i+9] + mass[i+10] + mass[i+11]+ mass[i+12];			
			}
			}
		
		//System.out.println(s1);
		//нашли кусок интересующего нас текста и извлекли его присвоив некоторой переменной String
		symb = s1;
		
	}
	
	public static void extract(){
		
		//из извлеченного куска, что нас интересует извлекается число и преобразуется в тип INT
		
		String s5 = "";
		
		char[] mass5 = symb.toCharArray();
		
		for(int i = 0; i < mass5.length; i++){
			
			
				if(Character.isDigit(mass5[i])){
					s5 = s5 + mass5[i];		
			}
		}
		
		int a = Integer.parseInt(s5);
		System.out.println("value: " + a + " ...is extract");
		s10 = s5;
		
	}

}
