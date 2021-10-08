package CoreJavaDay50.day43_Exceptions01;


public class EyyJavaBuHatayiOgrenException extends Exception {


	public static final long serialVersionUID = 1L;
	
	EyyJavaBuHatayiOgrenException(String message){
		// p'li const creat ettim ki bu class dan olusan
	    // Object ile class'dan ve parent'inden field ve veriable call yapabilelim		
 super(message);
		
		
	}

}