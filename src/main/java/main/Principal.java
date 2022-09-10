package main;


import main.estoque.Produto;
import main.login.*;

public class Principal {
    public static void main(String[] args) {
        Produto.criaEstoque();
        Login.validaUsuario();
    }

}
