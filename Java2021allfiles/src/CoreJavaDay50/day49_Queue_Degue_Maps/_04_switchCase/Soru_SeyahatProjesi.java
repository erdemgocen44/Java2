package CoreJavaDay50.day49_Queue_Degue_Maps._04_switchCase;

import java.util.Scanner;

public class Soru_SeyahatProjesi {

	public static void main(String[] args) {

		/*
		 * bulundugunuz yerden, bir yere yolculuk edeceksiniz. 
		 * 1. K�ln veya Frankfurta
		 * gidebilirsiniz. 2. Bilet fiyat� hesab� = Her 20 Km ba��na 5 euro. �rn: (100
		 * km yol. Bilet paras� (100/20)* 5 =25 euro 
		 * �PUCU: toplamTutar, i�lem,
		 * FrankfurtKm, KmBirimFiyat gibi sabit veri tipleri olu�turabilirsiniz.
		 * ��lemlerde direkt bunlar� ca��rabilirsiniz. 
		 * �LK OLARAK; "Nereye yolculuk
		 * etmek istiyorsunuz? (Frankfurt : 60 KM --- K�ln : 80 KM --- (20 KM ba��na 5
		 * euro bilet paras� al�nmaktadir..) yaz�s� gelsin. 
		 * 1. Frankfurt veya K�ln
		 * olarak bir giri� yap�n. (Girdi�iniz sehrin harfleri , girildikten sonra b�y�k
		 * hale gelsin. todo Frankfurt girildiyse, �rn: girdi= Frankfurt case=FRANKFURT:
		 * Rota = Frankfurt yazd�r�n. Frankfurt km hesab� i�lemi yap�n. son olarak
		 * konsolda: Frankfurt 15 Euro yazs�n. 
		 * todo case: K�LN ise "Rota = K�ln"
		 * yazd�r�n. km hesab�na g�re i�lemi yap�n�z. 
		 * son olarak konsolda: K�ln 20 Euro
		 * yazs�n. 2. Sistem bize
		 * "Ka� ki�ilik bilet istiyorsunuz? (Max 2 ki�ilik olabilir):   " sorusunu
		 * sorsun. case:1 ise " 1 ki�ilik " yazd�r�n. (1 ki�ilik se�erseniz bir i�lem
		 * yapman�za gerek kalmaz, bilet �creti yukar�da �oktan belirlenmi� olur.)
		 * case:2 ise "2 ki�ilik " yazd�r�n 2 ki�i i�in bilet fiyat�n� hesaplay�n. todo
		 * Son olarak yolculugunuzu check edin; 
		 * konsolda 
		 * �rn: Frankfurt - 2 Ki�ilik
		 * yazs�n. 1.Bakiyemi belirtin. 
		 * 2.Toplam Tutar� belirtin. 
		 * 3.double paraUstu
		 * olu�turun ve hesaplay�n. 
		 * 4.Double para �st�n� yazd�r�n.
		 */

		Scanner scanner = new Scanner(System.in);

		System.out.println("******** Seyehat Acentemize Ho�geldiniz ********");
		System.out.println("Frankfurt : 60 Km\n" + "K�ln : 80 Km\n" + "20 Km ba��na 5 euro bilet paras� al�nmaktadir.");
		System.out.println("************************************************");

		System.out.print("Nereye yolculuk etmek istiyorsunuz:  ");
		String islem = scanner.nextLine();
		String islem2 = islem.toUpperCase();

		double toplamTutar = 0;
		double bakiye = 100;

		double FrankfurtKm = (60 / 20) * 5;
		double KolnKm = (80 / 20) * 5;

		switch (islem2) {
		default:
			System.out.println("Hatal� giri� yapt�n�z...");
			break;

		case "FRANKFURT":
			System.out.println("Rota = Frankfurt ");
			System.out.println("Frankfurt " + FrankfurtKm + " Euro");

			System.out.print("Ka� ki�ilik bilet istiyorsunuz? (Max 2 ki�ilik olabilir): ");
			String islem3 = scanner.nextLine();

			switch (islem3) {
			case "1":
				System.out.println("1 Ki�ilik");
				System.out.println("�stikamet: Frankfurt - 1 Ki�ilik");
				toplamTutar = FrankfurtKm;
				break;

			case "2":
				System.out.println("2 Ki�ilik");
				toplamTutar = FrankfurtKm * 2;
				System.out.println("�stikamet: Frankfurt - 2 Ki�ilik");
				break;

			default:
				System.out.println("Hatal� giri� yapt�n�z...");
				break;
			}
			System.out.println("Bakiye: " + bakiye);
			System.out.println("Toplam Tutar: " + toplamTutar);
			double paraustu = bakiye - toplamTutar;
			System.out.println("Para �st� = " + paraustu);
			break;

		case "KOLN":
			System.out.println("Rota = Koln ");
			System.out.println("Koln " + KolnKm + " Euro");

			System.out.print("Ka� ki�ilik bilet istiyorsunuz? (Max 2 ki�ilik olabilir): ");
			islem3 = scanner.nextLine();

			switch (islem3) {
			case "1":
				System.out.println("1 Ki�ilik");
				System.out.println("�stikamet: Koln - 1 Ki�ilik");
				toplamTutar = KolnKm;
				break;

			case "2":
				System.out.println("2 Ki�ilik");
				toplamTutar = KolnKm * 2;
				System.out.println("�stikamet: Koln - 2 Ki�ilik");
				break;

			default:
				System.out.println("Hatal� giri� yapt�n�z...");
				break;
			}
			System.out.println("Bakiye: " + bakiye);
			System.out.println("Toplam Tutar: " + toplamTutar);
			paraustu = bakiye - toplamTutar;
			System.out.println("Para �st� = " + paraustu);

		}

		scanner.close();
	}
}