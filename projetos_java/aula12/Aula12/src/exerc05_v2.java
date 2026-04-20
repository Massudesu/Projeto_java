import static java.lang.IO.*;
void main() {
    int i = 1;
    do{
        if (i % 2==0){
            println(i);
        }
        i++;
    } while(i<=30);
}