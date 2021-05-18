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
public class TorreVetor {
    
    private final PilhaVetor<Integer> t;
    private int tamanho;
    
    public TorreVetor() {
        t = new PilhaVetor<>(5);
        tamanho = 0;
    }
    
    public void push(int disco) throws Exception {
        t.push(disco);
        tamanho++;
    }
    
    public int pop() throws Exception {
        tamanho--;
        return t.pop();
    }
    
    public int tamanho() {
        return tamanho;
    }
    
    public boolean vazia() {
        return t.vazia();
    }
    
}
