package main.estoque;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Produto {
    public static List<Produto> estoque = new ArrayList<>();
    private String nome;
    private Double preco;
    private int quantidade;

    public Produto(String nome, Double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "\n Produto [nome: " + nome + ", preco: R$"
                + preco + ", quantidade: " + quantidade + "]";
    }

    public static List<Produto> criaEstoque() {
        Produto caneca = new Produto("CANECA", 19.00, 5);
        Produto copo = new Produto("COPO", 12.00, 4);
        Produto chaveiroColecionável = new Produto("CHAVEIRO COLECIONÁVEL", 2.00, 3);
        Produto growleyStanley = new Produto("GROWLEY STANLEY", 450.00, 2);
        Produto growleyTabajara = new Produto("GROWLEY TABAJARA", 30.00, 5);

        estoque.add(caneca);
        estoque.add(copo);
        estoque.add(chaveiroColecionável);
        estoque.add(growleyStanley);
        estoque.add(growleyTabajara);
        return estoque;
    }

}
