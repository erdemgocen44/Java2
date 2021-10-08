package CoreJavaDay50.day27_ConstructorStaticKeywords;
public class ThisKeyword {

	ThisKeyword(int x){

		this();

		System.out.println("Parametreli constructor");

	}

	ThisKeyword(){

		System.out.println("Parametresiz constructor");

	}	

	public static void main(String[] args) {

		@SuppressWarnings("unused")
		ThisKeyword obj = new ThisKeyword(7);

	}

}




		   

		