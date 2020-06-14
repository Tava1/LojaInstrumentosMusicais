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
    
    /**
    *
    * @param Valida se o usuario selecionou um opcao valida em combobox Obrigatorio.
    */
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
    
    
    /**
    * @param Valida CPF, limpa toda a formatacao e verifica se o usuario digitou uma sequencia numerica.
    */
    public String ValidarCPF(JFormattedTextField cpfFormatado) {
        String cpfValido = cpfFormatado.getText();
        
        cpfValido = cpfValido.replace("-", "");
        cpfValido = cpfValido.replace(".", "");
        cpfValido = cpfValido.replace(" ", "");
        
        try {
            Integer retorno = Integer.parseInt(cpfValido);
        } 
        catch (NumberFormatException e) {
            //JOptionPane.showMessageDialog(null, "CPF inválido." + e);
        }
        
        return cpfValido;
    }
    /**
    * @param Valida Numeros de telefones, limpa toda a formatacao.
    */
    public String ValidarTelefone(JFormattedTextField telefoneFormatado) {
        String telefone = telefoneFormatado.getText();
        
        telefone = telefone.replace("(", "");
        telefone = telefone.replace(")", "");
        telefone = telefone.replace(" ", "");
        telefone = telefone.replace("-", "");

        return telefone;
    }
    
    /**
    * @param Valida se o usuario digitou um valor valido para double.
    */
    public Double validarDouble(JFormattedTextField campoFormatado) {
        Double valor = 0.0;

        try {
            String texto = campoFormatado.getText();
            valor = Double.parseDouble(texto);
        }
        catch (Exception ex) {
            
        }
        return valor;
    }
    
}
