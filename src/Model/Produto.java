package Model;

/**
 * @author Gustavo Santos
 */
public class Produto {
    private int id;
    private String marca;
    private String modelo;
    private String descricao;
    private Double preco;
    private int idTipo;
    private int quantidade;
    
    public Produto() {
        
    }

    public Produto(int id, String marca, String descricao, Double preco, int idTipo) {
        this.id = id;
        this.marca = marca;
        this.descricao = descricao;
        this.preco = preco;
        this.idTipo = idTipo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public int getIdTipo() {
        return idTipo;
    }

    public void setIdTipo(int idTipo) {
        this.idTipo = idTipo;
    }

    // Estoque
    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
