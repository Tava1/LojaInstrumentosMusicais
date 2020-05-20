package Model;
/**
 * @author Gustavo Santos
 */
public class Cliente {
    private String nome;
    private int sexo;
    private int estadoCivil;
    private int dataNascimento;
    private String cpf;
    private String endereco;
    private String enderecoNumero;
    private String email; 
    private int telefonePrimario;
    private int telefoneSecundario;
    
    public Cliente() {
        
    }
    
    public Cliente(String nome, int sexo, int estadoCivil, int dataNascimento, String cpf, String endereco, String enderecoNumero, String email, int telefonePrimario, int telefoneSecundario) {
        this.nome = nome;
        this.sexo = sexo;
        this.estadoCivil = estadoCivil;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
        this.endereco = endereco;
        this.enderecoNumero = enderecoNumero;
        this.email = email;
        this.telefonePrimario = telefonePrimario;
        this.telefoneSecundario = telefoneSecundario;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public int getSexo() {
        return sexo;
    }
    
    public void setSexo(int sexo) {
        this.sexo = sexo;
    }
    
    public int getEstadoCivil() {
        return estadoCivil;
    }
    
    public void setEstadoCivil(int estadoCivil) {
        this.estadoCivil = estadoCivil;
    }
    
    public int getDataNascimento() {
        return dataNascimento;
    }
    
    public void setDataNascimento(int dataNascimento) {
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
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public int getTelefonePrimario() {
        return telefonePrimario;
    }
    
    public void setTelefonePrimario(int telefonePrimario) {
        this.telefonePrimario = telefonePrimario;
    }
    
    public int getTelefoneSecundario() {
        return telefoneSecundario;
    }
    
    public void setTelefoneSecundario(int telefoneSecundario) {
        this.telefoneSecundario = telefoneSecundario;
    }
}
