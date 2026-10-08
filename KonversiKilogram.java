/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul10;

/**
 *
 * @author Dante
 */
public class KonversiKilogram {//awal dari program KonversiKilogram
    public static void main(String[]args){//awalprogram yang akan dijalankan
        
        //deklarasi variable pon dan kg sebagai double
        double pon, kg;
        
        //menyimpan value atau nilai ke dalam variable pon
        pon=55.5;
        
        //rumus perhitungan kg dan menyimpan hasil ke dalam variable kg
        kg=0.454*pon;
        
        //mencetak hasil perhitungan kg ke terminal
        System.out.println(pon+" pon = "+kg+" kg");
    }
}
