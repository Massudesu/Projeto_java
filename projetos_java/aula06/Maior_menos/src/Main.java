//desenvolver uma aplicaçãoo que receba  aidade de uma pessoa.
//se a idade for maior ou igual a 18 anos, exibir na tela
//"maior de idade".

import static  java.lang.IO.*;
void main() {
    print("Digite a sua idade: ");
    int i = Integer.parseInt(IO.readln());

    if (i >= 18) {
        print("Maior de idade");
    }
    else {
        print("Menor de idade");
    }
}
