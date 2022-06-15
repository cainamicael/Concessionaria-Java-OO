import java.util.ArrayList;
import java.util.Scanner;

import classes.Cliente;
import classes.Montadora;
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

        //cadastrar algumas Montadoras
        ArrayList<Montadora> montadora = new ArrayList<Montadora>();
        montadora.add(new Montadora("43.999.424/0001-14", "VOLVO DO BRASIL VEICULOS LTDA", "Avenida Juscelino K de Oliveira, 2600, Lat Direita CIC, CURITIBA - PR CEP: 81260-900", "(41) 3405-5694"));

        montadora.add(new Montadora("03.472.246/0004-05", "AUDI DO BRASIL INDUSTRIA E COMERCIO DE VEICULOS LTDA.", "Avenida das Industrias, S/N Galpaodocas 81 e 82 DISTRITO INDUSTRIAL BENEDITO STORANIVINHEDO - SP CEP: 13288-163", "(11) 3041-2959"));

        montadora.add(new Montadora("", "nome", "endereco", "telefone"));


        //cadastrar Carros

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

        switch (escolha) {
            case 1:
                System.out.printf("%n Área administrativa - Vamos mostrar todos os vendedores da loja e os anos de experiência: %n");
                for (Vendedor funcionario : vendedor) {
                    System.out.printf("%n %s,  que tem %d ano(s) de Experiência",funcionario.getNome(), funcionario.getExperiencia());
                }
                System.out.printf("%n%n");
                //add vendedor, add carro
                break;
            case 2:
            System.out.printf("%n Área do Cliente - Vamos mostrar todos os carros da loja vendidos e não vendidos %n");
            // ver se já comprou e ou não, ver se tem cadastro ou não
                break;
        
            default:
                break;
        }
        
        sc.close();
    }
}
