package two;

/**
 * Created by kubra on 20.07.2017.
 */
public class HextoDec {
    public static int hextoDec(String hex)
    {
        int sonuc=0,us=0;
        String hexler="0123456789ABCDEF";
        for(int i=hex.length()-1;i>=0;i--)
        {
            sonuc+=hexler.indexOf(hex.charAt(i))*
                    Math.pow(16, us);
            us++;
        }
        return sonuc;
    }

    public static void main(String[] args) {
        System.out.println(hextoDec("1ABC"));
    }
}
