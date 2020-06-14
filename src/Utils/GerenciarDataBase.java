package Utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Gustavo Santos
 */
public class GerenciarDataBase {
    static String STATUS = "Banco de dados não conectado.";
    static String DRIVER = "com.mysql.cj.jdbc.Driver";                   
    static String SERVER = "localhost";
    static String DATABASE = "lojaintrumentosmusicais";              
    static String LOGIN = "root";                           
    static String SENHA = "";                         
    static String URL = "";
    static Connection CONEXAO;

    public GerenciarDataBase() {}
    
    public static Connection abrirConexao() throws ClassNotFoundException,SQLException {
        
        URL = "jdbc:mysql://" + SERVER + ":3306/" + DATABASE + "?useTimezone=true&serverTimezone=UTC&useSSL=false";

        if (CONEXAO == null) {
            try {
                Class.forName(DRIVER);
                CONEXAO = DriverManager.getConnection(URL, LOGIN, SENHA);
                
                if (CONEXAO != null) {
                    STATUS = "Conexão com o banco de dados realizada com sucesso!";
                } 
                else {
                    STATUS = "Banco de dados não conectado.";
                }
            }
            catch (ClassNotFoundException e) {
                throw new ClassNotFoundException("O driver expecificado não foi encontrado.");
            }
            catch (SQLException e) {  
                throw new SQLException("Erro ao estabelecer uma conexão com o banco de dados. Verifique as credenciais de acesso.");
            }
        }
        else {
            try {
                if (CONEXAO.isClosed())
                    CONEXAO = DriverManager.getConnection(URL, LOGIN, SENHA);
            }
            catch (SQLException e) {
                throw new SQLException("Não foi possível finalizar a conexão com o banco de dados.");
            }
        }
        
        return CONEXAO;
    }
    
    public static boolean fecharConexao() throws SQLException {
        try {
            if (CONEXAO != null) {
                if (!CONEXAO.isClosed())
                    CONEXAO.close();
            }
            STATUS = "Banco de dados não conectado.";
        }
        catch (SQLException e) {
            return false;
        }
        
        return true;
    }
    
    public static String getStatusConexao() {
        return STATUS;
    }
}
