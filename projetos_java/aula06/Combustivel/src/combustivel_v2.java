import static java.lang.IO.*;
void main() {
    print("Digite o tempo percorrido (horas): ");
    float t = Float.parseFloat(IO.readln());
    print("Digite a velocidade media (km/h): ");
    int v = Integer.parseInt(IO.readln());

    print("Entre com a autonomia: ");
    float a = Float.parseFloat(IO.readln());

    print("Qual é o valor do combustível: ");
    float val= Float.parseFloat(IO.readln());

    float d = v * t;
    float l = d/a;
    float c = l * val;

    IO.println("Velocidade: " + v + " horas");
    IO.println("Tempo: " + t + " km/h");
    IO.println("Distancia: " + String.format("%.2f", d) + " km");
    IO.println("Litros gasto: " + String.format("%.0f", l) + "L");
    IO.println("O custo da viagem foi de: R$" + String.format("%.2f", c));

}