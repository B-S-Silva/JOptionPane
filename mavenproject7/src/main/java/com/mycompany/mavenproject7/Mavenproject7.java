/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject7;

import javax.swing.JOptionPane;

/**
 *
 * @author Bruno
 */
public class Mavenproject7 {

    public static void main(String[] args) {
    String entrada =  JOptionPane.showInputDialog("digite o peso");
   String entrada2 = JOptionPane.showInputDialog("digite a altura");
  double peso = Double.parseDouble(entrada);
   double altura = Double.parseDouble(entrada2);
   double imc = peso / (altura*altura);
   JOptionPane.showMessageDialog(null,"o imc é "+imc,"imc",1);
    }
}
