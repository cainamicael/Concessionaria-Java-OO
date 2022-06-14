import java.util.ArrayList;
import java.util.Scanner;

import classes.Cliente;
import classes.Vendedor;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        //Cadastrando alguns clientes

        ArrayList<Cliente> cliente = new ArrayList<Cliente>();
        cliente.add(new Cliente("0.000.000", "Cainã Micael", "988888880", "Rua sem nome, nº 0", "Débito"));
        cliente.add(new Cliente("0.000.001", "Pedro Henrique", "988888881", "Rua sem nome, nº 1", "Crédito"));
        cliente.add(new Cliente("0.000.002", "Juliana Albuquerque", "988888882", "Rua sem nome, nº 2", "Pix"));
        cliente.add(new Cliente("0.000.003", "Marcos Vinicius", "988888883", "Rua sem nome, nº 3", "Financiado"));

        //Cadastrando os vendedores
        ArrayList<Vendedor> vendedor = new ArrayList<Vendedor>();
        vendedor.add(new Vendedor("Juvenal Batista", "1.000.000", 19));
        vendedor.add(new Vendedor("Lourival Puzzuoli", "2.000.000", 2));
        vendedor.add(new Vendedor("Sebastião Jailson", "3.000.000", 5));
        vendedor.add(new Vendedor("Enzo Schneider", "4.000.000", 3));
        vendedor.add(new Vendedor("Moacir Agripino", "5.000.000", 30));

        //menu 01
        System.out.println("Olá! Bem vindo a Poo Multimarcas - Seu carro novo está aqui!!!");
        int escolha = -1;
        do{
            System.out.println("Escolha uma opção abaixo:");
            System.out.printf("%n [1] Área Administrativa %n [2] Área do Comprador");
            System.out.printf("%nSua escolha: ");
            escolha = sc.nextInt(); 
            if (escolha < 1 || escolha >2)
                System.out.println("Opção inválida! Tente novamente!");
            else
                System.out.println("Vamos Prosseguir");
        } while(escolha < 1 || escolha >2);
        
        sc.close();
    }
}
