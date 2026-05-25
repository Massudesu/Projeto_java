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
    float soma= 0;
    List<String> produtos = new ArrayList<>();
    List<Float> precos = new ArrayList<>();

    while (true) {

        String produto = readln("Digite o produto ('fim' para sair): ");
        if (produto.equalsIgnoreCase("fim")) {
            break;
        }
        Float preco = Float.parseFloat(readln("Digite o valor do produto: "));

        if (!produto.isEmpty()) {
            produtos.add(produto);
            precos.add(preco);
            println(produto + " adicionado!");
            println("R$" + preco);


        }
        soma+= preco;

//    for (String produto:produtos) {
//        for(float preco:precos){
//            println(produto+ " R$"+preco);
//            soma+= preco;
//
//        }
//
//    }
    }
        println("O valor total da compra é: R$" + soma);

}