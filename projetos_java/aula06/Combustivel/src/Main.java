import static java.lang.IO.*;
void main() {
    print("Digite o tempo percorrido (horas): ");
    float t = Float.parseFloat(IO.readln());
    print("Digite a velocidade media (km/h): ");
    int v = Integer.parseInt(IO.readln());

    float d = v * t;
    float l = d/12;

    IO.println("Velocidade: " + v + " horas");
    IO.println("Tempo: " + t + " km/h");
    IO.println("Distancia: " + String.format("%.2f", d) + " km");
    IO.print("Litros gasto: " + String.format("%.0f", l) + "L");


}
