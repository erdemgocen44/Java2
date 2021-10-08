package _21_Abstract.Examples.GeometrikSekiller;

import java.util.Scanner;

public class Daire extends Soru1 {

	static Scanner scan = new Scanner(System.in);
	
	@Override
	public void alanHesapla() {
		System.out.println("Lutfen dairenin yari capini giriniz: ");
		double yariCap = scan.nextDouble();
		System.out.println("Dairenin alanini " + yariCap*yariCap*3.14);
		
	}

	@Override
	public void cevreHesapla() {
		System.out.println("Lutfen dairenin yari capini giriniz: ");
		double yariCap = scan.nextDouble();
		System.out.println("Dairenin alanini " + 2*3.14*yariCap);
		
	}

}
