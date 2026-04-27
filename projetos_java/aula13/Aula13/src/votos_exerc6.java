//6. Ler dez votos e exibir na tela o resultado da eleição para os seguintes candidatos:
//
//1 = João
//2 = Maria
//outro = nulo
import static java.lang.IO.*;
void main() {
    int joao=0;
    int maria=0;
    int outro=0;
    for(int i=1; i<=10; i++){
        String n = readln("Qual é seu voto(1=João/2=Maria/outro:nulo): ");
        if(n.equals("1")){
            joao+=1;
        }
        if(n.equals("2")){
            maria+=1;
        }
        if(n.equals("outro")){
            outro+=1;
        }
    }
    println("João recebeu: "+joao+" votos");
    println("Maria recebeu: "+maria+" votos");
    println("Nulo recebeu: "+outro+" votos");
}