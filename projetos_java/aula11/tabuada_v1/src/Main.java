import static java.lang.IO.*;

void main() {
    println("--TABUADA--");
    int num = Integer.parseInt(readln("Digite o número da tabuada: "));
    int i =1;
    while(i<=10){
        println(i + " x " + num + " = " + (i * num));
        i++;
    }
}

