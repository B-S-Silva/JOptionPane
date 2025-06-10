/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject2;

import javax.swing.JOptionPane;

/**
 *
 * @author Kevin
 */
public class Mavenproject2 {

    public static void main(String[] args) {
  String entrada = JOptionPane.showInputDialog("digite sua nota");
  double nota = Double.parseDouble(entrada);
  
  if(nota >= 7){
   JOptionPane.showMessageDialog(null,"aluno aprovado","mensagem de aprovacao",1);
  }
  else if (nota <7 && nota>=5){
  JOptionPane.showMessageDialog(null,"em recuperacao","mensagem de recuperacao",1);
  }
  else{
  JOptionPane.showMessageDialog(null,"aluno reprovado","mensagem de reprovacao",0);
  }
    }
}
