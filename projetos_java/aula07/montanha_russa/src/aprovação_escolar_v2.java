// aprovação escolar: Se a mf for maior ou igual a 7.0 e a presença maior ou igual a 75%.
// se verdadeiro exibir "Você esta aprovado" se mf for menor que 5 e presença ,empr qie 75%.
// exibir "voce esta reprovado", Senao exibir vc esta de recuperação"
import static java.lang.IO.*;
void main() {
    print("Digite a media: ");
    float mf = Float.parseFloat(IO.readln());
    print("Digite a presença do aluno(%): ");
    int presenca = Integer.parseInt(IO.readln());

    if (mf >= 7 && presenca >= 75 ) {
        print("O aluno está aprovado!");
    }else if (mf <= 5 && presenca <= 75) {
        print("Você está reprovado");
    }
    else{
        print("Voce esta de recuperação!");
    }

}