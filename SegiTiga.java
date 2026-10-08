/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul10;

/**
 *
 * @author Dante
 */
public class SegiTiga {//awal program SegiTiga
    public static void main(String[]args){//awal program yang akan dijalankan
        
        //deklarasi variable alas, tinggi sebagi interger dan variable hasil sebagai double
        int alas, tinggi;
        double hasil;//beri.catatan.tentang.mengapa.float.tidak.berhasil
        
        //menyimpan value ka dalam variable alas dan tinggi
        alas=35;
        tinggi=3;
        
        //rumus perhitungan hasil atau luas yang akan disimpan kedalam variable 
        hasil=alas*tinggi*0.5;
        
        //mencetak hasil ke terminal
        System.out.println("Hasil dari luas segitiga adalah: "+hasil);
        
    }
}
