package uts;

/**
 *
 * Created by 21343030_Muhammad Gilang Bagindo
 */

import javax.swing.JOptionPane;
        
public class UTS3 {
    public static void main(String[] args) {
        int angka;
        String a;
        
        a = JOptionPane.showInputDialog("Masukkan Angka");
        angka = Integer.parseInt(a);
        
        if(angka >= 0){
            JOptionPane.showMessageDialog(null,"Angka "+angka+" merupakan bilangan positif");
        }
        else{
            JOptionPane.showMessageDialog(null,"Angka "+angka+" merupakan bilangan negatif");
        }
    }
}
