/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.comandobasicos;

/**
 *
 * @author joaovitor
 */

public class exercicioUm {    
   
    private static class Cachorro {

        private char sexo;
        private String cor;
        private String corOlhos;
        private int idade;
        private int peso;

    }
    public static void main(String[] args) {
        Cachorro joao = new Cachorro();
        joao.sexo = 'M';
        joao.cor = "preto";
        joao.corOlhos = "preto";
        joao.idade = 22;
        joao.peso = 10;
        
        Cachorro pedro = new Cachorro();
        pedro.sexo = 'M';
        pedro.cor = "branco";
        pedro.corOlhos = "castanho";
        pedro.idade = 24;
        pedro.peso = 20;
        
        Cachorro renan = new Cachorro();
        renan.sexo = 'M';
        renan.cor = "marrom";
        renan.corOlhos = "preto";
        renan.idade = 26;
        renan.peso = 30;
        
        Cachorro mateus = new Cachorro();
        mateus.sexo = 'M';
        mateus.cor = "cinza";
        mateus.corOlhos = "azul";
        mateus.idade = 28;
        mateus.peso = 40;
        
        Cachorro alan = new Cachorro();
        alan.sexo = 'M';
        alan.cor = "amarelo";
        alan.corOlhos = "preto";
        alan.idade = 30;
        alan.peso = 50;
    }


}