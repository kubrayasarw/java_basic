package one;

import java.util.Scanner;

/**
 * Created by kubra on 3.07.2017.
 */
public class CiftseTopla {


    public static void main(String[] args) {

        int sayi,toplam=0;
        Scanner scn=new Scanner(System.in);
        while(true)
        {
            System.out.println("sayi giriniz:");
            sayi=scn.nextInt();
            if(sayi%2==0)
                toplam+=sayi;
            else
                break;
        }
        System.out.println("toplam="+toplam);
    }

}
