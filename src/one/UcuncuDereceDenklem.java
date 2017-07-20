package one;

/**
 * Created by kubra on 18.06.2017.
 */
import java.util.Scanner;
public class UcuncuDereceDenklem {


    public static void main(String[] args) {

        double delta;
        Scanner s=new Scanner (System.in);
        System.out.println("x^2 nin katssayısını gir");
        double a=s.nextInt();
        System.out.println("x in katsayısının gir");
        double b=s.nextInt();
        System.out.println("sabit sayıyı gir");
        double c=s.nextInt();

        delta=b*b-4*a*c;
        if (delta>0){
            double x1=(-b+Math.pow(delta,1/2))/2*a;
            double x2=(-b-Math.pow(delta, 1/2)/2*a);
            System.out.println("iki farklı kök vardır");
            System.out.println("denklemin birinci kükü="+x1);
            System.out.println("denklemin ikinci kökü="+x2);
        }
        else if(delta==0){
            double x1=-b/(2*a);
            System.out.println("eşit iki kök vardır");
            System.out.println(" denklemin  iki esit kökü :x1 = x2="+x1);
        }
        else
            System.out.println("kök yoktur");

    }

}
