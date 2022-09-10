package main.usuarios;

import java.util.ArrayList;
import java.util.List;

import static main.usuarios.Cliente.*;

/**
 * Classe usuário
 */
public abstract class Usuario {
    private List<Usuario> usuarios = new ArrayList<>();

    private String cpf;
    private String senha;

    public String getCpf() {
        return cpf;
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



