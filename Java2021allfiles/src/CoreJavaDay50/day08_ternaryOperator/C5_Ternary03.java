package CoreJavaDay50.day08_ternaryOperator;

import java.util.Scanner;

public class C5_Ternary03 {

	public static void main(String[] args) {
		// Soru 3 Kullanicidan bir sayi alin ve sayinin mutlak degerini yazdirin

		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen sayi giriniz");
		
		double sayi=scan.nextDouble();
		
		System.out.println(sayi>=0 ? sayi : -1*sayi);
		
		// if ile yapsaydik
		
		if (sayi>=0) {
			System.out.println("Girdiginiz sayinin mutlak degeri : " + sayi);
		}else {
			System.out.println("Girdiginiz sayinin mutlak degeri : " + -sayi);
		}
		
		scan.close();
	}

}
