import java.util.ArrayList;
import java.util.Random;
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
        cliente.add(new Cliente("0.000.000", "Cainã Micael", 988888880, "Rua sem nome, nº 0", "Débito"));
        cliente.add(new Cliente("0.000.001", "Pedro Henrique", 988888881, "Rua sem nome, nº 1", "Crédito"));
        cliente.add(new Cliente("0.000.002", "Juliana Albuquerque", 988888882, "Rua sem nome, nº 2", "Pix"));
        cliente.add(new Cliente("0.000.003", "Marcos Vinicius", 988888883, "Rua sem nome, nº 3", "Financiado"));

        //Cadastrando os vendedores
        ArrayList<Vendedor> vendedor = new ArrayList<Vendedor>();
        vendedor.add(new Vendedor("Juvenal Batista", "1.000.000", 19));
        vendedor.add(new Vendedor("Lourival Puzzuoli", "2.000.000", 2));
        vendedor.add(new Vendedor("Sebastião Jailson", "3.000.000", 5));
        vendedor.add(new Vendedor("Enzo Schneider", "4.000.000", 3));
        vendedor.add(new Vendedor("Moacir Agripino", "5.000.000", 30));

        //cadastrar algumas Montadoras
        ArrayList<Montadora> montadora = new ArrayList<Montadora>();
        montadora.add(new Montadora("43.999.424/0001-14", "VOLVO DO BRASIL VEICULOS LTDA", "Avenida Juscelino K de Oliveira, 2600, Lat Direita CIC, CURITIBA - PR CEP: 81260-900", 413405569)); //VOLVO
        montadora.add(new Montadora("03.472.246/0004-05", "AUDI DO BRASIL INDUSTRIA E COMERCIO DE VEICULOS LTDA.", "Avenida das Industrias, S/N Galpaodocas 81 e 82 DISTRITO INDUSTRIAL BENEDITO STORANIVINHEDO - SP CEP: 13288-163", 1130412959)); //AUDI
        montadora.add(new Montadora("00.882.430/0007-70", "BMW DO BRASIL LTDA", "Avenida Doutor Chucri Zaidan, 1240 Conj 2302 VILA SAO FRANCISCO (ZONA SUL) SAO PAULO - SP CEP: 04711-130", 1151860000)); //BMW
        montadora.add(new Montadora("31.715.616/0003-34", "MERCEDES-BENZ CARS & VANS BRASIL - INDUSTRIA E COMERCIO DE VEICULOS LTDA", "Avenida Mercedes Benz, 679 Centro Log Viracopos Predio 411 Mznino DISTRITO INDUSTRIAL CAMPINAS - SP CEP: 13054-750", 1141736611)); //MERCEDES-BENS
        montadora.add(new Montadora("10.313.717/0001-47", "AGUAR E LAND ROVER BRASIL INDUSTRIA E COMERCIO DE VEICULOS LTDA", "Avenida Ibirapuera, 2332 Andar 10 INDIANOPOLIS SAO PAULO - SP CEP: 04028-002", 1150567000)); //JAGUAR E LAND ROVER

 
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

        //Início 
        System.out.printf("%n%nOlá! Bem vindo a Premium Car Multimarcas  - Não vendemos carros, vendemos sonhos!!!%n");
        int escolha = -1;
        int auxMenu2 = -1, auxMenu3 = -1;
        do{ //serve para sempre que for digitado 0, voltar para o começo
            System.out.printf("%n Escolha uma opção abaixo:"); //menu 01
            System.out.printf("%n [1] Área Administrativa (Mostrar Tabelas)%n [2] Área do Comprador (Novos ou Veteranos) %n [0] Quando quiser voltar para essa parte nos proximos menus");
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
                        if (produto.getQtdEstoque() != 0){
                            if (produto.getComprador() != null)
                                System.out.printf("%n"+ produto.statusCarroVendido() + "%n");
                        }
                    }
    
                    System.out.printf("%n%n");// mostrar os carros à venda
                    for (Carro produto : carro ){
                        if (produto.getQtdEstoque() != 0){
                            if (produto.getComprador() == null)
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
                            String nomeV, rgV;
                            int experienciaV;
                            

                            for (int i = 0; i < tamanho; i++){

                                int a = i+1;
                                System.out.printf("%nDigite o nome do vendedor " + a + ": %n");
                                sc.nextLine();
                                nomeV = sc.nextLine();
                                System.out.printf("%nDigite o RG do vendedor "+ a + ": %n");
                                rgV = sc.nextLine(); 
                                System.out.printf("%nDigite os anos de experiência do vendedor "+ a + ": %n");
                                experienciaV = sc.nextInt();
                                vendedor.add(new Vendedor(nomeV, rgV, experienciaV));
                                System.out.println("Vendedor adicionado com sucesso!");
                                
                            }
                            System.out.printf("%nVamos voltar para o início%n");
                            escolha = 0;

                            break;

                        case 2:

                            System.out.printf("%n -------------Adicionar Carro À Venda------------- %n");
                            System.out.printf("%nQUantos carros você quer adicionar?%nSua escolha: ");

                            int tamanho2 = sc.nextInt();
                            int ano, qtdEstoque;
                            String chassi, placa, marca, modelo, cor;
                            double valor;
                            int indiceMontadora;
                            
                            for (int i = 0; i < tamanho2; i++){

                                int a = i+1;
                                System.out.printf("%nDigite o chassi do carro " + a + ": %n");
                                sc.nextLine();
                                chassi = sc.nextLine();
                                System.out.printf("%nDigite a placa do carro " + a + ": %n");
                                placa = sc.nextLine();
                                System.out.printf("%nDigite a marca do carro " + a + ": %n");                               
                                marca = sc.nextLine();
                                System.out.printf("%nDigite o modelo do carro " + a + ": %n");
                                modelo = sc.nextLine();
                                System.out.printf("%nDigite a cor do carro " + a + ": %n");
                                cor = sc.nextLine();
                                System.out.printf("%nDigite o ano do carro " + a + ": %n");
                                ano = sc.nextInt();
                                System.out.printf("%nDigite o valor do carro " + a + ": %n");
                                valor = sc.nextDouble();
                                System.out.printf("%nDigite a quantidade em estoque do carro " + a + ": %n");
                                qtdEstoque = sc.nextInt();
                                System.out.printf("%nEscolha a montadora:%n[0]Volvo%n[1]Audi%n[2]Bmw%n[3]Mercedes-Benz%n[4]Jaguar e Land Rover%n");
                                indiceMontadora = sc.nextInt(); 
                                carro.add(new Carro(chassi, placa, marca, modelo, cor, ano, valor, qtdEstoque, montadora.get(indiceMontadora)));   

                            }

                            System.out.printf("%nVamos voltar para o início%n");
                            escolha = 0;

                            break;
                    
                        default:
                            break;
                    }
    
                    //add vendedor, add carro
                    break;
                case 2:
                System.out.printf("%n ------------- Área do Cliente ------------- %n");
                //Menu 03
                do{
                    System.out.printf("%n [1] Já tenho Cadastro %n [2] Quero me Cadastrar %n [0] Voltar para o início");
                    System.out.printf("%nSua escolha: ");
                    auxMenu3 = sc.nextInt();
                    if (auxMenu3 == 0){ //Opção para voltar ao começo
                        System.out.printf("%n Você escolheu Voltar para o Início!");
                        auxMenu3 = -1;
                        escolha = 0;
                    } else if (auxMenu3 != 1 && auxMenu3 != 2 && auxMenu3 != 0){ //Sempre repetir quando for diferente de 0, 1 e 2
                        System.out.printf("%nOpção inválida");
                        auxMenu3 = 0;
                    }
                } while (auxMenu3 == 0);

                switch (auxMenu3) {
                    case 1:
                    int foneC;
                    int indiceCliente = -1;
                    int indiceCarro = -1;
                    int c = 0;
                    boolean achou = false;
                    System.out.printf("%nDigite seu telefone SEM ESPAÇOS (ex: 999999999):%n");
                    foneC = sc.nextInt();
                    System.out.printf("%nVamos procurar o Telefone " + foneC +" no cadastro!%n");

                    for (int i = 0; i < cliente.size(); i++){
                       if (cliente.get(i).getTelefone() == foneC){
                            System.out.printf("%nAchamos Seu cadastro!%n");
                            indiceCliente = i;
                            achou = true;
                       }
                    }
                    if (achou){
                        System.out.printf("%nOlá, "+ cliente.get(indiceCliente).getNome() + "%n");

                        System.out.printf("Verificamos que você já viu um carro. O carro que você viu foi: %n");
                        for (Carro comprado : carro){
                            if (comprado.getComprador() == cliente.get(indiceCliente)){
                                System.out.printf("%n"+ comprado.getModelo() + " da marca " + comprado.getMarca() + " do ano " + comprado.getAno() + " da cor " + comprado.getCor() + "%n");
                                indiceCarro = c;
                            }
                            c++;
                        }
                       System.out.printf("%nVocê veio buscar seu carro? %n[1] Sim %n[2] Não %n[0] Voltar pro menu principal%n");
                       int buscar = sc.nextInt();
                       switch (buscar) {
                        case 1:
                            cliente.get(indiceCliente).buscar();
                            Random aleatorio = new Random();
                            int vendedorEscolhido = aleatorio.nextInt(vendedor.size()); // sorteia um vendedor para atender o cliente
                            System.out.printf("%nO vendedor " + vendedor.get(vendedorEscolhido).getNome() + " vai lhe atender e gerar a nota fiscal!%n");
                            System.out.printf("%nSua nota Fiscal: %n");
                            vendedor.get(vendedorEscolhido).gerarNotaFiscal(cliente.get(indiceCliente), carro.get(indiceCarro));


                            break;
                        case 2:
                            System.out.printf("%nNão se preocupe, está tudo certo com o seu carro! %n");
                            break;
                       
                        default:
                            escolha = 0;
                            break;
                       }

                    } else {
                        System.out.printf("%nNão te achamos. Escolha a opção: QUERO ME CADASTRAR%n");
                        escolha = 0;
                    }

                        break;
                    case 2:
                    int repete = -1;
                     do{
                        System.out.printf("%nVamos mostrar os carros à venda: %n");

                        System.out.printf("%n");// mostrar os carros à venda
                        for (Carro produto : carro ){
                            if (produto.getQtdEstoque() != 0){
                                if (produto.getComprador() == null)
                                    System.out.printf("%n"+produto.statusCarroVenda()+ "%n"); 
                            }
                        }
                        System.out.printf("%nDigite modelo do carro: %n");
                        sc.nextLine(); 
                        String modeloC = sc.nextLine(); 
                        int indiceCarro2 = -1;
                        boolean achou2 = false;
                        for (int i = 0; i < carro.size(); i++){
                            if (carro.get(i).getModelo().toLowerCase().equals(modeloC.toLowerCase())){
                                System.out.printf("%nSua escolha deu certo! Boa escolha!%n");
                                indiceCarro2 = i;
                                achou2 = true;
                                 
                            }
                         }
                         if (achou2){

                            System.out.printf("%nVamos criar seu cadastro: %n");
                            
                            System.out.printf("%nDigite o seu nome: %n");
                            String nomeC = sc.nextLine();
                            System.out.printf("%nDigite o seu Rg: %n");
                            String rgC = sc.next();
                            System.out.printf("%nDigite o seu Telefone: %n");
                            int telefoneC = sc.nextInt();
                            System.out.printf("%nDigite o seu Endereço: %n");
                            sc.nextLine();
                            String enderecoC = sc.nextLine();
                            System.out.printf("%nDigite a sua Forma de Pagamento %n");
                            String formaC = sc.next();
                            cliente.add(new Cliente(rgC, nomeC, telefoneC, enderecoC, formaC));

                            System.out.printf("%nCadastrado com sucesso!%n");
                            System.out.printf("%nO que você deseja?%n[1] Fazer orçamento%n[2] Fazer teste drive%n[3] Comprar%n");
                            int aux = sc.nextInt();
                            switch (aux) {
                                case 1:
                                    Random aleatorio = new Random();
                                    int vendedorEscolhido = aleatorio.nextInt(vendedor.size()); // sorteia um vendedor para atender o cliente
                                    System.out.println(vendedor.get(vendedorEscolhido).fazerOrcamento(cliente.get(cliente.size()-1), carro.get(indiceCarro2)));

                                    break;
                                case 2:
                                    Random aleatorio2 = new Random();
                                    int vendedorEscolhido2 = aleatorio2.nextInt(vendedor.size()); // sorteia um vendedor para atender o cliente
                                    vendedor.get(vendedorEscolhido2).intermediarTesteDrive(cliente.get(cliente.size()-1), carro.get(indiceCarro2));
                                    
                                    break;
                                case 3:
                                    Random aleatorio3 = new Random();
                                    int vendedorEscolhido3 = aleatorio3.nextInt(vendedor.size()); // sorteia um vendedor para atender o cliente
                                    carro.get(indiceCarro2).setVendido(true);
                                    carro.get(indiceCarro2).setComprador(cliente.get(cliente.size()-1));
                                    vendedor.get(vendedorEscolhido3).gerarNotaFiscal(cliente.get(cliente.size()-1), carro.get(indiceCarro2));
                                
                                    break;
                            
                                default:
                                    break;
                            }


                         } else {
                            System.out.println("Você digitou errado! Tente novemente!");
                            repete = 0;
                         }
                         
                        } while (repete == 0);
                        
                        break;
                
                    default:
                        break;
                }

                // ver se já comprou e ou não, ver se tem cadastro ou não ,add cliente no arraylist, login pelo rg , cadastrar novo 
                    break;
                default:
                    break;
            }
        } while(escolha == 0);
        sc.close();
    }
}
