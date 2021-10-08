package CoreJavaDay50.day34_Encapsulation;

public class C02_Encapsulation02 {

	public static void main(String[] args) {
		
		// C01 ve C02 yi beraber yaptik
		
		C01_Encapsulation01 insan1= new C01_Encapsulation01(); 
		//C01 den insan1 obj creat ettim

		//insan1.age=-47;
		insan1.name="Onur";
		insan1.surName="Enes";
		insan1.yasAta(-47);
		System.out.println(insan1.name); // Onur
		System.out.println(insan1.surName); // Enes
		System.out.println(insan1.yasGoster()); // 47
		
		// Not ; yazdirirken yasAta diyerek yazdirdigimizda CTE verdi.
		// Sadece atama yapar yazdirmak icin yasGoster kullanilmali.
		
		
		
		
		}
	}