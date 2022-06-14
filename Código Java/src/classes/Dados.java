package classes;

public abstract class Dados {

    protected String nome;
    protected String rg; 
    protected String endereco;
    protected String telefone;
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getRg() {
        return rg;
    }
    public void setRg(String rg) {
        this.rg = rg;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    

    // Rg e Telefone são Strings porque podem ter vários tipos de escrita Ex: 988888888 ou 9 8888-8888, logo, String aceita tudo

    
}
