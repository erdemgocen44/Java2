package CoreJavaDay50.day49_Queue_Degue_Maps._04_switchCase;

import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {

        // Bugune gore 100 gun sonra hangi gun oldugunuz yazdiriniz.
        // pazartesi
        Scanner scan = new Scanner(System.in);
        System.out.print(
                "Pazartesi: 1 \nSali: 2 \nCarsamba: 3 \nPersembe: 4 \nCuma: 5 \n" +
                        "Cumartesi: 6 \nPazar: 7 \nLutfen haftanin kacinci gununde oldugunu yazin : ");
        int kacinciGun = scan.nextInt();
        System.out.println("Lutfen kac gun sonrasini merak ettiginizi yazin :");
        int kacGun = scan.nextInt();
        int hangiGun = (kacGun % 7 + kacinciGun) % 7;
        if (kacinciGun <= 7 && kacinciGun > 0) {
            if (kacGun > 0) {
                switch (hangiGun) {
                    case 1: {
                        System.out.println(kacGun + " gun sonra gunlerden Pazartesi.");
                        break;
                    }
                    case 2: {
                        System.out.println(kacGun + " gun sonra gunlerden Sali.");
                        break;
                    }
                    case 3: {
                        System.out.println(kacGun + " gun sonra gunlerden Carsamba.");
                        break;
                    }
                    case 4: {
                        System.out.println(kacGun + " gun sonra gunlerden Persembe.");
                        break;
                    }
                    case 5: {
                        System.out.println(kacGun + " gun sonra gunlerden Cuma.");
                        break;
                    }
                    case 6: {
                        System.out.println(kacGun + " gun sonra gunlerden Cumartesi.");
                        break;
                    }
                    case 7: {
                        System.out.println(kacGun + " gun sonra gunlerden Pazar.");
                        break;
                    }
                }
            } else {
                System.out.println("Gecmis gecmiste kaldi :)");
            }
        } else {
            System.out.println("Hafta 7 gun dostum!");
        }
        scan.close();
    }
}
