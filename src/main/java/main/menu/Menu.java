package main.menu;

import main.login.Usuario;

import java.util.Objects;
import java.util.Scanner;

public final class Menu {
    private Menu() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }

    public static void menu(Usuario usuario) {

        Scanner in = new Scanner(System.in);
        System.out.println("ESCOLHA UMA OPÇÃO");
        System.out.println("1 - FAZER COMPRAS. DIGITE 1");
        if (Objects.equals(usuario.getCpf(), "admin") && Objects.equals(usuario.getSenha(), "admin")) {
            System.out.println("2 - RELATÓRIOS SOBRE CLIENTES. DIGITE 2");
        }
        System.out.println("3 - TROCAR USUÁRIO. DIGITE 3");
        System.out.println("4 - SOBRE. DIGITE 4");
        System.out.println("5 - SAIR. DIGITE 5 \n");
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

