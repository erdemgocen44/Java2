package CoreJavaDay50.day35_Encapsulation;

public class C05_BMIRunner {

	public static void main(String[] args) {
		
		
		C05_BMI b1=new C05_BMI("Aydin",43,102,1.83);
		
		System.out.println(b1.getName()+" bey "+b1.bmiHesapla()+" "+b1.bmiDurumu());
		
		
	
	}

}
