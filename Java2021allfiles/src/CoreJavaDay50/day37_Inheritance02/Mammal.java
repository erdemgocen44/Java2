package CoreJavaDay50.day37_Inheritance02;

public class Mammal extends Animal{
	
	public void mA() {//parenti ile ayn�
		System.out.println("mammal");
	}
		public void mC() {
			System.out.println("cat" +"mammal");
		}
		 int c=7;
		 int m=4; // parenti ile ayni
		
		 public Mammal() {
			 this('A');
			System.out.println("p'siz mammal cons.");
		}
		public Mammal(char c) {
			super(34); // parentten p'li cons call.
			System.out.println("char p'li mammal cons.");
			
		}
}