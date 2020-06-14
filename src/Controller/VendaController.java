package Controller;

import DAO.VendaDAO;
import Model.Venda;
import java.util.Date;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 * @author Gustavo Santos
 */
public class VendaController {
    
    public static boolean finalizarVenda(JTable carrinho, int id, JTextField total) {
        Date date = new Date(); 
        Venda venda = new Venda();
        
        int linhas = carrinho.getRowCount();
        
        for (int i = 0; i <= linhas - 1; i++) {
            
            venda.setDataPedido(date);
            venda.setTotal(Double.parseDouble(total.getText()));
            venda.setIdCliente(id);
            
            venda.setQuantidade(Integer.parseInt(carrinho.getValueAt(i, 7).toString()));
            venda.setIdProduto(Integer.parseInt(carrinho.getValueAt(i, 0).toString()));
            
            VendaDAO.criar(venda);
        }
        
        return true;
    }
}
