//Atividade 3- Preenchendo a matriz manualmente
//crie uma matriz 3x3
//atribua valores as posições
// exiba a matriz  completa manualmente
//
import static java.lang.IO.*;
void main() {
    //[1][2][3]
    //[4][5][6]
    //[7][8][9]
    int[][] valores = new int[3][3];

    valores[0][0] = 1;
    valores[0][1] = 2;
    valores[0][2] = 3;

    valores[1][0] = 4;
    valores[1][1] = 5;
    valores[1][2] = 6;

    valores[2][0] = 7;
    valores[2][1] = 8;
    valores[2][2] = 9;

    println(" | "+valores[0][0]+" | "+valores[0][1]+" | "+valores[0][2]+" | ");
    println(" | "+valores[1][0]+" | "+ valores[1][1]+" | "+valores[1][2]+" | ");
    println(" | "+valores[2][0]+" | "+valores[2][1]+" | "+valores[2][2]+" | ");
}