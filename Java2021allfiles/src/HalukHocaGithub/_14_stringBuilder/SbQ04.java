package _14_stringBuilder;

public class SbQ04 {
	public static void main(String[] args) {
		/*
		Bir cümleyi parametre olarak kabul eden, StringBuilder kullanarak cümleyi ters çeviren ve cümlenin palindrom
	        olup olmadığını kontrol eden (büyük/küçük harf duyarlılığı olmadan) bir Java programı yazın.
	     (without case sensitivity)
	     Eg : input : I love Java
	     Output: "Reversed sentence : avaJ evol I 
	        It is not a palindrome"

		 */
	
		
		String str="tras neden sart";
		
		StringBuilder sB=new StringBuilder();
		sB.append(str);
		String terString=sB.reverse().toString();
				
				if (str.equalsIgnoreCase(terString)) {
					System.out.println("girdiginiz ifade  polindrome dir "+terString);
			
		}
				else {
					System.out.println("girdiginiz ifade  polindrome degildir "+terString);
				}
		
	}

}
