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


        switch (opcao){
            case "1":
                float sacar=Float.parseFloat(IO.readln("Você tem R$"+ String.format("%.2f",saldo)+" Quanto quer sacar: "));
                if(sacar > saldo){
                    println("Saque maior que o saldo, cancelando....");
                }else{
                    resu= saldo - sacar;
                    println("Você sacou -R$"+String.format("%.2f",sacar));
                    saldo -= sacar;
                    println("Seu novo saldo é R$"+String.format("%.2f",resu));
                    println("--------------------------------------");
                }


        }
        switch (opcao){
            case "2":
                float deposito=Float.parseFloat(IO.readln("Você tem R$"+ String.format("%.2f",saldo)+" Quanto quer depositar: "));
                if(deposito>10000){
                    println("Você so pode depositar ate R$10.000, cancelando....");
                }else{
                    resu= saldo + deposito;
                    println("Você depositou +R$"+String.format("%.2f",deposito));
                    saldo += deposito;
                    println("Seu novo saldo é R$"+String.format("%.2f",resu));
                    println("--------------------------------------");
                }

        }
        switch (opcao){
            case "3":
                println("Seu saldo é R$"+String.format("%.2f",saldo));
                println("--------------------------------------");
        }
        if(opcao.equals("0")){
            println("Saindo....");
            break;
        }
    }
}