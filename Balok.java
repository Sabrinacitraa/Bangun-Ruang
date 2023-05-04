/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BangunRuang;

/**
 *
 * @author ACER
 */
public class Balok extends BangunRuang  {
       int panjang;
       int lebar;
       int tinggi;
      @Override
      int volume () {         
          int volume = panjang * lebar * tinggi; 
          System.out.println("Volume balok   : " + volume);
      return 0 ;
}     
}
    

