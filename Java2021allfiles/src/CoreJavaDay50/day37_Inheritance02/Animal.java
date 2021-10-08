package CoreJavaDay50.day37_Inheritance02;

public class Animal {

	
	// Animal--Mammal--Cat

/*
 * 1) Animal isiminde class creat edip 2 farkli methoda prnt komutu yaziniz.
 * Animal class'inda int type biri initialize(assaingmet) edilmis
 * digeri initialize(assaingmet) edilmemis iki farkli instance veriable creat ediniz.
 * Animal class'inda int p'li ve p'siz iki cons creat ediniz.
 * 
 * 
 * 2)Mammal isiminde class creat edip 2 farkli methoda prnt komutu yaziniz.
 * methodlardan biri parentindeki metod ile ayns isimde olsun Mammal class'inda
 * int type initialize(assaingmet) edilmis biri parentindeki veriable ayns
 * isimde digeri farkli isimde iki farkli instance veriable creat ediniz.
 * Mammal class'inda char p'li ve p'siz cons creat ediniz.
 * p'li cons parentindeki p'li cons call etsin. 
 * p'siz cons kendi class'indaki p'li cons call etsin
 * 
 * 
 * 3)Cat isiminde class creat edip parentindeki ile ayni isimde methoda prnt
 * komutu yaziniz. Cat class'inda int type initialize(assaingmet) edilmis biri
 * parentindeki veriable ayni isimde digeri farkli isimde iki farkli instance
 * veriable creat ediniz. Cat class'inda p'li ve p'siz cons creat ediniz. String
 * p'li cons classindaki p'siz cons call etsin ve parentindeki ayni isimdeki
 * veriable print etsin
 * 
 * 4)Runner class'i creat ederek class ve cons ayni veya farkli obj ler creat
 * ederk veriable ve metod call ile yazdiriniz.
 * 
 * parent --> child animal --> Mammal --> Cat
 * 
 */
	
	public void mA() {
	System.out.println("animal");
}
	public void mM() {
		System.out.println("animal" +"mammal");
	}
	public int a=7;
	public int m;
	
	public Animal() {
		System.out.println("p'siz animal cons");
		
	}
public Animal(int i) {
	System.out.println("int  p'li animal cons");
	}
	
}
	
	