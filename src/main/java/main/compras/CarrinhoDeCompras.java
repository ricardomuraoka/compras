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
