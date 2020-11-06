/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bandtec.projeto6.poo2;

/**
 *
 * @author adeli
 */
public class Cofrinho {
   
    //Métodos e atributos utilizamos o padrão camelCase
    
    // Características
    // Atributos de instância
   Double saldo = 0.0;
   
   // Habilidades -> Métodos
   // Assinatura do método -linha onde está tudo sobre o método, até chegar no parênteses-
   void depositar10(){
       
       // Não pode ultrapassar 100
        if ((saldo+ 10.0) <= 100.0){
            saldo += 10.0;
        }        
    }
   
   void sacar5(){
     
       // Não pode ser menor que 0
        if ((saldo - 5.0) >= 0){
            saldo -= 5.0;
        }
   }
   
}
