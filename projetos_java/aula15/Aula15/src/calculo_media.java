import static java.lang.IO.*;
void main(){
    int[] numeros = new int[3];
    float soma =0;
    double media;
    for (int i = 0; i < numeros.length; i++) {
        numeros[i] = Integer.parseInt(readln("Digite o "+ (i+1)+ "º numero: "));
        soma += numeros[i];
    }
    media = (soma/ numeros.length);
    println("Media = "+media);//("Media = "+ (soma/ numeros.length));
}