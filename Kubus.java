/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BangunRuang;

/**
 *
 * @author ACER
 */
public class Kubus extends BangunRuang {

    int sisi;

    @Override
    int volume() {
        int volume = sisi * sisi * sisi;
        System.out.println("Volume kubus   : " + volume);
        return 0;
    }
}
