/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.torresdehanoi;

/**
 *
 * @author Denicio
 */
public class TorresDeHanoiJogo {
    protected int TAMANHO = 5;
    protected boolean fimDeJogo;
    protected int totalJogadas;
    protected final double menorJogoPossivel = Math.pow(2, TAMANHO) -1;
    
    
    public boolean fimDeJogo() {
        return fimDeJogo;
    }
    
    public void IniciaJogo() throws Exception {
        fimDeJogo = false;
        totalJogadas = 0;
    }
    
    public String moveDisco(int tO, int tD) throws Exception {
        return "";        
    }
    
    
}
