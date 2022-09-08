package main;


import main.login.*;
import main.menu.Menu;

public class main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        Usuario usuario = Login.login();
        if (usuario != null) {
        menu.menu(usuario);
        } else {
            System.out.println("Usuário não cadastrado");
            Cliente.desejaCadastrar();
            System.out.println();
        }
    }
}
