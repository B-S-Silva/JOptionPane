/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject4;

import javax.swing.JOptionPane;

/**
 *
 * @author Bruno
 */
public class Mavenproject4 {

    public static void main(String[] args) {
       String entrada = JOptionPane.showInputDialog("digite um numero");
       int num = Integer.parseInt(entrada);
       
       if(num % 2 == 0){
       JOptionPane.showMessageDialog(null,"numero par", "par", 1);
       }
       else {
       JOptionPane.showMessageDialog(null,"numero impar","impar",1);
       }
    }
}
