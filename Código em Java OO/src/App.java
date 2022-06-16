import java.util.ArrayList;
import java.util.Scanner;

import classes.Carro;
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
        montadora.add(new Montadora("43.999.424/0001-14", "VOLVO DO BRASIL VEICULOS LTDA", "Avenida Juscelino K de Oliveira, 2600, Lat Direita CIC, CURITIBA - PR CEP: 81260-900", "(41) 3405-5694")); //VOLVO
        montadora.add(new Montadora("03.472.246/0004-05", "AUDI DO BRASIL INDUSTRIA E COMERCIO DE VEICULOS LTDA.", "Avenida das Industrias, S/N Galpaodocas 81 e 82 DISTRITO INDUSTRIAL BENEDITO STORANIVINHEDO - SP CEP: 13288-163", "(11) 3041-2959")); //AUDI
        montadora.add(new Montadora("00.882.430/0007-70", "BMW DO BRASIL LTDA", "Avenida Doutor Chucri Zaidan, 1240 Conj 2302 VILA SAO FRANCISCO (ZONA SUL) SAO PAULO - SP CEP: 04711-130", "(11) 5186-0000")); //BMW
        montadora.add(new Montadora("31.715.616/0003-34", "MERCEDES-BENZ CARS & VANS BRASIL - INDUSTRIA E COMERCIO DE VEICULOS LTDA", "Avenida Mercedes Benz, 679 Centro Log Viracopos Predio 411 Mznino DISTRITO INDUSTRIAL CAMPINAS - SP CEP: 13054-750", "(11) 4173-6611")); //MERCEDES-BENS
        montadora.add(new Montadora("10.313.717/0001-47", "AGUAR E LAND ROVER BRASIL INDUSTRIA E COMERCIO DE VEICULOS LTDA", "Avenida Ibirapuera, 2332 Andar 10 INDIANOPOLIS SAO PAULO - SP CEP: 04028-002", "(11) 5056-7000")); //JAGUAR E LAND ROVER

 
        //cadastrar alguns Carros
        ArrayList<Carro> carro = new ArrayList<Carro>();

        //Carros já vendidos
        carro.add(new Carro("3M7 1829RY n0 Ta7363", "MZV-3801", "Bmw", "X6", "Branca", 2021, 691950.00, montadora.get(2), cliente.get(1)));
        carro.add(new Carro("66z AA4F4C Z1 eb1588", "NBA-0153", "Jaguar", "f-type Conversível", "Nardo Gray", 2022, 600000.00, montadora.get(4), cliente.get(2)));
        carro.add(new Carro("504 4bAM5h NV 330984", "NAM-3667", "Volvo", "Xc 90 Recharge R-Design", "bege", 2023, 539950.00, montadora.get(0), cliente.get(0)));
        carro.add(new Carro("2du J7Xss0 d8 3h9533", "MDH-9548", "Mercedes-Benz", "Gt-63 AMG", "Branco", 2021, 1683900.00, montadora.get(3), cliente.get(3)));

        //Carros não vendidos
        carro.add(new Carro("2JK 19JxWA 6M g39426", "KIU-6723", "Volvo", "Xc 40 Recharge", "Azul", 2023, 310000.00, 3, montadora.get(0))); 
        carro.add(new Carro("735 8ARAe0 Zy Pg6951", "MZS-8413", "Audi", "RS6 Avant", "Vermelho", 2012, 139900.00, 1, montadora.get(1))); 
        carro.add(new Carro("2Sz hAxg5Z 4j 5g1706", "JVT-5095", "Jaguar", "I-Pace", "Prata", 2020, 304162.00, 2, montadora.get(4)));
        carro.add(new Carro("68r R7ls62 7c vb2730", "MYB-3929", "Bmw", "320i", "Branco", 2013,  92990.00, 6, montadora.get(2)));
        carro.add(new Carro("7AU 9t45Au 4x Aw4677", "HVB-0203", "Mercedes-Benz", "G 63 amg", "Cinza", 2019, 1049900.00, 2, montadora.get(3)));

        System.out.printf("%n%nOlá! Bem vindo a Premium Car Multimarcas  - Não vendemos carros, vendemos sonhos!!!");
        int escolha = -1;
        int auxMenu2 = -1;
        do{ //serve para sempre que for digitado 0, voltar para o começo
            System.out.printf("%n Escolha uma opção abaixo:"); //menu 01
            System.out.printf("%n [1] Área Administrativa (Mostrar Tabelas)%n [2] Área do Comprador (Novos ou Veteranos) %n [0] Digite a qualquer momento para voltar para essa parte");
            System.out.printf("%nSua escolha: ");
            escolha = sc.nextInt(); 

            if (escolha == 0) //Opção para voltar ao começo
                System.out.printf("%n Você escolheu repetir!");
            else if (escolha != 1 && escolha != 2 && escolha != 0){ //Sempre repetir quando for diferente de 0, 1 e 2
                System.out.printf("%nOpção inválida");
                escolha = 0;
            }

            switch (escolha) {
                case 1:
                    System.out.printf("%n -------------Área Administrativa------------- %n");

                    System.out.printf("%nVamos mostrar todas as montadoras fornecedoras: %n");

                    for (Montadora mont : montadora) {
                        System.out.printf("%nNome: " +mont.getNome() + ", Telefone: "+ mont.getTelefone() + ", Endereço: "+ mont.getEndereco() + "%n");
                    }
    
                    System.out.printf("%n%nVamos mostrar todos os carros da loja: %n");
    
                    System.out.printf("%n"); //mostrar os carros vendidos
                    for (Carro produto : carro) {
                        if (produto.getComprador() != null)
                            System.out.printf("%n"+ produto.statusCarroVendido() + "%n");
                    }
    
                    System.out.printf("%n%n");// mostrar os carros à venda
                    for (Carro produto : carro ){
                        if (produto.getComprador() == null){
                            System.out.printf("%n"+produto.statusCarroVenda()+ "%n"); 
                        }
                    }

                    System.out.printf("%n%nVamos mostrar todos os vendedores da loja: %n");
    
                    for (Vendedor funcionario : vendedor) {
                        System.out.printf("%n %s,  que tem %d ano(s) de Experiência",funcionario.getNome(), funcionario.getExperiencia());
                    }
                    System.out.printf("%n%n");
                    
                    System.out.printf("%nVamos mostrar todos os clientes cadastrados: %n");
    
                    System.out.printf("%n");
                    for (Cliente comprador : cliente ){
                        System.out.printf("%n"+comprador.toString());
                    }
                    System.out.printf("%n%n");
                    //menu 02
                    do{
                        System.out.printf("%n [1] Adicionar Vendedor%n [2] Adicionar Carro %n [0] Voltar para o início");
                        System.out.printf("%nSua escolha: ");
                        auxMenu2 = sc.nextInt();
                        if (auxMenu2 == 0){ //Opção para voltar ao começo
                            System.out.printf("%n Você escolheu Voltar para o Início!");
                            auxMenu2 = -1;
                            escolha = 0;
                        } else if (auxMenu2 != 1 && auxMenu2 != 2 && auxMenu2 != 0){ //Sempre repetir quando for diferente de 0, 1 e 2
                            System.out.printf("%nOpção inválida");
                            auxMenu2 = 0;
                        }
                    } while (auxMenu2 == 0);

                    switch (auxMenu2) {
                        case 1:
                            System.out.printf("%n -------------Adicionar Vendedor------------- %n");

                            System.out.printf("%nQUantos vendedores você quer adicionar?%nSua escolha: ");
                            int tamanho = sc.nextInt();

                            for (int i = 0; i < tamanho; i++){

                                int a = i+1;
                                System.out.printf("%nDigite o nome do vendedor" + a + ": %n");
                                sc.nextLine();
                                String nomeV = sc.nextLine();
                                System.out.printf("%nDigite o RG do vendedor"+ a + ": %n");
                                String rgV = sc.nextLine(); 
                                System.out.printf("%nDigite os anos de experiência do vendedor"+ a + ": %n");
                                int experienciaV = sc.nextInt();
                                vendedor.add(new Vendedor(nomeV, rgV, experienciaV));

                            }
                            System.out.printf("%nVamos voltar para o início%n");
                            escolha = 0;
                            break;
                        case 2:
                            
                            break;
                    
                        default:
                            break;
                    }
    
                    //add vendedor, add carro
                    break;
                case 2:
                System.out.printf("%n Área do Cliente - Vamos mostrar todos os carros da loja vendidos e não vendidos %n");
                // ver se já comprou e ou não, ver se tem cadastro ou não ,add cliente no arraylist, login pelo rg , cadastrar novo
                    break;
            
                default:
                    break;
            }
        } while(escolha == 0);
        sc.close();
    }
}
