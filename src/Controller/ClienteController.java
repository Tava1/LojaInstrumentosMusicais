package Controller;

import DAO.ClienteDAO;
import java.util.Date;
import Model.Cliente;

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
  
}
 