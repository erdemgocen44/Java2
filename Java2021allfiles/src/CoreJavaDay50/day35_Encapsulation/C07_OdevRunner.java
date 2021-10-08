package CoreJavaDay50.day35_Encapsulation;

import java.util.Scanner;

public class C07_OdevRunner {

	public static void main(String[] args) {
		
		Scanner scan =new Scanner(System.in);
		
		// Scanner da istenen sorulari girdim ve data turleri ile tanimladim..
		
		System.out.print("Lutfen adinizi giriniz : ");
		String name=scan.nextLine();
		 
		System.out.print("Lutfen oda sayisini giriniz : ");
		int roomCount=scan.nextInt();
		
		System.out.println("Balkon istiyor musunuz?\n True yada False seklinde cevaplayiniz");
		boolean balconyOrNo=scan.nextBoolean();
		
		// obje olusturup Runner ile baglanti kurdum.
		
		C07_Odev kiraci =new C07_Odev();

		// verileri objeye bagladim
		kiraci.setName(name);
		kiraci.setRoomCount(roomCount);
		kiraci.setBalconyOrNo(balconyOrNo); 
		
	
		// yazdirdim
		System.out.println("Sayin " + kiraci.getName() + "\n" +kiraci.getRoomCount() + " odali daire kirasi  : "
				+ kiraci.daireFiyati(roomCount)) ;
		
		scan.close();
	}

}
