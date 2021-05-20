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
public class TorresDeHanoiArray extends TorresDeHanoiJogo {
    private final TorreArray[] torres;
    
    /**
     *
     */
    public TorresDeHanoiArray() {
        fimDeJogo = false;
        torres = new TorreArray[3];
        torres[0] = new TorreArray(TAMANHO);
        torres[1] = new TorreArray(TAMANHO);
        torres[2] = new TorreArray(TAMANHO);
    }
    
    @Override
    public void IniciaJogo() throws Exception {
        fimDeJogo = false;
        
        for (int i = 0; i < TAMANHO; i++) {
            torres[0].push(TAMANHO - i);
        }
        
        totalJogadas = 0;
       
        imprimeTorres();
    }
    
    @Override
    public String moveDisco(int tO, int tD) throws Exception {
        Integer dO;
        Integer dD;
        
        if (tO == 99) {
            return "CANCEL";
        }
        
        if (tO == tD) {
            return "A torre de Origem e a torre de Destino devem ser diferentes!";
        }
        else {
            if (tO >= 1 && tO <= 3) {
                if (torres[tO-1].vazia()) {
                    return "Torre " + tO + " está vazia!";
                }
                else {
                    dO = torres[tO-1].pop();
                }
            }
            else {
                return "Torre de origem não existe. Deve ser 1, 2, ou 3!";
            }

            if (dO != null && tD >= 1 && tD <= 3) {
                if (torres[tD-1].vazia()) {
                    torres[tD-1].push(dO);
                }
                else {
                    dD = torres[tD-1].pop();

                    torres[tD-1].push(dD);
                    
                    if (dD < dO) {
                        torres[tO-1].push(dO);
                        return "Jogada não permitida!";
                    }
                    else {
                        torres[tD-1].push(dO);
                    }
                }
            }
            else {
                return "Torre de destino não existe. Deve ser 1, 2, ou 3!";
            }
            
        }
        
        imprimeTorres();
        
        totalJogadas++;
                
        if (torres[2].tamanho() == TAMANHO) {
            String result;
            fimDeJogo = true;
            result = "Fim de jogo.....Você venceu";
            
            if (totalJogadas > menorJogoPossivel) {
                result = result + ", mas pode melhorar! É possível terminar o jogo em " + menorJogoPossivel + " jogadas. Suas jogadas: " + totalJogadas;
            }
            else {
                result = result + "! " + totalJogadas + " jogadas!";
            }
            return result;
        }
        else {
            return "";
        }
        
    }
    
    private void imprimeTorres() throws Exception {
        String linha;
        Integer d;
        
        TorreArray[] torresC = new TorreArray[3];
        torresC[0] = new TorreArray(TAMANHO);
        torresC[1] = new TorreArray(TAMANHO);
        torresC[2] = new TorreArray(TAMANHO);
        
        System.out.println("");
        System.out.println("");
        
        linha = "  ";
        
        for (int i = 0; i < TAMANHO; i++) {
            linha = linha + " ";
        }
        
        linha = linha + "|  ";
        
        for (int i = 0; i < TAMANHO * 2; i++) {
            linha = linha + " ";
        }
        
        linha = linha + "|  ";
        
        for (int i = 0; i < TAMANHO * 2; i++) {
            linha = linha + " ";
        }
        
        linha = linha + "|";
        
        System.out.println(linha);

        for (int contaLin = 0; contaLin < TAMANHO; contaLin++) {
            linha = "";

            for (int contaTorre = 0; contaTorre < 3; contaTorre++) {

                if (torres[contaTorre].tamanho() < TAMANHO - contaLin) {
                    linha = linha + "  ";
                    
                    for (int i = 0; i < TAMANHO; i++) {
                        linha = linha + " ";
                    }
                    
                    linha = linha + "|";
                    
                    for (int i = 0; i < TAMANHO; i++) {
                        linha = linha + " ";
                    }
                }
                else {
                    if (!torres[contaTorre].vazia()) {
                        linha = linha + "  ";
                        d = torres[contaTorre].pop();
                        
                        for (int z = 1; z <= TAMANHO - d; z++) {
                            linha = linha + " ";
                        }
                        
                        for (int z = 1; z <= d; z++) {
                            linha = linha + "o";
                        }
                        
                        linha = linha + "|";
                        
                        for (int z = 1; z <= d; z++) {
                            linha = linha + "o";
                        }
                        
                        for (int z = 1; z <= TAMANHO - d; z++) {
                            linha = linha + " ";
                        }
                        
                        //linha = linha + "  ";
                        
                        torresC[contaTorre].push(d);
                    }
                    else {
                        linha = linha + "    ";
                        
                        for (int i = 0; i < TAMANHO; i++) {
                            linha = linha + " ";
                        }
                    
                        linha = linha + "|";
                    
                        for (int i = 0; i < TAMANHO; i++) {
                            linha = linha + " ";
                        }

                    }
                }
            }
            
            System.out.println(linha);
        }
        
        linha = "  ";
        
        for (int i = 0; i < TAMANHO; i++) {
            linha = linha + " ";
        }
        
        linha = linha + "1";
        
        linha = linha + "  ";
        
        for (int i = 0; i < TAMANHO * 2; i++) {
            linha = linha + " ";
        }
        
        linha = linha + "2";
        
        linha = linha + "  ";
        
        for (int i = 0; i < TAMANHO * 2; i++) {
            linha = linha + " ";
        }
        
        linha = linha + "3";
        
        System.out.println(linha);
        
        // Volta as informações para a posição correta
        for (int contaTorre = 0; contaTorre < 3; contaTorre++) {
            while (!torresC[contaTorre].vazia()) {
                d = torresC[contaTorre].pop();
                torres[contaTorre].push(d);
            }
        }

    }
}
