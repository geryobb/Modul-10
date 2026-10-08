/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul10;

/**
 *
 * @author Dante
 */
public class VolumeKotak { //awal dari kelas VolumeKotak
    public static void main(String[]args){//awal mulai program main
        
        //deklarasi tipe data panjang,lebar,tinggi,volume sebagai interger
        int panjang,lebar,tinggi,volume;
        
        //menyimpan angka atau data dalam variable panjang,lebar,tinggi
        panjang=10;
        lebar=15;
        tinggi=5;
        
        //menyimpan hasil perkalian panjang*lebar*tinggi dalam variable volume
        volume=panjang*tinggi*lebar;
        
        //mencetak hasil perkalian ke terminal bersama dengan string teks pengantar
        System.out.println("Hasil volume kotak adalah: "+volume);
    }
}
