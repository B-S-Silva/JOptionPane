/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject6;

import javax.swing.JOptionPane;

/**
 *
 * @author Bruno
 */
public class Mavenproject6 {

    public static void main(String[] args) {
      String entrada =  JOptionPane.showInputDialog("digite um inteiro");
       String entrada3 = JOptionPane.showInputDialog("digite o operador");
   String entrada2 = JOptionPane.showInputDialog("digite outro inteiro");
   int num1 = Integer.parseInt(entrada);
   int num2 = Integer.parseInt(entrada2);
   
   if(entrada3.equals("+")){
       double soma = num1+num2;
   JOptionPane.showMessageDialog(null,"o resultado foi "+soma,"soma",1);
   }
   else if(entrada3.equals("-")){
       double subtracao = num1 - num2;
       JOptionPane.showMessageDialog(null,"o resultado foi "+subtracao ,"subtracao ",1);}
   else if(entrada3.equals("/")){double divisao = num1/num2;
   JOptionPane.showMessageDialog(null,"o resultado foi "+divisao,"divisao",1);
  }
   else if (entrada3.equals("*")){double multiplicacao = num1*num2;
   JOptionPane.showMessageDialog(null,"o resultado foi "+multiplicacao,"multiplicacao",1);
   }
    }
   
}
