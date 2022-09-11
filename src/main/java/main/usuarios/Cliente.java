package main.usuarios;

import main.estoque.Produto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static main.login.Login.trocaUsuario;

/**
Classe Cliente
 */
public class Cliente extends Usuario {
    private static List<Usuario> clientes = new ArrayList<>();

    private String name;
    private String cidade;
    private static List<Produto> historicoCompras = new ArrayList<Produto>();

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

    public static void cadastraCliente() throws InterruptedException {
        Scanner in = new Scanner(System.in);
        System.out.println("Insira seu nome: ");
        String name = in.nextLine();
        System.out.println("Insira seu cpf: ");
        String cpf = in.nextLine();
        System.out.println("insira a senha que deseja cadastrar: ");
        String senha = in.nextLine();
        Usuario novo = new Cliente(name, cpf, senha);
        System.out.println("Insira a cidade onde você mora: ");
        String cidadeUsuario = in.nextLine();
        ((Cliente) novo).setCidade(cidadeUsuario);
        adicionaCliente(novo);
        trocaUsuario();
    }

    public static void adicionaCliente(Usuario novo) {
        if (clientes.contains(novo)) {
            System.out.println("Este cliente já existe");
        } else {
            clientes.add(novo);
        }
    }


    public static void desejaCadastrar() throws InterruptedException {
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

    public static void adicionaCompra(ArrayList<Produto> compra) {
        for (Produto produto: compra) {
            historicoCompras.add(produto);
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

    public static List<Usuario> getClientes() {
        return clientes;
    }


    @Override
    public String toString() {
        return "Nome do cliente: " + name +
                ", cidade: " + cidade;
    }


}
