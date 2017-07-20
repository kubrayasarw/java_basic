package one;

import java.util.Scanner;

/**
 * Created by kubra on 3.07.2017.
 */
public class FahrenaytCelsius {

    public static void main (String[] args){
        double f,c;
        Scanner scn=new Scanner(System.in);
        System.out.println("f Giriniz:");
        f=scn.nextDouble();
        c=(5.0/9)*(f-32);
        System.out.println("c="+c);
        System.out.println(f+" fahrenayt "+c+" celsius eder" );
    }

}
