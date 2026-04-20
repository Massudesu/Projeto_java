import static java.lang.IO.*;
void main() {
    int n = 0;
    for(int i = 1; i<=50; i++){
        if (i % 2==0) {
            n += i;
        }
    }
    println("Soma: "+ n);

}