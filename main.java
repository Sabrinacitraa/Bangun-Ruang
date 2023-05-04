/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BangunRuang;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("===================================================");
        System.out.println("\t Menampilkan Volume Bangun Ruang");
        System.out.println("===================================================");
        
        BangunRuang b = new BangunRuang();
        Kubus k = new Kubus();
        System.out.print("Masukkan nilai sisi kubus    : ");
        k.sisi = input.nextInt();
        k.volume();
        System.out.println("===================================================");
        Balok balok = new Balok();
        System.out.print("Masukkan nilai panjang balok  : ");
        balok.panjang = input.nextInt();
        System.out.print("Masukkan nilai lebar balok    : ");
        balok.lebar   = input.nextInt();
        System.out.print("Masukkan nilai tinggi balok   : ");
        balok.tinggi  = input.nextInt();
        balok.volume();
        System.out.println("===================================================");
        Tabung t = new Tabung();
        System.out.print("Masukkan jari - jari tabung    : ");
        t.jari2 = input.nextInt();
        System.out.print("Masukkan nilai tinggi tabung   : ");
        t.tinggi = input.nextInt();
        t.volume();
        System.out.println("===================================================");
        kerucut kr = new kerucut();
        System.out.print("Masukkan jari - jari kerucut    : ");
        kr.jari2 = input.nextInt();
        System.out.print("Masukkan nilai tinggi kerucut   : ");
        kr.tinggi= input.nextInt();
        kr.volume();
        System.out.println("===================================================");
        Limas l = new Limas();
        System.out.print("Masukkan nilai alas limas       : ");
        l.a = input.nextInt();
        System.out.print("Masukkan nilai tinggi limas     : ");
        l.t = input.nextInt();
        l.volume();
        System.out.println("===================================================");        
        Prisma p = new Prisma();
        System.out.print("Masukkan nilai luas alas prisma  : ");
        p.la = input.nextInt();
        System.out.print("Masukkan nilai tinggi prisma     : ");
        p.t = input.nextInt();
        p.volume();
        System.out.println("===================================================");
        Bola bl = new Bola();
        System.out.println("Masukkan nilai jari - jari bola : ");
        bl.r = input.nextInt();
        bl.volume();   
    }
    
}
