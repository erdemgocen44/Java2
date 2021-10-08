package CoreJavaDay50.day43_Exceptions01;

import java.io.FileInputStream;
import java.io.IOException;

@SuppressWarnings("unused")
public class Exceptions02 {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException  {
		
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\TOSHIBA-PC\\eclipse-workspace\\java2021Summer Tr\\src\\day42_Exceptions02\\file");

		int k = 0;
		while ((k = fis.read()) != -1) {
			System.out.print((char) k);
		}
	}

}
