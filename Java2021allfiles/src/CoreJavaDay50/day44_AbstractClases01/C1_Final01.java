package CoreJavaDay50.day44_AbstractClases01;

public class C1_Final01 {

	
	final static int SAYI=10; // static eklersek final in yanina sayi yi bold ve italik yapar ve biz de buyuk harfle yazariz
	
	String isim; 
	// instance bir variable lara deger atamasi yapmak zorunda degiliz.
	// deger atamazsak java data turune gore default deger atar...
	
	// final String soysisim;
	// final variable larin degeri sonradan degistirilemez..
	// ilk atama yapmadan olusturulmasina java izin vermez
	
	public static void main(String[] args) {
		
		System.out.println(SAYI);
		
		// NOT ;
		
		System.out.println(Integer.MAX_VALUE);
		// buyuk italik ve bold yazdi...
		// hem final hem de static oldugu icin..
		// uzantisina gidersen anlarsin...

		
	}
	
	public void deneme() {
		System.out.println("Deneme yapiyok 1");
	}
	
	public final void deneme2() {
		System.out.println("Deneme yapiyok 2");
	}

}
