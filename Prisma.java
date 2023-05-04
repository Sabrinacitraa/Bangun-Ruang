/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BangunRuang;

/**
 *
 * @author ACER
 */
public class Prisma extends BangunRuang{
        int la;
        int t;
       
      @Override
      int volume () {           
          int volume = la * t; 
          System.out.println("Volume prisma  : " + volume);
      return 0 ;
} 
}
