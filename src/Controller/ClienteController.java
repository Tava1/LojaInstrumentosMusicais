package Controller;

import DAO.ClienteDAO;
import java.util.Date;
import Model.Cliente;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Gustavo Santos
 */
public class ClienteController {
    
    public ClienteController() {}
    
    public static boolean criarCliente(String nome, int genero, int estadoCivil, Date dataNascimento, String cpf, String endereco, String enderecoNumero, String complemento, String email, String telefonePrimario, String telefoneSecundario) {
        
        Cliente cliente = new Cliente();
        
        cliente.setNome(nome);
        cliente.setGenero(genero);
        cliente.setEstadoCivil(estadoCivil);
        cliente.setDataNascimento(dataNascimento);
        cliente.setCpf(cpf);
        cliente.setEndereco(endereco);
        cliente.setEnderecoNumero(enderecoNumero);
        cliente.setComplemento(complemento);
        cliente.setEmail(email);
        cliente.setTelefonePrimario(telefonePrimario);
        cliente.setTelefoneSecundario(telefoneSecundario);
        
        return ClienteDAO.criar(cliente);
    }
    
    public static void buscarClienteNome(String nome, JTable tabelaClientes) {
        ArrayList<Cliente> listaClientes = ClienteDAO.consultarNome(nome);
        
        DefaultTableModel tableModel = new DefaultTableModel();
        tableModel.addColumn("ID");
        tableModel.addColumn("Nome");
        tableModel.addColumn("CPF");
        tableModel.addColumn("Data de Nascimento");
        tableModel.addColumn("Endereço");
        
        tableModel.addColumn("Genero");
        tableModel.addColumn("Estado Civil");
        tableModel.addColumn("EnderecoNumero");
        tableModel.addColumn("Complemento");
        tableModel.addColumn("Email");
        tableModel.addColumn("Telefone(1)");
        tableModel.addColumn("Telefone(2)");

        tabelaClientes.setModel(tableModel);
        
        tableModel.setRowCount(0);

        for (Cliente cliente : listaClientes) {
            tableModel.addRow(new Object[] {
                cliente.getId(),
                cliente.getNome(),
                cliente.getCpf(),
                cliente.getDataNascimento(),
                cliente.getEndereco(),
                
                cliente.getGenero(),
                cliente.getEstadoCivil(),
                cliente.getEnderecoNumero(),
                cliente.getComplemento(),
                cliente.getEmail(),
                cliente.getTelefonePrimario(),
                cliente.getTelefoneSecundario(),
            });
        }
    }
    
    public static ArrayList<Cliente> buscarCliente(String cpf) {
        ArrayList<Cliente> listaClientes = ClienteDAO.consultarCPF(cpf);
        
        return listaClientes;
    }
    
    public static boolean alterarCliente(int id, String nome, int genero, int estadoCivil, Date dataNascimento, String cpf, String endereco, String enderecoNumero, String complemento, String email, String telefonePrimario, String telefoneSecundario) {
        Cliente cliente = new Cliente();
        
        cliente.setId(id);
        cliente.setNome(nome);
        cliente.setGenero(genero);
        cliente.setEstadoCivil(estadoCivil);
        cliente.setDataNascimento(dataNascimento);
        cliente.setCpf(cpf);
        cliente.setEndereco(endereco);
        cliente.setEnderecoNumero(enderecoNumero);
        cliente.setComplemento(complemento);
        cliente.setEmail(email);
        cliente.setTelefonePrimario(telefonePrimario);
        cliente.setTelefoneSecundario(telefoneSecundario);
        
        return ClienteDAO.alterar(cliente);
    }
    
    public static boolean deletarCliente(int id) {
        return ClienteDAO.deletar(id);
    }
}
 