/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bandtec.projeto05.poo1;

import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author adeli
 */
public class App {
    public static void main(String[] args) {
        
        Integer numeroInteiro = ThreadLocalRandom.current().nextInt(0, 10);
        
        System.out.println("Número inteiro gerado: " + numeroInteiro);
        
        Double numeroReal = ThreadLocalRandom.current().nextDouble(0, 10);
        
        System.out.println("Número real gerado: " + numeroReal);
     
    }
}
