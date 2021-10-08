package _21_Abstract.Examples.GeometrikSekiller;

import java.util.Scanner;



public class Runner {

	public static void main(String[] args) {
		
		Daire d = new Daire();
		Dikdortgen dd = new Dikdortgen();
		Ucgen u = new Ucgen();
		
		
		
		
		Scanner scan= new Scanner (System.in);
		int islem = 0;
		
		
		do {
			System.out.println("----------------------------------------------------------------");
		System.out.println("Lutfen alanini ya da cevresini hesaplamak istediginiz sekli seciniz: ");
	
		System.out.println("1-Daire \n2-Dikdortgen \n3-Ucgen \n4-Cikis");
		islem = scan.nextInt();
		
		
		
		switch (islem) {
		case 1:
			System.out.println("Dairenin alanini hesaplamak icin 1 cevresini hesaplamak icin 2 giriniz: ");
			String islemNo = scan.next();
			if(islemNo.equals("1")) {
				d.alanHesapla();
			} else {
				d.cevreHesapla();
			}
			
			break;
		case 2:
			System.out.println("Dikdortgenin alanini hesaplamak icin 1 cevresini hesaplamak icin 2 giriniz: ");
			islemNo = scan.next();
			if(islemNo.equals("1")) {
				dd.alanHesapla();
			} else {
				dd.cevreHesapla();
			}
			break;

		case 3:
			System.out.println("Lutfen ucgenin a kenarini giriniz: ");
			double a = scan.nextDouble();
			System.out.println("Lutfen ucgenin b kenarini giriniz: ");
			double b = scan.nextDouble();
			System.out.println("Lutfen ucgenin c kenarini giriniz: ");
			double c = scan.nextDouble();
			System.out.println("Lutfen ucgenin yuksekligini giriniz: ");
			double h = scan.nextDouble();
			
			
			
				if((a==b && b!=c)  || (a==c && b!=a) || (c==b && a!=b)) {
					u.ikizKenarUcgen(a,b,c,h);
				} else if (a!=b && b!=c && a!=c) {
					u.cesitKenarUcgen(a,b,c,h);
				} else if (a==b && b==c) {
					u.eskenarUcgen(a,b,c,h);
				}
			
				
				
				
				
	
			
			
			break;

		}
		}while(islem!=4);

	}

}
