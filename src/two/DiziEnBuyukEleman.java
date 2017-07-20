package two;

/**
 * Created by kubra on 20.07.2017.
 */
public class DiziEnBuyukEleman {

    public static void main(String[] args) {
        int[] dizi={15,25,12,35,65,23,34};
        int enb=dizi[0];
        for(int i=1;i<dizi.length;i++)
            if(dizi[i]>enb)
                enb=dizi[i];
        System.out.println("En Buyuk="+enb);
    }
}
