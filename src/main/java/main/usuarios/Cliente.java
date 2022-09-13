package main.usuarios;

import main.compras.CarrinhoDeCompras;
import main.estoque.Produto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static main.login.Login.trocaUsuario;

/**
Classe Cliente
 */
public class Cliente extends Usuario {
    private String name;
    private String cidade;
    private static List<Cliente> clientes = new ArrayList<>();
    private static List<CarrinhoDeCompras> compras = new ArrayList<>();
    private static List<Produto> historicoCompras = new ArrayList<>();

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
        Cliente novo = new Cliente(name, cpf, senha);
        System.out.println("Insira a cidade onde você mora: ");
        String cidadeUsuario = in.nextLine();
        novo.setCidade(cidadeUsuario);
        adicionaCliente(novo);
        trocaUsuario();
    }

    public static void adicionaCliente(Usuario novo) {
        if (clientes.contains(novo)) {
            System.out.println("Este cliente já existe");
        } else {
            clientes.add((Cliente) novo);
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
        historicoCompras.addAll(compra);
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

    public static List<Cliente> getClientes() {
        return clientes;
    }

    public static List<Produto> getCompras() {
        return historicoCompras;
    }

    public static List<Cliente> criaCliente() {
        Cliente joao = new Cliente("João", "123456", "123456");
        Cliente marcio = new Cliente("Márcio", "12", "12");
        Cliente marina = new Cliente("Marina", "13", "13");
        Cliente maria = new Cliente("Maria", "14", "14");
        Cliente mariana = new Cliente("Mariana", "15", "15");
        Cliente ze = new Cliente("Zé", "16", "17");
        Cliente lucas = new Cliente("Lucas", "18", "18");
        Cliente dolores = new Cliente("Dolores", "19", "19");
        Cliente barbara = new Cliente("Bárbara", "20", "20");
        Cliente ok = new Cliente("ok", "ok", "ok");



        clientes.add(joao);
        clientes.add(marcio);
        clientes.add(marina);
        clientes.add(maria);
        clientes.add(mariana);
        clientes.add(ze);
        clientes.add(lucas);
        clientes.add(dolores);
        clientes.add(barbara);
        clientes.add(ok);
        return clientes;
    }



    @Override
    public String toString() {
        return "Cliente: " + name + "\n";
    }


}
