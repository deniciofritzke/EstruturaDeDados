/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.denicio.main;

import br.senai.sc.denicio.classes.ArvoreComArray;

/**
 *
 * @author Aluno
 */
public class MainArvoreComArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArvoreComArray<Integer> aa = new ArvoreComArray(2);
        
        boolean insere = aa.insere(23);
        
        System.out.println(insere);
        
        
    }
    
}
