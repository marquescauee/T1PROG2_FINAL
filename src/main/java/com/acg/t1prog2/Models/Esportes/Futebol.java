/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.acg.t1prog2.Models.Esportes;

import com.acg.t1prog2.Models.Esporte;

public class Futebol extends Esporte {

    public Futebol(int qtdParticipantes) {
        super(qtdParticipantes);
    }

    @Override
    public String simularPartida() {
        return "O jogador dribla o primeiro e avança pela ponta "
                + "\nFaz o cruzamento para o atacante que cabeceia a bola e..."
                + "\nGOOOOOOOl!!!\n";
    }

    @Override
    public String regras() {
        return "Para uma partida de futebol, deve-se cumprir os seguintes requisitos:"
                + "\nA partida deve ter 90 minutos"
                + "\n11 jogadores de cada lado"
                + "\npossibilidade de 3 substituições"
                + "\nVitória: 3 pontos; Empate: 1 ponto; Derrota: 0 pontos"
                + "\n2 cartões amarelos = expulsão\n";
    }

    public static String mostrarRegras() {
        Esporte e = new Futebol(22);
        
        return e.regras();
    }
    
    public static String mostrarSimulacao() {
        Esporte e = new Futebol(22);
        
        return e.simularPartida();
    }

    @Override
    public String toString() {
        return super.toString() + " Futebol";
    }

}
