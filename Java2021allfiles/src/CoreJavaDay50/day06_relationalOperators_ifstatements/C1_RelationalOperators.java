package CoreJavaDay50.day06_relationalOperators_ifstatements;

public class C1_RelationalOperators {

	public static void main(String[] args) {

		System.out.println(15 * 3 == 40);// false

		// == isareti gorunce otomatik olaral boolean kabul eder ve cevabi verir..



		boolean sayi = 2 == 5;
		System.out.println(sayi);

	

		boolean sonuc2 = 5+2<=7;
		// kucuktur veya esittir.. ikisinden biri dogru ise true yazar
		System.out.println(sonuc2);

		boolean sonuc3 = 5+2>=7;
		// buruktur veya esittir.. ikisinden biri dogru ise true yazar
		System.out.println(sonuc3);

		boolean sonuc4 = 5 + 2 > 7;
		// buyuk mudur ? hayir esittir olacakti. false
		System.out.println(sonuc4);



		// direk yazdirarak soralim

		boolean sonuc6 = (5 * 2 != 15) && (5 > 7);
		// islemlerden biri yanlis oldugu icin false olur..
		// && isareti mukemmeliyetcidir..
		System.out.println(sonuc6);

		System.out.println(5 + 2 > 8 || 9 < 6); // false

	

	}

}
