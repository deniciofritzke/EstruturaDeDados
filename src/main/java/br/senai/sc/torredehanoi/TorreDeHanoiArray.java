/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.torredehanoi;

/**
 *
 * @author Denicio
 */
public class TorreDeHanoiArray {
    private final int TAMANHO;
    private final TorreArray[] torres;
    private boolean fimDeJogo;
    
    /**
     *
     */
    public TorreDeHanoiArray() {
        this.TAMANHO = 5;
        fimDeJogo = true;
        torres = new TorreArray[3];
        torres[0] = new TorreArray();
        torres[1] = new TorreArray();
        torres[2] = new TorreArray();
    }
    
    public boolean fimDeJogo() {
        return fimDeJogo;
    }
    
    public void IniciaJogo() throws Exception {
        fimDeJogo = false;
        
        torres[0].push(5);
        torres[0].push(4);
        torres[0].push(3);
        torres[0].push(2);
        torres[0].push(1);
       
        imprimeTorres();
    }
    
    public String moveDisco(int tO, int tD) throws Exception {
        String result = "";
        Integer dO = null;
        Integer dD;
        
        if (tO == 99) {
            return "CANCEL";
        }
        
        if (tO == tD) {
            result = "A torre de Origem e a torre de Destino devem ser diferentes!";
        }
        else {
            if (tO >= 1 && tO <= 3) {
                if (torres[tO-1].vazia()) {
                    result = "Torre " + tO + " está vazia!";
                }
                else {
                    dO = torres[tO-1].pop();
                }
            }
            else {
                result = "Torre de origem não existe. Deve ser 1, 2, ou 3!";
            }

            if (dO != null && tD >= 1 && tD <= 3) {
                if (torres[tD-1].vazia()) {
                    torres[tD-1].push(dO);
                }
                else {
                    dD = torres[tD-1].pop();

                    torres[tD-1].push(dD);
                    
                    if (dD < dO) {
                        result = "Jogada não permitida!";
                        torres[tO-1].push(dO);
                    }
                    else {
                        torres[tD-1].push(dO);
                    }
                }
            }
            else {
                result = "Torre de origem não existe. Deve ser 1, 2, ou 3!";
            }
            
        }
        
        imprimeTorres();
        
        return result;
    }
    
    private void imprimeTorres() throws Exception {
        String linha;
        Integer d;
        
        TorreArray[] torresC = new TorreArray[3];
        torresC[0] = new TorreArray();
        torresC[1] = new TorreArray();
        torresC[2] = new TorreArray();
        
        System.out.println("");
        System.out.println("");
        System.out.println("        |               |              |");

        for (int contaLin = 0; contaLin < TAMANHO; contaLin++) {
            linha = "";

            for (int contaTorre = 0; contaTorre < 3; contaTorre++) {
                //t = (PilhaVetor) torres[contaTorre];
                //tc = (PilhaVetor) torresC[contaTorre];
                if (torres[contaTorre].tamanho() < TAMANHO - contaLin) {
                    linha = linha + "        |       ";
                }
                else {
                    if (!torres[contaTorre].vazia()) {
                        linha = linha + "  ";
                        d = torres[contaTorre].pop();
                        
                        for (int z = 1; z <= 6 - d; z++) {
                            linha = linha + " ";
                        }
                        
                        for (int z = 1; z <= d; z++) {
                            linha = linha + "o";
                        }
                        
                        linha = linha + "|";
                        
                        for (int z = 1; z <= d; z++) {
                            linha = linha + "o";
                        }
                        
                        for (int z = 1; z <= 6 - d; z++) {
                            linha = linha + " ";
                        }
                        
                        linha = linha + "  ";
                        
                        torresC[contaTorre].push(d);
                    }
                    else {
                        linha = linha + "       |       ";
                    }
                }
            }
            
            System.out.println(linha);
        }
        
        System.out.println("        1               2              3");
        
        // Volta as informações para a posição correta
        for (int contaTorre = 0; contaTorre < 3; contaTorre++) {
            while (!torresC[contaTorre].vazia()) {
                d = torresC[contaTorre].pop();
                torres[contaTorre].push(d);
            }
        }

    }
}
