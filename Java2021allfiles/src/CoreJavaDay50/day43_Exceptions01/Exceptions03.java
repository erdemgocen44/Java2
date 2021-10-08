package CoreJavaDay50.day43_Exceptions01;

public class Exceptions03 {

	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4};
		
		try {
			System.out.println(arr[2]);
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}finally {
			System.out.println("Ne olursa olsun yazdir...");
		}
		
		// finally try catch blogu ile calisabilir.. try blogu ile de calisabilir..
		// finally block her durumda calisir...


	}

}
