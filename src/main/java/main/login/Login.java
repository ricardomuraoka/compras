package main.login;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import main.menu.Menu;

import static main.menu.Menu.*;


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
        Usuario usuario_login = null;
        for (Usuario us : usuario) {
            if (userLogin.equals(admin.getCpf()) && admin.getSenha().equals(admin.getSenha())) {
                usuario_login = admin;
            } else if (userLogin.equals(us.getCpf()) && psd.equals(us.getSenha())) {
                usuario_login = new Cliente(us);
            } else usuario_login = null;
        }
        return usuario_login;
    }


    public List<Usuario> getUsuario() {
        return usuario;
    }

    public void setUsuario(List<Usuario> usuario) {
        this.usuario = usuario;
    }

}


