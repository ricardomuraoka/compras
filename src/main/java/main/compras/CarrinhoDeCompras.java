package main.compras;


import main.estoque.Produto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static main.estoque.Produto.estoque;

public class CarrinhoDeCompras {

    private ArrayList<Produto> produtos;



    public CarrinhoDeCompras() {
        this.produtos = new ArrayList<Produto>();
    }


    public void adicionaProduto() {
        Scanner in = new Scanner(System.in);
        System.out.println("Qual produto gostaria de adicionar? \n");
        String itemProduto = in.nextLine();
        System.out.println("Quantos itens gostaria de adicionar? \n");
        int qtdeProdutos = Integer.parseInt(in.nextLine());
        buscaProduto(itemProduto);
        for (int i = 0; i < estoque.size(); i++) {
            for (Produto produtoEstoque : estoque) {
                if (produtoEstoque.getNome().equals(itemProduto)) {
                    produtos.add(produtoEstoque);
                    produtoEstoque.setQuantidade(produtoEstoque.getQuantidade() - qtdeProdutos);
                }
            }
        }
    }

    public void buscaProduto(String busca) {
        String pesquisa;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o produto que deseja buscar");
        pesquisa = in.nextLine();
        if (estoque.contains(pesquisa))
            System.out.println("Temos em estoque: " + pesquisa);
        else
            System.out.println(pesquisa + "não possuímos em estoque: ");
    }


    public void removeProduto(int numeroProduto) {
        if(numeroProduto < 0 ) {
            System.out.println("\n Produto invalido para remocao");
        }
        else {
            if(numeroProduto > this.produtos.size()) {
                System.out.println("\n Produto maior do que tamanho da colecao. Produto invalido para remocao");
            }
            else {
                this.produtos.remove(numeroProduto);
            }
        }
    }



    public String listaProdutos() {
        List<Produto> listaProduto= new ArrayList<>();
        for( Produto produtoNaLista : this.produtos) {
            listaProduto.add(produtoNaLista);
        }

        return String.valueOf(listaProduto);

    }


    public Double totalProdutos() {
        Double total = 0.00;

        for( Produto produtoNaLista : this.produtos) {
            total = total + produtoNaLista.getPreco();
            String.format("\n"+ produtoNaLista);
        }

        return total;
    }


    public ArrayList<Produto> getCarrinhoProdutos() {
        return produtos;
    }

    public void setProdutosCarrinho(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }

}
