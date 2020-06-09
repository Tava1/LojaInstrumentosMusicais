package DAO;

import Model.Venda;
import Utils.GerenciarDataBase;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;

/**
 * @author Gustavo Santos
 */
public class VendaDAO {
    public static boolean criar(Venda pedido) {
        boolean retorno = false;
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        
        try {
            connection = GerenciarDataBase.abrirConexao();
            
            // Criando query SQL
            preparedStatement = connection.prepareStatement("INSERT INTO pedido (DataPedido, PrecoTotal, IdCliente) VALUES (?, ?, ?);", Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setDate(1, new java.sql.Date(pedido.getDataPedido().getTime()));
            preparedStatement.setDouble(2, pedido.getTotal());
            preparedStatement.setInt(3, pedido.getIdCliente());
                        
            int linhasAfetadas = preparedStatement.executeUpdate();
            
            // Criando query SQL
            preparedStatement = connection.prepareStatement("INSERT INTO detalhepedido (Quantidade, IdPedido, IdProduto) VALUES (?, ?, ?);", Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setDate(1, new java.sql.Date(pedido.getDataPedido().getTime()));
            preparedStatement.setDouble(2, pedido.getTotal());
            preparedStatement.setInt(3, pedido.getIdCliente());
                        
            int linhasAfetadas2 = preparedStatement.executeUpdate();
            
            if (linhasAfetadas > 0 && linhasAfetadas2 > 0) {
                retorno = true;
                ResultSet resultSet = preparedStatement.getGeneratedKeys();
                
                if (resultSet.next()) {
                    pedido.setId(resultSet.getInt(1));
                }
                else {
                    throw new SQLException("Falha ao obter o ID.");
                }
            }
            else {
                retorno = false;
            }
        } 
        catch(SQLException | ClassNotFoundException ex) {
            retorno = false;
        }
        finally {
            try {
                if (preparedStatement != null) 
                    GerenciarDataBase.fecharConexao();
            }
            catch (SQLException ex) {
            }
        }
        
        return retorno;
        
    }

    public static ArrayList<Venda> consultar() {
        ResultSet resultSet = null;
        Connection connection = null;
        PreparedStatement preparedStatement = null; 
        ArrayList<Venda> listaPedido = new ArrayList<Venda>();
        
        try {
            connection = GerenciarDataBase.abrirConexao();
            
            // Criando Query SQL
            preparedStatement = connection.prepareStatement("SELECT * From pedido");
            
            resultSet = preparedStatement.executeQuery();
            
            while(resultSet.next()) {
                Venda pedido = new Venda();
                
                pedido.setId(resultSet.getInt("IdPedido"));
                pedido.setDataPedido(resultSet.getDate("DataPedido"));
                pedido.setTotal(resultSet.getDouble("PrecoTotal"));
                pedido.setIdCliente(Integer.parseInt(resultSet.getString("IdCliente")));

                // Adiciona cada pedido a lista de clientes
                listaPedido.add(pedido);
                
            }
        } 
        catch (SQLException | ClassNotFoundException ex) {
            listaPedido = null;
        }
        finally {
            try {
                if (resultSet != null)
                    resultSet.close();
                if (preparedStatement != null)
                    preparedStatement.close();
                
                GerenciarDataBase.fecharConexao();
            }
            catch (SQLException e) {
            }
        }
        
        return listaPedido;
    }
    
    public static ArrayList<Venda> consultar(int codigoVenda) {
        ResultSet resultSet = null;
        Connection connection = null;
        PreparedStatement preparedStatement = null; 
        ArrayList<Venda> listaVendas = new ArrayList<Venda>();
        
        try {
            connection = GerenciarDataBase.abrirConexao();
            
            // Criando Query SQL
            preparedStatement = connection.prepareStatement("SELECT * FROM pedido as pe INNER JOIN detalhepedido as dp ON dp.IdPedido = pe.IdPedido INNER JOIN produto as p ON p.IdProduto = dp.IdProduto INNER JOIN cliente as c ON c.IdCliente = pe.IdCliente WHERE pe.IdPedido = ?;");
            preparedStatement.setInt(1, codigoVenda);

            resultSet = preparedStatement.executeQuery();
            
            while(resultSet.next()) {
                Venda venda = new Venda();
                
                venda.setId(resultSet.getInt("IdPedido"));
                venda.setDataPedido(resultSet.getDate("DataPedido"));
                venda.setTotal(resultSet.getDouble("PrecoTotal"));
                venda.setMarca(resultSet.getString("Marca"));
                venda.setModelo(resultSet.getString("Modelo"));
                venda.setQuantidade(resultSet.getInt("Quantidade"));
                venda.setPrecoUnidade(resultSet.getDouble("Preco"));
                venda.setCPFCliente(resultSet.getString("CPF"));
                venda.setIdCliente(Integer.parseInt(resultSet.getString("IdCliente")));

                // Adiciona cada pedido a lista de pedidos
                listaVendas.add(venda);
                
            }
        } 
        catch (SQLException | ClassNotFoundException ex) {
            listaVendas = null;
        }
        finally {
            try {
                if (resultSet != null)
                    resultSet.close();
                if (preparedStatement != null)
                    preparedStatement.close();
                
                GerenciarDataBase.fecharConexao();
            }
            catch (SQLException e) {
            }
        }
        
        return listaVendas;
    }
    
    public static ArrayList<Venda> consultar(Date dataInicial, Date dataFinal) {
        ResultSet resultSet = null;
        Connection connection = null;
        PreparedStatement preparedStatement = null; 
        ArrayList<Venda> listaPedido = new ArrayList<Venda>();
        
        try {
            connection = GerenciarDataBase.abrirConexao();
            
            // Criando Query SQL
            preparedStatement = connection.prepareStatement("SELECT * FROM pedido WHERE DataPedido >= ? AND DataPedido <= ?");
            preparedStatement.setDate(1, new java.sql.Date(dataInicial.getTime()));
            preparedStatement.setDate(2, new java.sql.Date(dataFinal.getTime()));

            resultSet = preparedStatement.executeQuery();
            
            while(resultSet.next()) {
                Venda pedido = new Venda();
                
                pedido.setId(resultSet.getInt("IdPedido"));
                pedido.setDataPedido(resultSet.getDate("DataPedido"));
                pedido.setTotal(resultSet.getDouble("PrecoTotal"));
                pedido.setIdCliente(Integer.parseInt(resultSet.getString("IdCliente")));

                // Adiciona cada pedido a lista de clientes
                listaPedido.add(pedido);
                
            }
        } 
        catch (SQLException | ClassNotFoundException ex) {
            listaPedido = null;
        }
        finally {
            try {
                if (resultSet != null)
                    resultSet.close();
                if (preparedStatement != null)
                    preparedStatement.close();
                
                GerenciarDataBase.fecharConexao();
            }
            catch (SQLException e) {
            }
        }
        
        return listaPedido;
    }
    
    public static boolean deletar(int id) {
        boolean retorno;
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        
        try {
            connection = GerenciarDataBase.abrirConexao();
            
            preparedStatement = connection.prepareStatement("DELETE FROM cliente WHERE IdCliente = ?;");
            preparedStatement.setInt(1, id);
            
            int linhasAfetadas = preparedStatement.executeUpdate();
            
            if (linhasAfetadas > 0) 
                retorno = true;
            else
                retorno = false;
            
        } 
        catch (SQLException | ClassNotFoundException ex) {
            retorno = false;
        }
        finally {
            try {
                if (preparedStatement != null)
                   preparedStatement.close();

                GerenciarDataBase.fecharConexao();
            }
            catch (SQLException ex) {
                
            }
        }
        
        return retorno;
   }
}
