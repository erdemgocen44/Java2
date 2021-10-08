package CoreJavaDay50.day38_Overriding;

public class GeciciIsci extends Isci{
	
	public String calistigiBolum = "Yemkhane";

	public static void main(String[] args) {
		
		GeciciIsci gi1=new GeciciIsci();
		System.out.println(gi1.maasHesapla()); // 2400
		
	}
	// overriding yapmak istiyorsaniz method signiture ile 
	// child class daki method olusturulur
	public int maasHesapla() {
		return 30*8*10;
		
	}
	@Override // annotation aciklama denir. annotation sadece bir aciklama degil. 
	public void mesai() {
		// super.mesai();
		System.out.println("gecici isciler haftada 25 saat calisir...");
	}


	// annottaion aciklama demektir.
	// kodu okuyana aciklama gibi olur.
	// eger overriding edilen parent claas daki methodun calismasini istiyorsak 
	// overriding methoda super yazariz
	// override da super olmazsa calismaz...



}
