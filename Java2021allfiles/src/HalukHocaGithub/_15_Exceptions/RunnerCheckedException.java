package HalukHocaGithub._15_Exceptions;

import java.util.Scanner;

public class RunnerCheckedException {

	public static void main(String[] args) throws InvalidEmailIdCheckedException {

		Scanner scan = new Scanner(System.in);
		System.out.print("email giriniz : ");

		String email = scan.nextLine();

	
		/*mail dogru yazinca verdigi cikti  //mailiniz basariyla kaydedildi
		 * 
		 * mail hatali yazinca verdigi hata ciktisi
		 * Exception in thread "main" TechProEd2021._01_JavaTechProEd.day40_exceptions.InvalidEmailIdCheckedException: email uygun degil
		at NewDay/TechProEd2021._01_JavaTechProEd.day40_exceptions.RunnerCheckedException.mailDogrula(RunnerCheckedException.java:19)
		at NewDay/TechProEd2021._01_JavaTechProEd.day40_exceptions.RunnerCheckedException.main(RunnerCheckedException.java:8)
		*/
	}

	public static void mailDogrula(String email) throws InvalidEmailIdCheckedException {
		
		if (email.contains("@gmail.com") || email.contains("@ebıkgabık.com")) {
			System.out.println("gayet basarili....");
			
		}else{
			throw new InvalidEmailIdCheckedException("neyin kafasi bu. ne ictiysen bana da ....");
			
		}	
	}
}
