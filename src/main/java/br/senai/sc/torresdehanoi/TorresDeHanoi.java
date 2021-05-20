/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.torresdehanoi;

import java.util.Scanner;

/**
 *
 * @author Denicio
 */
public class TorresDeHanoi {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    
    
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        
        boolean contigua = false;
        boolean sobre = false;
                
        for (String arg : args) {
            if (!contigua) {
                contigua = "contigua".equalsIgnoreCase(arg) || "contígua".equalsIgnoreCase(arg);
            }
            
            if (!sobre) {
                sobre = "sobre".equalsIgnoreCase(arg);
            }
        }
        
        if (sobre) {
            System.out.println("Alunos: Denicio Fritzke");
            System.out.println("        Mateus Silva Freitas");
        }
        else {
            int tOrigem;
            int tDestino;
            Scanner ent = new Scanner(System.in);
            String rMov = "";
            TorresDeHanoiJogo torre;
            
            if (contigua) {
                torre = new TorresDeHanoiArray();
            }
            else {
                torre = new TorresDeHanoiLinked();
            }
            
            torre.IniciaJogo();
            
            while (!torre.fimDeJogo() && !"CANCEL".equals(rMov)) {
                System.out.print("Digite a torre de origem: \n");
                tOrigem = ent.nextInt();
                
                System.out.print("Digite a torre de destino: \n");
                tDestino = ent.nextInt();
                
                rMov = torre.moveDisco(tOrigem, tDestino);
                
                if (!rMov.equals("")) {
                    System.out.println(rMov);
                }
                
            }
        }
    }
    
}
