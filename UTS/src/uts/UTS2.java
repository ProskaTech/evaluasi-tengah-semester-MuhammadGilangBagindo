package uts;

/**
 *
 * Created by 21343030_Muhammad Gilang Bagindo
 */

import java.util.Scanner;

public class UTS2 {
    public static void main(String[] args) {
        int i, j, k, baris;
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Baris \n");
        baris = in.nextInt();
        for (i = baris; i >= 1; i--){
            for (j = baris; j > i; j--){
                System.out.print(" ");
            }
            for (k = 1; k < (2 * i); k++){
                System.out.print("#");
            }
            System.out.println();
        }
        for (i = 1; i <= baris; i++){
            for (j = baris; j > i; j--){
                System.out.print(" ");
            }
            for (k = 1; k < (2 * i); k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
