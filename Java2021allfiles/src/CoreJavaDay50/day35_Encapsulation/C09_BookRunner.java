package CoreJavaDay50.day35_Encapsulation;

import java.util.Scanner;

public class C09_BookRunner {

	public static void main(String[] args) {
		// 3. adimda ise C09_Book icin obje olusturuyorum
		
		C09_Book kitap=new C09_Book();
		
		// 4. adimda scan olustururp 1.kitap ismi ekledim
		// 2. kitabi kullanicidan istedim
		Scanner scan = new Scanner(System.in);

		System.out.print("son okudugunuz kitabi giriniz  : ");
		String kitap2 = scan.nextLine();
		kitap.setBookName("calikusu");
		kitap.setAuthorName(kitap2);
		System.out.println("1. kitabim :" + kitap.getBookName() 
		+ " ikinci kitabim : " + kitap.getAuthorName());

		scan.close();
	}

}
