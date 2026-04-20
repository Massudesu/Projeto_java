import static java.lang.IO.*;
import static java.lang.Math.pow;

void main() {
    int i = 15;
    while(i <=50){
        println(i + " ^ " +"2 "+ " = " +String.format("%.0f", (pow(i, 2))));
        i++;
    }
}