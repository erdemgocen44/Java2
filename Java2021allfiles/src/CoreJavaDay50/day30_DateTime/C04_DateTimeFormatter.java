package CoreJavaDay50.day30_DateTime;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

@SuppressWarnings("unused")
public class C04_DateTimeFormatter {
	public static void main(String[] args) {

		LocalDate bugun=LocalDate.now();
		LocalDate date=LocalDate.of(2020, 11, 15);

		/*
		 * yy: YILIN SON iKi RAKAMI
		 * yyyy : yilin tamamini
		 * y : yilin tamamini
		 * M : ay sirasini verir TEMMUZ icin : 7
		 * MM: ay sirasiniverir TEMMUZ icin : 07
		 * MMM: ay isminin ilkuc harfini verir. JUL
		 * MMMM : ay isminin tamamini verir
		 */
		
		DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd/M/yy");//15/11/20
		DateTimeFormatter dtf1=DateTimeFormatter.ofPattern("dd/MM/yy");//15/05/20
		DateTimeFormatter dtf2=DateTimeFormatter.ofPattern("dd/MMM/yy");//02/Agu/21
		DateTimeFormatter dtf3=DateTimeFormatter.ofPattern("dd$M$yyyy");//15$5$2020
		
		System.out.println(dtf.format(date));
		System.out.println(dtf1.format(date));
		System.out.println(dtf2.format(bugun));
		System.out.println(dtf3.format(date));
		
		
		LocalDate dt=LocalDate.of(2005, 03, 05);
		System.out.println("bugunun tarihi : "+bugun);
		System.out.println("faruk dt :"+dt);
		Period yasim=Period.between(dt, bugun);
		System.out.println("faruk beyin yasi : "+yasim);
		System.out.println(yasim.getYears());
	}

}