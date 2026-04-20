import static java.lang.IO.*;
void main() {
    print("Digite o valor do raio: ");
    float r = Float.parseFloat(IO.readln());
    print("Digite o valor da altura: ");
    float h = Float.parseFloat(IO.readln());
    double v = (Math.PI * Math.pow(r,2)) * h;

    IO.print("O volume é: "+ String.format("%.2f", v));
}
