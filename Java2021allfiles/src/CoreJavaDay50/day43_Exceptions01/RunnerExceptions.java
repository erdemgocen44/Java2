package CoreJavaDay50.day43_Exceptions01;

import java.util.Scanner;

public class RunnerExceptions {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws EyyJavaBuHatayiOgrenException {

		Scanner scanner = new Scanner(System.in);
		System.out.print("email giriniz : ");

		String email = scanner.nextLine();

		if (email.contains("@gmail.com") || email.contains("@ebikgabik.com")) {
			System.out.println("basarili");

		} else {
			throw new EyyJavaBuHatayiOgrenException("email adresi uygun degil ...");
		}

		scanner.close();
	}

}