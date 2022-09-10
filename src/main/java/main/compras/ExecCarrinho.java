package main.compras;
import main.estoque.Produto;

public class ExecCarrinho {
    public static void main(String[] args) {

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        Produto caneca = new Produto("CANECA", 19.00);
        Produto copo = new Produto("COPO", 12.00);
        Produto chaveiroColecionável = new Produto("CHAVEIRO COLECIONÁVEL", 2.00);
        Produto growleyStanley = new Produto("GROWLEY STANLEY", 450.00);
        Produto growleyTabajara = new Produto("GROWLEY TABAJARA", 30.00);


        carrinho.adicionaProduto(caneca);
        carrinho.adicionaProduto(chaveiroColecionável);
        carrinho.adicionaProduto(copo);
        carrinho.adicionaProduto(growleyStanley);
        carrinho.adicionaProduto(growleyTabajara);

        Double total = carrinho.totalProdutos();

        carrinho.removeProduto(2);

        total = carrinho.totalProdutos();

        Produto tacaVinho = new Produto("TAÇA DE VINHO", 45.00);
        carrinho.adicionaProduto(tacaVinho);

        total = carrinho.totalProdutos();
        System.out.println(carrinho.listaProdutos());
        System.out.println(total);
    }

}

