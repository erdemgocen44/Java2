package CoreJavaDay50.day35_Encapsulation;

public class C08_Encapsulation08Runner {

	public static void main(String[] args) {
	
		C08_Encapsulation08 obj1=new C08_Encapsulation08();
		
		System.out.println(obj1.getOkulIsmi()); // Yildiz Koleji
		System.out.println(obj1.getOkulNo()); // 12345
		System.out.println(obj1.isOkulAcikMi()); // true
		
		obj1.setOkulIsmi("Mehmet Koleji"); 
		// obj1 icin okul ismini degistirmis olduk
		System.out.println(obj1.getOkulIsmi());
		
		C08_Encapsulation08 obj2=new C08_Encapsulation08();
		System.out.println(obj2.getOkulIsmi()); // Yildiz Koleji
		
		obj2.setOkulNo(123);
		System.out.println(obj2.getOkulNo()); // 123
		
		obj2.setOkulAcikMi(false);
		System.out.println(obj2.isOkulAcikMi()); // false
	}

}
