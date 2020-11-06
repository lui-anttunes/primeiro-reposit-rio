/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bandtec.exercicios;

import java.util.Scanner;

/**
 *
 * @author adeli
 */
public class Exercicio1 {
    public static void main(String[] args) {
        Scanner leitorNumero = new Scanner(System.in);
        
        System.out.println("Digite um número:");
        Double numero = leitorNumero.nextDouble();
        
        System.out.println(String.format("Seu número é %d", numero));
        
        System.out.println("Digite outro número:");
        Double numero2 = leitorNumero.nextDouble();
        
        System.out.println(String.format("Seu segundo número é %d", numero2));
        
       
    }
}    
    

