package CoreJavaDay50.day41_Exceptions;

import java.util.Scanner;

public class Exceptions02 {

	public static void main(String[] args) {
		// Kullanicidan alacaginiz 2 tam sayinin bolumunu while ile yazdiriniz.
		
		Scanner scan=new Scanner(System.in);
        int count=1;
		while (count<=34) { // 34 kere dongu yap demektir...
	
		System.out.println("Lutfen iki sayi giriniz : ");
		
		int sayi1=scan.nextInt();
		int sayi2=scan.nextInt();
		
		try {
			System.out.println("Bolum : " + (sayi1/sayi2));
			}catch (ArithmeticException e) {
				System.out.println("Bolme isleminde bolen 0 olamaz");
				// hatanin kisa mesaji icin bilgi mesaji soyle yazdirilir.
				System.out.println(e.getMessage());
				// arizanin herseyini yazdirir gormemizi saglar..
				e.printStackTrace();
			}
	
		count++;
		}
       scan.close();
	}

}
