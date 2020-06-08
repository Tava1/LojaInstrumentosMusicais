package DAO;

import Model.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import Utils.GerenciarDataBase;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * @author Gustavo Santos
 */
public class ClienteDAO {
    public static boolean criar(Cliente cliente) {
        boolean retorno = false;
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        
        try {
            connection = GerenciarDataBase.abrirConexao();
            
            // Criando query SQL
            preparedStatement = connection.prepareStatement("INSERT INTO cliente (Nome, CPF, Sexo, EstadoCivil, DataNascimento, Email, NumeroTelefone1, NumeroTelefone2, Endereco, NumeroEndereco, Complemento) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);", Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1, cliente.getNome());
            preparedStatement.setString(2, cliente.getCpf());
            preparedStatement.setString(3, Integer.toString(cliente.getEstadoCivil()));
            preparedStatement.setString(4, Integer.toString(cliente.getGenero()));
            preparedStatement.setDate(5, new java.sql.Date(cliente.getDataNascimento().getTime()));
            preparedStatement.setString(6, cliente.getEmail());
            preparedStatement.setString(7, cliente.getTelefonePrimario());
            preparedStatement.setString(8, cliente.getTelefoneSecundario());
            preparedStatement.setString(9, cliente.getEndereco());
            preparedStatement.setString(10, cliente.getEnderecoNumero());
            preparedStatement.setString(11, cliente.getComplemento());
            
            int linhasAfetadas = preparedStatement.executeUpdate();
            
            if (linhasAfetadas > 0) {
                retorno = true;
                ResultSet resultSet = preparedStatement.getGeneratedKeys();
                
                if (resultSet.next()) {
                    cliente.setId(resultSet.getInt(1));
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

    // Consultar clientes
    public static ArrayList<Cliente> consultar() {
        ResultSet resultSet = null;
        Connection connection = null;
        PreparedStatement preparedStatement = null; 
        ArrayList<Cliente> clientes = new ArrayList<Cliente>();
        
        try {
            connection = GerenciarDataBase.abrirConexao();
            
            // Criando Query SQL
            preparedStatement = connection.prepareStatement("SELECT * From cliente");
            
            resultSet = preparedStatement.executeQuery();
            
            while(resultSet.next()) {
                Cliente cliente = new Cliente();
                
                cliente.setId(resultSet.getInt("IdCliente"));
                cliente.setNome(resultSet.getString("Nome"));
                cliente.setCpf(resultSet.getString("CPF"));
                cliente.setGenero(Integer.parseInt(resultSet.getString("Sexo")));
                cliente.setEstadoCivil(Integer.parseInt(resultSet.getString("EstadoCivil")));
                cliente.setDataNascimento(resultSet.getDate("DataNascimeto"));
                cliente.setEmail(resultSet.getString("Email"));
                cliente.setTelefonePrimario(resultSet.getString("NumeroTelefone1"));
                cliente.setTelefoneSecundario(resultSet.getString("NumeroTelefone2"));
                cliente.setEndereco(resultSet.getString("Endereco"));
                cliente.setEnderecoNumero(resultSet.getString("NumeroEndereco"));
                cliente.setComplemento(resultSet.getString("Complemento"));

                // Adiciona cada cliente a lista de clientes
                clientes.add(cliente);
                
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
    
    // Consultar cliente pelo nome
    public static ArrayList<Cliente> consultarNome(String nome) {
        ResultSet resultSet = null;
        Connection connection = null;
        PreparedStatement preparedStatement = null; 
        ArrayList<Cliente> clientes = new ArrayList<Cliente>();
        
        try {
            connection = GerenciarDataBase.abrirConexao();
            
            // Criar query SQL filtrando por nome
            preparedStatement = connection.prepareStatement("SELECT * FROM Cliente WHERE Nome LIKE ?;");
            preparedStatement.setString(1, "%" + nome + "%");
            
            resultSet = preparedStatement.executeQuery();
            
            while (resultSet.next()) {
                Cliente cliente = new Cliente();
                
                cliente.setId(resultSet.getInt("IdCliente"));
                cliente.setNome(resultSet.getString("Nome"));
                cliente.setCpf(resultSet.getString("CPF"));
                cliente.setGenero(Integer.parseInt(resultSet.getString("Sexo")));
                cliente.setEstadoCivil(Integer.parseInt(resultSet.getString("EstadoCivil")));
                cliente.setDataNascimento(resultSet.getDate("DataNascimento"));
                cliente.setEmail(resultSet.getString("Email"));
                cliente.setTelefonePrimario(resultSet.getString("NumeroTelefone1"));
                cliente.setTelefoneSecundario(resultSet.getString("NumeroTelefone2"));
                cliente.setEndereco(resultSet.getString("Endereco"));
                cliente.setEnderecoNumero(resultSet.getString("NumeroEndereco"));
                cliente.setComplemento(resultSet.getString("Complemento"));

                // Adiciona cada cliente a lista de clientes
                clientes.add(cliente);
                
            }

        } 
        catch (SQLException | ClassNotFoundException ex) {
            clientes = null;
        }
        finally {
            try {
                if(resultSet != null)
                    resultSet.close();                
                if(preparedStatement != null)
                    preparedStatement.close();
                
                GerenciarDataBase.fecharConexao();
            } 
            catch (SQLException ex) {
            }
        }
        
        return clientes;
    }
    
    // Consultar cliente pelo CPF
    public static ArrayList<Cliente> consultarCPF(String cpf) {
        ResultSet resultSet = null;
        Connection connection = null;
        PreparedStatement preparedStatement = null; 
        ArrayList<Cliente> clientes = new ArrayList<Cliente>();
        
        try {
            connection = GerenciarDataBase.abrirConexao();
            
            // Criar query SQL filtrando por cpf
            preparedStatement = connection.prepareStatement("SELECT * FROM Cliente WHERE CPF = ?;");
            preparedStatement.setString(1, cpf);
            
            resultSet = preparedStatement.executeQuery();
            
            while (resultSet.next()) {
                Cliente cliente = new Cliente();
                
                cliente.setId(resultSet.getInt("IdCliente"));
                cliente.setNome(resultSet.getString("Nome"));
                cliente.setCpf(resultSet.getString("CPF"));
                cliente.setGenero(Integer.parseInt(resultSet.getString("Sexo")));
                cliente.setEstadoCivil(Integer.parseInt(resultSet.getString("EstadoCivil")));
                cliente.setDataNascimento(resultSet.getDate("DataNascimento"));
                cliente.setEmail(resultSet.getString("Email"));
                cliente.setTelefonePrimario(resultSet.getString("NumeroTelefone1"));
                cliente.setTelefoneSecundario(resultSet.getString("NumeroTelefone2"));
                cliente.setEndereco(resultSet.getString("Endereco"));
                cliente.setEnderecoNumero(resultSet.getString("NumeroEndereco"));
                cliente.setComplemento(resultSet.getString("Complemento"));
                
                // Adiciona cada cliente a lista de clientes
                clientes.add(cliente);
                
            }

        } 
        catch (SQLException | ClassNotFoundException ex) {
            clientes = null;
        }
        finally {
            try {
                if(resultSet != null)
                    resultSet.close();                
                if(preparedStatement != null)
                    preparedStatement.close();
                
                GerenciarDataBase.fecharConexao();
            } 
            catch (SQLException ex) {
            }
        }
        
        return clientes;
    }
    
    public static boolean alterar(Cliente cliente) {
        boolean retorno = false;
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        
        try {
            connection = GerenciarDataBase.abrirConexao();
            
            preparedStatement = connection.prepareStatement("UPDATE cliente SET Nome = ?, CPF = ?, Sexo = ?, EstadoCivil = ?, DataNascimento = ?, Email = ?, NumeroTelefone1 = ?, NumeroTelefone2 = ?, Endereco = ?, NumeroEndereco = ?, Complemento = ? WHERE IdCliente = ?;");
            
            preparedStatement.setString(1, cliente.getNome());
            preparedStatement.setString(2, cliente.getCpf());
            preparedStatement.setString(3, Integer.toString(cliente.getEstadoCivil()));
            preparedStatement.setString(4, Integer.toString(cliente.getGenero()));
            preparedStatement.setDate(5, new java.sql.Date(cliente.getDataNascimento().getTime()));
            preparedStatement.setString(6, cliente.getEmail());
            preparedStatement.setString(7, cliente.getTelefonePrimario());
            preparedStatement.setString(8, cliente.getTelefoneSecundario());
            preparedStatement.setString(9, cliente.getEndereco());
            preparedStatement.setString(10, cliente.getEnderecoNumero());
            preparedStatement.setString(11, cliente.getComplemento());
            // WHERE
            preparedStatement.setInt(12, cliente.getId());

            
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