/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tebaklagi;

/**
 *
 * @author Nel
 */
import java.util.Scanner;
public class angka {
    int skor = 100; 
    int bonus = 0; 
    int acak = (int)(Math.random() *100); 
    int percobaan = 0; 
    
    void tampilAwal(){ //Sebagai game tebak angkanya
        int angka;
        System.out.println("---------------------------------------------------");
        System.out.println("Hai.. nama saya Anelka, saya telah memilih sebuah ");
        System.out.println("bilangan bulat secara acak antara 0 s/d 100. Silakan tebak ya!!!");
        System.out.println("Skor Kamu " + skor);        
//        System.out.println(acak);
        System.out.println("---------------------------------------------------");
    while (skor > 0) { 
        System.out.print("Coba Tebak Angkanya xixixi : ");      
        Scanner jawab = new Scanner (System.in);
        int inputan = jawab.nextInt();
        percobaan += 1;
        if (inputan == acak) {
            System.out.println("---------------------------------------------------");
            System.out.println("Jawaban Kamu Benar!");
            System.out.println("Skor Kamu " + skor);
            if (percobaan <= 5){
                bonus += 50;
                skor += bonus;
                System.out.println("Bonus Kamu " +bonus);
                System.out.println("Total Skor Kamu " + skor);
                System.out.println("Banyak Percobaan " + percobaan + " x");
            }
        break;         
        } else if (inputan < acak) {
            System.out.println("Yahh Tebakan Kamu Terlalu Kecil u.u");
            skor -= 2;
            System.out.println("Kamu sudah mencoba " + percobaan + " x loh");
            System.out.println("Skor Kamu " + skor);            
            System.out.println("---------------------------------------------------");
        } else {
            System.out.println("Yahh Tebakan Kamu Terlalu Besar u.u");
            skor -= 2;
            System.out.println("Kamu sudah mencoba " + percobaan + " x loh");
            System.out.println("Skor Kamu " + skor);            
            System.out.println("---------------------------------------------------");
        }            
        if (skor == 0){
            System.out.println("Skor Kamu Habis");
            System.out.println("Angka yang dimaksud adalah " + acak);
            System.out.println("---------------------------------------------------");
        }
    }
    }
}
