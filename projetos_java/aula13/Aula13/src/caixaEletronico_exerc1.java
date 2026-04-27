//1. Um caixa eletrônico permite 3 tentativas para digitar a senha correta (4321).
//Caso erre 3 vezes, a conta será bloqueada.
//
//Resultado Esperado:
//Se acertar exibir na tela 'acesso liberado'
//Se errar 3 vezes exibir na tela 'conta bloqueada'

import static java.lang.IO.*;
void main() {
    int contador=0;
    for(int i = 0; i<=2; i++){
        int n = Integer.parseInt(IO.readln("Digite a senha: "));
        if(n==1234){
            println("Acesso liberado!");
            break;
        }else if(n!=1234){
            println("Senha errada");
        }
        contador++;
        if(contador==3){
            println("Conta Bloqueada!");
        }
    }
}