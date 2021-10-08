package CoreJavaDay50.day50_Maps;

import java.util.HashMap;

public class Ex01 {
	public static void main(String[] args) {
        //  Ad ve soyad bulunduruan iki ayri array'i ad=soyad  seklinde yazdiriniz.
    	
        // input : {"ahmet", "ahmet can", "haluk"};  {"seref", "erdem", "bilgin"};
        // output : {ahmet=seref, ahmet can=erdem, haluk=bilgin};

        String ad[] = {"ahmet", "ahmet can", "haluk"};
        String soyad[] = {"seref", "erdem", "bilgin"};

        HashMap<String, String> adSoyad = new HashMap<>();
        for (int i = 0; i < ad.length; i++) {
            adSoyad.put(ad[i], soyad[i]);

        }
        System.out.println("adSoyad = " + adSoyad);//adSoyad = {ahmet=seref, ahmet can=erdem, haluk=bilgin}
        
        
        /*
         * 2. yol
         * 
        String arr[] = { "ahmet", "ahmet can", "haluk" };

		String arr2[] = { "seref", "erdem", "bilgin" };

		HashMap<String, String> hm = new HashMap<>();

		for (int i = 0; i < arr2.length; i++) {

			hm.put(arr[i], arr2[i]);
		}

		System.out.println(hm);
		*/
         

    }
}