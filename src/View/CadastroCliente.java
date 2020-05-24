package View;

import Controller.ClienteController;
import Utils.Validador;
import java.awt.Color;
import javax.swing.JOptionPane;
import java.util.Date;
import Controller.ClienteController;

/**
 * @author Gustavo Santos
 */
public class CadastroCliente extends javax.swing.JInternalFrame {

    private Date date = new Date();
    
    public CadastroCliente() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panelDadosPessoaisCliente = new javax.swing.JPanel();
        labelNomeCliente = new javax.swing.JLabel();
        textFieldNomeCliente = new javax.swing.JTextField();
        labelGeneroCliente = new javax.swing.JLabel();
        comboBoxGeneroCliente = new javax.swing.JComboBox<>();
        labelEstadoCivilCliente = new javax.swing.JLabel();
        comboBoxEstadoCivilCliente = new javax.swing.JComboBox<>();
        labelDataNascimentoCliente = new javax.swing.JLabel();
        labelCPFCliente = new javax.swing.JLabel();
        frmtTextFieldCpfCliente = new javax.swing.JFormattedTextField();
        dtChooserDataNascimento = new com.toedter.calendar.JDateChooser();
        panelDadosCobrancaCliente = new javax.swing.JPanel();
        labelEnderecoCliente = new javax.swing.JLabel();
        textFieldEnderecoCliente = new javax.swing.JTextField();
        labelNumeroEnderecoCliente = new javax.swing.JLabel();
        textFieldNumeroEnderecoCliente = new javax.swing.JTextField();
        labelEmailCliente = new javax.swing.JLabel();
        textFieldEmailCliente = new javax.swing.JTextField();
        labelNumeroPCliente = new javax.swing.JLabel();
        frmtTextFieldNumeroPrimarioCliente = new javax.swing.JFormattedTextField();
        labelNumeroSCliente = new javax.swing.JLabel();
        frmtTextFieldNumeroSecundarioCliente = new javax.swing.JFormattedTextField();
        labelComplementoCliente = new javax.swing.JLabel();
        textFieldComplementoCliente = new javax.swing.JTextField();
        panelAcoesCliente = new javax.swing.JPanel();
        buttonCriarCliente = new javax.swing.JButton();
        buttonCancelarCliente = new javax.swing.JButton();
        LabelCamposObrigatorioCliente = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Cadastro de Clientes");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        panelDadosPessoaisCliente.setBackground(new java.awt.Color(255, 255, 255));
        panelDadosPessoaisCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados Pessoais"));

        labelNomeCliente.setText("NOME *");

        textFieldNomeCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldNomeClienteActionPerformed(evt);
            }
        });
        textFieldNomeCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textFieldNomeClienteKeyPressed(evt);
            }
        });

        labelGeneroCliente.setText("GÊNERO *");

        comboBoxGeneroCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione -", "Feminino", "Masculino", "Outros" }));
        comboBoxGeneroCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxGeneroClienteActionPerformed(evt);
            }
        });

        labelEstadoCivilCliente.setText("ESTADO CIVIL *");

        comboBoxEstadoCivilCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione -", "Solteiro(a)" }));
        comboBoxEstadoCivilCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxEstadoCivilClienteActionPerformed(evt);
            }
        });

        labelDataNascimentoCliente.setText("DATA DE NASCIMENTO *");

        labelCPFCliente.setText("CPF *");

        try {
            frmtTextFieldCpfCliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        frmtTextFieldCpfCliente.setToolTipText("");
        frmtTextFieldCpfCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frmtTextFieldCpfClienteActionPerformed(evt);
            }
        });

        dtChooserDataNascimento.setDateFormatString("dd/MM/yyyy");

        javax.swing.GroupLayout panelDadosPessoaisClienteLayout = new javax.swing.GroupLayout(panelDadosPessoaisCliente);
        panelDadosPessoaisCliente.setLayout(panelDadosPessoaisClienteLayout);
        panelDadosPessoaisClienteLayout.setHorizontalGroup(
            panelDadosPessoaisClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDadosPessoaisClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDadosPessoaisClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textFieldNomeCliente)
                    .addGroup(panelDadosPessoaisClienteLayout.createSequentialGroup()
                        .addComponent(labelNomeCliente)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panelDadosPessoaisClienteLayout.createSequentialGroup()
                        .addGroup(panelDadosPessoaisClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboBoxGeneroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelGeneroCliente))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelDadosPessoaisClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboBoxEstadoCivilCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelEstadoCivilCliente))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelDadosPessoaisClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelDadosPessoaisClienteLayout.createSequentialGroup()
                                .addComponent(labelDataNascimentoCliente)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(dtChooserDataNascimento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelDadosPessoaisClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelCPFCliente)
                            .addComponent(frmtTextFieldCpfCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        panelDadosPessoaisClienteLayout.setVerticalGroup(
            panelDadosPessoaisClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDadosPessoaisClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDadosPessoaisClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(dtChooserDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelDadosPessoaisClienteLayout.createSequentialGroup()
                        .addComponent(labelNomeCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textFieldNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelDadosPessoaisClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelGeneroCliente)
                            .addComponent(labelEstadoCivilCliente)
                            .addComponent(labelDataNascimentoCliente)
                            .addComponent(labelCPFCliente))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelDadosPessoaisClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(frmtTextFieldCpfCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelDadosPessoaisClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(comboBoxGeneroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(comboBoxEstadoCivilCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelDadosCobrancaCliente.setBackground(new java.awt.Color(255, 255, 255));
        panelDadosCobrancaCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados de cobrança"));

        labelEnderecoCliente.setText("ENDEREÇO *");

        textFieldEnderecoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldEnderecoClienteActionPerformed(evt);
            }
        });

        labelNumeroEnderecoCliente.setText("Nº *");

        textFieldNumeroEnderecoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldNumeroEnderecoClienteActionPerformed(evt);
            }
        });

        labelEmailCliente.setText("E-MAIL");

        textFieldEmailCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldEmailClienteActionPerformed(evt);
            }
        });

        labelNumeroPCliente.setText("NÚMERO P/ CONTATO *");

        try {
            frmtTextFieldNumeroPrimarioCliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) # ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        frmtTextFieldNumeroPrimarioCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frmtTextFieldNumeroPrimarioClienteActionPerformed(evt);
            }
        });

        labelNumeroSCliente.setText("NÚMERO P/ CONTATO(2)");

        try {
            frmtTextFieldNumeroSecundarioCliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) # ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        frmtTextFieldNumeroSecundarioCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frmtTextFieldNumeroSecundarioClienteActionPerformed(evt);
            }
        });

        labelComplementoCliente.setText("COMPLEMENTO");

        textFieldComplementoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldComplementoClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelDadosCobrancaClienteLayout = new javax.swing.GroupLayout(panelDadosCobrancaCliente);
        panelDadosCobrancaCliente.setLayout(panelDadosCobrancaClienteLayout);
        panelDadosCobrancaClienteLayout.setHorizontalGroup(
            panelDadosCobrancaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDadosCobrancaClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDadosCobrancaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDadosCobrancaClienteLayout.createSequentialGroup()
                        .addComponent(labelEmailCliente)
                        .addGap(380, 380, 380)
                        .addComponent(labelNumeroPCliente)
                        .addGap(117, 117, 117)
                        .addComponent(labelNumeroSCliente)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panelDadosCobrancaClienteLayout.createSequentialGroup()
                        .addComponent(textFieldEmailCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 408, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(frmtTextFieldNumeroPrimarioCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(frmtTextFieldNumeroSecundarioCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelDadosCobrancaClienteLayout.createSequentialGroup()
                        .addGroup(panelDadosCobrancaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelDadosCobrancaClienteLayout.createSequentialGroup()
                                .addComponent(labelEnderecoCliente)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(textFieldEnderecoCliente))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelDadosCobrancaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textFieldNumeroEnderecoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelNumeroEnderecoCliente))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelDadosCobrancaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelComplementoCliente)
                            .addComponent(textFieldComplementoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        panelDadosCobrancaClienteLayout.setVerticalGroup(
            panelDadosCobrancaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDadosCobrancaClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDadosCobrancaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelEnderecoCliente)
                    .addComponent(labelNumeroEnderecoCliente)
                    .addComponent(labelComplementoCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDadosCobrancaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textFieldEnderecoCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(textFieldComplementoCliente)
                    .addComponent(textFieldNumeroEnderecoCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelDadosCobrancaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelEmailCliente)
                    .addComponent(labelNumeroPCliente)
                    .addComponent(labelNumeroSCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDadosCobrancaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldEmailCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(frmtTextFieldNumeroPrimarioCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(frmtTextFieldNumeroSecundarioCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );

        panelAcoesCliente.setBackground(new java.awt.Color(255, 255, 255));

        buttonCriarCliente.setText("ENVIAR");
        buttonCriarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCriarClienteActionPerformed(evt);
            }
        });

        buttonCancelarCliente.setText("CANCELAR");
        buttonCancelarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelarClienteActionPerformed(evt);
            }
        });

        LabelCamposObrigatorioCliente.setBackground(new java.awt.Color(0, 0, 0));
        LabelCamposObrigatorioCliente.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout panelAcoesClienteLayout = new javax.swing.GroupLayout(panelAcoesCliente);
        panelAcoesCliente.setLayout(panelAcoesClienteLayout);
        panelAcoesClienteLayout.setHorizontalGroup(
            panelAcoesClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAcoesClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelCamposObrigatorioCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonCancelarCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonCriarCliente)
                .addContainerGap())
        );
        panelAcoesClienteLayout.setVerticalGroup(
            panelAcoesClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAcoesClienteLayout.createSequentialGroup()
                .addContainerGap(95, Short.MAX_VALUE)
                .addGroup(panelAcoesClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonCriarCliente)
                    .addComponent(buttonCancelarCliente)
                    .addComponent(LabelCamposObrigatorioCliente))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelDadosPessoaisCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelDadosCobrancaCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelAcoesCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelDadosPessoaisCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelDadosCobrancaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelAcoesCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textFieldNomeClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldNomeClienteActionPerformed
        
    }//GEN-LAST:event_textFieldNomeClienteActionPerformed

    private void comboBoxGeneroClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxGeneroClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxGeneroClienteActionPerformed

    private void comboBoxEstadoCivilClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxEstadoCivilClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxEstadoCivilClienteActionPerformed

    private void frmtTextFieldCpfClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frmtTextFieldCpfClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_frmtTextFieldCpfClienteActionPerformed
    
    private void frmtTextFieldCpfClienteActionPerformed(java.awt.event.KeyEvent evt) {                                                        
        char c = evt.getKeyChar();
        if(Character.isLetter(c)){
            frmtTextFieldCpfCliente.setEditable(false);
        }else{
            frmtTextFieldCpfCliente.setEditable(true);
        }
    } 
    
    private void textFieldEnderecoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldEnderecoClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldEnderecoClienteActionPerformed
    
    private void textFieldNumeroEnderecoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldNumeroEnderecoClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldNumeroEnderecoClienteActionPerformed

    private void textFieldComplementoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldComplementoClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldComplementoClienteActionPerformed

    private void textFieldEmailClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldEmailClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldEmailClienteActionPerformed

    private void frmtTextFieldNumeroPrimarioClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frmtTextFieldNumeroPrimarioClienteActionPerformed
        
    }//GEN-LAST:event_frmtTextFieldNumeroPrimarioClienteActionPerformed

    private void frmtTextFieldNumeroSecundarioClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frmtTextFieldNumeroSecundarioClienteActionPerformed
        
    }//GEN-LAST:event_frmtTextFieldNumeroSecundarioClienteActionPerformed

    private void buttonCriarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCriarClienteActionPerformed
        Validador validador = new Validador();

        String nome = textFieldNomeCliente.getText();
        int genero = comboBoxGeneroCliente.getSelectedIndex();
        int estadoCivil = comboBoxGeneroCliente.getSelectedIndex();
        Date dataNascimento = dtChooserDataNascimento.getDate();
        String cpf = validador.ValidarCPF(frmtTextFieldCpfCliente);
        String endereco = textFieldEnderecoCliente.getText();
        String enderecoNumero = textFieldNumeroEnderecoCliente.getText();
        String complemento = textFieldComplementoCliente.getText();
        String email = textFieldEmailCliente.getText();
        
        String telefonePrimario = validador.ValidarTelefone(frmtTextFieldNumeroPrimarioCliente);
        String telefoneSecundario = validador.ValidarTelefone(frmtTextFieldNumeroSecundarioCliente);
        
        try {
            validador.ValidarCampoVazioSimples(textFieldNomeCliente, labelNomeCliente, LabelCamposObrigatorioCliente);
            validador.ValidarComboBox(comboBoxGeneroCliente, labelGeneroCliente, LabelCamposObrigatorioCliente);
            validador.ValidarComboBox(comboBoxEstadoCivilCliente, labelEstadoCivilCliente, LabelCamposObrigatorioCliente);
            // TODO: validar data de nacimento
            // TODO: validar CPF
            validador.ValidarCampoVazioSimples(textFieldEnderecoCliente, labelEnderecoCliente, LabelCamposObrigatorioCliente);
            validador.ValidarCampoVazioSimples(textFieldNumeroEnderecoCliente, labelNumeroEnderecoCliente, LabelCamposObrigatorioCliente);
            // TODO: Validar telefone
        }
        catch(IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, "Não é possível cadastrar, campos obrigatórios não foram preenchidos.");
        }
        
        // CONTROLLER
        boolean retorno = ClienteController.criarCliente(nome, genero, estadoCivil, dataNascimento, cpf, endereco, enderecoNumero, complemento, email, telefonePrimario, telefoneSecundario);
        
        if (retorno) {
            JOptionPane.showMessageDialog(null, "Cliente gravado com sucesso");
        } 
        else {
            JOptionPane.showMessageDialog(null, "Não foi possível gravar o cliente em questão.");
        }
    }//GEN-LAST:event_buttonCriarClienteActionPerformed

    private void buttonCancelarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelarClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonCancelarClienteActionPerformed

    private void textFieldNomeClienteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textFieldNomeClienteKeyPressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_textFieldNomeClienteKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelCamposObrigatorioCliente;
    private javax.swing.JButton buttonCancelarCliente;
    private javax.swing.JButton buttonCriarCliente;
    private javax.swing.JComboBox<String> comboBoxEstadoCivilCliente;
    private javax.swing.JComboBox<String> comboBoxGeneroCliente;
    private com.toedter.calendar.JDateChooser dtChooserDataNascimento;
    private javax.swing.JFormattedTextField frmtTextFieldCpfCliente;
    private javax.swing.JFormattedTextField frmtTextFieldNumeroPrimarioCliente;
    private javax.swing.JFormattedTextField frmtTextFieldNumeroSecundarioCliente;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelCPFCliente;
    private javax.swing.JLabel labelComplementoCliente;
    private javax.swing.JLabel labelDataNascimentoCliente;
    private javax.swing.JLabel labelEmailCliente;
    private javax.swing.JLabel labelEnderecoCliente;
    private javax.swing.JLabel labelEstadoCivilCliente;
    private javax.swing.JLabel labelGeneroCliente;
    private javax.swing.JLabel labelNomeCliente;
    private javax.swing.JLabel labelNumeroEnderecoCliente;
    private javax.swing.JLabel labelNumeroPCliente;
    private javax.swing.JLabel labelNumeroSCliente;
    private javax.swing.JPanel panelAcoesCliente;
    private javax.swing.JPanel panelDadosCobrancaCliente;
    private javax.swing.JPanel panelDadosPessoaisCliente;
    private javax.swing.JTextField textFieldComplementoCliente;
    private javax.swing.JTextField textFieldEmailCliente;
    private javax.swing.JTextField textFieldEnderecoCliente;
    private javax.swing.JTextField textFieldNomeCliente;
    private javax.swing.JTextField textFieldNumeroEnderecoCliente;
    // End of variables declaration//GEN-END:variables

    public void ExibirMensagem(String mensagem) {
        JOptionPane.showMessageDialog(null, mensagem);
    }
}
