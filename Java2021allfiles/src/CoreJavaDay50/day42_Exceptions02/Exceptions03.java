package CoreJavaDay50.day42_Exceptions02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exceptions03 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		// icice try yerine tek try birkac catxh ile yapabiliriz.
		// child parente dikkat etmek lazim...
		// yer degistirmek gerekebilir..
		// Yapilmasi gereken ;
		// parantez icindeki iki hata ismini yer degistirecegiz...
		// FileNotFoundException ile IOExceptions yer degistirmeli

		try {
			FileInputStream fis = new FileInputStream(
					"C:\\Users\\TOSHIBA-PC\\eclipse-workspace\\java2021Summer Tr\\src\\day42_Exceptions02\\file");
			int k = 0;
				while ((k = fis.read()) != -1) {
					System.out.print((char) k);
				}
			} catch (FileNotFoundException e) { // dosyalarla ilgili okuma ve yazma sorunlarini handle eder...
				e.printStackTrace();
			

		} catch ( IOException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("");
		System.out.println("kod bloke olmamis");

	}

}
