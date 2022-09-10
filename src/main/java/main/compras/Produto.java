package main.compras;

public class Produto {

    private int quantidade;
    private String nome;
    private Double preco;

    public Produto(int quantidade, String nome, Double preco) {
        this.quantidade = quantidade;
        this.nome = nome;
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int codigo) {
        this.quantidade = codigo;
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



    @Override
    public String toString() {
        return "\n Produto [quantidade=" + quantidade + ", nome=" + nome + ", preco="
                + preco + "]";
    }


}
