//n numeros. maior numero par, menor numero impar. para parar a entrada dos numeors, dar "-1"

import static java.lang.IO.*;
void main() {
    int soma = 0;
    int maior = 0;
    int menor = 0;
    int pares = 0;
    int impares = 0;
    int maiorPar = 0;
    int menorImpar = 0;
    int contador = 0;
    float media = 0;

    while(true){
        int i = Integer.parseInt(readln("Digite os numeros inteiros e (-1 para parar): "));
        if (i == -1){
            break;
        }
        soma +=i;
        contador++;
        if(i % 2==0){
            pares +=1;
        }else{
            impares +=1;
        }

        if(i == 1) {
            maior = i;
            menor = i;
        }
        if(i>maior){
            maior = i;
        }
        if(i<menor){
            menor = i;
        }

        //pares e impares
        if(i == 1) {
            maiorPar = i;
            menorImpar = i;
        }
        if(i>maiorPar){
            maiorPar = i;
        }
        if(i<menorImpar){
            menorImpar = i;
        }
    }
    if (contador > 0) {
        media = (float) soma / contador;
    }
    println("O maior numero é: "+maior);
    println("O menor numero é: "+menor);
    println("A soma é: "+soma);
    println("A media é: "+media);
    println("Numero de pares: "+pares);
    println("Numero de impares: "+impares);
    println("O maior numero par é: "+ maiorPar);
    println("O menor numero impar é: "+ menorImpar);

}