package main.compras;


import main.estoque.Produto;
import main.usuarios.Cliente;
import main.usuarios.Usuario;

import java.util.ArrayList;
import java.util.Scanner;

import static main.estoque.Produto.estoque;

public class CarrinhoDeCompras {

    private static ArrayList<Produto> carrinho = new ArrayList<>();
    private static double totalCompras;



    public CarrinhoDeCompras() {
        }


    public static void adicionaProduto() {
        Scanner in = new Scanner(System.in);
        System.out.println("Qual produto gostaria de adicionar? \n");
        String itemProduto = in.nextLine();
        System.out.println("Quantos itens gostaria de adicionar? \n");
        int qtdeProdutos = Integer.parseInt(in.nextLine());
        buscaProduto(itemProduto);
        for (Produto produtoEstoque : estoque) {
            if (produtoEstoque.getNome().equals(itemProduto)) {
                carrinho.add(produtoEstoque);
                carrinho.get(carrinho.indexOf(produtoEstoque)).setQuantidade(qtdeProdutos);
            }
        }
    }

    public static void buscaProduto(String busca) {
        String resultadoBusca = "";
        for (Produto produtoEstoque : estoque) {
            if (produtoEstoque.getNome().toLowerCase().contains(busca.toLowerCase())) {
                resultadoBusca = ("Temos em estoque: " + produtoEstoque);
                System.out.println(resultadoBusca);
            }
        }
        if (resultadoBusca == "") {
            resultadoBusca = ("Não temos " + busca + " em estoque");
            System.out.println(resultadoBusca);
        }

    }

    public static Double totalCompras() {
        double total = 0;
        for (Produto produtoCarrinho: carrinho) {
            total += produtoCarrinho.getPreco() * produtoCarrinho.getQuantidade();
        }
        totalCompras = total;
        return total;
    }

    public static void fecharCompra(Cliente cliente) {
        for (Produto produtoCarrinho: carrinho) {
            int qtdeProdutoCarrinho = carrinho.get(carrinho.indexOf(produtoCarrinho)).getQuantidade();
            int qtdeProdutoEstoque = estoque.get(estoque.indexOf(produtoCarrinho)).getQuantidade();
            estoque.get(estoque.indexOf(produtoCarrinho)).setQuantidade(qtdeProdutoEstoque - qtdeProdutoCarrinho);
        }
        cliente.adicionaCompra(carrinho);
        carrinho = new ArrayList<>();
    }
    public ArrayList<Produto> getCarrinhoProdutos() {
        return carrinho;
    }

    @Override
    public String toString() {
        return getCarrinhoProdutos() + "\nValor Total: R$" + totalCompras();
    }
}
