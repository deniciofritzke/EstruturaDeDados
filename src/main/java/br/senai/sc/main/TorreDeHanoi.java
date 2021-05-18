/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.main;

import br.senai.sc.classes.TorreDeHanoiVetor;
import java.util.Scanner;

/**
 *
 * @author Denicio
 */
public class TorreDeHanoi {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        
        int tOrigem;
        int tDestino;
        Scanner ent = new Scanner(System.in);
        String rMov = "";
        
        TorreDeHanoiVetor torre = new TorreDeHanoiVetor();
        
        torre.IniciaJogo();
        
        while (!torre.fimDeJogo() && !"CANCEL".equals(rMov)) {
            System.out.printf("Digite a torre de origem: \n");
            tOrigem = ent.nextInt();
            
            System.out.printf("Digite a torre de destino: \n");
            tDestino = ent.nextInt();
            
            rMov = torre.moveDisco(tOrigem, tDestino);
            
            if (!rMov.equals("")) {
                System.out.println(rMov);
            }
            
        }
        
    }
    
}
