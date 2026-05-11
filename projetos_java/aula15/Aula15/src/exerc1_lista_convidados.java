//Exercício 1 — Lista de convidados
//Crie um programa que:
//     Cadastre 5 convidados;
//     Exiba todos os convidados;
//     Informe quantos convidados existem.

import static java.lang.IO.*;
void main() {

    String[] nomes = new String[5];
    int quantidade = 0;
    for(int i=0; i< nomes.length; i++){
        nomes[i] = readln("Escreva o "+(i+1)+"º nome: ");
        quantidade ++;
    }
    for (int i=0; i< nomes.length; i++) {
        println((i + 1) + "º nome: " + nomes[i]);
    }
    println("O total de convidados é: "+quantidade);
}
