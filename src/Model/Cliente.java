package Model;

import java.util.Date;
/**
 * @author Gustavo Santos
 */
public class Cliente {
    
    private int id;
    private String nome;
    private int genero;
    private int estadoCivil;
    private Date dataNascimento;
    private String cpf;
    private String endereco;
    private String enderecoNumero;
    private String complemento;
    private String email; 
    private String telefonePrimario;
    private String telefoneSecundario;
    
    public Cliente() {
        
    }
    
    public Cliente(int id, String nome, int genero, int estadoCivil, Date dataNascimento, String cpf, String endereco, String enderecoNumero, String complemento, String email, String telefonePrimario, String telefoneSecundario) {
        this.id = id;
        this.nome = nome;
        this.genero = genero;
        this.estadoCivil = estadoCivil;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
        this.endereco = endereco;
        this.enderecoNumero = enderecoNumero;
        this.complemento = complemento;
        this.email = email;
        this.telefonePrimario = telefonePrimario;
        this.telefoneSecundario = telefoneSecundario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public int getGenero() {
        return genero;
    }
    
    public void setGenero(int genero) {
        this.genero = genero;
    }
    
    public int getEstadoCivil() {
        return estadoCivil;
    }
    
    public void setEstadoCivil(int estadoCivil) {
        this.estadoCivil = estadoCivil;
    }
    
    public Date getDataNascimento() {
        return dataNascimento;
    }
    
    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    
    public String getCpf() {
        return cpf;
    }
    
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public String getEndereco() {
        return endereco;
    }
    
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    public String getEnderecoNumero() {
        return enderecoNumero;
    }
    
    public void setEnderecoNumero(String enderecoNumero) {
        this.enderecoNumero = enderecoNumero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getTelefonePrimario() {
        return telefonePrimario;
    }
    
    public void setTelefonePrimario(String telefonePrimario) {
        this.telefonePrimario = telefonePrimario;
    }
    
    public String getTelefoneSecundario() {
        return telefoneSecundario;
    }
    
    public void setTelefoneSecundario(String telefoneSecundario) {
        this.telefoneSecundario = telefoneSecundario;
    }
}
