package CoreJavaDay50.day39_Overriding;

public class Dog extends Animal {


	@Override 
	//Annotation --> *** Mutlaka childe yazilir parent ve child 
	// metodlarinda iliski kurar...
	// @Override olmazsa metodu degistirdiginde cte almazsin.
	// Ama olursa sana uyari verir.
	public  void beslenme() {
		System.out.println("kemik ile beslenir");
	}

	@Override
	public void tatli() {
		System.out.println("fistik sarma");
	}

	@Override
	protected String icecek() {
		System.out.println("tursu suyu");
		return "yarasin";
	}

	@Override
	public Integer  topla() {
		return 41+54;
		
	}

	@Override
	public Dog fatih() {
		
		return new Dog();
	}

	

}