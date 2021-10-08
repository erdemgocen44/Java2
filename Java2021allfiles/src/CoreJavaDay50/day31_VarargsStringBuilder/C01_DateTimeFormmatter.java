package CoreJavaDay50.day31_VarargsStringBuilder;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C01_DateTimeFormmatter {

	public static void main(String[] args) {
		
		LocalDateTime ldt=LocalDateTime.now();

		System.out.println(ldt); // 2021-08-05T11:32:57.574248900
	
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yy/MMMM/dd hh:mm");
		// istedigim formatta yazdirmis oldum
		System.out.println(dtf.format(ldt)); // 21/Agustos/05 11:32

		DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("yy/MMM/dd");
		System.out.println(dtf1.format(ldt)); // 21/Agu/05
		
		DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("HH:mm"); // 24 saate gore
		System.out.println(dtf2.format(ldt)); // 11:38 ---> 24 saate gore
		
		DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("hh:mm"); // pm/am sistemine gore
		System.out.println(dtf3.format(ldt)); // 11:38 ---> 12 saate gore
		
		
		
	}

}
