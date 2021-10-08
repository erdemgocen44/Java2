package _09_Arrays;

import java.util.Arrays;

public class Q16 {
    public static void main(String[] args) {
        /*
        Write a method which accepts  string as parameter and prints the sum of digits
        present in thr given string
        input :"ade1r4d3"
        output : 8
        trick : Use --> Character.isDigit()
                    --> Integer.valueOf()
         */



        String str = "ade1r4d3";
        int sum = 0;

        String arr[] = str.split("");
        System.out.println(Arrays.toString(arr));

        for (String w : arr) {

            if (Character.isDigit(Integer.valueOf(w.charAt(0)))) {
                sum += Integer.valueOf(w);
            } else {
                continue;
            }
        }
        System.out.println(sum);

    }


    }

