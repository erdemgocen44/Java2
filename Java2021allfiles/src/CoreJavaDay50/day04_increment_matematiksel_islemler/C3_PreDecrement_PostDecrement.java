package CoreJavaDay50.day04_increment_matematiksel_islemler;

public class C3_PreDecrement_PostDecrement {

	public static void main(String[] args) {

		int sayi1 = 20;

		int sayi2 = sayi1--;

		System.out.println("post decrement sayi1 : " + sayi1); // post decrement sayi1 : 19
		System.out.println("post decrement sayi2 : " + sayi2); // post decrement sayi2 : 20

		System.out.println(--sayi2); // 19

		System.out.println(sayi2--); // 19

		System.out.println(sayi2); // 18

	}

}