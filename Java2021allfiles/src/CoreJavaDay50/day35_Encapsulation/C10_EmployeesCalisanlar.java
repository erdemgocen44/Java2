package CoreJavaDay50.day35_Encapsulation;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class C10_EmployeesCalisanlar {
	/* TODO
    Burada iki adet class vardir. Biri Main digeri ise Employees,
    Employees(calisanlar) class'inda;
    Bu variable'lari olusturunuz;
    private String name,
    private int salary, (salary : maas demektir)
    private String dob (date of birth) (Dogum tarihi)
    getter ve setter olusturunuz.

 Main class'in icinde; kullanicidan name dob ve slary bilgilerini alip
    Eger employee 18 yasinda buyukse, Welcome to our company Fernando your salary is 80000. yazdiriniz.
    Eger Fernando 18 yasindan kucukse, come back when you are 18 years old. yazdiriniz.
    Eger Fernando 18 yasindaysa,  we can have inter with you after that you can have a 80000 salary yazdiriniz.
  Ornek:
    Name is Fernando
    dob is 11/23/2000
    Salary is 80000
todo  ageCalculator isminde bir method olusturunuz. suanki tarih - dogum yili = employee age
*/
	
	// 1. adimda private olusturuyorum...
	private String name;
    private int salary;
    private String dob ;
    
    // 2. adimda getters ve setters olusturdum...
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
    
	
	// 5. adimda ise kullanician gelecek tarihi formatliyorum
	public int yasHesapla(String dob) {
		 
		String strDate=dob; //   Ornek : "12/23/1999"
		    
		LocalDate bugun=LocalDate.now();
		DateTimeFormatter format= DateTimeFormatter.ofPattern("MM/dd/yyyy");
		    
	// 6. adimda ise dogum tarihinden yas hesapliyoruz..
		LocalDate dTarihi=LocalDate.parse(strDate,format);
		//kullanicinin string girdigi MM/dd/yyyy formata gore parcala
		    
		int age=bugun.getYear()-dTarihi.getYear();
		//bugun - kullanici dTarihi= yas
		    
		return age;
	}
}

