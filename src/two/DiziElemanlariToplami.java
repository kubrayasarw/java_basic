package two;

/**
 * Created by kubra on 20.07.2017.
 */
public class DiziElemanlariToplami {




        public static void main(String[] args) {
            int[] dizi={1,2,3,4,5,6,7,8,9,10};
            int toplam=0;
            for(int i=0;i<dizi.length;i++)
                toplam+=dizi[i];
            System.out.println("Toplam="+toplam);
        }

}
