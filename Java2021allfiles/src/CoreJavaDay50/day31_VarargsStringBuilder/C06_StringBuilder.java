package CoreJavaDay50.day31_VarargsStringBuilder;

public class C06_StringBuilder {

	public static void main(String[] args) {


		StringBuilder sb1= new StringBuilder(); // Bos bir SB olusturur..
		System.out.println("sb1 : " + sb1); // sb1 : 
		
		StringBuilder sb2= new StringBuilder("Merhaba");
		System.out.println("sb2 : " + sb2); // sb2 : Merhaba
		
		StringBuilder sb3= new StringBuilder(10); // 10 karakter olan bir SB uretir..
		System.out.println("sb3 : " + sb3); // sb3 :   --> su an icin bostur.
		
		
		//----------------------------------------------------
		// bos bir stringe ekleme yapmak istersek
		
		// 1. String Builder methodu ; append(); ---> ekleme yapar.. add gibi..
		
		sb1.append(" Hello");
		System.out.println("sb1 append : " + sb1); // sb1.append : Hello
		
		sb2.append(" Hello");
		System.out.println("sb2 append : " + sb2); // sb2.append : Merhaba Hello
		
		sb3.append(" Hello");
		System.out.println("sb3 append : " + sb3); // sb3.append : Hello
		
		// 2. String Builder methodu ; length(); ---> uzunluk verir..
		// 3. String Builder methodu ; capacity(); 
		// ---> kapasiteyi verir. default degeri sb1 bos oldugu icin 16 dir..
		// Kurali ise sudur.. kapasite 5 derse --> 5*2+2 olur... 5 degisken olandir...
		
		System.out.println("sb1 length : " + sb1.length()); // 6
		System.out.println("sb1 capacity : " + sb1.capacity()); // 16
		
		System.out.println("sb2 length : " + sb2.length()); // 13
		System.out.println("sb2 capacity : " + sb2.capacity()); // 23
		
		System.out.println("sb3 length : " + sb3.length()); // 6
		System.out.println("sb3 capacity : " + sb3.capacity()); // 10
		
		// capacity hafiza yonetimi icin cok onemli..
		// kod yazarken sabit uzunluk veya max uzunluk belli ise 
		// 3. method capacity ile hafizayi yonetebiliriz.

	}

}
