package CoreJavaDay50.day42_Exceptions01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exceptions04 {

	@SuppressWarnings("resource")
	public static void main(String[] args) { // inner try-catch veya parent child try-catch calistik diyebiliriz

		try { // parent try-catch ===> file yerini kontrol eder (ya evde yoksa hatasini handle
				// eder)

			FileInputStream fis = new FileInputStream(
					"C:\\Users\\TOSHIBA-PC\\eclipse-workspace\\java2021Summer Tr\\src\\day41_Exceptions\\Deneme");

			int i = 0;

			// child try-catch ===> file icerigini okuma ve yazdirma islemini handle etti

			while ((i = fis.read()) != -1) { // int degeri fis objesi read methodu ile atandiginda
				// -1' e esit degilse while body' sine gir

				System.out.print((char) (i));

			}

		}

		catch (FileNotFoundException e) { // I : input, O : output

			// e.printStackTrace(); // daha cok kullanilir, cunku hatanin tum verisini
			// verir,
			// handle kolayligi saglar

			System.out.println(e.getMessage()); // hata mesajini yazdirir

		}

		catch (IOException e) {

			// e.printStackTrace();

			System.out.println(e.getMessage());

		}

		System.out.println();

		System.out.println("Devamkeee yazisini okuduysan kod bu satira kadar sorunsuz run olmustur...");

	}

}