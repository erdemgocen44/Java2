package CoreJavaDay50.day32_StringBuilder;

public class C02_StringBuilder02 {

	public static void main(String[] args) {
		/*
		Bir cumleyi parametre olarak kabul eden,
		StringBuilder kullanarak cumleyi ters ceviren ve cumlenin palindrom
	    olup olmadigini kontrol eden (buyuk kucuk harf duyarliligi olmadan)
	    bir Java programi yazin.
	    */
	
		
		String str="tras neden sart";
		// Not; bu cumlenin terside kendisidir :)
		
		StringBuilder sB=new StringBuilder(str);
	
		String terString=sB.reverse().toString();
				
				if (str.equalsIgnoreCase(terString)) {
					System.out.println("Girdiginiz ifade Polindrome dur : " + terString);
		}
				else {
					System.out.println("Girdiginiz ifade Polindrome degildir : " + terString);
				}	
	}
	}