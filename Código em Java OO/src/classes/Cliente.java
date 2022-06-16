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

    public Cliente(String rg, String nome, int fone, String endereco, String formaDePagamento) {
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
    public String dirigir() {
        return "Você dirigindo o carro e sentindo o conforto, desempenho e economia dele! ";
    }

    @Override
    public String pagar() {
        return "Você decidiu comprar o carro! Sua forma de pagamento é: " + this.formaDePagamento;
    }

    @Override
    public String buscar() {
        return "O Cliente veio buscar o carro que comprou! ";
    }

    @Override
    public String toString() {
        return "Cliente:  Nome = " + this.nome + ", Telefone = " + this.telefone;
    }
    
    

}
