package two;

/**
 * Created by kubra on 20.07.2017.
 */
public class DiziRasgeleSırala {


    public static void main(String[] args) {
        int[] dizi={15,25,35,45,55,65};
        int temp,sayi;
        for(int i=0;i<dizi.length;i++)
        {
            sayi=(int)(Math.random()*dizi.length);
            temp=dizi[i];
            dizi[i]=dizi[sayi];
            dizi[sayi]=temp;
        }
        for(int i=0;i<dizi.length;i++)
            System.out.println(dizi[i]);
        for(int eleman:dizi)
            System.out.print(eleman+"  " );
    }
}
