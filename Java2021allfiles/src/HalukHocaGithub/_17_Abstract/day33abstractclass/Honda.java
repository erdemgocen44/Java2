package HalukHocaGithub._17_Abstract.day33abstractclass;

public abstract class Honda {

		/*
		 		1) Bazen child class'lar parent class'daki method'larin body'lerini  hep degistirerek
		 	kullanirlar. Bu tip durumlarda parent class'daki method'a body koymak manasiz olur.
		 	Cunku parent class'daki method body hic kullanilmaz. Bu manasizligi gidermek icin
		 	Java bize body'siz method uretme sansi verir. Body'siz method'lara abstract method denir.
		 		
		 		2) Parent class'daki body'siz methodlari (abstract method) child class'lar Override etmek
		 	zorundadirlar. Biz bir application olustururken child class'lari parent class'daki bazi methodlari
		 	Override etmek zorunda birakmak istersek o methodlari abstract method yapariz.
		 		
		 		3) abstract method olusturmak icin a) "{}" kismini yazmayin b) access modifier'dan sonra "abstract"
		 		 																									keywordunu kullanin
		 		 																									
		 		4) abstract method'lar sadece abstract class'lar icinde olusturulabilir.
		 		
		 		5) abstract class olusturmak icin access modifier'dan sonra abstract keyword'unu kullanin
		 		
		 		6) "abstract" keyword'u ile method body bir arada kullanilamaz.
		 		
		 		7) abstract class icinde hem abstract hem de abstract olmayan(concrete) method'lar kullanilabilir.
		 		
		 		8) Bir concrete class abstract class'a extend ettiginde, abstract class icindeki tum abstract methodlari
		 	Override etmek zorundadir. Aksi takdirde Compile Time Error verir. Fakat concrete methodlari
		 	Override etmek zorunda degildir. Concrete methodlarin Override edilmesi istege baglidir.
		 		
		 		9) Bir abstract class baska bir abstract class'a extend ettiginde herhangi bir method'u Override etmek
		 	zorunda degildir. Isterse Override eder istemezse etmez. cunku java abstract child class'inda son degil altinda
		 	mutlaka concrete child class olacagini bilir.

		 	concrete classlarda abstract metod yazilamaz....
		 	
		 		10) final class'larin child class'i olamas. abstract class'lar child class'lara talimat vermek icin
		 	olusturulurlar. Eger bir class'i final yaparsaniz o class'in child class'i olamayacagindan abstract
		 	olmasi mantikli degildir. Bu yuzden Java abstract class'larin final olmasina m�sade etmez.
		 		
		 		11) abstract method uretmemizin sebebi child class'larin kullanabilmesidir. Eger method'u final 
		 	yaparsak child bu o method Override edilemez demektir yani; child class'lar kullanamaz demektir.
		 	Bu celiskiden dolayi Java abstract methodlarin "final" olmasina musade etmez.
		 		
		 		12) abstract method'lar private olamazlar cunku abstract method'lar baska class'lar tarafindan 
		 	kullanilmak icin uretilirler. Halbuki "private" method'lar baska class'lar tarafindan kullanilamazlar.
		 		
		 		13) abstract method'lar static olamazlar. Cunku static method'lar Override edilemezler halbuki
		 	biz abstract method'lari Override etmek icin uretiriz

		 	14)Abstract class icinde veriable olabilir ama veriable asla kesinlikle  abstract olamaz.
		 	
		 							!!!! ABSTRACT CLASS'LARDAN OBJECT URETILEMEZ.
		 */


	public abstract void motor();
	

	
	
	public void sunroof() {
		System.out.println("panoramik cam kullanilmali");
	}


}
