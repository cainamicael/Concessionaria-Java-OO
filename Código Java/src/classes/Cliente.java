package classes;  
//Uso da Herança do tipo TEM UM e Implementação da Interface
public class Cliente extends Dados implements InterCliente {
    
    private String formaDePagamento;

    //Construtores - Uso de Múltiplos Construtores
    public Cliente() {

    }

    public Cliente(String rg, String nome) {
        this.rg = rg;
        this.nome = nome;
    }

    public Cliente(String rg, String nome, String fone, String endereco, String formaDePagamento) {
        this.rg = rg;
        this.nome = nome;
        this.telefone = fone;
        this.endereco = endereco;
        this.formaDePagamento = formaDePagamento.toLowerCase(); 
    }

    //Gets e Sets

    public String getFormaDePagamento() {
        return formaDePagamento;
    }

    public void setFormaDePagamento(String formaDePagamento) {
        this.formaDePagamento = formaDePagamento;
    }

    //Implementando os Métodos Abstratos - Uso de Encapsulamento(Interface) e Polimorfismo(Sobrescrever)

    @Override
    public void dirigir() {
        System.out.printf("%s está dirigindo o carro e sentindo o conforto, desempenho e economia dele! ",this.nome);
        
    }

    @Override
    public void pagar() {
        System.out.printf("%s decidiu comprar o carro! Sua forma de pagamento é: %s",this.nome, this.formaDePagamento);
        
    }
    
    

}
