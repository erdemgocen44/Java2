package HalukHocaGithub._18_Interface;



public class SahinRunner {
	public static void main(String[] args) {
		Sahin s1=new Sahin();
		s1.ayna();
		s1.ebat();
		s1.jant();
		s1.kapi();
		s1.kaporta();
		s1.koltuk();
		s1.motor();
		s1.yakit();
		System.out.println(IcDonanim.music);
		//s1.kumas="deri";//final veriable assaignment yapilamaz
		System.out.println(IcDonanim.RENK);//ahsap
		System.out.println(DisDonamim.RENK);//metalik
		System.out.println(Lastik.RENK);//siyah beyaz yanakli
		System.out.println(s1.sisLamp());//obj ile parent interface'den concrete method call edildi.
		System.out.println(DisDonamim.boya());//interface name  ile parent interface'den concrete method call edildi.





	}

}
