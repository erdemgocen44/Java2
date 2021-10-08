package CoreJavaDay50.day34_Encapsulation;

		/*
		 * 1- fieldlari
		 *    model(String), 
		 *    renk(String), 
		 *    motor(int), 
		 *    yil (int)
		      olan Araba  isimli bir class tanimlayiniz.
		 2- Butun fieldlari parametre alan bir constructor tanimlayiniz.
		 3- Butun fieldlari icin getter ve setter metodlari olusturunuz.
		 4- ArabaMain isminde main metohod icin bir class olusturunuz.
		 5- iki adet parametreli const 1 adet parametresiz cons ile 3 adet araba creat ediniz
		 6- Araclarin motor ve yilini hatali veri girisine karsi kapsulleyiniz.

		 */

public class C04_Araba {
	
	String model; // 1.step
	String renk;
	private int motor; // 6. step icin private yaptik
	private int yil;  // 6. step icin private yaptik
	
	//-----------------------------------------------------------------------
	// ---> C03 te 13. satir icin parametrsiz constructor creat ettik
	public C04_Araba() {}; 
	
	
	//-----------------------------------------------------------------------
	// 2.step ---> Parametreli Constructor
	public C04_Araba(String model, String renk, int motor, int yil) {
	
		super();
		setModel(model);
		setMotor(motor);
		setRenk(renk);
		setYil(yil);
		}
	
	//-----------------------------------------------------------------------
	//3.step getter setter method
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
		if (motor>0) {
			this.motor = motor;
		}else this.motor = -motor;
		
	}

	public int getYil() {
		return yil;
	}

	public void setYil(int yil) {
		if (yil>0) {
			this.yil = yil;
		}else this.yil = -yil;
	}


}