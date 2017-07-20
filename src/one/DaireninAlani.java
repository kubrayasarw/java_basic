package one;

import java.util.Scanner;

/**
 * Created by kubra on 3.07.2017.
 */
public class DaireninAlani {

    public static void main(String[] args) {
        double radius,area;
        Scanner scn=new Scanner(System.in);
        System.out.println("Dairenin yarıçapını giriniz:");
        radius=scn.nextDouble();
        area=radius*radius*3.14;
        System.out.println("Dairenin alanı="+area);


    }
}
