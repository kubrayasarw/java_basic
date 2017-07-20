package one;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by kubra on 3.07.2017.
 */
public class RandomTahmin {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int tahmin,hak=0;
        Random rnd=new Random();
        int sayi = rnd.nextInt(11);
        System.out.println(sayi);
        System.out.println("Tahminniz");
        tahmin=scn.nextInt();

        while(sayi!=tahmin)
        {

            if(tahmin>sayi)
                System.out.println("büyük tahminde bulundunuz");
            else if(tahmin<sayi)
                System.out.println("küçük tahminde bulundunuz");
            hak++;
            System.out.println("Tahmininiz");
            tahmin=scn.nextInt();

        }
        System.out.println("tebrikler"+hak+"hakta bildiniz");
    }

}
