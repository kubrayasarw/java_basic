package two;

/**
 * Created by kubra on 20.07.2017.
 */
public class SesliHarfSayisi {



    public static int sesliBul(String mesaj)
    {
        int sonuc=0;
        String sesliler="aeıioöuü";
        for(int i=0;i<mesaj.length();i++)
            if(sesliler.indexOf(mesaj.charAt(i))>=0)
                sonuc++;
        return sonuc;
    }

    public static void main(String[] args) {
        System.out.println(sesliBul("merhaba"));
    }
}
