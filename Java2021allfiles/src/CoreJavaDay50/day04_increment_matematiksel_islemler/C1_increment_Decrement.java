package CoreJavaDay50.day04_increment_matematiksel_islemler;

public class C1_increment_Decrement {

	public static void main(String[] args) {
		
		int sayi1=10;
		int sayi2=20;
		
		sayi1-=5;
		sayi2+=10;
		
		System.out.println(sayi2/sayi1);  // cevap neden 6 cikiyor..
		//sayi2 20 idi +10 daha 30 oldu
		//sayi2 artik 30 oldu..
		//sayi1 de 5 oldugu icin 30/5=6 olur..
		
		sayi1*=2;
		sayi2++;
		
		// yazdirmak istersem sayi1 5 idi. balk hafizali oldugu icin 2 yi yani ilki alir. 2 ile carparak 10 bulur
		//sayi2++ ise en son islemde 30 olmustu... 30+1=31 olur
		
		System.out.println(sayi2/sayi1); // sonuc 31/10 dan 3.1 olmaz. tamsayi alir. 3 cevabini verir..
		
		sayi1 /=2 ;
		
		double sayi3 = sayi2/10;  // sayi2 integer oldugundan sayi2/10 isleminin sonucunu java 3 olarak bulur
								  // ama atama islemi yapilirken sayi3 double oldugu icin
								  // bolme isleminin sonucu olan 3'u casting ile 3.0'a cevirir
		
		System.out.println(sayi3);
		
		System.out.println(sayi1 * sayi2); // 155 --- 5*31=155 olur
		System.out.println(sayi1 * sayi3); // 15.0 --- sayi3 3.1 idi ama int double donunce 3.0 alir. 3.0*5=15.0 olur
		
		
		sayi3= (double)sayi2/10; // bir atama islemi varsa java once sag tarafi yapar sonra atama yapar.
		// say�2 31 idi. 31/10=3.1 ama int oldugundan 3 kabul eder.
		// atama yaparken 3.0 olarak asagiya atar.
		
		
		System.out.println(sayi3); // 3.1
		System.out.println(sayi2); // 31 
		System.out.println((double)sayi2); // 31.0
		System.out.println(sayi2); // 31
		
		
		
		sayi2+=0.2;  // sayi2 int, 
		
		System.out.println(sayi2);  // 31 --- 
		// normalde 31+0.2=31.2 olmasi lazimdi ama int oldugu icin 31 olarak kabul eder.
		
		
		
		
		
		
		
		
	}

}