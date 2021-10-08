package CoreJavaDay50.day10_stringManipulations;

import java.util.Scanner;

public class C5_StringManipulations05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// soru 1; Ailem

		Scanner scan = new Scanner(System.in);

		String name = "javam ile bir kere yaz hep calistir";

		System.out.print("istenilen str : " + name.toUpperCase().charAt(1)
				+ name.substring(6, 9) + name.substring(4, 5));

		scan.close();

	}

}
