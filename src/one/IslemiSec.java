package one;

import java.util.Scanner;

/**
 * Created by kubra on 3.07.2017.
 */
public class IslemiSec {

    public static void main(String[] args) {
        int sayi1,sayi2;
        String islem;
        Scanner scn=new Scanner(System.in);
        System.out.println("sayi1 gir:");
        sayi1=scn.nextInt();
        System.out.println("sayi2 gir:");
        sayi2=scn.nextInt();
        System.out.println("islem tipi gir:");
        islem=scn.next();
        if(islem.equals("+"))
            System.out.println("sayi1+sayi2="+(sayi1+sayi2));
        else if(islem.equals("-"))
            System.out.println("sayi1-sayi2="+(sayi1-sayi2));

    }
}
