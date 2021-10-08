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


public class Dikdortgen extends Sekil {

	double uzunKenar;
	double kisaKenar;
	
	
	
	


	public Dikdortgen(double uzunKenar, double kisaKenar) {
		super(uzunKenar, kisaKenar);
		this.uzunKenar = uzunKenar;
		this.kisaKenar = kisaKenar;
		
	}


	public double cevreHesaplama() {
		

		return (uzunKenar+kisaKenar)*2;
		
	}
	

	public double alanHesaplama() {
		
		
		return uzunKenar*kisaKenar;
		
	}
	
	@Override
	public String toString() {
		return "uzunKenar=" + uzunKenar + ", kisaKenar=" + kisaKenar + ", cevreHesaplama()=" + cevreHesaplama()
				+ ", alanHesaplama()=" + alanHesaplama();
	}

	
}
