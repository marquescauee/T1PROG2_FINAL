/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.acg.t1prog2.Models.Esportes;

import com.acg.t1prog2.Models.Esporte;

public class Basquete extends Esporte {
    
    public Basquete(int qtdParticipantes) {
        super(qtdParticipantes);
    }
    
    @Override
    public String simularPartida() {
        return "Falta 3 segundos para o fim do jogo..."
                + "\nA única chance de vitória é o jogador arremessar de onde ele está"
                + "\nEle arremessa a bola e o tempo acabar e..."
                + "\nCESTA!!! O TIME É CAMPEÃO!!!\n";
    }

    @Override
    public String regras() {
        return "Para uma partida de basquete, deve-se cumprir os seguintes requisitos:"
                + "\nA bola pode ser arremessada em qualquer direção com uma ou com ambas as mãos"
                + "\nUm jogador não pode correr com a bola."
                + "\nNão é permitido empurrar, derrubar ou segurar o jogador"
                + "\n2 infrações: o jogador só joga quando uma cesta for convertida em ponto"
                + "\nO tempo de jogo deve ser de quatro períodos de 10 minutos cada, com 15 minutos de descanso entre o segundo e terceiro período.\n";
    }
    
    public static String mostrarRegras() {
        Esporte e = new Basquete(10);
        
        return e.regras();
    }
    
    public static String mostrarSimulacao() {
        Esporte e = new Basquete(10);
        
        return e.simularPartida();
    }
    
    @Override
    public String toString() {
        return super.toString() + " Basquete";
    }
}
