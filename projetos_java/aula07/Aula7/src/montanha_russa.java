
import static java.lang.IO.*;
void main() {
    print("Informe sua altura (ex: 1.60): ");
    float altura = Float.parseFloat(IO.readln());

    if (altura >= 1.50){
        print("Você tem problema cardiaco? sim/nao: ");
        String cardiaco = IO.readln();
        if (cardiaco.equals("nao")){
            print("Pode passar!");
        }else{
            print("Não pode passar!");
        }
    }else{
        print("Não pode passar!");
    }

}
