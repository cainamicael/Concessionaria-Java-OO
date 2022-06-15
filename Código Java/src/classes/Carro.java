package classes; 
//Uso e Implementação da Interface
public class Carro implements InterCarro {

    private String chassi, placa, marca, modelo, cor; 
    public int ano;
    private float valor;     
    private boolean vendido;
    private int qtdEstoque;
    private Montadora montadoraQueForneceu;
    
    public Carro(String chassi, String placa, String marca, String modelo, String cor, int ano, float valor, boolean vendido, int qtdEstoque, Montadora montadoraQueForneceu) {
        this.chassi = chassi;
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
        this.valor = valor;
        this.vendido = vendido;
        this.qtdEstoque = qtdEstoque;
        this.montadoraQueForneceu = montadoraQueForneceu;
    }

    //Gets e Sets

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public boolean isVendido() {
        return vendido;
    }

    public void setVendido(boolean vendido) {
        this.vendido = vendido;
    }

    public int getQtdEstoque() {
        return qtdEstoque;
    }

    public void setQtdEstoque(int qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }

    public Montadora getMontadoraQueForneceu() {
        return montadoraQueForneceu;
    }

    public void setMontadoraQueForneceu(Montadora montadoraQueForneceu) {
        this.montadoraQueForneceu = montadoraQueForneceu;
    }

    //Implementando os Métodos Abstratos - Uso de Encapsulamento(Interface) e Polimorfismo(Sobrescrever)

    @Override
    public String status(){
        return "Modelo: " + this.modelo +  " Marca: "+ this.marca;
    }

    @Override
    public String andar() {
        return "O carro está andando! tudo está funcionando normalmente!";
    }

}
    

