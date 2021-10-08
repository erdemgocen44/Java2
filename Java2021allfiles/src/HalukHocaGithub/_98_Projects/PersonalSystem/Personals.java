package _98_Projects.PersonalSystem;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Personals {


    private static int id = 1000;
    private String personalId;
    private String firstName;
    private String lastName;
    private int level;

    private String levelString;

    private static int maas;


    public void setPersonalId() {

        id++;
        this.personalId = level + "" + id;

    }

    public Personals() {

        Scanner scan = new Scanner(System.in);

        System.out.println("L�tfen �al��an�n ad�n� giriniz");

        this.firstName = scan.nextLine();

        System.out.println("L�tfen �al��an�n soyad�n� giriniz");

        this.lastName = scan.nextLine();

        System.out.println("L�tfen �al��an�n seviyesini giriniz\n1- Junior\n2- Middle\n3- Senior");

        this.level = scan.nextInt();

        System.out.println("L�tfen �al��an�n maa��n� giriniz");

        this.maas = scan.nextInt();

        if (level == 1) {

            this.levelString = "Junior";

        } else if (level == 2) {

            this.levelString = "Middle";

        } else if (level == 1) {

            this.levelString = "Senior";

        }

        setPersonalId();

        System.out.println("Id niz : " + personalId);

        System.out.println("Id nizi bir yere kaydetmenzi �neririz");

    }


    public String toString() {

        return "�ALI�ANIN NUMARASI: " + personalId + "\n�ALI�ANIN ADI: " + firstName + " " + lastName + "\n�ALI�ANIN SEV�YES�: " + levelString + "\nMAAS: " + maas + "$";


    }

    static Map<String, String> personalInfo = new HashMap<>();

    static Map<Integer, String> personalInfoInt = new HashMap<>();

    public static void mapePersonelEkleme() {

        Scanner scan = new Scanner(System.in);

        String stop = "";

        while (!stop.equalsIgnoreCase("dur")) {

            Personals p = new Personals();


            personalInfo.put(p.personalId, p.toString());

            System.out.println("�slemleri bitirmek i�in dur yaz�n�z");
            System.out.println("Devam etmek i�in enter a bas�n�z");

            stop = scan.nextLine();
        }

        islemSec();

    }

    public static void getPersonalInfo() {

        Scanner scan = new Scanner(System.in);

        String personelinIdsi = "";

        String sonuc = "";

        do {
            System.out.println("L�tfen �al��an�n bilgilerini almak i�in idsini giriniz");
            System.out.println("Program� bitirmek i�in ��k�� yaz�n�z");

            personelinIdsi = scan.nextLine();

            sonuc = personalInfo.get(personelinIdsi);

            if (!personelinIdsi.equalsIgnoreCase("��k��")) {

                System.out.println(sonuc);

            }

        } while (!personelinIdsi.equalsIgnoreCase("��k��"));

        islemSec();

    }

    public static void personalSil() {

        Scanner scan = new Scanner(System.in);

        String personalinIdsi = "";

        String sonuc = "";

        do {
            System.out.println("L�tfen personali silmek i�in idsini giriniz");
            System.out.println("Program� bitirmek i�in ��k�� yaz�n�z");

            personalinIdsi = scan.nextLine();

            sonuc = personalInfo.remove(personalinIdsi);

            if (!personalinIdsi.equalsIgnoreCase("��k��")) {

                System.out.println(sonuc);

                System.out.println("Personel listeden silindi");

            }

        } while (!personalinIdsi.equalsIgnoreCase("��k��"));

        islemSec();

    }

    public static void islemSec() {

        System.out.println("��lem se�in:\n1-�al��an Ekleme\n2-�al��an�n bilgilerini getirme\n3-�al��an�n bilgilerini silme\n4- T�m �al��anlar� g�rme");

        Scanner scan = new Scanner(System.in);

        int islem = scan.nextInt();

        switch (islem) {

            case 1:

                mapePersonelEkleme();
                break;

            case 2:

                getPersonalInfo();

                break;

            case 3:

                personalSil();

                break;

            case 4:

                tumPersonelleriGoster();

            default:
                System.out.println("Yanl�� i�lem girdiniz 1,2 , 3 ya da 4 giriniz");
                islemSec();
                break;

        }

        islemSec();

    }

    public static void tumPersonelleriGoster() {


        for (int i = 1; i <= personalInfoInt.size(); i++) {

            System.out.println(personalInfoInt.get(i));

            System.out.println("--------------------------------");

        }
    }
}




