programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{caracter matriz[3][3] = {{' ',' ',' '},{' ',' ',' '},{' ',' ',' '}}
	efetuarJogada(1, 1, 'X', matriz) 
	efetuarJogada(2, 2, 'O', matriz)
	efetuarJogada(0, 2, 'X', matriz)
	efetuarJogada(2, 0, 'O', matriz)
	efetuarJogada(0, 1, 'X', matriz)
	efetuarJogada(2, 1, 'O', matriz)
	
		
	}
	funcao efetuarJogada(inteiro linha, inteiro coluna, caracter jogador, caracter matriz[][]){
		matriz[linha][coluna] = jogador
		imprimeTabuleiro(matriz)
	}
	funcao imprimeTabuleiro(caracter matriz [][]){
		limpa()
 	
		escreva(matriz[0][0], " | ", matriz[0][1], " | ", matriz[0][2], "\n") 
		escreva("--+---+---\n") 
		escreva(matriz[1][0], " | ", matriz[1][1], " | ", matriz[1][2], "\n") 
		escreva("--+---+---\n") 
		escreva(matriz[2][0], " | ", matriz[2][1], " | ", matriz[2][2], "\n") 
		Util.aguarde(1500) 

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 330; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */