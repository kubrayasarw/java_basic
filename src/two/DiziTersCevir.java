package two;

/**
 * Created by kubra on 20.07.2017.
 */
public class DiziTersCevir {


    public static int[] tersCevir(int[] gelen)
    {
        int[] ters=new int[gelen.length];
        for(int i=gelen.length-1,j=0;i>=0;i--,j++)
            ters[i]=gelen[j];
        return ters;
    }
    public static void main(String[] args) {
        int[] sonuc=tersCevir(new int[]{1,2,3,4,5});
        for(int eleman:sonuc)
            System.out.println(eleman);
    }
}
