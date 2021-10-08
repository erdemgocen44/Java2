package _98_Projects.GeometriProje;

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


public class Cember extends Sekil {

	
	double yariCap;

	
	
	
	public Cember(double yariCap) {
		super(yariCap );
		this.yariCap = yariCap;
	}
	
	
	public double cevreHesaplama() {
		
		
		return yariCap*2*3.14;
		
	}


	@Override
	public String toString() {
		return "yariCap=" + yariCap + ", cevreHesaplama()=" + cevreHesaplama();
	}

	
	
	
	
	
}
