package CoreJavaDay50.day03_datacasting_increment;

import java.util.Scanner;

public class C2_Scanner02 {

	public static void main(String[] args) {
	
		// Soru 7) Kullanicidan ismini alip isminin bas harfini yazdirin.

		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen isminizi giriniz");
		
		char ilkHarf=scan.next().charAt(0);
		
		/* charAt(0) 0 daki char demekmis.. 0 ise burada index demektir.
		 mesela mehmet java da index olarak 5 harflidir. kelimenin ilk harfini 0 olarak alir ikicisine 1 der.
		 */
		
		System.out.println("girdiginiz kelimenin ilk harfi : " + ilkHarf);

		scan.close();
	}

}