package CoreJavaDay50.day35_Encapsulation;

public class C05_BMI {

	/*
	 * 1 ) BMI ve MainBMI class'lari creat ediniz
	 * 2 ) BMI class'i icin field'lari
	 * name(String), age(int), weight(double) ve height(double) olan veriable'lar
	 * olusturup tum veriableleri encapsule ediniz.
	 * 3 ) tum field'lari setter getter
	 * ve constructor creat ediniz. 
	 * 4 ) bmi=weight/(height*height) formulune gre
	 * bmi hesaplayan bir method creat ediniz. 
	 * 5 ) bmi 18.5 ten kucukse zayif, 
	 * 25 ten kucukse normal, 30 dan kucukse kilolu, 30 ustu obez durumunu veren method
	 * creat ediniz. 
	 * 6 ) MainBMI de bu degereli yazdiriniz.
	 */
	
	// 1. adimda variable larimi olusturup private yapiyorum...
	
	private String name;
	private int age;
	private double weight;
	private double height;
	
	// 2. adimda ise parametresiz caontructor olusturuyorum...
	
	public C05_BMI() {
		
	}

	// 3. adimda ise parametreli caontructor olusturuyorum...
	
	public C05_BMI(String name, int age, double weight, double height) {
		super();
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.height = height;
	}
	
	// 4. adimda ise getter ve setters olusturuyorum

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double bmiHesapla() {
		double bmi = weight / (height * height);
		return bmi;
	}

	public String bmiDurumu() {
		double bmi = bmiHesapla();

		if (bmi < 18.5) {
			return "zayif";
		} else if (bmi < 25) {
			return "normal";
		} else if (bmi < 30) {
			return "kilolu";
		} else
			return "obez";

	}

}

