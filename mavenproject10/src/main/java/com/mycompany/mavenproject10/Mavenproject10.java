/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject10;

import javax.swing.JOptionPane;

/**
 *
 * @author Kevin
 */
public class Mavenproject10 {

    public static void main(String[] args) {
         String entrada =  JOptionPane.showInputDialog("digite a idade");
         String entrada2 =  JOptionPane.showInputDialog("digite a nacionalidade");
         int idade = Integer.parseInt(entrada);
         if(idade>=16&&entrada2.equals("brasileira")){
          JOptionPane.showMessageDialog(null,"pode votar","pode votar",1);}
         else{ JOptionPane.showMessageDialog(null,"nao pode votar","nao vota",1);}
    }
}
