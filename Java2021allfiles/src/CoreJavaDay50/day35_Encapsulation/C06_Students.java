package CoreJavaDay50.day35_Encapsulation;

public class C06_Students {
	
	/*
	 * Burada 2 adet class vardr. bir main digeri student..
	 * 
	 * Student Class i icinde
	 * name ve age adinda iki variable olusturunuz.
	 * geter ve stter yapiniz.
	 * 
	 * name ; steven
	 * age ; 12
	 * 
	 * output
	 * Student name is Steven
	 * He is 12 years old
	 */
	
	// 1. adimda variable lari private yapiyoruz..
	private String name;
	private int age;
	
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
	
}
	