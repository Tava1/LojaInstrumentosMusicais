package Model;

import java.util.Date;

/**
 * @author Gustavo Santos
 */
public class Venda {
    private int id;
    private Date dataPedido;
    private Double total;
    private int idCliente;
    private int IdDetalhePedido;
    private int Quantidade;
    private int IdPedido;
    private int IdProduto;
    private Double PrecoUnidade;
    private String Marca;
    private String Modelo;
    private String CPFCliente;
    
    public Venda() {
    }

    public Venda(int id, Date dataPedido, Double total, int idCliente, int IdDetalhePedido, int Quantidade, int IdPedido, int IdProduto) {
        this.id = id;
        this.dataPedido = dataPedido;
        this.total = total;
        this.idCliente = idCliente;
        this.IdDetalhePedido = IdDetalhePedido;
        this.Quantidade = Quantidade;
        this.IdPedido = IdPedido;
        this.IdProduto = IdProduto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(Date dataPedido) {
        this.dataPedido = dataPedido;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdDetalhePedido() {
        return IdDetalhePedido;
    }

    public void setIdDetalhePedido(int IdDetalhePedido) {
        this.IdDetalhePedido = IdDetalhePedido;
    }

    public int getQuantidade() {
        return Quantidade;
    }

    public void setQuantidade(int Quantidade) {
        this.Quantidade = Quantidade;
    }

    public int getIdPedido() {
        return IdPedido;
    }

    public void setIdPedido(int IdPedido) {
        this.IdPedido = IdPedido;
    }

    public int getIdProduto() {
        return IdProduto;
    }

    public void setIdProduto(int IdProduto) {
        this.IdProduto = IdProduto;
    }

    public Double getPrecoUnidade() {
        return PrecoUnidade;
    }

    public void setPrecoUnidade(Double PrecoUnidade) {
        this.PrecoUnidade = PrecoUnidade;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public String getCPFCliente() {
        return CPFCliente;
    }

    public void setCPFCliente(String CPFCliente) {
        this.CPFCliente = CPFCliente;
    }
    
    
    
}

