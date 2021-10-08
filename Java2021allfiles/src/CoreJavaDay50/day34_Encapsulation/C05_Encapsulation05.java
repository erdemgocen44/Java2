package CoreJavaDay50.day34_Encapsulation;

public class C05_Encapsulation05 {
	
	// C05 ve C06 yi beraber yaptik

	String name;
	String surName;
	private int age;// encap icin veriyi private yaptik

	public static void main(String[] args) {

	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age > 0) {
			this.age = age;
		} else
			this.age = -age;

	}

}
