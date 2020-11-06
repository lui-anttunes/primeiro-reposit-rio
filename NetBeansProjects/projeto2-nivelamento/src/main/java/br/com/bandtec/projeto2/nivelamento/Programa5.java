
package br.com.bandtec.projeto2.nivelamento;

import java.util.Scanner;

public class Programa5 {
    
    public static void main(String[] args) {
        
        //Exemplo de como instanciar um objeto do tipo Scanner.
        Scanner leitorTexto = new Scanner(System.in);
        Scanner leitorNumero = new Scanner(System.in);
        
        System.out.println("Digite seu nome:");
        String nome = leitorTexto.nextLine();
        
        System.out.println(String.format("Olá %s", nome));
        
        System.out.println("Digite sua idade:");
        Integer idade = leitorNumero.nextInt();
        
        System.out.println(String.format("Você tem %d anos.", idade));
        
        if(idade >= 18){
            System.out.println("Já pode tirar a CNH.");
        } else{
            System.out.println("Infelizmente você terá que ir de metrô.");
        }
        
        System.out.println("Quanto custa a passagem de onibus na sua cidade?");
        Double precoPassagem = leitorNumero.nextDouble();
        
        System.out.println(String.format("O preço da passagem é %.2f ", 
                precoPassagem));
    }
}    
