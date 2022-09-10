package main.menu;


import main.Sobre;
import main.compras.MenuCompras;
import main.login.Login;
import main.usuarios.Usuario;
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
        System.out.println("1 - DIGITE 1 - FAZER COMPRAS. ");
        System.out.println("2 - DIGITE 2 - TROCAR USUÁRIO. ");
        System.out.println("3 - DIGITE 3 - SOBRE. ");
        System.out.println("4 - DIGITE 4 - SAIR. ");
        if (logado.getCpf().equals("admin") && logado.getSenha().equals("admin")) {
            System.out.println("5 - DIGITE 5 - RELATÓRIOS SOBRE CLIENTES. ");
        }
        int option = Integer.parseInt(in.nextLine());

        switch(option) {
            case 1:
                MenuCompras.MenuCompras(logado);
            case 2:
                Login.trocaUsuario();
            case 3:
                System.out.println(new Sobre());
                Thread.sleep(3000);
                Menu.menu(logado);
            case 4:
                System.exit(0);
            case 5:
        }
    }
}

