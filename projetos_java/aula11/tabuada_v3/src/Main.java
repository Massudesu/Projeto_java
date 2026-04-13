import static java.lang.IO.*;
void main() {

        int n = Integer.parseInt(readln("Informe o número da tabuada: "));
        int i = 1;
        do{
            println(i + " x " + n + " = " + (i * n));
            i++;
        } while (i <= 10); {
            println("Fim da tabuada");
        }

}
