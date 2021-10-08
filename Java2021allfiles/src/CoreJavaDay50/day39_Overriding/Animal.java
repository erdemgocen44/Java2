package CoreJavaDay50.day39_Overriding;

public class Animal {
	
	// animal ve dog inheritance
	
	
	
	
	
	public void beslenme() {
		System.out.println("tum hayvanlar beslenir..");
		
	}
	
	protected void tatli() {
		System.out.println("trilece");
	}
	
	
	protected String icecek() {
		System.out.println("nigde gazozu");
		return "ohhh";
	}
	
	
	public Integer topla(){
		return 34+6;
		
	}
	
	
	public Animal fatih() {
		
		return new Animal();
	}
	}
