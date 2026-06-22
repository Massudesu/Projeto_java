//    atividade 1- conhecendo a matriz
//      Crie uma matriz 2x3 e armazene os seguintes valores:
//    10, 20, 30, 40, 50, 60
//    exiba:
//    o valor da primeira linha e primeira coluna.
//    o valor da segunda linha e terceira coluna.
import  static  java.lang.IO.*;
void main() {
    int[][] valores = new int[2][3];

    valores[0][0] = 10;
    valores[0][1] = 20;
    valores[0][2] = 30;
    valores[1][0] = 40;
    valores[1][1] = 50;
    valores[1][2] = 60;

    println(valores[0][0]+ "|");
    println(valores[1][0]+ "|");

//    for(int i=0; i < valores.length; i++){
//        for(int j=1; j < valores[i].length; j++){
//            print(valores[i][j]+ " | ");
//        }
//        println("");
//    }
    //[10][20][30]
    //[40][50][60]
}