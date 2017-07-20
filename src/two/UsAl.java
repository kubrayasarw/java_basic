package two;

/**
 * Created by kubra on 20.07.2017.
 */
public class UsAl {

    public static int usAl(int taban,int us)
    {
        int sonuc=1;
        for(int i=1;i<=us;i++)
            sonuc*=taban;
        return sonuc;
    }

    public static void main(String[] args) {
        System.out.println(usAl(2, 5));
    }


}
