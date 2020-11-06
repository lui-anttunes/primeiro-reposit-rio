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
public class Programa4 {
    public static void main(String[] args) {
        
        /*
            Operações de Comparação    
                < menor
                > maior
                == igual 
                != diferente
                <= menor igual 
                >= maior igual
        */
        
        Integer num1 = 10;
        /*
            if(num1 > 10){
            System.out.println("É maior");
        } else if(num1 == 10){
            System.out.println("É igual");
        }else{
            System.out.println("É menor");
        }
        */
        
        if(num1.equals(10)){
            System.out.println("É o mesmo número");
        }
        
        /*
        Operadores lógicos
        or -> ||
        and -> &&
        */   
        String nome = "Luiza";
        Integer idade = 18;
        
        if(nome.equals("Ma")&& idade.equals(18)){
            System.out.println("Os dois então corretos.");
        } else{
            System.out.println("Tem um ou dois errados.");
        }
    } 
}
