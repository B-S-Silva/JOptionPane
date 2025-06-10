/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

import javax.swing.JOptionPane;

/**
 *
 * @author Bruno
 */
public class Mavenproject1 {

    public static void main(String[] args) {
        String  entrada = JOptionPane.showInputDialog("digite um numero");
        int numero = Integer.parseInt(entrada);
        
        if (numero >0){
        JOptionPane.showMessageDialog(null,"numero positivo","positivo",1);
        }
        else if (numero == 0){
        JOptionPane.showMessageDialog(null,"numero zero","nulo",1);
        }
        else{
            JOptionPane.showMessageDialog(null,"numero negativo","negativo",1);
        }
    }
}
