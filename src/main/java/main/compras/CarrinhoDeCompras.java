package main.compras;


import jdk.swing.interop.SwingInterOpUtils;
import main.estoque.Produto;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import static main.estoque.Produto.estoque;

public class CarrinhoDeCompras {

    private ArrayList<Produto> carrinho;



    public CarrinhoDeCompras() {
        this.carrinho = new ArrayList<Produto>();
    }


    public void adicionaProduto() {
        Scanner in = new Scanner(System.in);
        System.out.println("Qual produto gostaria de adicionar? \n");
        String itemProduto = in.nextLine();
        System.out.println("Quantos itens gostaria de adicionar? \n");
        int qtdeProdutos = Integer.parseInt(in.nextLine());
        buscaProduto(itemProduto);
        for (Produto produtoEstoque : estoque) {
            if (produtoEstoque.getNome().equals(itemProduto)) {
                carrinho.add(produtoEstoque);
                produtoEstoque.setQuantidade(produtoEstoque.getQuantidade() - qtdeProdutos);
            }
        }
    }

    public static void buscaProduto(String busca) {
        String resultadoBusca = "";
        for (Produto produtoEstoque : estoque) {
            if (produtoEstoque.getNome().toLowerCase().contains(busca.toLowerCase())) {
                resultadoBusca = ("Temos em estoque: " + busca + produtoEstoque + "\n");
                System.out.println(resultadoBusca);
            }
        }
        if (resultadoBusca == "") {
            resultadoBusca = ("Não temos " + busca + " em estoque");
            System.out.println(resultadoBusca);
        }

    }


    public void removeProduto(int numeroProduto) {
        if(numeroProduto < 0 ) {
            System.out.println("\n Produto invalido para remocao");
        }
        else {
            if(numeroProduto > this.carrinho.size()) {
                System.out.println("\n Produto maior do que tamanho da colecao. Produto invalido para remocao");
            }
            else {
                this.carrinho.remove(numeroProduto);
            }
        }
    }



    public String listaProdutos() {
        List<Produto> listaProduto= new ArrayList<>();
        for( Produto produtoNaLista : this.carrinho) {
            listaProduto.add(produtoNaLista);
        }

        return String.valueOf(listaProduto);

    }


    public Double totalProdutos() {
        Double total = 0.00;

        for( Produto produtoNaLista : this.carrinho) {
            total = total + produtoNaLista.getPreco();
            String.format("\n"+ produtoNaLista);
        }

        return total;
    }


    public ArrayList<Produto> getCarrinhoProdutos() {
        return carrinho;
    }

    public void setProdutosCarrinho(ArrayList<Produto> produtos) {
        this.carrinho = produtos;
    }

}
