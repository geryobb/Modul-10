/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul10;

/**
 *
 * @author Dante
 */
public class SegiEmpat {//awal program SegiEmpat
    public static void main(String[]args){//awal program yang akan dijalankan
        
        //deklarasi variable panjang, lebar sebagai interger
        int panjang, lebar;
        double luas;//bisa.int.atau.double.tp.java.defaultnya.double
        
        //menyimpan value atau nial ke dalam variable 
        panjang=4;
        lebar=3;
        
        //rumus perhitungan luas dan menyimpan hasil perhitungan tersebut ke dalam variable luas
        luas=panjang*lebar;
        
        //mencetak hasil perhitungan variable luas ke terminal
        System.out.println("Hasil dari luas segi empat adalah: "+luas);
    }
}
