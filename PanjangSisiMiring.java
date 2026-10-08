/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul10;

/**
 *
 * @author Dante
 */
public class PanjangSisiMiring { //awal dar kelas PanjangSisiMiring
    public static void main(String[]args){ //awal mulai program main
        
        //deklarasi variable alas dan tinggi sebagai interger, dan variable miring sebagai double
        int alas,tinggi;
        double miring;
        
        //menyimpan value atau nilai kedalam variable
        alas=8;
        tinggi=10;
        
        //menginput variable alas dan tinggi ke dalam rumus yang akan digunakan untuk mengisi variable miring
        miring=Math.sqrt((alas*alas)+(tinggi*tinggi)); //mengambil.info.dari.w3school tentang cara mengakar pangkat
        
        //mencetak hasil perhitungan variable miring ke terminal
        System.out.println("Hasil panjang sisi miring segitiga adalah: "+miring);
    }
}
