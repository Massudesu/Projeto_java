//Atividade 5 - Crie a matriz
// {12, 5, 8}
// {25, 14, 3}
// {9, 17, 20}
// Percorrra a matriz e descubra qual
// é o maior valor armazenado
import static java.lang.IO.*;
void main() {
    int maior = 0;
    int[][] matriz = {
        {12, 5, 8},
        {25, 14, 3},
        {9, 17, 20}
    };
    for(int i=0; i < matriz.length; i++){
        for(int j=0; j < matriz[i].length; j++){
            if(matriz[i][j] > maior){
                maior = matriz[i][j];
            }
        }
    }
    println(maior);
}