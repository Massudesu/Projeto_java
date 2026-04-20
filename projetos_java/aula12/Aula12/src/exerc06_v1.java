import static java.lang.IO.*;
void main() {
    int i = 1, n = 0;
    while(i <=50){
        if (i % 2==0){
            n += i;

        }
        i++;
    }
    println("Soma: "+ n);
}