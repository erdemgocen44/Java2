package CoreJavaDay50.day41_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exceptions03 {

	
	public static void main(String[] args) {
		
		try { // file yani bizdeki denemenin yerini getiriyor
			FileInputStream fis = new FileInputStream ("C:\\Users\\TOSHIBA-PC\\eclipse-workspace\\java2021Summer Tr\\src\\day41_Exceptions\\Deneme");
		int i=0;
		try {
			while ((i=fis.read())!=-1) {
				System.out.print((char)(i));
			}
		} catch (IOException e) { // IO ; I INPUT O OUTPUT
			e.printStackTrace(); // hatanin tum zerrelerini getirir.
		}
		}
		catch (FileNotFoundException e) {
			
			// e.printStackTrace();
			System.out.println(e.getMessage());
		}
		System.out.println("");
		System.out.println("devamkee yazisi varsa problem yok");

	}

}
