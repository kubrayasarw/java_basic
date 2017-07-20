package two;

/**
 * Created by kubra on 20.07.2017.
 */
public class StringTersCevir {

    public static String tersCevir(String mesaj)
    {
        String sonuc="";
        for(int i=mesaj.length()-1;i>=0;i--)
            sonuc+=mesaj.charAt(i);
        return sonuc;
    }

    public static void main(String[] args) {
        System.out.println(tersCevir("merhaba"));
    }
}
