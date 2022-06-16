package classes;
import java.util.Random;
//Uso da Herança do tipo TEM UM e Implementação da Interface
public class Vendedor extends Dados implements InterVendedor{
    
    private int experiencia;
    private Carro carroDaVenda;
    private Cliente comprador;

    //Construtores - Uso de Múltiplos Construtores

    public Vendedor() {
    }

    public Vendedor(String nome, String rg, int experiencia) {
        
        this.nome = nome;
        this.rg = rg;
        this.experiencia = experiencia;
    }

    public Vendedor(String nome, String rg, int experiencia, Carro carroDaVenda, Cliente comprador) {
        
        this.nome = nome;
        this.rg = rg;
        this.experiencia = experiencia;
        this.carroDaVenda = carroDaVenda;
        this.comprador = comprador;
    }

    //Gets e Sets

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

   public Carro getCarroDaVenda() {
        return carroDaVenda;
    }

    public void setCarroDaVenda(Carro carroDaVenda) {
        this.carroDaVenda = carroDaVenda;
    }

    public Cliente getComprador() {
        return comprador;
    }

    public void setComprador(Cliente comprador) {
        this.comprador = comprador;
    }

    //Implementando os Métodos Abstratos - Uso de Encapsulamento(Interface) e Polimorfismo(Sobrescrever)


    @Override
    public void gerarNotaFiscal(Cliente comprador, Carro carroDaVenda) {
        
        //gerar numero da nota fiscal
        int[] vetor = new int[5];
        Random aleatorio = new Random();

        for (int g = 0; g < 5; g++)
            vetor[g] = aleatorio.nextInt(9);
        
        System.out.printf("%nO número da sua nota é: %n");
        for (int i : vetor) 
            System.out.print(i);

        System.out.printf("%n");
        System.out.printf("%n" + comprador.pagar() + "%n");
        System.out.printf("%n" + comprador.toString() + "%n");
        System.out.printf("%n" + carroDaVenda.statusCarroVendido() + "%n");
        System.out.printf("%nNome do vendedor: " + this.getNome() + "%n");
        carroDaVenda.setVendido(true);
        carroDaVenda.setQtdEstoque(getQtdEstoque()-1);
        System.out.printf("%nCarro Pago e retirado do estoque da loja! Volte Sempre!%n ");

    }

    private int getQtdEstoque() {
        return 0;
    }

    @Override
    public void intermediarTesteDrive(Cliente comprador, Carro carroDaVenda) {
        System.out.printf("%n" + comprador.dirigir() + "%n");
        System.out.printf("%n" + carroDaVenda.andar() + "%n");
        System.out.printf("%nTeste concluído com sucesso! %n");
    }

   
    @Override
    public String fazerOrcamento(Cliente comprador, Carro carroDaVenda) {
        return " O carro " + carroDaVenda.getMarca() + carroDaVenda.getModelo() + " custa " + carroDaVenda.getValor() + " e aceitamos sua forma de pagamento: " + comprador.getFormaDePagamento(); 
    }

 
}
