package main.login;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cliente extends Usuario {
    List<Usuario> cliente = new ArrayList<>(); 
    
    private String name;

    public String getName() {
        return name;
    }
    
    public static Cliente cadastraCliente() {
        Scanner in = new Scanner(System.in);
        System.out.println("Insira seu nome: ");
        String name = in.nextLine();
        System.out.println("Insira seu cpf: ");
        String cpf = in.nextLine();
        System.out.println("insira a senha que deseja cadastrar senha: ");
        String senha = in.nextLine();
        return new Cliente(name, cpf, senha);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    private String cidade;
    private char sexo;


    public Cliente(String name, String cpf, String senha) {
        this.cliente = cliente;
        this.setCpf(cpf);
        this.setSenha(senha);
    }
}
