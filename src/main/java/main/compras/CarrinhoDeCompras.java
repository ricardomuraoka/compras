package main.compras;


import main.estoque.Produto;
import main.usuarios.Cliente;

import java.util.ArrayList;
import java.util.Scanner;

import static main.estoque.Produto.estoque;

public class CarrinhoDeCompras {

    private static ArrayList<Produto> produtosNoCarrinho = new ArrayList<>();
    private static double totalCompras;
    private static Cliente clienteCarrinho;


    public CarrinhoDeCompras(Cliente atual) {
        clienteCarrinho = atual;
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
                produtosNoCarrinho.add(produtoEstoque);
                produtosNoCarrinho.get(produtosNoCarrinho.indexOf(produtoEstoque)).setQuantidade(qtdeProdutos);
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
        if (resultadoBusca.equals("")) {
            resultadoBusca = ("Não temos " + busca + " em estoque");
            System.out.println(resultadoBusca);
        }

    }

    public static Double totalCompras() {
        double total = 0;
        for (Produto produtoCarrinho : produtosNoCarrinho) {
            total += produtoCarrinho.getPreco() * produtoCarrinho.getQuantidade();
        }
        totalCompras = total;
        return total;
    }


    public static void fecharCompra() {
        for (Produto produtoCarrinho : produtosNoCarrinho) {
            int qtdeProdutoCarrinho = produtosNoCarrinho.get(produtosNoCarrinho.indexOf(produtoCarrinho)).getQuantidade();
            int qtdeProdutoEstoque = estoque.get(estoque.indexOf(produtoCarrinho)).getQuantidade();
            estoque.get(estoque.indexOf(produtoCarrinho)).setQuantidade(qtdeProdutoEstoque - qtdeProdutoCarrinho);
            produtosNoCarrinho.get(produtosNoCarrinho.indexOf(produtoCarrinho)).setQuantidade(qtdeProdutoCarrinho);
        }
        Cliente.adicionaCompra(produtosNoCarrinho);
        produtosNoCarrinho = new ArrayList<>();
    }

    public static double getTotalCompras() {
        return totalCompras;
    }


    public ArrayList<Produto> getCarrinho() {
        return produtosNoCarrinho;
    }

    public ArrayList<Produto> getCarrinhoProdutos() {
        return produtosNoCarrinho;
    }

    @Override
    public String toString() {
        return getCarrinhoProdutos() + "\nValor Total: R$" + totalCompras();
    }
}


