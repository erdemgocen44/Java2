package _98_Projects.calisanlarMiniProje;

import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {
        System.out.println("JAVA SIRKETINE HOSGELDINIZ !\n\n");
        Scanner scan = new Scanner(System.in);
        String secim = "";
        while (!secim.equals("3")){
            System.out.println("Lutfen seciniz...\n1-Yazilimci girisi\n2-Yonetici girisi\n3-Cikis yap");
            secim = scan.next();
            if (secim.equals("1")){
                Yazilimci developer = new Yazilimci("Mehmet","BULUTLUOZ",101,"+90 123 456 7890","Java, Selenyum");
                String yazilimciSecim = "";
                while (!yazilimciSecim.equals("3")) {
                    System.out.println("Yazilim girisindesiniz !\n1-Bilgileri goruntule\n2-Kod yaz\n3-Yazilimci girisinden cikis yap");
                    yazilimciSecim = scan.next();
                    if (yazilimciSecim.equals("1")){
                        developer.bilgileriGoster();
                    }else if (yazilimciSecim.equals("2")){
                        developer.kodYaz("MACBOOK");
                        System.out.println("Gayet basarili kod yazdiniz yonetici size zam yapabilir..");
                        Yonetici patron = new Yonetici("Boss","Boss",0,"0",0);

                        patron.zamYap(250);
                    }else if (yazilimciSecim.equals("3")){
                        System.out.println("Yazilimci girinden cikis yapiliyor...");
                    }else{
                        System.out.println("Yanlis tuslama yaptiniz tekrar deneyiniz...");
                    }





                }



            }else if (secim.equals("2")){
                Yonetici yonetici = new Yonetici("Haluk","BILGIN",100,"+90 321 456 7890",200);
                String yoneticiSecim = "";
                while (!yoneticiSecim.equals("3")){
                    System.out.println("Lutfen seciniz...\n1-Bilgileri goruntule\n2-Zam yap\n3-Cikis yap");
                    yoneticiSecim= scan.next();
                    if (yoneticiSecim.equals("1")){
                        yonetici.bilgileriGoster();
                    }else if (yoneticiSecim.equals("2")){
                        yonetici.zamYap(500);
                    }else if (yoneticiSecim.equals("3")){
                        System.out.println("Yonetici girinden cikis yapiliyor...");
                    }else {
                        System.out.println("Yanlis tuslama yaptiniz tekrar deneyiniz...");
                    }
                }




            }else if (secim.equals("3")){
                System.out.println("****************************");
                System.out.println("CIKIS YAPILIYOR");
                System.out.println("****************************");
            } else{
                System.out.println("Yanlis tuslama yaptiniz tekrar deneyiniz...");
            }






        }













    }






}
