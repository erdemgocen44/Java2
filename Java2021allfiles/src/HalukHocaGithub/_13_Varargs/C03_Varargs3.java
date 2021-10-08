package _13_Varargs;

public class C03_Varargs3 {
	public static void main(String[] args) {
		         // verilen int lerden ilki haric tum sayilari toplayan ve
				// buldugunuz toplam ile ilk sayiyi carpip sonucu yazdirin.
		topla(2,5,55,21,33);
		topla(0, 45,35,34);
		topla(3, 1,23,4,5,43,22,56,78,7,9);
	}

	private static void topla(int carpilacakSayi, int ...toplanacaklar) {
		int toplam=0;
		
		for (int each : toplanacaklar) {
			toplam+=each;
		}
		System.out.println("sonuc :"+(carpilacakSayi*toplam));
	}

}
