//Efetuar o cálculo e apresentar o valor de uma prestação de
//um bem em atraso, utilizando a fórmula PRESTAÇÃO ←
//VALOR + (VALOR * (TAXA / 100) * TEMPO).

import static java.lang.IO.*;
void main() { //CLASS
    print("Digite o valor da prestação (R$): ");
    float v = Float.parseFloat(IO.readln());
    print("Digite a taxa de juros (%): ");
    float tx = Float.parseFloat(IO.readln());
    print("Digite o tempo em atraso  (meses): ");
    int t = Integer.parseInt(IO.readln());


    float p = v + (v* (tx/100)* t);

    IO.println("O valor da prestação atualizada é : R$" + String.format("%.2f", p));
}