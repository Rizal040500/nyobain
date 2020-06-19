/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan.pkg1;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Latihan1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float x;
        float y;
        float hasil;
        float hasil2;
        float hasil3;
        float hasil4;
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan nilai x : ");
        x = scan.nextInt();
        System.out.println("Masukkan nilai y : ");
        y = scan.nextInt();
        hasil = x+y;
        hasil2 = x*y;
        hasil3= x-y;
        hasil4 = x/y;
        System.out.println("Hasil penjumlahan = "+hasil)
        System.out.println("Hasil perkalian = "+hasil2)
        System.out.println("Hasil pengurangan = "+hasil3)        
        System.out.println("Hasil pembagian = "+hasil4)
        // TODO code application logic here
    }
    
}
