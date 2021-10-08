package CoreJavaDay50.day49_Queue_Degue_Maps._04_switchCase;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {

// Girilen bir ay numaras�na g�re , ay�n ka� g�n oldu�unu say� ile yazd�r�n�z

        Scanner oku = new Scanner(System.in);
        System.out.print("Ay No =");
        int ayNo = oku.nextInt();

//        switch (ayNo)
//        {
//            case 1:   System.out.println("31");break;
//            case 2 :  System.out.println("28"); break;
//            case 3 :  System.out.println("31"); break;
//            case 4 :  System.out.println("30"); break;
//            case 5 :  System.out.println("31"); break;
//            case 6 :  System.out.println("30"); break;
//            case 7 :  System.out.println("31"); break;
//            case 8 :  System.out.println("31"); break;
//            case 9 :  System.out.println("30"); break;
//            case 10 :  System.out.println("31"); break;
//            case 11 :  System.out.println("30"); break;
//            case 12 :  System.out.println("31"); break;
//            default: System.out.println("Hatal� no");
//        }

        switch (ayNo) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Girdi�iniz ay 31 g�n");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Girdi�iniz ay 30 g�n");
                break;
            case 2:
                System.out.print("y�l = ");
                int yil = oku.nextInt();
                if (yil % 4 == 0)
                    System.out.println("Girdi�iniz ay 29 g�n");
                else
                    System.out.println("Girdi�iniz ay 28 g�n");
                break;

            default:
                System.out.println("Hatal� giri� yapt�n�z!!!");
        }
        oku.close();
    }
}