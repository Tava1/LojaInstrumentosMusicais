package DAO;

import Model.Produto;
import Utils.GerenciarDataBase;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
* @author Gustavo Santos
 */
public class ProdutoDAO {
    public static boolean criar(Produto produto) {
        boolean retorno = false;
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        
        try {
            connection = GerenciarDataBase.abrirConexao();
            
            // Criando query SQL
            preparedStatement = connection.prepareStatement("INSERT INTO produto (Marca, Modelo, Descricao, Preco, IdTipoProduto) VALUES(?, ?, ?, ?, ?);", Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1, produto.getMarca());
            preparedStatement.setString(2, produto.getModelo());
            preparedStatement.setString(3, produto.getDescricao());
            preparedStatement.setDouble(4, produto.getPreco());
            preparedStatement.setInt(5, produto.getIdTipo());
            
            int linhasAfetadas = preparedStatement.executeUpdate();
            
            preparedStatement = connection.prepareStatement("INSERT INTO estoque (QuantidadeEstoque, IdProduto) VALUES(?, LAST_INSERT_ID());", Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setInt(1, produto.getQuantidade());
            
            int linhasAfetadas2 = preparedStatement.executeUpdate();
            
            
            if (linhasAfetadas > 0 && linhasAfetadas2 > 0) {
                retorno = true;
                ResultSet resultSet = preparedStatement.getGeneratedKeys();
                
                if (resultSet.next()) {
                    produto.setId(resultSet.getInt(1));
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

    // Consultar Produtos
    public static ArrayList<Produto> consultar() {
        ResultSet resultSet = null;
        Connection connection = null;
        PreparedStatement preparedStatement = null; 
        ArrayList<Produto> clientes = new ArrayList<Produto>();
        
        try {
            connection = GerenciarDataBase.abrirConexao();
            
            // Criando Query SQL
            preparedStatement = connection.prepareStatement("SELECT * FROM produto as p INNER JOIN estoque as e ON p.IdProduto = e.IdProduto");
            
            resultSet = preparedStatement.executeQuery();
            
            while(resultSet.next()) {
                Produto produto = new Produto();
                
                produto.setId(resultSet.getInt("IdProduto"));
                produto.setMarca(resultSet.getString("Marca"));
                produto.setModelo(resultSet.getString("Modelo"));
                produto.setDescricao(resultSet.getString("Descricao"));
                produto.setPreco(Double.parseDouble(resultSet.getString("Preco")));
                produto.setIdTipo(resultSet.getInt("IdTipoProduto"));
                produto.setQuantidade(resultSet.getInt("QuantidadeEstoque"));

                // Adiciona cada cliente a lista de clientes
                clientes.add(produto);
                
            }
        } 
        catch (SQLException | ClassNotFoundException ex) {
            clientes = null;
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
        
        return clientes;
    }
    
    // Consultar Produto por id
    public static ArrayList<Produto> consultar(int id) {
        ResultSet resultSet = null;
        Connection connection = null;
        PreparedStatement preparedStatement = null; 
        ArrayList<Produto> clientes = new ArrayList<Produto>();
        
        try {
            connection = GerenciarDataBase.abrirConexao();
            
            // Criando Query SQL
            preparedStatement = connection.prepareStatement("SELECT * FROM produto as p INNER JOIN estoque as e ON p.IdProduto = e.IdProduto WHERE p.IdProduto LIKE ?");
            preparedStatement.setString(1, id + "%");
            
            resultSet = preparedStatement.executeQuery();
            
            while(resultSet.next()) {
                Produto produto = new Produto();
                
                produto.setId(resultSet.getInt("IdProduto"));
                produto.setMarca(resultSet.getString("Marca"));
                produto.setModelo(resultSet.getString("Modelo"));
                produto.setDescricao(resultSet.getString("Descricao"));
                produto.setPreco(Double.parseDouble(resultSet.getString("Preco")));
                produto.setIdTipo(resultSet.getInt("IdTipoProduto"));
                produto.setQuantidade(resultSet.getInt("QuantidadeEstoque"));

                // Adiciona cada cliente a lista de clientes
                clientes.add(produto);
                
            }
        } 
        catch (SQLException | ClassNotFoundException ex) {
            clientes = null;
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
        
        return clientes;
    }
    
    public static ArrayList<Produto> consultar(int id, ArrayList carrinho) {
        ResultSet resultSet = null;
        Connection connection = null;
        PreparedStatement preparedStatement = null; 
        ArrayList<Produto> clientes = new ArrayList<Produto>();
        
        try {
            connection = GerenciarDataBase.abrirConexao();
            
            // Criando Query SQL
            preparedStatement = connection.prepareStatement("SELECT * FROM produto as p INNER JOIN estoque as e ON p.IdProduto = e.IdProduto WHERE p.IdProduto LIKE ?");
            preparedStatement.setString(1, id + "%");
            
            resultSet = preparedStatement.executeQuery();
            
            while(resultSet.next()) {
                Produto produto = new Produto();
                
                produto.setId(resultSet.getInt("IdProduto"));
                produto.setMarca(resultSet.getString("Marca"));
                produto.setModelo(resultSet.getString("Modelo"));
                produto.setDescricao(resultSet.getString("Descricao"));
                produto.setPreco(Double.parseDouble(resultSet.getString("Preco")));
                produto.setIdTipo(resultSet.getInt("IdTipoProduto"));
                produto.setQuantidade(resultSet.getInt("QuantidadeEstoque"));

                // Adiciona cada cliente a lista de clientes
                clientes.add(produto);
                
            }
        } 
        catch (SQLException | ClassNotFoundException ex) {
            clientes = null;
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
        
        return clientes;
    }
    
    
    
    // Consultar Produto por marca
    public static ArrayList<Produto> consultar(String marca) {
        ResultSet resultSet = null;
        Connection connection = null;
        PreparedStatement preparedStatement = null; 
        ArrayList<Produto> clientes = new ArrayList<Produto>();
        
        try {
            connection = GerenciarDataBase.abrirConexao();
            
            // Criando Query SQL
            preparedStatement = connection.prepareStatement("SELECT * FROM produto as p INNER JOIN estoque as e ON p.IdProduto = e.IdProduto WHERE p.Marca LIKE ?");
            preparedStatement.setString(1, "%" + marca + "%");
            
            resultSet = preparedStatement.executeQuery();
            
            while(resultSet.next()) {
                Produto produto = new Produto();
                
                produto.setId(resultSet.getInt("IdProduto"));
                produto.setMarca(resultSet.getString("Marca"));
                produto.setModelo(resultSet.getString("Modelo"));
                produto.setDescricao(resultSet.getString("Descricao"));
                produto.setPreco(Double.parseDouble(resultSet.getString("Preco")));
                produto.setIdTipo(resultSet.getInt("IdTipoProduto"));
                produto.setQuantidade(resultSet.getInt("QuantidadeEstoque"));

                // Adiciona cada cliente a lista de clientes
                clientes.add(produto);
                
            }
        } 
        catch (SQLException | ClassNotFoundException ex) {
            clientes = null;
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
        
        return clientes;
    }

    // Consultar Produto por modelo
    public static ArrayList<Produto> consultar(String marca, String modelo) {
        ResultSet resultSet = null;
        Connection connection = null;
        PreparedStatement preparedStatement = null; 
        ArrayList<Produto> clientes = new ArrayList<Produto>();
        
        try {
            connection = GerenciarDataBase.abrirConexao();
            
            // Criando Query SQL
            preparedStatement = connection.prepareStatement("SELECT * FROM produto as p INNER JOIN estoque as e ON p.IdProduto = e.IdProduto WHERE p.Modelo LIKE ?");
            preparedStatement.setString(1, "%" + modelo + "%");
            
            resultSet = preparedStatement.executeQuery();
            
            while(resultSet.next()) {
                Produto produto = new Produto();
                
                produto.setId(resultSet.getInt("IdProduto"));
                produto.setMarca(resultSet.getString("Marca"));
                produto.setModelo(resultSet.getString("Modelo"));
                produto.setDescricao(resultSet.getString("Descricao"));
                produto.setPreco(Double.parseDouble(resultSet.getString("Preco")));
                produto.setIdTipo(resultSet.getInt("IdTipoProduto"));
                produto.setQuantidade(resultSet.getInt("QuantidadeEstoque"));

                // Adiciona cada cliente a lista de clientes
                clientes.add(produto);
                
            }
        } 
        catch (SQLException | ClassNotFoundException ex) {
            clientes = null;
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
        
        return clientes;
    }

    
    public static boolean alterar(Produto produto) {
        boolean retorno = false;
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        
        try {
            connection = GerenciarDataBase.abrirConexao();
            
            preparedStatement = connection.prepareStatement("UPDATE produto SET Marca = ?, Modelo = ?, Descricao = ?, Preco = ?, IdTipoProduto = ? WHERE IdProduto = ?;");
            
            preparedStatement.setString(1, produto.getMarca());
            preparedStatement.setString(2, produto.getModelo());
            preparedStatement.setString(3, produto.getDescricao());
            preparedStatement.setDouble(4, produto.getPreco());
            preparedStatement.setInt(5, produto.getIdTipo());
            
            // WHERE
            preparedStatement.setInt(6, produto.getId());
            
            int linhasAfetadas = preparedStatement.executeUpdate();
            
            preparedStatement = connection.prepareStatement("UPDATE estoque SET QuantidadeEstoque = ? WHERE IdProduto = ?;");
            preparedStatement.setInt(1, produto.getQuantidade());
            
            // WHERE
            preparedStatement.setInt(2, produto.getId());
            
            int linhasAfetadas2 = preparedStatement.executeUpdate();
            
            
            if (linhasAfetadas > 0 && linhasAfetadas2 > 0) 
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
            catch (SQLException e) {
            }
        }
        return retorno;
    }
    
    public static boolean deletar(int id) {
        boolean retorno;
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        
        try {
            connection = GerenciarDataBase.abrirConexao();
            
            preparedStatement = connection.prepareStatement("DELETE FROM estoque WHERE IdProduto = ?;");
            preparedStatement.setInt(1, id);
            
            int linhasAfetadas2 = preparedStatement.executeUpdate();
            
            preparedStatement = connection.prepareStatement("DELETE FROM produto WHERE IdProduto = ?;");
            preparedStatement.setInt(1, id);
            
            int linhasAfetadas = preparedStatement.executeUpdate();
            
            if (linhasAfetadas > 0 && linhasAfetadas2 > 0) 
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
