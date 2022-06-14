package classes;

public class Vendedor {
    
    private int experiencia;
    private String carroDaVenda;
    private String comprador;

    public Vendedor() {
    }

    public Vendedor(float rg, String nome, int experiencia, String carroDaVenda, String comprador) {
        super(rg, nome);
        this.experiencia = experiencia;
        this.carroDaVenda = carroDaVenda;
        this.comprador = comprador;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public String getCarroDaVenda() {
        return carroDaVenda;
    }

    public void setCarroDaVenda(String carroDaVenda) {
        this.carroDaVenda = carroDaVenda;
    }

    public String getComprador() {
        return comprador;
    }

    public void setComprador(String comprador) {
        this.comprador = comprador;
    }
    
}
