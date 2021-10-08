package _98_Projects.laptop;

import java.util.ArrayList;

public class Calculation {
	/*
    getRam methodunu oluşturalım

    Parametresi  ArrayList<String> olsun


    Eğer ram 32 gb ise price 300 ekle
    Eğer ram 16 gb ise price 200 ekle
    Eğer ram 8 gb ise price 100 ekle
    Eğer ram 4 gb ise price 50 ekle
    return  price olmalı.
    Not price -- fiyat
 */
	Data bilgi1 = new Data();
	
	public static int getRam(ArrayList<String> ram) {
	
		int price =0;
		if (ram.get(2).equalsIgnoreCase("32 gb")) {
			price+=300;
		}
		else if (ram.get(2).equalsIgnoreCase("16 gb")) {
			price+=200;
		}
		else if (ram.get(2).equalsIgnoreCase("8 gb")) {
			price+=100;
		}
		else if (ram.get(2).equalsIgnoreCase("4 gb")) {
			price+=50;
		}
		
		return price;
	}
	
	
	 /*
    getCPU  methodunu oluşturalım

    Parametresi  ArrayList<String> olsun


    Eğer CPU i3 ise price 200 ekle
    Eğer CPU i5 ise price 300 ekle
    Eğer CPU i7 ise price 500 ekle

    return  price olmalı.
 */
	public static int getCPU(ArrayList<String> CPU) {
		
		int price =0;
		if (CPU.get(3).equalsIgnoreCase("i3")) {
			price+=200;
		}
		else if (CPU.get(3).equalsIgnoreCase("i5")) {
			price+=300;
		}
		else if (CPU.get(3).equalsIgnoreCase("i7")) {
			price+=500;
		}
		
		
		return price;
	}
	
	 /*
    getColor methodunu oluşturalım

    Parametresi  ArrayList<String> olsun

    return türü int olmalı


    Eğer Color Red ise ise price 400 ekle
    Eğer Color Orange ise price 300 ekle
    Eğer Color Silver ise price 200 ekle
    Eğer Color Black ise price 150 ekle


    return  price olmalı.

 */
	public static int getColor(ArrayList<String> color) {
		
		int price =0;
		if (color.get(4).equalsIgnoreCase("Red")) {
			price+=400;
		}
		else if (color.get(4).equalsIgnoreCase("Orange")) {
			price+=300;
		}
		else if (color.get(4).equalsIgnoreCase("Silver")) {
			price+=200;
		}
		else if (color.get(4).equalsIgnoreCase("Black")) {
			price+=150;
		}
		
		
		return price;
	}
	
	 /*
    getSize  methodunu oluşturalım

    return türü int olmalı

    Parametresi  ArrayList<String> olsun


    Eğer Size "Mini" içeriyorsa price 100 ekle
    Eğer Size "Middle" içeriyorsa price 200 ekle
    Eğer Size "Max" içeriyorsa price 300 ekle


    return  price olmalı.
 */
public static int getSize(ArrayList<String> size) {
		
		int price =0;
		if (size.get(1).contains("Mini")) {
			price+=100;
		}
		else if (size.get(1).contains("Middle")) {
			price+=200;
		}
		else if (size.get(1).contains("Max")) {
			price+=300;
		}
		
		
		return price;
	}
	
}
