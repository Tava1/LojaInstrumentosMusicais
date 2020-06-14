package Controller;

import DAO.ProdutoDAO;
import Model.Produto;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.JTextField;
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
        tableModel.addColumn("Quantidade Disponível");
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
    
    public static void buscarProdutos(int id, JTable tabelaProdutos) {
        ArrayList<Produto> listaProdutos = ProdutoDAO.consultar(id);
        
        DefaultTableModel tableModel = new DefaultTableModel();
        tableModel.addColumn("ID");
        tableModel.addColumn("Marca");
        tableModel.addColumn("Modelo");
        tableModel.addColumn("Descrição");
        tableModel.addColumn("Preço");
        tableModel.addColumn("Quantidade Disponível");
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
    
    public static void buscarProdutos(String marca, JTable tabelaProdutos) {
        ArrayList<Produto> listaProdutos = ProdutoDAO.consultar(marca);
        
        DefaultTableModel tableModel = new DefaultTableModel();
        tableModel.addColumn("ID");
        tableModel.addColumn("Marca");
        tableModel.addColumn("Modelo");
        tableModel.addColumn("Descrição");
        tableModel.addColumn("Preço");
        tableModel.addColumn("Quantidade Disponível");
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
    
    public static void buscarProdutos(String marca, String modelo, JTable tabelaProdutos) {
        ArrayList<Produto> listaProdutos = ProdutoDAO.consultar(null, modelo);
        
        DefaultTableModel tableModel = new DefaultTableModel();
        tableModel.addColumn("ID");
        tableModel.addColumn("Marca");
        tableModel.addColumn("Modelo");
        tableModel.addColumn("Descrição");
        tableModel.addColumn("Preço");
        tableModel.addColumn("Quantidade Disponível");
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
    
    public static void buscarProdutoEstoque(int id, JTable tabelaProdutos, int quantidadeDesejadaProduto) throws Exception {
        ArrayList<Produto> listaProdutos = ProdutoDAO.consultar(id);
        
        // Validade se existe estoque para o produto solicitado.
        for (Produto produto : listaProdutos) {
            if (produto.getQuantidade() <= 0) {
                throw new Exception("Poduto não possui estoque disponível.");
            }
            if (produto.getQuantidade() - quantidadeDesejadaProduto < 0) {
                throw new Exception("Quantidade de estoque insuficiente.");
            }
        }
        
        DefaultTableModel tableModel = (DefaultTableModel) tabelaProdutos.getModel();
        tableModel.addColumn("ID");
        tableModel.addColumn("Marca");
        tableModel.addColumn("Modelo");
        tableModel.addColumn("Descrição");
        tableModel.addColumn("Preço");
        tableModel.addColumn("Quantidade Disponível");
        tableModel.addColumn("Tipo");
        tabelaProdutos.setModel(tableModel);
        
        
        
        //tableModel.setRowCount(0);
        
        for (Produto produto : listaProdutos) {
            tableModel.insertRow(0, new Object[] {
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
    
    public static void buscarProdutoEstoque(int id, JTable tabelaProdutos, int quantidadeDesejadaProduto, int linhas, JTextField totalVenda) throws Exception {
        ArrayList<Produto> listaProdutos = ProdutoDAO.consultar(id);
        
        // Validade se existe estoque para o produto solicitado.
        for (Produto produto : listaProdutos) {
            if (produto.getQuantidade() <= 0) {
                throw new Exception("Poduto não possui estoque disponível.");
            }
            if (produto.getQuantidade() - quantidadeDesejadaProduto < 0) {
                throw new Exception("Quantidade de estoque insuficiente.");
            }
        }
        DefaultTableModel tableModel = (DefaultTableModel) tabelaProdutos.getModel();

        if (linhas < 1) {
            tableModel.addColumn("ID");
            tableModel.addColumn("Marca");
            tableModel.addColumn("Modelo");
            tableModel.addColumn("Descrição");
            tableModel.addColumn("Preço");
            tableModel.addColumn("Quantidade Disponível");
            tableModel.addColumn("Tipo");
            tableModel.addColumn("Quantidade desejada");
            tabelaProdutos.setModel(tableModel);
        }
        
        Double total = Double.parseDouble(totalVenda.getText());
        
        for (Produto produto : listaProdutos) {
            tableModel.insertRow(0, new Object[] {
                produto.getId(),
                produto.getMarca(),
                produto.getModelo(),
                produto.getDescricao(),
                produto.getPreco(),
                produto.getQuantidade(),
                produto.getIdTipo(),
                quantidadeDesejadaProduto
            });
            // Preecher o campo Total
            total += (produto.getPreco() * quantidadeDesejadaProduto);

        }
        
        totalVenda.setText(total.toString());

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
