package main.login;

import java.util.ArrayList;
import java.util.List;

public abstract class Usuario {
    private List<Usuario> usuario;

    {
        usuario = new ArrayList<>();
    }

    private String cpf;
    private String senha;

    public String getCpf() {
        return cpf;
    }

    public void addUsuario(Usuario novo) {
        if (usuario.contains(novo)) {
            System.out.println("Este cliente já existe");
        } else {
            this.usuario.add(novo);
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



