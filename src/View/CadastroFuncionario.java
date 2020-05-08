package View;

import Utils.Validador;
import javax.swing.JOptionPane;

/**
 * @author Gustavo Santos
 */
public class CadastroFuncionario extends javax.swing.JInternalFrame {

    public CadastroFuncionario() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelGeral = new javax.swing.JPanel();
        panelDadosFuncionario = new javax.swing.JPanel();
        labelNomeFuncionario = new javax.swing.JLabel();
        textFieldNomeFuncionario = new javax.swing.JTextField();
        labelCpfFuncionario = new javax.swing.JLabel();
        frmtCpfFuncionario = new javax.swing.JFormattedTextField();
        labelEmailFuncionario = new javax.swing.JLabel();
        textFieldEmailFuncionario = new javax.swing.JTextField();
        labelGeneroFuncionario = new javax.swing.JLabel();
        comboBoxoGeneroFuncionario = new javax.swing.JComboBox<>();
        LabelDataNascimentoFuncionario = new javax.swing.JLabel();
        frmtDataNascimentoFuncionario = new javax.swing.JFormattedTextField();
        panelCargo = new javax.swing.JPanel();
        labelCargoFuncionario = new javax.swing.JLabel();
        comboBoxCargoFuncionario = new javax.swing.JComboBox<>();
        buttonGerCargoCadFuncionario = new javax.swing.JButton();
        panelAcoesCadastroFuncionario = new javax.swing.JPanel();
        buttonCadastrarFuncionario = new javax.swing.JButton();
        buttonCancelarCadastroFuncionario = new javax.swing.JButton();
        LabelCamposObrigatorioCliente = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Cadastro de Funcionários");

        panelGeral.setBackground(new java.awt.Color(255, 255, 255));

        panelDadosFuncionario.setBackground(new java.awt.Color(255, 255, 255));
        panelDadosFuncionario.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados do Funcionário"));

        labelNomeFuncionario.setText("NOME *");

        labelCpfFuncionario.setText("CPF *");

