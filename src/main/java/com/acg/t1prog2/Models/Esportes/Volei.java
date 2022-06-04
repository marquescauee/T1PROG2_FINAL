/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.acg.t1prog2.Models.Esportes;

import com.acg.t1prog2.Models.Esporte;

public class Volei extends Esporte {

    public Volei(int qtdParticipantes) {
        super(qtdParticipantes);
    }
  
    @Override
    public String simularPartida() {
        return "É o ponto decisivo!! a Equipe 1 vence o jogo por 24x23 e está ganhando a partida por 2 sets a 1"
                + "\nO jogador da equipe 2 faz o saque e a equipe 1 recepciona bem!"
                + "\nO levantamento é feito e o jogador desce o braço na barreira adversária!! BLOQUEADO!!"
                + "\nA equipe tenta novamente, o levantamento é feito para o mesmo jogador!"
                + "\nO jogador desce o braço novamente e crava a bola no chão!!! É CAMPEÃO!!!\n";
    }

    @Override
    public String regras() {
        return "Para uma partida de vôlei, deve-se cumprir os seguintes requisitos:"
                + "\nUma partida é constituída de 5 sets"
                + "\nOs sets não possuem tempo"
                + "\nCada set tem um máximo de 25 pontos, com diferença de 2 pontos caso haja empate em 24x24"
                + "\nApós o saque, a equipe só pode tocar três vezes na bola"
                + "\nGanha a equipe que vencer três sets\n";
    }
    
    public static String mostrarRegras() {
        Esporte e = new Volei(12);
        
        return e.regras();
    }
    
    public static String mostrarSimulacao() {
        Esporte e = new Volei(12);
        
        return e.simularPartida();
    }
    
    @Override
    public String toString() {
        return super.toString() + " Vôlei";
    }
}
