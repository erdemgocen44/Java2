package Quiz.Quiz_02;

import java.util.Scanner;

public class Q8_İfStatements01 {

	public static void main(String[] args) {
		/*
		 * Soru 1) Kullanicidan bir tamsayi isteyin ve sayinin tek veya cift oldugunu
		 * yazdirin
		 */

		Scanner scan = new Scanner(System.in);
		System.out.print("Lutfen bir tamsayi giriniz : ");
		int sayi = scan.nextInt();

		if (sayi % 2 == 0 && sayi % 2 != 0) {
			System.out.println("Cift Sayi");
		} else {
			System.out.println("Tek Sayi");

			scan.close();

	}

}
}