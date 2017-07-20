package one;

import java.util.Scanner;

/**
 * Created by kubra on 3.07.2017.
 */
public class Faktoriyel {


    public static void main(String[] args) {

        Scanner scn=new Scanner(System.in);
        System.out.println("faktöriyeli  hesaplanacak deger giriniz:");
        int faktoriyel=scn.nextInt();

        if (faktoriyel==0)
            System.out.println(1);
        else {
            int s=1;
            for (int i = faktoriyel; i >=1; i--)
            {
                 s=s*i;

            }
            System.out.println(s);
        }}}
