package Controller;

import DAO.ProdutoDAO;
import Model.Produto;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 * @author Gustavo Santos
 */
public class ProdutoController {
    
    public static boolean criarProduto(String marca, String modelo, String descricao, Double preco, int quantidade, int idTipoProduto) {
        
        Produto produto = new Produto();
        
        produto.setMarca(marca);
        produto.setModelo(modelo);
        produto.setDescricao(descricao);
        produto.setPreco(preco);
        produto.setIdTipo(idTipoProduto);
        produto.setQuantidade(quantidade);
        
        return ProdutoDAO.criar(produto);
    }
    
    public static void buscarProdutos(JTable tabelaProdutos) {
        ArrayList<Produto> listaProdutos = ProdutoDAO.consultar();
        
        DefaultTableModel tableModel = new DefaultTableModel();
        tableModel.addColumn("ID");
        tableModel.addColumn("Marca");
        tableModel.addColumn("Modelo");
        tableModel.addColumn("Descrição");
        tableModel.addColumn("Preço");
        tableModel.addColumn("Quantidade");
        tableModel.addColumn("Tipo");
        tabelaProdutos.setModel(tableModel);
        
        tableModel.setRowCount(0);
        
        for (Produto produto : listaProdutos) {
            tableModel.addRow(new Object[] {
                produto.getId(),
                produto.getMarca(),
                produto.getModelo(),
                produto.getDescricao(),
                produto.getPreco(),
                produto.getQuantidade(),
                produto.getIdTipo()
            });
        }
    }
    
    public static boolean alterarProduto(int id, String marca, String modelo, String descricao, Double preco, int quantidade, int idTipoProduto) {
        
        Produto produto = new Produto();
        
        produto.setId(id);
        produto.setMarca(marca);
        produto.setModelo(modelo);
        produto.setDescricao(descricao);
        produto.setPreco(preco);
        produto.setQuantidade(quantidade);
        produto.setIdTipo(idTipoProduto);
        
        return ProdutoDAO.alterar(produto);
    }
    
    public static boolean deletarProduto(int id) {
        return ProdutoDAO.deletar(id);
    }
    
}
