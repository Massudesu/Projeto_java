//4. Somar e exibir todos os múltiplos de 3 entre 1 e 100.

import static java.lang.IO.*;
void main() {
    int n = 0;
    for(int i = 0; i<=100; i++) {
        if (i % 3 == 0) {
            print(i+", ");
            n+=i;
        }
    }
    print("Soma: "+n);
}