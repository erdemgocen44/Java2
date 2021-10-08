package CoreJavaDay50.day42_Exceptions02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exceptions01 {


	
	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {
		
		try {
			FileInputStream fis = new FileInputStream
					("C:\\Users\\TOSHIBA-PC\\eclipse-workspace\\java2021Summer Tr\\src\\day42_Exceptions02\\file");
		} catch (FileNotFoundException e) {
			//e.printStackTrace(); // tum hatayi acikca yazar
			System.out.println(e.getMessage()); // hatayi kisa sekilde yazar
		}		
		System.out.println("kod bloke olmamis");
		
		
		
		
	}
}
