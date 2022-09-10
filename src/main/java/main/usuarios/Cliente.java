package main.usuarios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cliente extends Usuario {
    public static List<Usuario> clientes = new ArrayList<>();
    
    private String name;
    private String cidade;
    private char sexo;

    public Cliente(String name, String cpf, String senha) {
        this.name = name;
        this.setCpf(cpf);
        this.setSenha(senha);
    }

    public Cliente() {
        super();
    }

    public String getName() {
        return name;
    }
    
    public static void cadastraCliente() {
        Scanner in = new Scanner(System.in);
        System.out.println("Insira seu nome: ");
        String name = in.nextLine();
        System.out.println("Insira seu cpf: ");
        String cpf = in.nextLine();
        System.out.println("insira a senha que deseja cadastrar senha: ");
        String senha = in.nextLine();
        Cliente novo = new Cliente(name, cpf, senha);
        novo.adicionaUsuario(novo);
    }


    public static void desejaCadastrar() {
        System.out.println("Deseja realizar seu cadastro? ");
        Scanner in = new Scanner(System.in);
        System.out.println("1 - SIM");
        System.out.println("2 - NÃO");
        int option = Integer.parseInt(in.nextLine());
        if (option == 1) Cliente.cadastraCliente();
        else if (option == 2) System.exit(0);
        else {
            System.out.println("Digite uma opção corretamente");
            desejaCadastrar();
        }
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

}