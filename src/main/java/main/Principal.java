package main;


import main.estoque.Produto;
import main.login.*;
import main.menu.Menu;
import main.usuarios.Cliente;
import main.usuarios.Usuario;

import java.util.ArrayList;
import java.util.List;

import static main.login.Login.validaUsuario;
import static main.usuarios.Cliente.getClientes;

public class Principal {
    public static void main(String[] args) throws InterruptedException {
        List<Produto> estoque = Produto.criaEstoque();
        Usuario logado = Login.login();
        if (validaUsuario(logado) == true) {
            Menu.menu(logado);
        } else {
            System.out.println("Usuário não cadastrado");
            Cliente.desejaCadastrar();
        }
    }

}
