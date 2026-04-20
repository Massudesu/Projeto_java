// adoçao de pet: crie a logica de adoção onde a pessoa pode adotar se
// tiver quintal grande ou se comprometer a passear 2x ao dia
import static java.lang.IO.*;
void main() {
    print("Você tem quintal grande?(S/N): ");
    char quintal = readln().charAt(0);
    print("Você tem disponibilidade de passear 2x por dia?(S/N): ");
    char passear = readln().charAt(0);

    if (quintal == 'S' || passear =='S'){
        print("Pode adotar o seu pet!");
    }else {
        print("Não pode adotar!");
    }
}