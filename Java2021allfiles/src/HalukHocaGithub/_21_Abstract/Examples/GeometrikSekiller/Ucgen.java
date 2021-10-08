package _21_Abstract.Examples.GeometrikSekiller;

import java.util.Scanner;

public class Ucgen extends Soru1 {

	static Scanner scan = new Scanner (System.in);
	@Override
	public void alanHesapla() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cevreHesapla() {
		
		
		
	}

	

	@Override
	public void eskenarUcgen(double a, double b, double c, double h) {
		
		System.out.println("Eskenar ucgenin cevresi "+ (a+b+c));
		System.out.println("Eskenar ucgenin alani "+ c*h/2);
		
		
	}

	

	@Override
	public void ikizKenarUcgen(double a, double b, double c, double h) {
		
		System.out.println("Ikizkenar ucgenin cevresi "+ (a+b+c));
		System.out.println("Ikizkenar ucgenin alani "+ c*h/2);
		
		
		
	}

	

	@Override
	public void cesitKenarUcgen(double a, double b, double c, double h) {
		
		System.out.println("Cesitkenar ucgenin cevresi "+ (a+b+c));
		System.out.println("Cesitkenar ucgenin alani "+ c*h/2);
		
		
	}

}
