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

		System.out.println("����� 1. ���������� ������");
		//web("Hello");
		System.out.println("����� 2. ����� ���������� �������� �");
		System.out.println("����� 3. ���������� ���������� ��������");
		System.out.println("����� 4. ������������� ������, �������, ���������� �����");
		System.out.println("����� 5. ������ �����(��������) � ��");

	}
	
	//���������� ������ �� URL
	
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
		
		result = doc.text(); //result ---> �������� �����
//		
//		System.out.println(result); //����� ������ � �������
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
	
	//��������������, �������� �������� � ���������� � ������� ��������
	
	public static void work(){
		
//////////////////////////////LOWER/////////////////////////////////////////////////
	
		String s = result;
		
String j = s;
//String result2 = "";



///////////////////////////////////////////////////////////////////////////////////////////
String[] text5 = s.split(" "); //�������� ��������

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

// work - ��� ����� ��� �������� � ������ ���������


}

	//System.out.println(work);	
	}
	
	//�����
	
	public static void search(){
		
		char[] mass = work.toCharArray();
//		int sir = 0;
//		int rus = 0;
//		int us = 0;
//		int am = 0;
		String s1 = "";
		
		for(int i = 0; i < mass.length; i++){
			//System.out.println("Im SYRIA");
			//!!! ����� !!!
			//�������307��������
			
				if(mass[i] == '�' && mass[i+1] == '�' && mass[i+2] == '�' && mass[i+3] == '�' && mass[i+4] == '�' && mass[i+5] == '�' && mass[i+6] == '�'){
					System.out.println("+++ZZZ+++");
					s1 = "" + mass[i] + mass[i+1] + mass[i+2] + mass[i+3] + mass[i+4]+ mass[i+5] + mass[i+6] + mass[i+7] + mass[i+8] + mass[i+9] + mass[i+10] + mass[i+11] + mass[i+12];
					
					//sir++;
				
			}
				
				
				
			}
		
		System.out.println(s1);
		//����� ����� ������������� ��� ������ � �������� ��� �������� ��������� ���������� String
		symb = s1;
		
	}
	
	public static void extract(){
		
		//�� ������������ �����, ��� ��� ���������� ����������� ����� � ������������� � ��� INT
		
		System.out.println("I am Exemple!");
		//System.out.println(result);
		
		String s5 = "";
		
		char[] mass5 = symb.toCharArray();
		
		for(int i = 0; i < mass5.length; i++){
			
			if(mass5[i] == '�'){
				if(mass5[i+1] != '�'){s5 = "" + mass5[i+1];}else{break;}
				if(mass5[i+2] != '�'){s5 = "" + mass5[i+1] + mass5[i+2];}else{break;}
				if(mass5[i+3] != '�'){s5 = "" + mass5[i+1] + mass5[i+2] + mass5[i+3];}else{break;}
				if(mass5[i+4] != '�'){s5 = "" + mass5[i+1] + mass5[i+2] + mass5[i+3] + mass5[i+4];}else{break;}
				if(mass5[i+5] != '�'){s5 = "" + mass5[i+1] + mass5[i+2] + mass5[i+3] + mass5[i+4] + mass5[i+5];}else{break;}
				
			}
		}
		System.out.println(s5);
		int a = Integer.parseInt(s5);
		System.out.println("I am Integer! ---> " + a);
		s10 = s5;
		
	}

}
