/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul10;

/**
 *
 * @author Dante
 */
public class LuasKelilingSegiEmpat {//awal dari program LuasKelilingSegiEmpat
    public static void main(String[]args){//awal progam yang akan dijalankan 
        
        //deklarasi variable panjang, lebar, luas, keliling sebagai interger
        int panjang, lebar, luas, keliling;
        
        //menyimpan value atau nilai ke dalam variable panjang dan lebar
        panjang=15;
        lebar=10;
        
        //rumus perhitungan luas dan keliling dan menyimpan hasilnya ke dalam variable luas dan keliling
        luas=panjang*lebar;
        keliling=2*(panjang+lebar);
        
        //mencetak hasil perhitungan luas dan keliling ke terminal
        System.out.println("Hasil luas segiempat adalah: "+luas);
        System.out.println("Hasil keliling segiempat adalah: "+keliling);
    }
}
