/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject3;

import javax.swing.JOptionPane;

/**
 *
 * @author Kevin
 */
public class Mavenproject3 {

    public static void main(String[] args) {
   String entrada =  JOptionPane.showInputDialog("digite um inteiro");
   String entrada2 = JOptionPane.showInputDialog("digite outro inteiro");
   int num1 = Integer.parseInt(entrada);
   int num2 = Integer.parseInt(entrada2);
   
   if (num1 > num2){
   JOptionPane.showMessageDialog(null,"o numero "+num1+" maior","num1 maior",1);}
   else if (num2 > num1){
   JOptionPane.showMessageDialog(null,"o numero "+num2+ " e o maior","num2 maior",1);}
   else{JOptionPane.showMessageDialog(null,"numeros iguais","igualdade", 1);}
    }
}
