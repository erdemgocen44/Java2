package CoreJavaDay50.day42_Exceptions02;

import java.io.FileInputStream;
import java.io.IOException;

public class Exceptions04 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		// eger handle edilecek exceptionslar arasinda 
		// child parents iliskisi kurmadan childi silebiliriz...
		// FileNotFoundException catch blogunu sildik
        // negatif tarafi ise ; sorun olursa hata bulma zorlasir...
		
		try {
			FileInputStream fis = new FileInputStream(
					"C:\\Users\\TOSHIBA-PC\\eclipse-workspace\\java2021Summer Tr\\src\\day42_Exceptions02\\file");
			int k = 0;
			while ((k = fis.read()) != -1) {
				System.out.print((char) k);
			}

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("");
		System.out.println("kod bloke olmamis");

	}

}
