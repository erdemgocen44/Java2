package _98_Projects.GeometriProje;

public class Runner {
	
/* 1-asagidaki hiyarasiye gore siniflari creat ediniz...

     sekil <--Cember
     sekil <--Dikdortgen<--Kare

    2- Turetilen siniflardan uygun olanlarina yaricap,
     uzunluk ve genislik ekleyiniz.++
    3- Her bir sinifa consructor ekleyiniz.++
    4- Her sinifa alan ve cevre hesaplamasi metodlarini ekleyiniz. +
      (cemberin alanini hesaplama)
    5-Her metodun toStringini yapiniz.+
    6- Main de bunlardan nesne olusturup sonuclari yazdiriniz.
    */


	public static void main(String[] args) {
		
		Cember c = new Cember (6);
		c.cevreHesaplama();
		System.out.println(c);
		
		Kare k = new Kare (9,9);
		k.alanHesaplama();
		k.cevreHesaplama();
		System.out.println(k);
		
		Dikdortgen d= new Dikdortgen(15, 7);
		d.alanHesaplama();
		d.cevreHesaplama();
		System.out.println(d);
	}

}
