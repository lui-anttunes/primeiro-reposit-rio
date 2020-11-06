/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bandtec.projeto9.poo2;

import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author adeli
 */
public class Professor {
    private Integer cod;
    private String nome;
    private Double salario;

    public Professor(String nome, Double salario) {
        this.cod = ThreadLocalRandom.current().nextInt(0, 100);
        this.nome = nome;
        this.salario = salario;
    }

    public Integer getCod() {
        return cod;
    }

    public String getNome() {
        return nome;
    }

    public Double getSalario() {
        return salario;
    }

    
    
}
