package CoreJavaDay50.day42_Exceptions02;

public class Exceptions07 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		int sayi=10;
		// String str=sayi; // CTE bu exception degildir...
		
		String str="123456";
		
		System.out.println(str+10); // 12345610 diye yazdirir...concat yapti...
		
		int strSayi=Integer.parseInt(str);
		
		System.out.println(strSayi+10); // 123466 toplama yapmis oldu parse methoduyla
		
		String str2= "123a45";
		// System.out.println(Integer.parseInt(str2)); // NumberFormatException verir.. 
		// Arada a harfi oldugu icin formata uygun olmadigini soyler...
		
		Object sayi2=40;
		String sayiStr=(String) sayi2; // Excpilicit narrowing casting oldu
		// ClassCastException verir...
		
	}

}
