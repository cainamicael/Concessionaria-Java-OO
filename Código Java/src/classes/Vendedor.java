package classes;
//Uso da Herança do tipo TEM UM e Implementação da Interface
public class Vendedor extends Dados implements InterVendedor{
    
    private int experiencia;
  // private Carro carroDaVenda;
    private Cliente comprador;

    //Construtores - Uso de Múltiplos Construtores

    public Vendedor() {
    }

    public Vendedor(String nome, String rg, int experiencia) {
        
        this.nome = nome;
        this.rg = rg;
        this.experiencia = experiencia;
    }

    public Vendedor(String nome, String rg, int experiencia, /*Carro carroDaVenda,*/ Cliente comprador) {
        
        this.nome = nome;
        this.rg = rg;
        this.experiencia = experiencia;
        //this.carroDaVenda = carroDaVenda;
        this.comprador = comprador;
    }

    //Gets e Sets

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

   /*public Carro getCarroDaVenda() {
        return carroDaVenda;
    }*/

    /*public void setCarroDaVenda(Carro carroDaVenda) {
        this.carroDaVenda = carroDaVenda;
    }*/

    public Cliente getComprador() {
        return comprador;
    }

    public void setComprador(Cliente comprador) {
        this.comprador = comprador;
    }

    //Implementando os Métodos Abstratos - Uso de Encapsulamento(Interface) e Polimorfismo(Sobrescrever)

    @Override
    public void fazerOrcamento(Cliente comprador) {
    
        
    }

    @Override
    public void gerarNotaFiscal(Cliente comprador/*, Carro carroDaVenda*/) {
    
        
    }

    @Override
    public void intermediarTesteDrive(Cliente comprador/*, Carro carroDaVenda*/) {
    
        
    }

    @Override
    public void realizarVenda(Cliente comprador/*, Carro carroDaVenda*/) {
        
    }
 
}
