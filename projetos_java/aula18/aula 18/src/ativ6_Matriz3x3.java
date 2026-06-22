//atividade 6- Crie a matriz 3x3
//representando um tabuleiro de jogo da velha.
//Preencha a matriz com os seguintes simbolos:
// X e O

//[X][O][O]
//[O][X][O]
//[X][O][X]
import static java.lang.IO.*;
void main() {
    String[][] jogos = {

            {"-", "-", "-"},
            {"-", "-", "-"},
            {"-", "-", "-"}
    };
    String jogador = "X";

    for (int rodada = 1; rodada <= 9; rodada++) {
        // mostrar tabuleiro
        println("---TABULEIRO---");
        for (int linha = 0; linha < jogos.length; linha++) {
            for (int coluna = 0; coluna < jogos[linha].length; coluna++) {
                print(jogos[linha][coluna] + " | ");
            }
            println("");
        }


        int linhaDigitada = Integer.parseInt(readln("Informe a linha: "));
        int colunaDigitada = Integer.parseInt(readln("Informe a coluna: "));
        if(jogos[linhaDigitada][colunaDigitada].equals("-")) {
            jogos[linhaDigitada][colunaDigitada] = jogador;

            if (jogador.equals("X")) {
                jogador = "O";
            } else {
                jogador = "X";
            }
        }else{
            println("Já esta ocupado!");
            rodada--;
        }
    }
    println("---TABULEIRO FINAL---");
    for (int i = 0; i < jogos.length; i++) {
        for (int j = 0; j < jogos[i].length; j++) {

            print(jogos[i][j] + " | ");
        }
        println("");
    }
}






