//7. Desenvolver um aplicativo para um caixa eletrônico com saldo inicial
// de R$ 500,00 com as seguintes opções:
//
//1 Saque
//2 Depósito
//3 Saldo
//0 Sair
//
//Repetir até sair.
import static java.lang.IO.*;
void main() {
    float saldo = 500;
    float resu=0;
    while(true){
        println("Qual serviço quer acessar hoje?");
        println("1 Saque");
        println("2 Deposito");
        println("3 Saldo");
        println("0 Sair");
        String opcao =IO.readln();

        switch (opcao) {
            case "0":
                println("Saindo....");
                break;
        }
        switch (opcao){
            case "1":
                float sacar=Float.parseFloat(IO.readln("Você tem R$"+ String.format("%.2f",saldo)+" Quanto quer sacar: "));
                resu= saldo - sacar;
                println("Você sacou R$"+sacar);
                println("Seu novo saldo é R$"+resu);
        }
        switch (opcao){
            case "3":
                println("Seu saldo é R$"+String.format("%.2f",saldo));
        }
    }
}