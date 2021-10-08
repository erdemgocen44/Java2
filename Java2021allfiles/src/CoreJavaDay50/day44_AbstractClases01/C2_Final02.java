package CoreJavaDay50.day44_AbstractClases01;

public class C2_Final02 extends C1_Final01 {

	public static void main(String[] args) {
		System.out.println(C1_Final01.SAYI); // 10 olur.. C1 klasorundeki degeri aldi...
		// final oldugu icin bu sayiyi degistiremeyiz...
		
		C2_Final02 obj = new C2_Final02();
		obj.deneme();

	}

	public void deneme() {
		System.out.println("Child Class da Deneme yapiyok 1");
	}
	
	// deneme2 ye final dedigimiz icin gelmedi...
	// final class inherit edilemez...
}
