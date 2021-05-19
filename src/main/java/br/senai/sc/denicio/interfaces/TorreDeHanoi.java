/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.denicio.interfaces;

/**
 *
 * @author Denicio
 */
public interface TorreDeHanoi {
    
    public void inicioJogo();
    
    public boolean fimJogo();
    
    public String moveDisco(int torreOrigem, int torreDestino);
    
    void imprimeTorre();
}
