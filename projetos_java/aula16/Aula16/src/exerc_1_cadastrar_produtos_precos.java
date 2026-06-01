//Crie um programa em java que permita cadastras produtos e seus respectivos preços.
//
//O programa deve solicitar ao usuário o nome de um produto e o seu preço,
//repetindo esse processo ate que seja digitada a palavra "fim" para encerrar o cadastro.
//
//após finalizar as entradas o programa deve:
//- exibir todos os produtos cadastrados;
//- calcular e mostrar o valor total da compra;
//- identificar e exibir o produto com o maior preço


import static java.lang.IO.*;

void main() {
    float soma = 0;

    List<String> produtos = new ArrayList<>();
    List<Float> precos = new ArrayList<>();

    while (true) {
        String produto = readln("Digite o produto ('fim' para sair): ");

        if (produto.equalsIgnoreCase("fim")) {
            break;
        }

        float preco = Float.parseFloat(
                readln("Digite o valor do produto: "));

        if (!produto.isEmpty()) {
            produtos.add(produto);
            precos.add(preco);

            println(produto + " adicionado!");
            println("R$" + preco);

            soma += preco;
        }
    }

    println("Produtos cadastrados:");

    for (int i = 0; i < produtos.size(); i++) {
        println(produtos.get(i) + " - R$" + precos.get(i));
    }

    println("O valor total da compra é: R$" + soma);

    if (!produtos.isEmpty()) {
        int indiceMaior = 0;

        for (int i = 1; i < precos.size(); i++) {
            if (precos.get(i) > precos.get(indiceMaior)) {
                indiceMaior = i;
            }
        }

        println("Produto mais caro: " + produtos.get(indiceMaior) + " - R$" + precos.get(indiceMaior));
    }
}