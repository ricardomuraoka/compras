package main.login;

import main.menu.Menu;
import main.usuarios.Admin;
import main.usuarios.Cliente;
import main.usuarios.Usuario;

import java.util.Scanner;
import static main.usuarios.Cliente.getClientes;


public class Login {

    public static Usuario login() throws InterruptedException {
        Admin admin = new Admin();
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o login (cpf): ");
        String userLogin = in.nextLine();
        System.out.println("Digite a senha: ");
        String psd = in.nextLine();
        Usuario usuarioLogin = null;
        if ((userLogin.equals(admin.getCpf())) && (userLogin.equals(admin.getCpf()))) {
            usuarioLogin = admin;
        } else {
            for (Usuario usuarioAtual : getClientes()) {
                if (userLogin.equals(usuarioAtual.getCpf()) && psd.equals(usuarioAtual.getSenha())) {
                    usuarioLogin = usuarioAtual;
                }
            }
        };
        return usuarioLogin;
    }

    public static boolean validaUsuario(Usuario usuario) throws InterruptedException {
        boolean valida = false;
        if (usuario != null) {
            valida = true;
        } else{
            valida = false;
        }
        return valida;
    }

    public static void trocaUsuario() throws InterruptedException {
        Usuario novoUsuario = Login.login();
        if (validaUsuario(novoUsuario) == true) {
            Menu.menu(novoUsuario);
        } else {
            System.out.println("Usuário não cadastrado");
            Cliente.desejaCadastrar();
        }
    }
}


