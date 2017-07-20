package one;

import java.util.Scanner;

/**
 * Created by kubra on 3.07.2017.
 */
public class AradakiTekSayilar {

    public static void main(String[] args) {

        int sayi = 0;
        Scanner scn = new Scanner(System.in);
        System.out.println("iki sayı giriniz");
        int s1 = scn.nextInt();
        int s2 = scn.nextInt();
        for (int i = s1; i <= s2; i++) {
            if (i % 2 == 1) {

                sayi = sayi + 1;
                System.out.println(i);

            }
        }
    }}