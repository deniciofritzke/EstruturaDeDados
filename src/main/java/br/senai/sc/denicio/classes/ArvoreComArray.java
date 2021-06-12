/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.denicio.classes;

/**
 *
 * @author Aluno
 * @param <T>
 */
public class ArvoreComArray<T> {
    int h;
    T[] array;
    int i;
    
    public ArvoreComArray(int h) {
        Double val = Math.pow(2, this.h+1);
        this.h = h;
        array = (T[]) new Object[val.intValue()-1];
        i = 0;
    }
    
    public ArvoreComArray() {
        this(3);
    }
    
    public boolean insere(T v) {
        if (i > h) {
            throw new ArrayIndexOutOfBoundsException("Índice fora do range do array");
        }
        
        // Raiz
        if (array[i] == null) {
            array[i] = v;
            return true;
        }
        else {
            // Filho esquerda
            if (array[2*i+1] == null) {
                array[2*i+1] = v;
                return true;
            }
            else {
                // Filho direita
                if (array[2*i+2] == null) {
                    array[2*i+2] = v;
                    i++;
                    return true;
                }
                else {
                    return false;
                }
            }
        }
    }
    
    public void liberaRecursos() {
        for (int z = 0; z <= 2*h+2; z++) {
            array[z] = null;
        }
    }
    
    public boolean vazia() {
        return array[0]==null;
    }
    
    public boolean cheia() {
        return array[2*h+2] != null;
    }
    
    public boolean pertence(T info) {
        boolean result = false;
        int z = 0;
        while (z <= 2*h+2 && !result) {
            result = array[z].equals(info);
            z++;
        }
        return result;
    }
}
