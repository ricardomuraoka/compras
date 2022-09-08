package main.login;

public class Admin extends Usuario {

    public Admin() {
        this.setCpf("admin");
        this.setSenha("Admin");
    }



    @Override
    public String getCpf() {
        return "admin";
    }

    @Override
    public String getSenha() {
        return "admin";
    }
}

