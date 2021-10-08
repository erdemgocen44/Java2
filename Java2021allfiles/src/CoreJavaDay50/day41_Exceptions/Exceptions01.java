package CoreJavaDay50.day41_Exceptions;

import java.util.Scanner;

public class Exceptions01 {

	public static void main(String[] args) {
		
		// Kullanicidan alacaginiz 2 tam sayinin bolumunu yazdiriniz.
		
	Scanner scan=new Scanner(System.in);

	System.out.println("Lutfen iki sayi giriniz : ");
	
	int sayi1=scan.nextInt();
	int sayi2=scan.nextInt();
	
	try {
	System.out.println("Bolum : " + (sayi1/sayi2));
	}catch (ArithmeticException e) {
		System.out.println("Bolme isleminde bolen 0 olamaz");
	}
	scan.close();
	
	
	
	}
	

	

}
