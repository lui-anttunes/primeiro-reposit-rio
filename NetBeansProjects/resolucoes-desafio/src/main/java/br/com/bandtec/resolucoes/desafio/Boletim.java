/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bandtec.resolucoes.desafio;

/**
 *
 * @author adeli
 */
public class Boletim {
    // atributos sempre começam privados
    // para não ocorrer mudanças em lugares indevidos 
    private Double nota1;
    private Double nota2;
    private Double media;
    private Double frequencia;
    private String situacao;
    private String cor;
    
    public void verificarSituacao(Double nota1, Double nota2, 
            Double frequencia){
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.frequencia = frequencia;
        
        this.calcularMedia();
        
        if (this.media > 9 && this.frequencia > 90) {
            this.situacao = "Aprovado com louvor";
            this.cor = "#0000AA";
        } else if (this.media >= 6 && this.frequencia >= 75) {
            this.situacao = "Aprovado";
            this.cor = "#00AA00";
        } else{
            this.situacao = "Reprovado";
            this.cor = "#AA0000";
        }
    }
    
    private void calcularMedia(){
        this.media = (this.nota1 + this.nota2) / 2;
    }

    public String getCor() {
        return cor;
    }

    public String getSituacao() {
        return situacao;
    } 
}
