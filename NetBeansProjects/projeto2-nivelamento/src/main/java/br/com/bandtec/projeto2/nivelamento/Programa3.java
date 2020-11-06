/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bandtec.projeto2.nivelamento;

/**
 *
 * @author adeli
 */
public class Programa3 {
    public static void main(String[] args) {
        
        String nome = "Luiza Vitória";
        Integer idade = 18;
        Double bilheteUnico = 255.60;
        
         //System.out.println(nome + " tem " + idade + " anos e possui " + 
                // bilheteUnico + " reais em seu bilhete único.");
         
         String frase = String.format("%s tem %d anos e possui %.2f reias em BU.",
                 nome, idade, bilheteUnico);
         
         System.out.println(frase);
        
    }  
}
