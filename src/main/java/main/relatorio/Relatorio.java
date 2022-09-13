package main.relatorio;

import main.compras.CarrinhoDeCompras;
import main.estoque.Produto;
import main.usuarios.Cliente;

import java.util.*;

import static main.compras.CarrinhoDeCompras.totalCompras;
import static main.usuarios.Cliente.getClientes;
import static main.usuarios.Cliente.getCompras;

public class Relatorio {
    private static List<Cliente> clientes = new ArrayList<>();
    private static Double totalComprado = Double.valueOf(0);
    private static Double valorMedioCompra = Double.valueOf(0);


    public static void escolhaRelatorio() throws InterruptedException {
        Scanner in = new Scanner(System.in);
        System.out.println("1 - DIGITE 1 - RELATORIO DE CLIENTES");
        System.out.println("2 - DIGITE 2 - NUMERO DE COMPRAS");
        System.out.println("3 - DIGITE 3 - TOTAL COMPRADO");
        System.out.println("4 - DIGITE 4 - VALOR MÉDIO DE COMPRAS");
        int tipoRelatorio = Integer.parseInt(in.nextLine());

        if (tipoRelatorio == 1) {
            final int pageSize = 5;
            final int pages = (getClientes().size() + pageSize - 1) / pageSize;
            for (int i = 1; i <= pages; i++) {
                System.out.println(getPageClient(getClientes(), i, pageSize));
                Thread.sleep(3000);
            }
            escolhaRelatorio();
        } else if (tipoRelatorio == 2) {
            System.out.println("Total de compras: "+ numeroDeCompras(true));
            escolhaRelatorio();
        } else if (tipoRelatorio == 3) {
            System.out.println("Valor total em compras: " + totalComprado(true));
            escolhaRelatorio();
        } else if (tipoRelatorio == 4) {
            System.out.println("Valor médio em compras " + mediaComprado(true));
            escolhaRelatorio();
        } else {
            System.out.println("Escolha uma das opções");
            escolhaRelatorio();
        }
    }

    public static int numeroDeCompras(boolean cascata) {
        int i = 0;
        Iterator<Cliente> it = clientes.iterator();
        while (it.hasNext()) {
            it.next();
            List<Produto> cli = getCompras();
            for (Produto ignored : cli) {
                i = i + 1;
            }
        }
        return i;
    }

    public static double totalComprado(boolean cascata) {
        double total = 0.00;
        int i = 0;
        for (Cliente cliente : getClientes()) {
            List<Produto> car = cliente.getCompras();
            for (Produto c : car) total += totalCompras();
        }
        return total;
    }

    public static double mediaComprado(boolean cascata) {
        double total = 0.00;
        Iterator<Cliente> it = clientes.iterator();
        while (it.hasNext()) {
            it.next();
            for (Produto cli : getCompras()) {
                total = total + totalCompras() / numeroDeCompras(true);
            }
        }
        return total;
    }



    public static <Cliente> List<Cliente> getPageClient(List<Cliente> clientes, int page, int pageSize) {
        if(pageSize <= 0 || page <= 0) {
            throw new IllegalArgumentException("invalid page size: " + pageSize);
        }

        int fromIndex = (page - 1) * pageSize;
        if(clientes == null || clientes.size() <= fromIndex){
            return Collections.emptyList();
        }

        return clientes.subList(fromIndex, Math.min(fromIndex + pageSize, clientes.size()));
    }
}


