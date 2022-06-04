/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.acg.t1prog2.Models;

import java.util.ArrayList;
import java.util.List;

public abstract class Esporte implements Modalidade {

    private int qtdParticipantes;
    private List<Mensalidade> listaMensalidades; 

    protected Esporte(int qtdJogadores) {
        this.listaMensalidades = new ArrayList<>();
        this.qtdParticipantes = qtdJogadores;
    }
    
    public void addMensalidade(Mensalidade mensalidade) {
        this.listaMensalidades.add(mensalidade);
    }
    
    public void removeMensalidade(Mensalidade mensalidade) {
        this.listaMensalidades.remove(mensalidade);
    }

    public List<Mensalidade> getListaMensalidades() {
        return listaMensalidades;
    }
    
    public int getQtdJogadores() {
        return qtdParticipantes;
    }

    public void setQtdJogadores(int qtdJogadores) {
        this.qtdParticipantes = qtdJogadores;
    } 
    
    @Override
    public String toString() {
        return "Esporte: ";
    } 
}
