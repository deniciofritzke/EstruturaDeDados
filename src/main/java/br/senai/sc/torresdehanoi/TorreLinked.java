/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.torresdehanoi;

import br.senai.sc.mateus.PilhaLinked;

/**
 *
 * @author Denicio
 */
public class TorreLinked {
    private final PilhaLinked<Integer> t;
    private int tamanho;
    
    public TorreLinked() {
        t = new PilhaLinked<>();
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
