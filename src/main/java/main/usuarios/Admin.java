package main.usuarios;

import main.usuarios.Usuario;

/**
 * Classe administrador
 */
public class Admin extends Usuario {
    private static final String ADM = "admin";

    public Admin() {
        this.setCpf(ADM);
        this.setSenha(ADM);
    }



    @Override
    public String getCpf() {
        return ADM;
    }

    @Override
    public String getSenha() {
        return ADM;
    }
}

