package CoreJavaDay50.day43_Exceptions01;

public class Exceptions05 {

	   public static void main(String[] args) { // 1. adim

	        System.out.println(exceptions());    // 2. adim
	        //acde yazdirir
	    }

	    @SuppressWarnings({ "finally", "null" })
	    public static String exceptions() {    //3. adim
	        String result = "";   // 4. adim
	        String v = null;   // 5. adim
	        try {
	            try {
	                result = result + "a";  //a     // 6.adim
	                v.length();             // NullPointer Exception sonrasi calismaz    //7. adim
	                result = result + "b";
	            } catch (NullPointerException e) {    //8.adim
	                result = result + "c";    //ac    //9.adim
	            } finally {
	                result = result + "d";    //acd    //10.adim
	                throw new Exception();   //11.adim  exception verir
	            }
	        } catch (Exception e) {   // 12.adim  exception yakalar
	            result = result + "e";  // acde       //13.adim methodcall a gider //2 ye
	        }
	        return result;

	    }
	}