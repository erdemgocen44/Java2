package _98_Projects.laptop;

import java.util.ArrayList;

public class PriceForOneLaptop {
	/*


    Parametresi int ve return tipi int olan GetPrice methodu veriliyor.

    Bu method, Data class dan AllData methodunu çağırıyor. LaptopID parametredir

   Bu yöntemin Calculation class taki tüm methodları çağırması ve price 
    alması ve totalAmount return etmesi gerekir.
*/
	public static int GetPrice(int LaptopId) {
		Data bilgi = new Data();
		ArrayList<String> urunOzlk= bilgi.AllData(LaptopId);
		int totalAmount= Calculation.getRam(urunOzlk)+ Calculation.getCPU(urunOzlk)+
				Calculation.getColor(urunOzlk)+Calculation.getSize(urunOzlk);
		
		return totalAmount;
	}
	
	/*


    Parameter iki tane int (amount , discount) ve return tipi int olan
     getDiscount methodu veriliyor.

    Miktardan(amount)  indirim(discount) yapın

    indirilmiş fiyatı return edin


    Örnek

    Amount 100
    discount 20

    20% indirimden sonra

   Sonuç 80 olmalı
 */
	public static int getDiscount(int amount,int discount) {
		//70-((70*20)/100)
		return amount-((amount*discount)/100);//indrli fiyat
		
	}
	
}
