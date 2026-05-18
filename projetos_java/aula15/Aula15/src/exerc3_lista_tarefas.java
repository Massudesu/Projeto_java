//Exercício 3 — Lista de tarefas
//     Crie um programa que:
//     permita cadastrar tarefas;
//     finalize quando o usuário digitar “fim”;
//     exiba todas as tarefas.

import static java.lang.IO.*;

void main() {
    ArrayList<String> tarefas = new ArrayList<>();
    while(true){
        String entrada = readln("Tarefa: ");
        tarefas.add(entrada);
        if(entrada.equalsIgnoreCase("fim")) {
            break;
        }
    }
    for (String item : tarefas) {
        println(item);
    }
}