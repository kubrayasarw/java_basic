package three;

import java.util.Scanner;

/**
 * Created by kubra on 6.08.2017.
 */
public class AdamAsma {


    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String kelime = "program";
        String kelimed = "*******";
        StringBuilder s = new StringBuilder(kelimed);

        while (true) {
            System.out.println("bir tahmin");
            String a = scn.next();
            if (kelime.contains(a))//Var ise
            {


                for (int i = 0; i < kelime.length(); i++)

                {
                    if (kelime.charAt(i) == a.charAt(0)) {
                        s.setCharAt(i, a.charAt(0));
                    }
                    kelimed = s.toString();
                }
            } else// yok ise
                System.out.println("hatalı");
            System.out.println(kelimed);
            if (!kelimed.contains("*"))
                break;
        }

    }
}
