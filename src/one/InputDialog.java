package one;

import javax.swing.*;

/**
 * Created by kubra on 3.07.2017.
 */
public class InputDialog {

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "MERHABA Dünya");
        int sayi=Integer.parseInt(JOptionPane.showInputDialog(null,"değer giriniz","Dikkat",JOptionPane.INFORMATION_MESSAGE));
        System.out.println(sayi*2);
    }
}
