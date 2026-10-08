/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul10;

/**
 *
 * @author Dante
 */
public class KelilingLuasLingkaran {//awal dari kelas KelilingLuasLingkungan
    public static void main(String[]args){//awal program yang akan dijalankan
        
        //deklarasi variable jari2 sebagai interger, dan variable luas, pie, keliling sebagai double
        int jari2;
        double luas,pie,keliling;
        
        //menyimpan value atau nilai kedalam variable 
        jari2=21;
        pie=3.14;
        
        //rumus perhitungan luas dan keliling lingkaran dan menyimpan hasilnya ke dalam variable luas dan keliling
        luas=jari2*jari2*pie;
        keliling=2*pie*jari2;
        
        //mencetak hasil perhitungan luas dan keliling ke terminal
        System.out.println("Hasil luas lingkaran adalah: "+luas);
        System.out.println("Hasil keliling lingkaran adalah: "+keliling);
    }
}
