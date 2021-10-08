package CoreJavaDay50.day05_wrapper_concatenation;

public class C3_Concatenation01 {

	public static void main(String[] args) {

		String str1 = "Java";
		String str2 = "Guzel";
		int sayi1 = 5;
		int sayi2 = 4;

		// Java Guzel 54 yazdirin
		System.out.println(str1 + " " + str2 + " " +sayi1+sayi2); // Java Guzel 54
		
		// Java 5 Guzel
		System.out.println(str1 + " " +sayi1+ " "+str2); // Java 5 Guzel

		// Java94
		System.out.println(str1 + " " + (sayi1+sayi2) + sayi2); // Java94

		// Java19
		System.out.println(str1 + " " + (sayi1-sayi2) + (sayi1+sayi2)); // Java 19
		
		
		String intdanCevrilen= ""+sayi1; // bu yontem method kullanmadan int'i String'e cevirir
		System.out.println(intdanCevrilen);
		// "" bu isaret stringtir ve toplar 5 cevabini verir..

	}

}
