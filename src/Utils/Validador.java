package Utils;

import javax.swing.*;
import java.awt.Color;

/**
 *
 * @author Gustavo Santos
 */
public class Validador {
    
    public Validador() {
        
    }
    
    public boolean ValidarLogin(JTextField campo, JPasswordField campoSenha){
//        if(campo.getText().length() < 6 && campo.getText().length() > 6) {
//            throw new IllegalArgumentException("Login inválido, lembre-se que o login deve possuir 6 caracteres.");
//        } 
//        if (campoSenha.getText().length() < 8 && campoSenha.getText().length() > 16) {
//            throw new IllegalArgumentException("Senha inválido, Mínimo 8 e Máximo 16 caracteres.");
//        }

        if(campo.getText().length() < 6 || campo.getText().length() > 6) {
            return false;
        } 
        if (campoSenha.getText().length() < 8 || campoSenha.getText().length() > 16) {
            return false;
        }
        return true;
    }
    
    public void ValidarNumero(JTextField campo){
    
        try{
            if(campo.getText().trim().equals("")){
                throw new IllegalArgumentException();
            }
            int numero = Integer.parseInt(campo.getText());
            campo.setBackground(Color.WHITE);
        }
        catch(IllegalArgumentException e){
        }
    }
    // Campos de textos Simples
    public void ValidarCampoVazioSimples(JTextField campo, JLabel labelCampo, JLabel retornoGeral){
        if (campo.getText().trim().equals("")){
            retornoGeral.setText("* Obrigatóirio preencher campos destacados em vermelho");
            retornoGeral.setForeground(Color.red);
            labelCampo.setForeground(Color.red);
            throw new IllegalArgumentException();
        } else {
            retornoGeral.setText("");
            labelCampo.setForeground(Color.black);
        }
    }
    // Area de texto
    public void ValidarCampoVazioSimples(JTextPane campo, JLabel labelCampo, JLabel retornoGeral){
        if (campo.getText().trim().equals("")){
            retornoGeral.setText("* Obrigatóirio preencher campos destacados em vermelho");
            retornoGeral.setForeground(Color.red);
            labelCampo.setForeground(Color.red);
            throw new IllegalArgumentException();
        } else {
            retornoGeral.setText("");
            labelCampo.setForeground(Color.black);
        }
    }
    
    public void ValidarComboBox(JComboBox comboBox, JLabel labelComboBox, JLabel retornoGeral){
        if (comboBox.getSelectedIndex() == 0){
            retornoGeral.setText("* Obrigatóirio preencher campos destacados em vermelho");
            retornoGeral.setForeground(Color.red);
            labelComboBox.setForeground(Color.red);
            throw new IllegalArgumentException();
        } else {
            retornoGeral.setText("");
            labelComboBox.setForeground(Color.black);
        }
    }
    
    public void ValidarCampoVazioFormatado(JFormattedTextField campoFormatado){
        //TODO: O nome do metodo ja diz.
    }
    
    public void ValidarCampoDinheiroVazio(JFormattedTextField campoFormatado){
        //TODO: O nome do metodo ja diz.
    }

    public String ValidarCPF(JFormattedTextField cpfFormatado) {
        String cpfValido = cpfFormatado.getText();
        
        cpfValido = cpfValido.replace("-", "");
        cpfValido = cpfValido.replace(".", "");
        
//        try {
//            Integer retorno = Integer.parseInt(cpfValido);
//        } 
//        catch (NumberFormatException e) {
//            JOptionPane.showMessageDialog(null, "CPF inválido." + e);
//        }
        
        return cpfValido;
    }
    
    public String ValidarTelefone(JFormattedTextField telefoneFormatado) {
        String telefone = telefoneFormatado.getText();
        
        telefone = telefone.replace("(", "");
        telefone = telefone.replace(")", "");
        telefone = telefone.replace(" ", "");
        telefone = telefone.replace("-", "");


//        try {
//            Integer retorno = Integer.parseInt(cpfValido);
//        } 
//        catch (NumberFormatException e) {
//            JOptionPane.showMessageDialog(null, "CPF inválido." + e);
//        }
        
        return telefone;
        
    }

}
