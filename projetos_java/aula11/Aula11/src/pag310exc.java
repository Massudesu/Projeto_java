import static java.lang.IO.*;
void main() {

    int i = 1;
    int soma = 0; //colocar fora
    while (i<=100){
        soma += i;
        println("A soma dos cem primeiros numeros é: "+soma);
        i++;
    }
}