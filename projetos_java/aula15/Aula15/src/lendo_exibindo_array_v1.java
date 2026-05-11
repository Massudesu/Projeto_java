import static java.lang.IO.*;
void main() {
    String[] nomes = new String[3];
    for(int i=0; i < nomes.length; i++){
        nomes[i] = readln("Escreva o nome: ");
    }
    for (int i=0; i < nomes.length; i++) {
        println((i + 1) + "º nome: " + nomes[i]);
    }
}
