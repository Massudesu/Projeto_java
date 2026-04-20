import static java.lang.IO.*;
void main() {

    int i = 0, soma = 0;
    do{
        soma +=i;
        i++;
    } while(i<=50);
    println("A soma de tudo é: "+soma);
}