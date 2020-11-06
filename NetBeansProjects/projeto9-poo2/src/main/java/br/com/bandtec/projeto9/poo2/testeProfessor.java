/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bandtec.projeto9.poo2;

/**
 *
 * @author adeli
 */
public class testeProfessor {
    public static void main(String[] args) {
        
        Professor professor1 = new Professor("Gerson", 30000.0);
        
        System.out.println(String.format("Cód: %d\n", professor1.getCod()));
        System.out.println(String.format("Nome: %s\n", professor1.getNome()));
        System.out.println(String.format("Salário: %.2f", professor1.getSalario()));
    }
}
