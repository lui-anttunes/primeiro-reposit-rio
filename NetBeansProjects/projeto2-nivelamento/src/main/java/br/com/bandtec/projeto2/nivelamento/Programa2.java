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
public class Programa2 {
    public static void main(String[] args) {
        
        /*
            Operações básicas são as mesmas utilizadas no Javascript
                + soma
                - suptração
                * multiplicação
                / divisão
        
        */
        
        String nome = "Luiza";
        Integer passagensDia = 4;
        Double bilheteUnico = 122.90;
        
        //Supondo que a passagem custa 4.40
        
        Double passagensTotais = bilheteUnico / 4.40;
        
        //Convertendo valor real (casas decimais) para inteiro
        Integer passagensTotaisInteiro = passagensTotais.intValue();
        
        System.out.println("Passagens Totais: " + passagensTotaisInteiro);
        
        //Apresente a qtd de dias que Luiza pode ir e voltar do trabalho 
        //sem preocupações
        //"Luiza pode utilizar esse bilhete por x dias"
        
        Integer qtdDias = passagensTotaisInteiro / passagensDia;
        
        System.out.println("Luiza pode utilizar esse bilhete por:\n " + qtdDias + 
                " dias.");
        
    } 
}
