//Atividade 4 - Soma
//Crie a matriz abaixo:
//{2, 4}
//{6, 8}
//Calcule e exiba a soma de todos os elementos da matriz.
import static java.lang.IO.*;
void main() {
    int soma=0;
    int[][] somas = {
          {2, 4},
          {6, 8}
    };

    for(int i=0; i < somas.length; i++){
        for(int j=0; j < somas[i].length; j++){
            soma += somas[i][j];
        }
    }
    println(soma);

}