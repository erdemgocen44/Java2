package _21_Abstract.Examples.GeometrikSekiller;

import java.util.Scanner;

public class Dikdortgen extends Soru1 {

	static Scanner scan = new Scanner(System.in);
	
	@Override
	public void alanHesapla() {
		System.out.println("Dikdortgenin kisa kenarini giriniz: ");
		double kisaKenar = scan.nextDouble();
		System.out.println("Dikdortgenin uzun kenarini giriniz: ");
		double uzunKenar = scan.nextDouble();
		System.out.println("Dikdortgenin alani " + uzunKenar*kisaKenar);
	}

	@Override
	public void cevreHesapla() {
		System.out.println("Dikdortgenin kisa kenarini giriniz: ");
		double kisaKenar = scan.nextDouble();
		System.out.println("Dikdortgenin uzun kenarini giriniz: ");
		double uzunKenar = scan.nextDouble();
		System.out.println("Dikdortgenin alani " + (uzunKenar*kisaKenar)*2);
		
	}

}
