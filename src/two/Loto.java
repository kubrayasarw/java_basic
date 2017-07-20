package two;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by kubra on 20.07.2017.
 */
public class Loto {

    public static void main(String[] args) {
        int[] dizi=new int[6];
        int sayi,j,tahminSayi=0;
        Scanner scn=new Scanner(System.in);
        Random rnd=new Random();
        for(int i=0;i<6;i++)
        {
            while(true)
            {
                sayi=rnd.nextInt(49)+1;
                for(j=0;j<i;j++)
                {
                    if(dizi[j]==sayi)
                        break;}

                if(j==i)
                {
                    dizi[i]=sayi;
                    System.out.println(dizi[j]);
                    break;
                }
            }
        }
        for(int i=0;i<6;i++)
        {
            System.out.println((i+1)+". tahmininiz:");
            sayi=scn.nextInt();

            for(j=0;j<6;j++)
                if(dizi[j]==sayi)
                {
                    tahminSayi++;
                    break;
                }
        }
        System.out.println(tahminSayi+" dogru tahmin var");

    }
}
