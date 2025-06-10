/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject9;

import javax.swing.JOptionPane;

/**
 *
 * @author Bruno
 */
public class Mavenproject9 {

    public static void main(String[] args) {
       String entrada = JOptionPane.showInputDialog("digite um numero");
       double num = Double.parseDouble(entrada);
       if(num>=10 &&num<=20){
        JOptionPane.showMessageDialog(null, "o numero esta entre o intervalo ","intervalo", 0);
       }
       else{ JOptionPane.showMessageDialog(null,"o numero nao esta no intervalo","nao intervalo", 0);}
    }
}
