/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.acg.t1prog2.Models.Esportes;

import com.acg.t1prog2.Models.Esporte;

public class Natacao extends Esporte {

    public Natacao(int qtdParticipantes) {
        super(qtdParticipantes);
    }

    @Override
    public String simularPartida() {
        return "O nadador da raia 6 segue na liderança desde o início da prova, porém o nadador da raia 4 ainda não entregou a medalha"
                + "\nÉ hora de decisão: o nadador 6 e 4 disputam a primeira colocação..."
                + "\nMas calma! o nadador da raia 2 surpreende e vem com toda a vontade para a briga"
                + "\nÉ IMPRESSIONANTE! O NADADOR DA RAIA 2 ULTRAPASSA OS OUTROS DOIS COMPETIDORES E CONQUISTA O OURO!!!\n";
    }

    @Override
    public String regras() {
        return "Para uma competição de natação olímpica, deve-se cumprir os seguintes requisitos:"
                + "\nAs dimensões da piscina devem ser de 50x25, com 3 metros de profundidade"
                + "\nAs piscinas devem ser divididas em raias de 2,5 metros de largura"
                + "\nCada piscina possui oito raias para competição"
                + "\nNas provas de nado livre, peito, borboleta e medley, a largada é feita por meio de salto"
                + "\nNa prova de costas e revezamento medley, a larga é dada dentro da água\n";
    }
    
    public static String mostrarRegras() {
        Esporte e = new Natacao(8);
        
        return e.regras();
    }
    
    public static String mostrarSimulacao() {
        Esporte e = new Natacao(8);
        
        return e.simularPartida();
    }
    
    @Override
    public String toString() {
        return super.toString() + " Natação";
    }
    
}
