package _98_Projects.laptop;

import java.util.Scanner;

public class LaptopRunner {
	
public static void main(String[] args) {
	Scanner scan= new Scanner(System.in);
	Data liste = new Data();
	System.out.println("==========URUN LISTESI=========");
	for (int i = 1100000; i <= 1100008; i++) {
		System.out.println("Urun id : " + i +"\n" + liste.AllData(i));
	}
	
	PriceForOneLaptop f1= new PriceForOneLaptop();
	System.out.print("Lutfen istediginiz urunun id`sini giriniz : ");
	int sayi = f1.GetPrice(scan.nextInt());
	System.out.println();
	System.out.println("Toplam fiyat : " + sayi + "\nIndirimli Fiyat : " + f1.getDiscount(sayi, 20));
}
	
	
}
