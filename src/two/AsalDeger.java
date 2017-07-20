package two;

import java.util.Scanner;

/**
 * Created by kubra on 20.07.2017.
 */
public class AsalDeger {

    public static void main(String[] args) {
        int sayi,bolenSayisi=0;
        Scanner scn=new Scanner(System.in);
        while (true)
        {System.out.println("Sayiyi Giriniz");
            sayi=scn.nextInt();
            for(int i=1;i<=sayi;i++)
            {
                if(sayi % i==0)
                    bolenSayisi++;
                if(bolenSayisi==3)
                    break;
            }
            if(bolenSayisi==2)
            {System.out.println("Sayi asal");
                break;}
            else
            {System.out.println("Sayi asal degil");
                continue;}
        }


    }

}
