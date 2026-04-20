import static java.lang.IO.*;
import static java.lang.Math.pow;
void main() {
    for (int i = 15; i <= 50; i++) {
        println(i + " ^ " +"2 "+ " = " +String.format("%.0f", (pow(i, 2))));
    }
}