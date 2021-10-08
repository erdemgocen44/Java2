package ReplitGithub;

import java.util.Arrays;

public class RG35_Array2ElemanınToplamindanOlusanSayilar {

    public static void main(String[] args) {

    /*35----
    Methoda iki sayı girelim ve  bize bir array dönsün.
     Array elemanları 1.sayının 2. sayı kadar kendisi ile
     toplamından oluşsun.

    Test Data:
    arrayOfMultiples(7, 5)

    sonuç: [7,14,21,28,35]
    */

        int a=7;
        int b=5;

        arrayOlustur(a,b);
    }

    public static void arrayOlustur(int a, int b) {
        int arr[]=new int[b];
        for (int i = 1; i <= b; i++) {
            arr[i-1]=a*i;
        }
        System.out.println(Arrays.toString(arr));

    }
    }