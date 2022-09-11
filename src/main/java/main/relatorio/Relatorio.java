package main.relatorio;

import main.estoque.Produto;
import main.usuarios.Cliente;
import main.usuarios.Usuario;

import java.util.ArrayList;
import java.util.List;

public class Relatorio {
    private static List<Usuario> clientes = new ArrayList<>();
    static int compras = 0;
    private Double totalComprado= Double.valueOf(0);
    private Double valorMedioCompra= Double.valueOf(0);


    public static String relatorioGeral() {
        clientes = Cliente.getClientes();
        for (Usuario cliente: clientes) {
            List<Produto> historico = Cliente.geraHistorico();
            compras += historico.size();
        }
        for (Usuario cliente: clientes) {
            List<Produto> historico = Cliente.geraHistorico();
            compras += historico.size();
        }
        for (Usuario cliente: clientes) {
            List<Produto> historico = Cliente.geraHistorico();
            compras += historico.size();
        }
    }
}


