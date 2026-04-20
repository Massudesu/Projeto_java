
//login do sitema: projete a verificação de login exigindo
// que o usuario seja "admin" e a senha seja "1234"
import static java.lang.IO.*;
void main() {
    print("Entre com o usuario: ");
    String usu = IO.readln();

    print("Entre com a senha numerica: ");
    String sen = IO.readln();

    if (usu.equals("admin") && sen.equals("1234")){
        print("Acesso permitido!");

    }else{
        print("Acesso negado, usuario ou senha incorretos");
    }
}