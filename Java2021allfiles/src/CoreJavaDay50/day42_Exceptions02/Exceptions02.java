package CoreJavaDay50.day42_Exceptions02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exceptions02 {
	public static void main(String[] args) {

		try {
			FileInputStream fis = new FileInputStream(
					"C:\\Users\\TOSHIBA-PC\\eclipse-workspace\\java2021Summer Tr\\src\\day42_Exceptions02\\file");
			int k = 0;
			try {
				while ((k = fis.read()) != -1) {
					System.out.print((char)k);
				}
			} catch (IOException e) { // dosyalarla ilgili okuma ve yazma sorunlarini handle eder...
				e.printStackTrace();
			}

		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("");
		System.out.println("kod bloke olmamis");

	}

}
