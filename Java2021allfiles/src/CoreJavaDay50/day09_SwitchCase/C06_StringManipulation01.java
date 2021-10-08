package CoreJavaDay50.day09_SwitchCase;

public class C06_StringManipulation01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String isim="Mehmet";
		String soyisim="Memo";
		        
		System.out.println(isim + " " + soyisim);//cancatination ilk methodu
		System.out.println(isim.concat(soyisim));
		System.out.println(isim.concat(" ").concat(soyisim)); // 2.method
		
		
		//System.out.println(isim.charAt(5)); // olmayan index yazilirsa java error verir
		// burada syntax acisindan bir hata yok
// ancak Java calismaya basladiktan sonra isim variable'na degeri atiyor
// ve 5.index'in olmadigini ancak 17.satira gelince farkediyor
// Bu tur hatalari Java ancak Run ettigimizde farkettigi icin
// bunlara Run Time Error RTE denir

//int sayi= isim; // biz kodu yazar yazmaz Java Kodu compile (derleme) eder
// eger syntax hatasi varsa Java bunu hemen farkeder ve altini cizer
// ve alti cizili bolumu duzeltmeden kodu calistiramayiz
// compile time error denir CTE



}

}