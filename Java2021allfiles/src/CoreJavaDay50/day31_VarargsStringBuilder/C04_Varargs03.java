package CoreJavaDay50.day31_VarargsStringBuilder;

public class C04_Varargs03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		toplama(2, 3);
		toplama(4, 3, 5, 10);
		toplama(8, 3, 5, 10, -12, 7, 8);
	}
		
		public static void toplama(int sayi, int... var) { 
		// int sayi yazinca var CTE verdi.
		// nedeni ise ben zaten tum int leri aliyorum ne gerek var der.
		// -----> public static void toplama(int sayi, int... var ) {	
		// var sonda olmali eger yazmak istiyorsak.
		// eger bu da yapilirsa soyle calisir...
			
			// toplama(2, 3); ilk elementi varargs almaz sonrakileri alir toplar.
			System.out.println("varags a dahil olmayanlar : " + sayi);
			
		// -----> public static void toplama(int sayi1, int sayi2, int... var ) {	
		// elementlerin ilk 1 ve 2 sini alirlar kalanlari varargs halleder...
			
			
			int toplam = 0;
			for (int each : var) {
				toplam += each;
			}
			System.out.println(sayi*toplam);
			
			// bu sonuclar bize ilk elementler ile
			// diger varags in elementlerinin carpimini verdi
			
		}

			
	}

