package main.menu;
import java.util.Scanner;

import main.login.Admin;
import main.login.Login;
import main.login.Usuario;

import java.util.Scanner;

public class Menu {
    public Menu() {
    }

    public static void menu(Usuario usuario) {
        Usuario admin = new Admin();
        Scanner in = new Scanner(System.in);
        System.out.println("ESCOLHA UMA OPÇÃO");
        System.out.println("FAZER COMPRAS. DIGITE 1");
        if (usuario.getCpf() == "admin" && usuario.getSenha() == "admin" ) {
            System.out.println("RELATÓROS SOBRE CLIENTES. DIGITE 2");
        }
        System.out.println("TROCAR USUARIO. DIGITE 3");
        System.out.println("SOBRE. DIGITE 4");
        System.out.println("SAIR. DIGITE 5 \n");
        int option = Integer.parseInt(in.nextLine());

        switch(option) {
            case 1:
                ;
            case 2:
                ;
            case 3:
                ;
            case 4:
                ;
            case 5:
                System.exit(0);
        }
    }
}

