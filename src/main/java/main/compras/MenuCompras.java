package main.compras;

import main.usuarios.Usuario;

import java.util.Objects;
import java.util.Scanner;

import static main.estoque.Produto.estoque;

public class MenuCompras {
    private MenuCompras() {
        throw new UnsupportedOperationException("Classe de utilidade não pode ser instanciada.");
    }


    public static void MenuCompras(Usuario usuario) throws InterruptedException {
        Usuario logado = usuario;
        Scanner in = new Scanner(System.in);
        System.out.println("ESCOLHA UMA OPÇÃO");
        System.out.println("1 - DIGITE 1 - BUSCAR PRODUTOS. ");
        System.out.println("2 - DIGITE 2 - LISTA PRODUTOS. ");
        System.out.println("3 - DIGITE 3 - REALIZAR COMPRA. ");
        System.out.println("4 - DIGITE 4 - EXIBE CARRINHO.  ");
        System.out.println("5 - DIGITE 5 - VOLTAR AO MENU. ");

        int option = Integer.parseInt(in.nextLine());

        switch(option) {
            case 1:
                System.out.println("Qual produto deseja buscar?");
                String buscaProduto = in.nextLine();
                CarrinhoDeCompras.buscaProduto(buscaProduto);
            case 2:
                System.out.println(estoque);
            case 3:
            case 4:
            case 5:
            default:
                System.out.println("Escolha uma das opções");
                MenuCompras.MenuCompras(logado);
        }
    }
}
