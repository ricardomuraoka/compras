package main.menu;


import main.Sobre;
import main.compras.MenuCompras;
import main.login.Login;
import main.usuarios.Cliente;
import main.usuarios.Usuario;

import java.sql.SQLOutput;
import java.util.Scanner;

import static main.relatorio.Relatorio.escolhaRelatorio;

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
        if (logado.getCpf() != ("admin") && logado.getSenha() != ("admin")) {
            System.out.println("1 - DIGITE 1 - FAZER COMPRAS. ");
        }
        System.out.println("2 - DIGITE 2 - TROCAR USUÁRIO. ");
        System.out.println("3 - DIGITE 3 - SOBRE. ");
        System.out.println("4 - DIGITE 4 - SAIR. ");
        if (logado.getCpf().equals("admin") && logado.getSenha().equals("admin")) {
            System.out.println("5 - DIGITE 5 - RELATÓRIOS SOBRE CLIENTES. ");
        }
        int option = Integer.parseInt(in.nextLine());
        try {
        switch(option) {
            case 1:
                MenuCompras.MenuCompras(logado);
                break;
            case 2:
                Login.trocaUsuario();
                break;
            case 3:
                System.out.println(new Sobre());
                Thread.sleep(3000);
                Menu.menu(logado);
                break;
            case 4:
                System.exit(0);
                break;
            case 5:
                escolhaRelatorio();
                break;
            default:
                System.out.println("Escolha uma das opções: ");
        }
        } catch (NumberFormatException e) {
            Menu.menu(logado);
        }
    }
}

