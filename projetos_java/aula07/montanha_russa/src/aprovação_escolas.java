// aprovação escolar: construa a regra onde o aluno passa de a nota for maior ou igual a 7.0
import static java.lang.IO.*;
void main() {
    print("Digite a nota do aluno: ");
    float nota = Float.parseFloat(IO.readln());
    if (nota >= 7){
        print("O aluno está aprovado!");
    }else{
        print("O aluno está reprovado!");
    }
    
}