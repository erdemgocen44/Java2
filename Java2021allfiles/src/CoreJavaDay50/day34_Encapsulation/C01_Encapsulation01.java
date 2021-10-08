package CoreJavaDay50.day34_Encapsulation;

public class C01_Encapsulation01 {

	// C01 ve C02 yi beraber yaptik
	
		String name;
		String surName;
		private int age;
		// yanlis girmeleri koruma adina private kullaniyoruz.
		
		public static void main(String[] args) {
			
		}
		
		public void yasAta(int age) { // obj isterse yasi set eder
			 if (age<0) {
				 this.age=-age;
				
			}else this.age=age;
			
		}
		public int yasGoster() { //bu metod obj isterse yasini gosterir
			
			return this.age;
			
		}

	}

