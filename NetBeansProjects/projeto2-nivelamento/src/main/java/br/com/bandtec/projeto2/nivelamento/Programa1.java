/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bandtec.projeto2.nivelamento;


public class Programa1 {
    public static void main(String[] args) {
        
        //Java utiliza tipagem ESTÁTICA
        //Javascript utiliza tipagem DINÂMICA
        
        String nome = "Luiza";
        String cidade = "São Paulo";
        String trabalha = "Zuri";
        
        //Número Inteiro: Integer
        
        Integer idade = 18;
        Integer nascimento = 2002;
        
        //Número Reais -> DOuble
        Double preco = 4.40;
        Double temperatura = 22.2;
        
        //Variaveis lógicas -> Boolean
        
       Boolean ligado = true;
       Boolean professor = true;
       Boolean temMundial = true;
       
       //Convertendo texto em inteiro
       String numeroInteiroTxt = "25";
       
       Integer numeroInteiroConvertido = Integer.valueOf(numeroInteiroTxt);
       
       //Convertendo texto em numero real
       String numeroRealTxt = "25.60";
       
       Double numeroRealConvertido = Double.valueOf(numeroRealTxt);
       
    }
}
