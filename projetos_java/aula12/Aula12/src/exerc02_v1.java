import static java.lang.IO.*;
void main() {
    float i = 1.0f;
    while(i <=5.01f){

        println(String.format("%.2f", i));
        i+= 0.01f;
    }
}