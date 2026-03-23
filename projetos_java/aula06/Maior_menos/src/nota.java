//Desenvolver uma  aplicação que receba quatro notas bimestrais e calcule a
// media final. Se a media final for maior ou igual a sete, exibir "aprovado"
// senão exibir "reprovado"
//mf = (n1 + n2 + n3 + n4) /4
import static  java.lang.IO.*;
void main() {
    print("Digite a nota do primeiro bimetre: ");
    float n1 = Float.parseFloat(IO.readln());
    print("Digite a nota do segundo bimetre: ");
    float n2 = Float.parseFloat(IO.readln());
    print("Digite a nota do terceiro bimetre: ");
    float n3 = Float.parseFloat(IO.readln());
    print("Digite a nota do quarto bimetre: ");
    float n4 = Float.parseFloat(IO.readln());


    float mf = (n1 + n2 + n3 + n4) / 4;

    IO.println("A nota final do aluno é: " + mf);
    if (mf >= 7) {
        println("Aprovado!!");
    }
    else {
        println("Reprovado!!");
    }

}