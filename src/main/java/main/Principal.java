package main;


import main.login.*;
import main.menu.Menu;

public class Principal {
    public static void main(String[] args) {
        Usuario usuario = Login.login();
        if (usuario != null) {
        Menu.menu(usuario);
        } else {
            System.out.println("Usuário não cadastrado");
            Cliente.desejaCadastrar();
            System.out.println();
            
        }
    }
}
