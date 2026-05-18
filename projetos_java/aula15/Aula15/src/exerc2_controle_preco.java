//Exercício 2 — Controle de preços
//     Solicite 5 preços e:
//     armazene em uma lista;
//     exiba o maior preço;
//     exiba o menor preço.
import static java.lang.IO.*;
void main() {

    int[] preco = new int[5];
    int menor = 0;
    int maior = 0;
    for(int i=0; i< preco.length; i++){
        preco[i] = Integer.parseInt(readln("Escreva o "+(i+1)+"º preço: "));
        if(i == 1) {
            maior = preco[i];
            menor = preco[i];
        }
        if(preco[i]>maior){
            maior = preco[i];
        }
        if(preco[i]<menor){
            menor = preco[i];
        }
    }
    println("O maior numero é: "+maior);
    println("O menor numero é: "+menor);
}
