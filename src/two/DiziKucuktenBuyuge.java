package two;

/**
 * Created by kubra on 20.07.2017.
 */
public class DiziKucuktenBuyuge {

    public static void main(String[] args) {
        int[] dizi={12,5,6,4,8,13};
        int temp;
        for(int i=0;i<dizi.length;i++)
            for(int j=i;j<dizi.length;j++)
                if(dizi[j]<dizi[i])
                {
                    temp=dizi[i];
                    dizi[i]=dizi[j];
                    dizi[j]=temp;
                }
        for(int eleman:dizi)
            System.out.println(eleman);
    }
}
