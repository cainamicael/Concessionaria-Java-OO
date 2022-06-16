package classes;
//Interface - Encapsulamento
public interface InterVendedor {

    public abstract String fazerOrcamento(Cliente comprador, Carro carroDaVenda);
    public abstract void intermediarTesteDrive(Cliente comprador, Carro carroDaVenda);
    public abstract void gerarNotaFiscal(Cliente comprador, Carro carroDaVenda);

}
