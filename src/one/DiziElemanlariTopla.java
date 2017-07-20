package one;

import java.util.Scanner;

/**
 * Created by kubra on 3.07.2017.
 */
public class DiziElemanlariTopla {




    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int toplam=0;


        int[] sayilar=new int[10];
        for(int i=0;i<sayilar.length;i++)
        {
            System.out.print("dizi["+i+"]=");
            sayilar [i]=scn.nextInt();
            toplam=toplam+sayilar[i];

        }
        System.out.println(toplam);


    }
}
