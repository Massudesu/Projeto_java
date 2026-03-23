import static java.lang.IO.*;
//import static java.lang.IO.*;
void main() {
    print("Digite o valor da compra: ");
    float valor = Float.parseFloat(IO.readln());

    print("Você é cliente premium? (S/N): ");
    char premium  = readln().charAt(0);

    if (valor >= 150.00 && premium == 'S'){
        print("Você tem direito a frete gratis");
    }else{
        double frete = valor * 0.40;
        print("Você vai pagar R$"+frete+" de frete");
    }
}