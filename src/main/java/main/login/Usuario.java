package main.login;

import java.util.ArrayList;
import java.util.List;

public abstract class Usuario {
    private List<Usuario> usuarios = new ArrayList<>();

    private String cpf;
    private String senha;

    public String getCpf() {
        return cpf;
    }

    public void adicionaUsuario(Usuario novo) {
        if (usuarios.contains(novo)) {
            System.out.println("Este cliente já existe");
        } else {
            usuarios.add(novo);
        }
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}



