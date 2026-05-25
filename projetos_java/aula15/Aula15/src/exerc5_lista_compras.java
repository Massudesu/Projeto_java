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
ArrayList<String> listaCompras = new ArrayList<>();

void main() {
    while (true) {
        println("LISTA DE COMPRAS");
        println("1 - Adicionar a lista");
        println("2 - Pesquisar item");
        println("3 - Remover item");
        println("4 - Alterar item");
        println("5 - Listar produtos");
        println("6 - Sair");
        print("Escolha uma opção: ");
        String opcao = readln();

        switch (opcao) {
            case "1":
                println("Adicionar Itens (digite 'sair' para voltar)");
                while (true) {
                    print("Digite o produto: ");
                    String produto = readln().trim();
                     if (produto.equalsIgnoreCase("sair")) {
                         break;
                     }

                     if (!produto.isEmpty()) {
                         listaCompras.add(produto);
                         println(produto + " adicionado!");
                     }
                }
                break;

                case "2":
                    println("Pesquisar Item");
                    print("Digite o produto para pesquisar: ");
                    String pesquisar = readln().trim();

                    if (listaCompras.contains(pesquisar)) {
                        println("Produto encontrado: " + pesquisar);
                    } else {
                        println("Produto não encontrado");
                    }
                    break;

                    case "3":
                        println("Remover Item ");
                        print("Digite o produto a ser removido: ");
                        String remover = readln().trim();


                        if (listaCompras.remove(remover)) {
                            println("Produto encontrado e removido com sucesso!");
                        } else {
                            println("Produto não encontrado");
                        }
                        break;

                        case "4":
                            println("Alterar Item");
                            print("Digite o nome do produto que deseja alterar: ");
                            String antigo = readln().trim();

                            int indice = listaCompras.indexOf(antigo);
                            if (indice != -1) {
                                print("Digite o novo nome para o produto: ");
                                String novo = readln().trim();
                                if (!novo.isEmpty()) {
                                    listaCompras.set(indice, novo);
                                    println("Produto alterado com sucesso!");
                                }
                            } else {
                                println("Produto não encontrado");
                            }
                            break;

                            case "5":
                                println("Produtos Cadastrados");
                                if (listaCompras.isEmpty()) {
                                    println("Lista vazia");
                                } else {
                                    for (int i = 0; i < listaCompras.size(); i++) {
                                        println((i + 1) + ". " + listaCompras.get(i));
                                    }
                                }
                                break;
                                case "6":
                                    println("Programa encerrado com sucesso!");
                                    return;
                                    default:
                                        println("Opção inválida! Tente novamente.");
                                        break;
        }
    }
}