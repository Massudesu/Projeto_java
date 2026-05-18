//   Exibir um menu de opções para esta lista de compras: 1 - Adicionar a lista, 2 - Pesquisar item, 3 - Remover item,
//   4 - Alterar item, 5 - Listar produtos, 6 - Sair
//     para a opção 1 solicitar ao usuário digitar produtos para compra até digitar a palavra "sair"
//     para a opção 2 solicitar um produto a ser pesquisado na lista. se encontrar o produto, exibir o
//     mesmo senão exibir produto não encontrado;
//     para  a opção 3 solicitar o nome do produto a ser removido da lista. se encontrar, exibir na tela "
//     produto encontrado" senão exibir "produto não encontrado";
//     para a opção 4 solicitar o nome do produto a ser alterado. se encontrar exibir na tela
//     "produto alterado com sucesso" senão exibir "produto não encontrado"
//     para a opção 5 listar todos os produtos cadastrados. se não houver produtos cadastrados,
//     exibir a mensagem "Lista vazia" senão exibir os produtos cadastrados.
//     para a opção 6 sair do programa e exibir na tela "Programa encerrado com sucesso!".
import static java.lang.IO.*;
void main() {
    while(true){
        println("1 - Adicionar a lista");
        println("2 - Pesquisar item");
        println("3 - remover item");
        println("4 - Alterar item");
        println("5 - Listar produtos");
        println("6 - Sair");
        String opcao = readln();

        if(opcao.equals("6")){
            println("Programa encerrado com sucesso!");
            break;
        }
    }
}