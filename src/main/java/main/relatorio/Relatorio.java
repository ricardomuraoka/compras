package main.relatorio;

import main.estoque.Produto;
import main.usuarios.Cliente;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static main.usuarios.Cliente.*;

public class Relatorio {
    private static List<Cliente> clientes = new ArrayList<>();
    static int compras = 0;
    private static Double totalComprado = Double.valueOf(0);
    private static Double valorMedioCompra = Double.valueOf(0);
    List<Object> listaRelatorioGeral = new ArrayList<>();


    public static void escolhaRelatorio() {
        Scanner in = new Scanner(System.in);
        System.out.println("1 - DIGITE 1 - RELATORIO GERAL");
        System.out.println("2 - DIGITE 2 - RELATORIO POR CLIENTE");
        int tipoRelatorio = Integer.parseInt(in.nextLine());
        if (tipoRelatorio == 1) {
            relatorioGeral();
        } else if (tipoRelatorio == 2) {
            System.out.println(getHistoricoCompras());
        } else {
            System.out.println("Escolha uma das opções");
        }
    }


    public static void relatorioGeral() {
        clientes = getClientes();
        String nomeCliente = null;
        for (int i = 0; i < clientes.size(); i++) {
            List<Produto> historico = geraHistorico();
            nomeCliente = clientes.get(i).getName();
            totalComprado = clientes.get(i).getTotalComprado();
            valorMedioCompra = clientes.get(i).getMediaCompra();
            compras = historico.size();
            System.out.println("Cliente: " + nomeCliente +
                    "\nNº de Compras: " + compras +
                    "\nValor total em compras: " + totalComprado +
                    "\nValor Médio das compras: " + valorMedioCompra);

        }
    }
}


