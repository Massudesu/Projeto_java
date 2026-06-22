//atividade 2 - exibindo todos os elementos
//crie a seguinte matriz
// 1, 2, 3, 4, 5, 6,
// utilize dois laços for para exibir todos os elementos da matriz
import static java.lang.IO.*;
void main() {

    int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6}
    };
        for(int i=0; i < matriz.length; i++){
        for(int j=0; j < matriz[i].length; j++){
            print(matriz[i][j]+ " | ");
        }
        println("");
    }
}