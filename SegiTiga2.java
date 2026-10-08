/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul10;

/**
 *
 * @author Dante
 */
public class SegiTiga2 {//awal dari program SegiTiga2
    public static void main(String[]args){//awal program dijalankan
        
        //deklarasi variable alas, tinggi sebagai interger dan variable luas sebagai double
        int alas, tinggi;
        double luasSeg;
        
        //menyimpan value atau nilai ke dalam variable alas dan tunggi
        alas=35;
        tinggi=3;
        
        //rumus perhitungan luas dan menyimpan hasil ke dalam variable luas
        luasSeg=alas*tinggi*0.5;
        
        //mencetak hasil perhitungan luas beserta value variable alas dan tinggi ke terminal
        System.out.println("Hasil dari luas segitiga dengan alas: "+alas+" dan tinggi: "+tinggi+" adalah: "+luasSeg);
    }
}
