package two;

/**
 * Created by kubra on 20.07.2017.
 */
public class Overloading {
    public static int topla(int a,int b)
    {
        return a+b;
    }
    public static int topla(int a,int b,int c)
    {
        return a+b+c;
    }
    public static double topla(double a,double b)
    {
        return a+b;
    }
    public static void main(String[] args) {
        System.out.println(topla(2,3));
        System.out.println(topla(2,3,4));
        System.out.println(topla(2.0,3.0));
    }


}
