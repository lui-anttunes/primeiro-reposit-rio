/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bandtec.projeto4.poo1;

import java.util.Random;

/**
 *
 * @author adeli
 */
public class App {
    public static void main(String[] args) {
        
        /*
        Laços de repetição
        Exemplo utilizando o "for"
        
        int, double, float, boolean... são conhecidos como tipos primitivos
        Integer, Double, Boolean... conhecidos como
        */
        
        /*
        for (int i = 0; i < 10; i++) {
            
            if(i % 2 == 0){
                System.out.println(String.format("%d é par", i));
            } else{
                System.out.println(String.format("%d é impar", i));      
            }
        }
        */
        
        // Exemplo de while:
        /*
            Integer numero = 0;
            
            while(numero <= 10){ 
             
               System.out.println(numero);
               numero++;
        }       
        */
            
            
        /*
            Exemplo de do... while
            A principal diferença entre os dois é que esse sempre
                realiza o procedimento descrito dentro das chaves ao menos uma vez.
        do {
            System.out.println("numero");
        }   while (numero <= 10);
            */    
        
        //Sintaxe de como criar objetos no java.
        Random aleatorio = new Random();
        
        Integer numeroSorteado = aleatorio.nextInt();
        
        // Exemplo de uso da classe Random
        System.out.println(aleatorio.nextInt(10));    
        
        System.out.println(aleatorio.nextDouble());
    }
}    
        
