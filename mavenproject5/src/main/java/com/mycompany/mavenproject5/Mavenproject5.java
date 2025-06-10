/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject5;

import javax.swing.JOptionPane;

/**
 *
 * @author Bruno
 */
public class Mavenproject5 {

    public static void main(String[] args) {
        String entrada =  JOptionPane.showInputDialog("digite a primeira nota");
   String entrada2 = JOptionPane.showInputDialog("digite outra nota");
  String entrada3 = JOptionPane.showInputDialog("digite outra nota");
   double num1 = Double.parseDouble(entrada);
   double num2 = Double.parseDouble(entrada2);
   double num3 = Double.parseDouble(entrada3);
   
   double media = (num1+num2+num3) /3;
   
    JOptionPane.showMessageDialog(null,"a media foi "+media,"media", 1);
    }
}
