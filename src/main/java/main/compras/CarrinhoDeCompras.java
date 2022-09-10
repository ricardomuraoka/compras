package main.compras;


import main.estoque.Produto;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private ArrayList<Produto> produtos;
    int quantidade;

    public CarrinhoDeCompras() {
        this.produtos = new ArrayList<Produto>();
    }


    public void adicionaProduto(Produto produto) {
        this.produtos.add(produto);
    }

    public void removeProduto(int qtdeProduto) {
        if(qtdeProduto < 0 ) {
            System.out.println("\n Não é possível remover essa quantidade, favor verificar a quantidade no carrinho");
        }
        else {
            if(qtdeProduto > this.produtos.size()) {
                System.out.println("\n Não temos essa quantidade em estoque");
            }
            else {
                this.produtos.remove(qtdeProduto);
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


}
