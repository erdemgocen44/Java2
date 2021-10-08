package CoreJavaDay50.day38_Overriding;

public class Formen extends Isci {

	public String sorumluOldBolum = "Bakim";
	public String isim = "Emrullah";

	public static void main(String[] args) {

		Formen fr1 = new Formen();

		fr1.sorumluOldBolum = "Marangozhane";
		fr1.maas = 10000;

		System.out.println(fr1.isim + " " + fr1.sorumluOldBolum + " " + fr1.maas);
		// Emrullah Marangozhane 10000

		Isci fr2 = new Formen();
		// data turu isci const Formen

		fr2.bolum = "Kaynak Atolyesi";

		System.out.println(fr2.isim + " " + fr2.bolum + " " + fr2.maas);
		// Mesut Kaynak Atolyesi 5000
		// isim cagirirken de data turunden olan class a gider.
		// aradgini orada bulursa alir yoksa parentine gider ordan alir.

		Personel fr3 = new Formen();

		System.out.println(fr3.isim); // Emre

	}

}
