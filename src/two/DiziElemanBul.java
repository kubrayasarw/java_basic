package two;

/**
 * Created by kubra on 20.07.2017.
 */
public class DiziElemanBul {
//parametre olarak gelen cok boyutlu bir dizide birin olduğu satır ve suıtunları string e kaydeden geri donduren metot
    public static String birBul(int[][] gelen)
    {
        String sonuc="";
        for(int i=0;i<gelen.length;i++)
            for(int j=0;j<gelen[i].length;j++)
                if(gelen[i][j]==1)
                    sonuc+="("  +i+  ","  +j+  ")\n";
        return sonuc;
    }
    public static void main(String[] args) {
        int[][] komsuluk={{0,1,0,1},{1,1,0,0},{0,0,1,1},
                {0,0,0,0}};
        System.out.println(birBul(komsuluk));
    }
}
