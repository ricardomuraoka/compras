package main.login;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import main.menu.Menu;

import static main.menu.Menu.*;


public class Login {
    private List<Usuario> usuario = new ArrayList<>();


    public static boolean login() {
        List<Usuario> usuario = new ArrayList<>();
        Admin admin = new Admin();
        usuario.add(admin);
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o login: ");
        String userLogin = in.nextLine();
        System.out.println("Digite a senha: ");
        String psd = in.nextLine();
        boolean usuario_login;
        if (userLogin.equals(admin.getCpf()) && admin.getSenha().equals(admin.getSenha())) {
            usuario_login = true;
        } else if (userLogin.equals(usuario.get(0).getCpf()) && psd.equals(usuario.get(0).getSenha())) {
            usuario_login = true;
        } else {
            usuario_login = false;
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


