package CoreJavaDay50.day34_Encapsulation;

public class C06_Encapsulation06 {

	public static void main(String[] args) {
		
		// C05 ve C06 yi beraber yaptik
		
		C05_Encapsulation05 insan2= new C05_Encapsulation05(); 
		//C05 den insan1 obj creat ettim

		//insan1.age=-34;
		insan2.name="Yavuz";
		insan2.surName="Selim";
		insan2.setAge(-34);
		System.out.println(insan2.name); // Yavuz
		System.out.println(insan2.surName); // Selim
		System.out.println(insan2.getAge()); // 34
		
		// Not ; yazdirirken yasAta diyerek yazdirdigimizda CTE verdi.
		// Sadece atama yapar yazdirmak icin yasGoster kullanilmali.
		 
		
	}

}


