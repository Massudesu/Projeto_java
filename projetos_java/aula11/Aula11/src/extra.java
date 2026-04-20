//elaborar um programa que leia dez numeros inteiros e apresente:
//o maior 500
//o menor 0
//a soma 653
//a media 65,3
//numero de pares 7
//numero de impares 3
//5 2 7 10 8 50 500 4 67 0


import static java.lang.IO.*;
void main() {
    int soma = 0;
    int maior = 0;
    int menor = 0;
    int pares = 0;
    int impares = 0;
    float media = 0;

    for(int i = 1; i<=10; i++){
        int n = Integer.parseInt(IO.readln("Digite 10 numeros inteiros: "));
        soma +=n;
        if(n % 2==0){
            pares +=1;
        }else{
            impares +=1;
        }

        //?????
        if(i == 1) {//?????
            maior = n;//?????
            menor = n;//?????
        }
        if(n>maior){//?????
            maior = n;//?????
        }
        if(n<menor){//?????
            menor = n;//?????
        }
        //?????

    }
    media = (float) soma /10;

    println("O maior numero é: "+maior);
    println("O menor numero é: "+menor);
    println("A soma é: "+soma);
    println("A media é: "+media);
    println("Numero de pares: "+pares);
    println("Numero de impares: "+impares);

}