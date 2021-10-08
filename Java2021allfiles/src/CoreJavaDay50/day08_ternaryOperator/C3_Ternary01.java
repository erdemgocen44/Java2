package CoreJavaDay50.day08_ternaryOperator;

public class C3_Ternary01 {

	public static void main(String[] args) {


		int sayi1=75;
		
		String sonuc=sayi1%2==0 ? "sayi cift" : "sayi tek";
		
		System.out.println(sonuc);
		
		System.out.println(sayi1>100 ? "sayi 100 den buyuk" : 10);
		
		int y=1;
		int z=1;
		int a=	y<10 ? y++ : z++;
		System.out.println(y + "," + z + "," + a);
		
	}

}
