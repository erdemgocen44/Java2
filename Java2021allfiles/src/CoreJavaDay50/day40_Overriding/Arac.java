package CoreJavaDay50.day40_Overriding;

public class Arac {
    // 1- Arac isimli bir superclass olusturunuz, 
	// fields : renk ve motor(private), 
	// model(protected) olsun.
    // 2- Consructor ekleyiniz.
	// get ve set metodlari ve toString Metodunu ekleyiniz.
    // 3- Arac sinifindan  Otobus sinifini uretiniz,
	// otobusun ayrica yolcuSayisi field ini ekleyiniz.
    // 4- Bir AracPark isimli icinde main olan bir sinif olusturunuz ve
	// Otobus ten obj olusturarak, Otobusun ozelliklerinin tumunu ekrana yazdiriniz...
   
	private String renk;
	private int motor;
	protected String model;
	
	
	public Arac(String renk, int motor, String model) {
		setModel(model);
		setMotor(motor);
		setRenk(renk);
	}
	
	
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getRenk() {
		return renk;
	}
	public void setRenk(String renk) {
		this.renk = renk;
	}
	public int getMotor() {
		return motor;
	}
	public void setMotor(int motor) {
		this.motor = motor;
	}
	

	
}
