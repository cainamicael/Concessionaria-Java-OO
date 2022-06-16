package classes; 
//Uso da Herança do tipo TEM UM
public class Montadora extends Dados {

    protected String cnpj;

    //Construtores - Uso de Múltiplos Construtores
    public Montadora() {
    }

    public Montadora(String cnpj, String nome, String endereco, int telefone) {
        this.cnpj = cnpj;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    //Gets e Sets
    
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    
}
    
