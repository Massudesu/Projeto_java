import static java.lang.IO.*;
void main() {

    int i = 0;
    int soma = 0;

    do{
        soma +=i;
        i+=2;
    }while (i <=500);
        println("Soma dos valores pares: "+ soma);
}

/*
import static java.lang.IO.*;
void main() {

    int i = 1;
    int soma = 0;

    do{
        if(i % 2 == 0) {
            soma = soma + i;
        }
        i++;
    }while (i <=500);
    println(soma);

}

 */