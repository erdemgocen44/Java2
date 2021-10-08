package CoreJavaDay50.day42_Exceptions01;

import java.util.Scanner;

public class Exceptions10 {
	
	/*
	 * Kullanicidan yasini girmesini isteyin. Kodunuzu kullanici sifirdan kucuk bir
	 * sayi girerse Exception verecek sekilde yazin.
	 */
	@SuppressWarnings("resource")
	
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("sayi giriniz: ");
		int age = scan.nextInt();

		// 1. yol try-cacth kullanmadan

		/*
		 * if (age>=0) { 
		 * System.out.println("yasiniz :"+age);
		 * } else { 
		 * throw new IllegalArgumentException(); } //exceptions firlatip code kirilir
		 */

		// 2. yol try-cacth kullanarak

		try {
			if (age >= 0) {
				System.out.println("yasiniz :" + age);

			} else {
				throw new IllegalArgumentException();// exceptions firlatip code kirilmaz cunku try body devam eder
														// catch calisir
														// 31. satirda javadan rica ediyoruz diyoruz ki benim hatrim icin
														// hata kabul edip catchi calistirir misin
			}

		} catch (IllegalArgumentException e) {

			e.getMessage();

		}

		System.out.println();
		System.out.println("dewamkeee yazisini okuduysan kod bu satira kadar sorunsuz run olmustur...");

		scan.close();
	}

}