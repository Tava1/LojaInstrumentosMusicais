package Controller;

import DAO.VendaDAO;
import Model.Venda;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 * @author Gustavo Santos
 */
public class RelatorioController {
    public static void buscarVendas(JTable tabelaProdutos, JTextField totalVendasPeriodo, Date dataInicial, Date dataFinal) {
        ArrayList<Venda> listaPedido = VendaDAO.consultar(dataInicial, dataFinal);
        
        DefaultTableModel tableModel = new DefaultTableModel();
        tableModel.addColumn("Código da Venda");
        tableModel.addColumn("Data da Venda");
        tableModel.addColumn("Total");
        tableModel.addColumn("CPF do cliente");
        tabelaProdutos.setModel(tableModel);
        
        tableModel.setRowCount(0);
        
        Double total = 0.0;
        
        for (Venda pedido : listaPedido) {
            tableModel.addRow(new Object[] {
                pedido.getId(),
                pedido.getDataPedido(),
                pedido.getTotal(),
                pedido.getCPFCliente(),
            });
            total += pedido.getTotal();
        }
        
        totalVendasPeriodo.setText(total.toString());
    }
    
    public static void buscarVendas(JTable tabelaProdutos, int codigoVenda, JTextField totalVenda, int linhas) {
        ArrayList<Venda> listaVenda = VendaDAO.consultar(codigoVenda);
        
        DefaultTableModel tableModel = (DefaultTableModel) tabelaProdutos.getModel();
        
        if (linhas < 1) {
            tableModel.addColumn("Codigo do Pedido");
            tableModel.addColumn("Data do Pedido");
            tableModel.addColumn("Marca");
            tableModel.addColumn("Modelo");
            tableModel.addColumn("Quantidade");
            tableModel.addColumn("Preço UN");
            tableModel.addColumn("CPF");

            tabelaProdutos.setModel(tableModel);
        }
        
        tableModel.setRowCount(0);
        
        for (Venda venda : listaVenda) {
            tableModel.insertRow(0, new Object[] {
                venda.getId(),
                venda.getDataPedido(),
                venda.getMarca(),
                venda.getModelo(),
                venda.getQuantidade(),
                venda.getPrecoUnidade(),
                venda.getCPFCliente(),
            });
            // Preecher o campo Total
            totalVenda.setText(venda.getTotal().toString());
        }
        
        
    }
}