        try {
            frmtCpfFuncionario.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        frmtCpfFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frmtCpfFuncionarioActionPerformed(evt);
            }
        });

        labelEmailFuncionario.setText("E-MAIL *");

        labelGeneroFuncionario.setText("GÊNERO *");

        comboBoxoGeneroFuncionario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione -", "Feminino", "Masculino", "Outros" }));

        LabelDataNascimentoFuncionario.setText("DATA DE NASCIMENTO *");

        frmtDataNascimentoFuncionario.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/yyyy"))));

        javax.swing.GroupLayout panelDadosFuncionarioLayout = new javax.swing.GroupLayout(panelDadosFuncionario);
        panelDadosFuncionario.setLayout(panelDadosFuncionarioLayout);
        panelDadosFuncionarioLayout.setHorizontalGroup(
            panelDadosFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDadosFuncionarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDadosFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(textFieldNomeFuncionario, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelDadosFuncionarioLayout.createSequentialGroup()
                        .addComponent(labelNomeFuncionario)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelDadosFuncionarioLayout.createSequentialGroup()
                        .addGroup(panelDadosFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textFieldEmailFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelEmailFuncionario))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelDadosFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelDadosFuncionarioLayout.createSequentialGroup()
                                .addComponent(labelGeneroFuncionario)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(comboBoxoGeneroFuncionario, 0, 222, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDadosFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(frmtCpfFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                    .addComponent(labelCpfFuncionario)
                    .addComponent(LabelDataNascimentoFuncionario)
                    .addComponent(frmtDataNascimentoFuncionario))
                .addContainerGap())
        );
        panelDadosFuncionarioLayout.setVerticalGroup(
            panelDadosFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDadosFuncionarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDadosFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNomeFuncionario)
                    .addComponent(labelCpfFuncionario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDadosFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(textFieldNomeFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(frmtCpfFuncionario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelDadosFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelEmailFuncionario)
                    .addComponent(labelGeneroFuncionario)
                    .addComponent(LabelDataNascimentoFuncionario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDadosFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelDadosFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(textFieldEmailFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(comboBoxoGeneroFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(frmtDataNascimentoFuncionario))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        panelCargo.setBackground(new java.awt.Color(255, 255, 255));
        panelCargo.setBorder(javax.swing.BorderFactory.createTitledBorder("Nível de ocupação"));

        labelCargoFuncionario.setText("OCUPAÇÃO *");

        comboBoxCargoFuncionario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione -", "Gerente", "Supervisor", "Vendedor" }));

        buttonGerCargoCadFuncionario.setText("EDITAR");
        buttonGerCargoCadFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGerCargoCadFuncionarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelCargoLayout = new javax.swing.GroupLayout(panelCargo);
        panelCargo.setLayout(panelCargoLayout);
        panelCargoLayout.setHorizontalGroup(
            panelCargoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCargoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCargoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelCargoFuncionario)
                    .addGroup(panelCargoLayout.createSequentialGroup()
                        .addComponent(comboBoxCargoFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonGerCargoCadFuncionario)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelCargoLayout.setVerticalGroup(
            panelCargoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCargoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelCargoFuncionario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelCargoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(buttonGerCargoCadFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(comboBoxCargoFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        panelAcoesCadastroFuncionario.setBackground(new java.awt.Color(255, 255, 255));

        buttonCadastrarFuncionario.setText("ENVIAR");
        buttonCadastrarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCadastrarFuncionarioActionPerformed(evt);
            }
        });

        buttonCancelarCadastroFuncionario.setText("CANCELAR");

        javax.swing.GroupLayout panelAcoesCadastroFuncionarioLayout = new javax.swing.GroupLayout(panelAcoesCadastroFuncionario);
        panelAcoesCadastroFuncionario.setLayout(panelAcoesCadastroFuncionarioLayout);
        panelAcoesCadastroFuncionarioLayout.setHorizontalGroup(
            panelAcoesCadastroFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAcoesCadastroFuncionarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelCamposObrigatorioCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonCancelarCadastroFuncionario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonCadastrarFuncionario)
                .addContainerGap())
        );
        panelAcoesCadastroFuncionarioLayout.setVerticalGroup(
            panelAcoesCadastroFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAcoesCadastroFuncionarioLayout.createSequentialGroup()
                .addContainerGap(62, Short.MAX_VALUE)
                .addGroup(panelAcoesCadastroFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonCadastrarFuncionario)
                    .addComponent(buttonCancelarCadastroFuncionario)
                    .addComponent(LabelCamposObrigatorioCliente))
                .addContainerGap())
        );

        javax.swing.GroupLayout panelGeralLayout = new javax.swing.GroupLayout(panelGeral);
        panelGeral.setLayout(panelGeralLayout);
        panelGeralLayout.setHorizontalGroup(
            panelGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGeralLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelDadosFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelCargo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelAcoesCadastroFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelGeralLayout.setVerticalGroup(
            panelGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGeralLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelDadosFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addComponent(panelAcoesCadastroFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelGeral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelGeral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonGerCargoCadFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGerCargoCadFuncionarioActionPerformed
        GerenciarCargosFuncionario gerenciarCargosFuncionario = new GerenciarCargosFuncionario();
        gerenciarCargosFuncionario.setVisible(true);
    }//GEN-LAST:event_buttonGerCargoCadFuncionarioActionPerformed

    private void frmtCpfFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frmtCpfFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_frmtCpfFuncionarioActionPerformed

    private void buttonCadastrarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCadastrarFuncionarioActionPerformed
        Validador validador = new Validador();
        try {
            validador.ValidarCampoVazioSimples(textFieldNomeFuncionario, labelNomeFuncionario, LabelCamposObrigatorioCliente);
            validador.ValidarCampoVazioSimples(textFieldEmailFuncionario, labelEmailFuncionario, LabelCamposObrigatorioCliente);
            validador.ValidarComboBox(comboBoxoGeneroFuncionario, labelGeneroFuncionario, LabelCamposObrigatorioCliente);
            validador.ValidarComboBox(comboBoxCargoFuncionario, labelCargoFuncionario, LabelCamposObrigatorioCliente);
        }
        catch(IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, "Não é possível cadastrar, campos obrigatórios não foram preenchidos.");
        }
    }//GEN-LAST:event_buttonCadastrarFuncionarioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelCamposObrigatorioCliente;
    private javax.swing.JLabel LabelDataNascimentoFuncionario;
    private javax.swing.JButton buttonCadastrarFuncionario;
    private javax.swing.JButton buttonCancelarCadastroFuncionario;
    private javax.swing.JButton buttonGerCargoCadFuncionario;
    private javax.swing.JComboBox<String> comboBoxCargoFuncionario;
    private javax.swing.JComboBox<String> comboBoxoGeneroFuncionario;
    private javax.swing.JFormattedTextField frmtCpfFuncionario;
    private javax.swing.JFormattedTextField frmtDataNascimentoFuncionario;
    private javax.swing.JLabel labelCargoFuncionario;
    private javax.swing.JLabel labelCpfFuncionario;
    private javax.swing.JLabel labelEmailFuncionario;
    private javax.swing.JLabel labelGeneroFuncionario;
    private javax.swing.JLabel labelNomeFuncionario;
    private javax.swing.JPanel panelAcoesCadastroFuncionario;
    private javax.swing.JPanel panelCargo;
    private javax.swing.JPanel panelDadosFuncionario;
    private javax.swing.JPanel panelGeral;
    private javax.swing.JTextField textFieldEmailFuncionario;
    private javax.swing.JTextField textFieldNomeFuncionario;
    // End of variables declaration//GEN-END:variables
}
