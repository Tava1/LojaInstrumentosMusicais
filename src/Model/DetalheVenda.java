package Model;

/**
 * @author Gustavo Santos
 */
public class DetalheVenda {
    private int id;
    private double precoItem;
    private int quantidade;
    private int idPedido;
    private int idProduto;

    public DetalheVenda() {
    }

    public DetalheVenda(int id, double precoItem, int quantidade, int idPedido, int idProduto) {
        this.id = id;
        this.precoItem = precoItem;
        this.quantidade = quantidade;
        this.idPedido = idPedido;
        this.idProduto = idProduto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrecoItem() {
        return precoItem;
    }

    public void setPrecoItem(double precoItem) {
        this.precoItem = precoItem;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }
    
}
