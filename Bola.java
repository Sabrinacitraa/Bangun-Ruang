/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BangunRuang;

/**
 *
 * @author ACER
 */
public class Bola extends BangunRuang {
    int r;

    @Override
    int volume() {
        int volume = (int) (4 / 3 * 3.14 * r * r);
        System.out.println("Volume bola    : " + volume);
        return 0;
    }
}
