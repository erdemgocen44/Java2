package CoreJavaDay50.day49_Queue_Degue_Maps._04_switchCase;

import java.util.Scanner;

public class Q01 {

	public static void main(String[] args) {
		// Kullan�c�dan notunu al�n ve a�a��daki kurallara g�re ekrana 
		// A, B, C veya D yazd�r�n.
		// 1. 0()dahil ile 50 arasi - D   
		// 2. 50(dahil) ile 60 aras� - C   
		// 3. 60(dahil) ile 80 aras� - B  
		// 4. 80(dahil) ustu- A
		// Yanlis not girilirse ekrana "Gecerli not giriniz" yazdirin
		// switch() kullanarak yapiniz.
		
		// switch() de long kullanilmaz, float kullanilmaz, double kullanilmaz, boolean kullanilmaz.
		// switch() de int, byte, short, char, String kullanilir.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Notunuzu giriniz : ");
		int not = scan.nextInt();
		String   note=scan.nextLine();
		
		if(not>=0 && not<50) {
			//not = 0;
			note="kald�n";
		}else if(not>=50 && not<60){
			//not = 50;
			note="ucuz y�rtt�n";
		}else if(not>=60 && not<80){
		//	not = 60;
			note="ba�ar�l�";
		}else if(not>=80 && not<=100){
			//not = 80;
			note="gayet ba�ar�l�";
		}

		switch(note) {
		
			case "kald�n":
				System.out.println("D");
				break;
			case "ucuz y�rtt�n":
				System.out.println("C");
				break;
			case "ba�ar�l�":
				System.out.println("B");
				break;
			case "gayet ba�ar�l�":
				System.out.println("A");
				break;
		    default:
		    	System.out.println("Gecerli not giriniz");
		    	break;
		}
		scan.close();
	}
}