//   Solicite temperaturas em graus Celsius até o usuário digitar "sair";
//     Converta as temperaturas da lista em graus Celsius para uma nova lista de temperaturas em graus Fahrenheit;
//     Calcule e exiba as médias de ambas as temperaturas.

import static java.lang.IO.*;

void main() {
    ArrayList<Double> grausCelsius = new ArrayList<>();
    ArrayList<Double> grausFahrenheit = new ArrayList<>();
    double somaCelsius = 0;
    double somaFahrenheit = 0;

    while (true) {
        String entrada = readln("Temperatura em Celsius (ou digite 'sair'): ");

        if (entrada.equalsIgnoreCase("sair")) {
            break;
        }

        double celsius = Double.parseDouble(entrada);
        grausCelsius.add(celsius);

        double fahrenheit = celsius * 1.8 + 32;
        grausFahrenheit.add(fahrenheit);
    }


    for (double temp : grausCelsius) {
        somaCelsius += temp;
    }
    double mediaCelsius = somaCelsius / grausCelsius.size();


    for (double temp : grausFahrenheit) {
        somaFahrenheit += temp;
    }
    double mediaFahrenheit = somaFahrenheit / grausFahrenheit.size();

    println("Celsius: " + grausCelsius);
    println("Fahrenheit: " + grausFahrenheit);
    println("Média em Celsius: " + mediaCelsius + " °C");
    println("Média em Fahrenheit: " + mediaFahrenheit + " °F");
}