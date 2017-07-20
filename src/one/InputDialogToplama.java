package one;

import javax.swing.*;

/**
 * Created by kubra on 3.07.2017.
 */
public class InputDialogToplama {

    public static void main(String[] args) {
        String sayi1,sayi2;
        sayi1= JOptionPane.showInputDialog(null,"sayi1");
        sayi2=JOptionPane.showInputDialog(null,"sayi2");
        JOptionPane.showMessageDialog(null,
                Integer.parseInt(sayi1)+
                        Integer.parseInt(sayi2));


    }
}
