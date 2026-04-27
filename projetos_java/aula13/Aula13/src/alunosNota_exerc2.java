//2. Peça 4 notas (nota1, nota2, nota3, nota4) de  4 alunos (aluno1, aluno2, aluno3, aluno4), calcule a média final (mf) de cada um e
// exiba na tela a sua situação escolar:
//
//Média final >= 7 → Aprovado
//Média final entre 5 e 6.9 → Recuperação
//Média final < 5 → Reprovado

import static java.lang.IO.*;

void main() {
    for (int i = 1; i <= 4; i++) {
        String nome = readln("Digite o nome do aluno " + i + ": ");

        double soma = 0;

        for (int j = 1; j <= 4; j++) {
            String notaTexto = readln("Digite a nota " + j + " do aluno " + nome + ": ");

            double nota = Double.parseDouble(notaTexto);
            soma += nota;
        }

        double mf = soma / 4;


        print("Média final de " + nome + ": " + mf + " = ");

        if (mf >= 7) {
            println("Aprovado");
        } else if (mf >= 5) {
            println("Recuperação");
        } else {
            println("Reprovado");
        }
    }
}