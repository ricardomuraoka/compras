package main.login;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import static main.login.Cliente.clientes;


public class Login {
    private List<Usuario> usuario = new ArrayList<>();


    public static Usuario login() {
        List<Usuario> usuario = new ArrayList<>();
        Admin admin = new Admin();
        usuario.add(admin);
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o login: ");
        String userLogin = in.nextLine();
        System.out.println("Digite a senha: ");
        String psd = in.nextLine();
        Usuario usuarioLogin = null;
        for (Usuario us : usuario) {
            if (userLogin.equals(admin.getCpf()) && userLogin.equals(admin.getSenha())) {
                usuarioLogin = admin;
            } else if (userLogin.equals(us.getCpf()) && psd.equals(us.getSenha())) {
                for (Usuario usuarioAtual : clientes) {
                    if (userLogin.equals(us.getCpf()) && psd.equals(us.getSenha())) {
                        usuarioLogin = usuarioAtual;
                    }
                }
            } else usuarioLogin = null;
        }
        return usuarioLogin;
    }


    public List<Usuario> getUsuario() {
        return usuario;
    }

    public void setUsuario(List<Usuario> usuario) {
        this.usuario = usuario;
    }

}


