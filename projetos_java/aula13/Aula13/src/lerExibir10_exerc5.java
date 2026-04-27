//5. Ler dez números e exibir na tela:
//   a soma destes números;
//   a média destes números;
//   o maior número lido;
//   o menor número lido;
//   a soma de todos os números pares lidos;
//   a soma de todos os números ímpares lidos;
//   o número de ímpares;
//   o número de pares.
import static java.lang.IO.*;
void main() {
    int soma = 0;
    int maior = 0;
    int menor = 0;
    int pares = 0;
    int impares = 0;
    float media;
    int somaPar = 0;
    int somaImpar=0;

    for(int i = 1; i<=10; i++){
        int n = Integer.parseInt(IO.readln("Digite 10 numeros inteiros: "));
        soma +=n;
        if(n % 2==0){
            pares +=1;
            somaPar+=n;
        }else{
            impares +=1;
            somaImpar+=n;
        }

        if(i == 1) {
            maior = n;
            menor = n;
        }
        if(n>maior){
            maior = n;
        }
        if(n<menor){
            menor = n;
        }
    }
    media = (float) soma /10;

    println("O maior numero é: "+maior);
    println("O menor numero é: "+menor);
    println("A soma é: "+soma);
    println("A media é: "+media);
    println("Numero de pares: "+pares);
    println("Numero de impares: "+impares);
    println("A soma dos numeros pares é: "+somaPar);
    println("A soma dos numeros impares é: "+somaImpar);

}