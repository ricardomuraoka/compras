package main.compras;
import main.usuarios.Cliente;
import main.usuarios.Usuario;
import static main.estoque.Produto.estoque;

import java.util.Scanner;



public class MenuCompras {
    private MenuCompras() {
        throw new UnsupportedOperationException("Classe de utilidade não pode ser instanciada.");
    }


    public static void MenuCompras(Usuario usuario) throws InterruptedException {
        Usuario logado = usuario;
        Scanner in = new Scanner(System.in);
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        System.out.println("ESCOLHA UMA OPÇÃO");
        System.out.println("1 - DIGITE 1 - BUSCAR PRODUTOS. ");
        System.out.println("2 - DIGITE 2 - LISTA PRODUTOS. ");
        System.out.println("3 - DIGITE 3 - ADICIONAR PRODUTO AO CARRINHO. ");
        System.out.println("4 - DIGITE 4 - EXIBE CARRINHO.  ");
        System.out.println("5 - DIGITE 5 - VOLTAR AO MENU. ");

        int option = Integer.parseInt(in.nextLine());


        switch (option) {
            case 1:
                System.out.println("Qual produto deseja buscar?");
                String buscaProduto = in.nextLine();
                CarrinhoDeCompras.buscaProduto(buscaProduto);
                MenuCompras.MenuCompras(logado);
                break;
            case 2:
                System.out.println(estoque);
                MenuCompras.MenuCompras(logado);
                break;
            case 3:
                carrinho.adicionaProduto();
                MenuCompras.MenuCompras(logado);
                break;
            case 4:
                System.out.println(carrinho);
                System.out.println("1 - DIGITE 1 - VOLTAR AS COMPRAS");
                System.out.println("2 - DIGITE 2 - FECHAR COMPRAS");
                int opt = Integer.parseInt(in.nextLine());
                    if (opt == 1) {
                        MenuCompras.MenuCompras(logado);
                    } else if (opt == 2) {
                        CarrinhoDeCompras.fecharCompra((Cliente) logado);
                }
                MenuCompras.MenuCompras(logado);
                break;
            case 5:
                break;
            default:
                System.out.println("Escolha uma das opções: ");
                MenuCompras.MenuCompras(logado);
                break;
        }
    }
}
