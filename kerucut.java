/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BangunRuang;

/**
 *
 * @author ACER
 */
public class kerucut extends BangunRuang{   
       int jari2;
       int tinggi;
      
      @Override
      int volume () {         
          int volume = (int) (0.3 * 3.14 * jari2 * jari2 * tinggi); 
          System.out.println("Volume kerucut : " + volume);
      return 0 ;
     
}   
}
