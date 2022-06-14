package classes;

public interface InterVendedor {

    public abstract void fazerOrcamento(Cliente comprador/*, Carro carroDaVenda*/);
    public abstract void intermediarTesteDrive(Cliente comprador/*, Carro carroDaVenda*/);
    public abstract void gerarNotaFiscal(Cliente comprador/*, Carro carroDaVenda*/);
    public abstract void realizarVenda(Cliente comprador/*, Carro carroDaVenda*/);

    
}
