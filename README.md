# EstruturaDeDados
 Aula de estrutura de dados - Senai
 
Packages
--------
br.senai.sc.denicio.classes

	Implementação de classes
		FilaLista      = Fila encadeada. Se utiliza da classe NoLista para encadeamento.
		FilaVetor      = Fila criada com base em array (vetor).
		ListaComArray  = Estrutura de lista baseada em array (vetor).
		ListaEncadeada = Lista encadeada utilizando a classe NoLista.
		NoLista        = Classe genérica de nó. Permite encadeamento.
		PilhaLista     = Estrutura de pilha dinâmica. Utiliza NoLista para criar o encadeamento da estrutura.
		PilhaVetor     = Estrutura de pilha que utiliza array (Vetor).
		
		
br.senai.sc.denicio.interfaces

	Interfaces
		iFila  = Corpo para as classes FilaLista e FilaVetor.
		iLista = Corpo para as classes ListaComArray e ListaEncadeada.
		iPilha = Corpo para as classes PilhaLista e PilhaVetor.
		
		
br.senai.sc.denicio.main

	Classses MAIN (execução) para testar as implementações dos pacotes ....denicio.classes e denicio.interfaces
		MainFilaLista      = Teste para FilaLista.
		MainFilaVetor      = Teste para FilaVetor.
		MainListaComArray  = Teste para ListaComArray.
		MainListaEncadeada = Teste para ListaEncadeada.
		MainPilhaLista     = Teste para PilhaLista.
		MainPilhaVetor     = Teste para PilhaVetor.
		
		
br.senai.sc.mateus

	Implementação das classes pedidas em aula, pelo aluno Mateus Silva Freitas.
	
	
br.senai.sc.torresdehanoi

	Classes do trabalho de implementação do jogo Torres de Hanoi, utilizando estruturas de pilha.
	As estruturas de pilhas utilizadas são as classes do package br.senai.sc.mateus.
		TorreArray          = Implementa o comportamento de uma torre. Utiliza a estrutura PilhaArray.
		TorreLinked         = Implemento o comportamento de uma torre. Utiliza a estrutura PilhaLinked.
		TorresDeHanoi       = Classe MAIN. Pode receber os seguintes parâmetros de entrada: contigua (utiliza a estrutura de array); dinamica (utiliza a estrutura linked); sobre (mostra o nome dos integrantes da equipe).
		TorresDeHanoiArray  = Controle do jogo com estrutura tipo array.
		TorresDeHanoiLinked = Controle do jogo com estrutura dinâmica.
		TorresDeHanoiJogo   = Classe Pai para execução do jogo.
		
		