//3. O sistema de um caixa eletrônico de uma loja recebe produtos até digitar 0 para finalizar a compra.
//Durante a compra: somar os valores do produtos
//Após ser finalizada: Exibir na tela o valor total da compra.

import static java.lang.IO.*;
void main() {
    double soma=0;
    double resultado;
    while(true){
        double i = Double.parseDouble(readln("Qual é o valor do produto: R$"));
        soma +=i;
        resultado= soma;
        println("R$"+ String.format("%.2f", resultado));
        if(i==0){
            println("O total da sua compra deu: R$"+String.format("%.2f",resultado));
            break;
        }
    }
}