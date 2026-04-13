import static java.lang.IO.*;

void main() {

    print("--TABUADA--");
    int n = Integer.parseInt(readln("Informe o número da tabuada: "));
    for (int i = 1; i <= 10; i++) {
        println(i + " x " + n + " = " + (i * n));
    }
}