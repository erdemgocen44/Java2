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


public class Sekil {

	double uzunKenar;
	double kisaKenar;
	double genislik;
	double yariCap;
	
	

	
	
	
	public Sekil(double uzunKenar, double kisaKenar) {
		
		this.uzunKenar = uzunKenar;
		this.kisaKenar = kisaKenar;
	}


	public Sekil(double yariCap) {
		
		this.yariCap = yariCap;
	}


	public Sekil(double uzunKenar, double kisaKenar, double genislik, double yariCap) {
		
		this.uzunKenar = uzunKenar;
		this.kisaKenar = kisaKenar;
		this.genislik = genislik;
		this.yariCap = yariCap;
	}


	public double cevreHesaplama() {
		
		return (uzunKenar+kisaKenar)*2;
		
	}
	



	public double alanHesaplama() {
		
		
		return uzunKenar*kisaKenar;
		
	}
	
	
	
	
}
