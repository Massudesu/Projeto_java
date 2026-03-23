import static java.lang.IO.*;
void main() {
    print("Digite os graus em Fahrenheit: ");
    float f = Float.parseFloat(IO.readln());
    float c = ((f-32) *5) /9;
    IO.print("A temperatura convertida em celsius é: "+ c);
}