package CoreJavaDay50.day31_VarargsStringBuilder;

import java.util.ArrayList;
import java.util.List;

public class C05_Varags04 {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		
		// toplama(list);
		// varargs esnektir ama listi kabul etmez. CTE verir.
		
		// Array deneyelim...
		
		int arr[]= {15,20,25};
		
		toplama(arr);
		
		// Array de CTE vermedi.. demek ki varags array ile calisir.
		// kullanicidan deger aliyorsak Array e kaydetmeliyiz.
		 
		// bunu yaparken ilk once liste aliriz. sonra Arrray e ceviririz.
		

	}
	
	public static void toplama(int... var) { 

			
			int toplam = 0;
			for (int each : var) {
				toplam += each;
			} 
			System.out.println(toplam); // 60

}
}
