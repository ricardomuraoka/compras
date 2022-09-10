package main;


import main.estoque.Produto;
import main.login.*;

import java.util.ArrayList;
import java.util.List;

import static main.login.Login.validaUsuario;
import static main.usuarios.Cliente.getClientes;

public class Principal {
    public static void main(String[] args) throws InterruptedException {
        List<Produto> estoque = Produto.criaEstoque();
        System.out.println(estoque);

        validaUsuario();
        System.out.println(getClientes());
    }

}
