package CoreJavaDay50.day05_wrapper_concatenation;

public class C2_Concatenation {

	public static void main(String[] args) {

		String str1 = "Hello";
		String str2 = "World";
		int sayi1 = 3;
		int sayi2 = 4;

		// Hello yazdirin

		System.out.println(str1); // Hello
		
		// Hello1 yazdirin
		System.out.println(str1 + (sayi2 - sayi1));

		// Hello 5 World yazdirin

		System.out.println(str1 + " " + ++sayi2 + " " + str2); // sayi2 4 oldugu icin 1 artirdik.

		// Hello34 yazdirin

		System.out.println(str1 + " " + sayi1 + --sayi2); 
		// --sayi2 deme nedenimiz yukarida artirdigi icin 1 dondurmus olduk ki 34 bulabilelim

		// 7World

		System.out.println(sayi1 + sayi2 + str2); // data turu int dir.

		// 34

		System.out.println(sayi1 + "" + sayi2);
		// " " isaretleri arasina bosluk birakmazsan yanyana yazar.. yoksa 3 4 seklinde yazar..
		// data turu string dir.

		// int i String e cevirmek icin method a ihtiyac yok ama istersek
		// kullanabiliriz.
		
		String intdanCevrilen= ""+sayi1; // bu yontem method kullanmadan int'i String'e cevirir
		System.out.println(intdanCevrilen);
		// "" bu isaret stringtir ve toplar 3 cevabini verir..

	}

}

