package classes;  

public class Cliente {
    
    protected float rg;
    protected String nome;
    private double fone;
    private String endereco;
    private String formaDePagamento;

    public void dirigir(){
        
    }

    public void pagar(double pagarValor){
        //this.valor += pagarValor;
    }

    public Cliente() {
    }


    public Cliente(float rg, String nome) {
        this.rg = rg;
        this.nome = nome;
    }

    public Cliente(float rg, String nome, double fone, String endereco, String formaDePagamento) {
        this.rg = rg;
        this.nome = nome;
        this.fone = fone;
        this.endereco = endereco;
        this.formaDePagamento = formaDePagamento;
    }

    public float getRg() {
        return rg;
    }

    public void setRg(float rg) {
        this.rg = rg;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getFone() {
        return fone;
    }

    public void setFone(double fone) {
        this.fone = fone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getFormaDePagamento() {
        return formaDePagamento;
    }

    public void setFormaDePagamento(String formaDePagamento) {
        this.formaDePagamento = formaDePagamento;
    }
    
}
