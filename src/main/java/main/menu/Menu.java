package main.menu;

import main.Sobre;
import main.compras.Compras;
import main.login.Login;
import main.usuarios.Usuario;

import java.util.Objects;
import java.util.Scanner;

/**
 * Classe utilitária menu
 */
public final class Menu {
    private Menu() {
        throw new UnsupportedOperationException("Classe de utilidade não pode ser instanciada.");
    }

    public static void menu(Usuario usuario) throws InterruptedException {
        Usuario logado = usuario;
        Scanner in = new Scanner(System.in);
        System.out.println("ESCOLHA UMA OPÇÃO");
        if (Objects.equals(usuario.getCpf(), logado.getCpf()) && Objects.equals(usuario.getSenha(), usuario.getSenha()))
        {
            System.out.println("1 - DIGITE 1 - FAZER COMPRAS. ");
        }
        System.out.println("2 - DIGITE 2 - TROCAR USUÁRIO. ");
        System.out.println("3 - DIGITE 3 - SOBRE. ");
        System.out.println("4 - DIGITE 4 - SAIR.  \n");
        if (Objects.equals(usuario.getCpf(), "admin") && Objects.equals(usuario.getSenha(), "admin")) {
            System.out.println("5 - DIGITE 5 - RELATÓRIOS SOBRE CLIENTES. ");
        }
        int option = Integer.parseInt(in.nextLine());

        switch(option) {
            case 1:
                Compras.Compras(logado);
            case 2:
                Login.validaUsuario();
            case 3:
                System.out.println(new Sobre());
                Thread.sleep(3000);
                Menu.menu(logado);
            case 4:
                System.exit(0);
            case 5:

            default:
                Menu.menu(logado);
        }
    }
}

