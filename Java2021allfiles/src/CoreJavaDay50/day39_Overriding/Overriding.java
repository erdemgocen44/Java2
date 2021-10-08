package CoreJavaDay50.day39_Overriding;

public class Overriding {


/*Overriding::::
 * 
 * Parent class'daki bir METHOD'u child class'a gore ozellestirerek kulanmanin adidir.
 * 
 * OVERRIDING KURALLARI
 * 
 * 1) Overriding creat edilirken  "method signature" (name+ parameters)
 * 	kesinlikle ve ASLAAA degistirilemez...!!!	
 * 
 * 2) Overriding creat edilirken "access modifier" belirli kurallara gore degistirilebilir
 * 
 * 3) Overriding creat edilirken "return type" belirli kurallara gore degistirilebilir
 * 
 * 4) Overriding creat edilirken "method body" %99 degistirilir ;
 *   Ama degistirilmezse CTE vermez (amelelik olur overriding amaci body creat etmek .)
 *  
 * 5) Overriding creat edilirken "parent - child" relationship sarttir.
 *    Ahan da tricky :  inheritance olmadan overriding olmaz  OLAMAZZZZ...!
 * 
 * 6) "Overridden method": Parent class'daki methoddur(zavalli ezilen)
 *    "Overriding method": Child class'daki methoddur( ezen)
 * 
 * 7) "Overriding method" (child )'in "access modifier" a "Overridden method" (parent) ile ayni ya da
 *   daha genis olmali.
 *   Evlat babanin erisimini daraltamaz ama genisletebilir. SubAccMod >= SuperAccMod
 * 
 * 8) "Overriding method" da (child )'in return type i void ise
 * "Overridden method" (parent) return type i void olmali kendinden olmayani kanul etmez
 * 
 * 9) "Overriding method" (child )'in return type i Wrapper clas'dan ise
 * "Overridden method" (parent) return type Wrapper clas'dan olmali kendinden olmayani kabul etmez
 * 
 * 10) "Overriding method" (child )'in return type i Wrapper clas'dan ise
 * "Overridden method" (parent) return type arasinda 
 * IS-A (child--> parents ## relationship) iliskisi olmali.
 * 
 * 11) Static methodlar overriding edlmezler...
 * 
 * 12) Private methodlar overriding edlmezler...
 * 
 * 13) Final methodlar overriding edlmezler... Final son hali demektir. Artik degisemezler...
 * 
 * 14) polymorphism --> overloading ve overriding den olusan yapiya denir.
 * 
 * "overloading"---> public void yemek(){...}
	 *  			 public void yemek(String tatli){...}
	 *  			 public void yemek(String tatli , int ucret){...}
	 *  
	 *  
	 *  
	"overidding"--->  public void icmek(){syso(gazoz)}
	                  public void icmek(){syso(dark ve sek bir kahve)}
	 *  		      public void icmek(){syso(ucret)}
 * 
 *************************Farklari nelerdir ?******************************
 * 
 * --> Overloading de signutare (parametre ve isim) degisir overriding de degismez.
 * 
 * --> Overloading de inheritance gerekmez overriding de inheritance olmadan kullanilamaz.
 * 
 * --> Overloading de body genellikle degismeden kullanilir overriding de ise nerdeyse body her zaman degisir .
 * 
 * --> Static methodlar overloading edilir ama overriding edilmezler.
 * 
 * --> Private methodlar overloading edilir ama overriding edlmezler...
 * 
 * --> Overloading Compile Time polymorphism dir.(Static) Overriding Run Time polymorphismdir..(Dinamik)
 */
}