/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject8;

import javax.swing.JOptionPane;

/**
 *
 * @author Kevin
 */
public class Mavenproject8 {

    public static void main(String[] args) {
   String entrada =   JOptionPane.showInputDialog("digite a temperatura em celsius");
    double num = Double.parseDouble(entrada);
    double fah = num *1.8+32;
     JOptionPane.showMessageDialog(null,"a temperatura em fahrenheit e "+fah,"fahrenheit", 0);
    }
}
