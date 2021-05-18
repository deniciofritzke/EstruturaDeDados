/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.classes;

/**
 *
 * @author Denicio
 */
public enum HanoiTipoPilha {
    
    CONTIGUA("Contígua"), 
    DINAMICA("Dinâmica");
    
    private final String descricao;
    
    HanoiTipoPilha(String descricao) {
        this.descricao = descricao;
    }
    
    public String getDescricao() {
        return this.descricao;
    }
}
