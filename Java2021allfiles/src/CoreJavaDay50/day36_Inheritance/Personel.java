package CoreJavaDay50.day36_Inheritance;

public class Personel {
	
	/*
	 1) Personel class olusturunuz 
	 id(int), 
	 isim(String), 
	 soyisim(String),
	 adres(String), 
	 tel(String),
	 instance veriable bululundursun.
     Bu class 1000 den baslayarak id atayan bir method barindirsin

     2) Muhasebe class olusturunuz
     saatUcreti (int), 
     statu(String), 
     maas(int) 
     instance veriable bululundursun.
     bu class saatucretini 8 ve 30 ile carparak maas hesaplayan bir method barindirsin

    3)Memur class olusturunuz 
    iki memurun saat ucreti 20 tl ve 25  den maasini  ve diger bilgilerini yazdiriniz

    4)isci class olusturunuz 
    iki iscinin saat ucreti 10 tl ve 15  den maasini  ve diger bilgilerini yazdiriniz.

    TRICK  :)
    Class'ların   
    parent-->child iliskisi
    *** Personel-->Muhasebe
    *** Muhasebe-->Memur
    *** Muhasebe-->Isci

     */
	
	public static int sayac=1000;
    public	int id;
    public	String isim;
    public	String soyIsim;
    public	String adres;
    public	String tel;
	
    public int  idAta() {
	this.id=++sayac;
	return id;
}
}
