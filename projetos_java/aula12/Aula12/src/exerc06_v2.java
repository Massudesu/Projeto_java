import static java.lang.IO.*;
void main() {
    int i = 1, n = 0;

    do{
        if (i % 2==0){
            n += i;

        }
        i++;
    } while(i <=50);

    println("Soma: "+ n);
}