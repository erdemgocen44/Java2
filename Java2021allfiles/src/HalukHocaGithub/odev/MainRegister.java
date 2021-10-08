package odev;



import _12_dateTime.odev.Registration;
import _12_dateTime.odev.User;

import java.util.ArrayList;
import java.util.Scanner;

public class MainRegister {
    public static void main(String[] args) {
        menu();
    }
    private static void menu() {
        Scanner scan = new Scanner(System.in);
        String islem;
        Registration userReg = new Registration();
        ArrayList<_12_dateTime.odev.User> register = null;
        boolean cikilsinMi = false;
        while (!cikilsinMi) {
            System.out.println("Lütfen Ekleme için 1\nListeleme için 2\nŞanslı kişi bulma için  3\nÇıkış için 4\ngiriniz : ");
            islem = scan.nextLine();
            switch (islem) {
                case "1":
                    register = (ArrayList<User>) userReg.register();
                    break;
                case "2":
                    userReg.listele(register);
                    break;
                case "3":
                    userReg.printHappyUsers(register);
                    break;
                case "4":
                    cikilsinMi = true;
                    break;
                default:
                    System.out.println("Yanlış bir değer girdiniz");
                    break;
            }
        }
    }
}
