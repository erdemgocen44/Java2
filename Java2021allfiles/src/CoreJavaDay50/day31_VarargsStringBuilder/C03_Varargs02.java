package CoreJavaDay50.day31_VarargsStringBuilder;

@SuppressWarnings("unused")
public class C03_Varargs02 {

	public static void main(String[] args) {

		// istedigimiz kadar sayi girdigiimizde
		// toplamlari bize veren bir method yazalim...

		// Not ; Var-args ---> Arguman cesitliligi
		// Var --->variety args--->arguments

		toplama(2, 3);
		toplama(2, 3, 5, 10);
		toplama(2, 3, 5, 10, -12, 7, 8);

	}

	public static void toplama(int... var) { // int... yazinca varags devreye girer..

		int toplam = 0;
		for (int j : var) {
			toplam += j;
		}
		System.out.println("Toplam : " + toplam); 
		// sirasiyla yukaridekileri alt alta toplayip yazdirir...

	}

}
