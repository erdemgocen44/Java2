package CoreJavaDay50.day03_datacasting_increment;

public class C4_DataCasting02 {

	public static void main(String[] args) {
		
		double sayi1 = 1000.14 ;
		
		int sayi2 = (int) sayi1;
		
		System.out.println("double degisken : " + sayi1); // 1000.14
		System.out.println("int degisken : " + sayi2); //1000
		
		// Java'da explicit narrowing(daralma) data casting yapilirken data kayiplari olabilir
		
		
		byte sayi3 = (byte) sayi2;
		
		System.out.println("byte degisken : " + sayi3);  // -24
		// hatta data kucuk data turune uymasi icin degistirilebilir
		
		// int 2 sayiyi birbirine boldurun ve sonucu yazdirin
		int sayi4= 95;
		int sayi5=10;
		
		
		System.out.println("bolme sonucu : " + sayi4/sayi5);
		
		// bolunen sayi ve bolen sayi ikisi de int ise java sonucu int olarak verir
		
		
		
		double sayi6= 2000;
		
		System.out.println(sayi6/sayi5); // 200.0 --- sayi double oldugu icin virgullu cikar..
		
		
		double sayi7=5;
		
		System.out.println(sayi4/sayi7); // 19.0 
		// saylardan biri int biri de double oldugu icin genis olani otomatik secer.
		
		

	}

}