package classes; 
//Uso e Implementação da Interface
public class Carro implements InterCarro {

    private String chassi, placa, marca, modelo, cor; 
    public int ano;
    private double valor;     
    private boolean vendido;
    private int qtdEstoque;
    private Montadora montadoraQueForneceu;
    private Cliente comprador;
    
    //Construtor para carros que não foram vendido
    public Carro(String chassi, String placa, String marca, String modelo, String cor, int ano, double valor,  int qtdEstoque, Montadora montadoraQueForneceu) {
        this.chassi = chassi;
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
        this.valor = valor;
        this.qtdEstoque = qtdEstoque;
        this.montadoraQueForneceu = montadoraQueForneceu;
        this.vendido = false;
        this.comprador = null;
    }
    //construtor para carros que já foram vendidos
    public Carro(String chassi, String placa, String marca, String modelo, String cor, int ano, double valor, Montadora montadoraQueForneceu, Cliente comprador) {
        this.chassi = chassi;
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
        this.valor = valor;
        this.montadoraQueForneceu = montadoraQueForneceu;
        this.comprador = comprador;
        this.qtdEstoque = 1;
        this.vendido = true;
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

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
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

    public Cliente getComprador() {
        return comprador;
    }
    public void setComprador(Cliente comprador) {
        this.comprador = comprador;
    }
    

    //Implementando os Métodos Abstratos - Uso de Encapsulamento(Interface) e Polimorfismo(Sobrescrever)

   
    @Override
    public String andar() {
        return "O carro está andando! tudo está funcionando normalmente!";
    }

    @Override
    public String statusCarroVenda() {
        return "À Venda: Marca = " + marca + ", modelo = " + modelo + ", ano = "+ ano + ", cor = " + cor + ", valor = " + valor + ", quantidade em estoque = " + qtdEstoque;
    }
    @Override
    public String statusCarroVendido() {
        return "Vendido:  Marca = " + marca + ", modelo = " + modelo + ", cor = " + cor + ", valor = " + valor + ", ano = " + ano + ", comprador = " + comprador.getNome();
    }
  

}
    

