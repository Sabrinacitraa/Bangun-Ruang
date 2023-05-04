/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BangunRuang;

/**
 *
 * @author ACER
 */
public class Limas extends BangunRuang{
        int la;
        int a;
        int t;
        
      @Override
      int volume () { 
          la = (int) (0.5 * a * t);
          int volume = (int) (0.3 * la * t); 
          System.out.println("Volume Limas segi tiga : " + volume);
      return 0 ;
}
    
}
