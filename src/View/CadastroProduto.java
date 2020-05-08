package View;

import Utils.Validador;
import javax.swing.JOptionPane;
/**
 * @author Gustavo Santos
 */
public class CadastroProduto extends javax.swing.JInternalFrame {

    public CadastroProduto() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelGeralCadastroProduto = new javax.swing.JPanel();
        panelFiltroProduto = new javax.swing.JPanel();
        labelCategoriaProduto = new javax.swing.JLabel();
        comboBoxCategoriaProduto = new javax.swing.JComboBox<>();
        labelTipoProduto = new javax.swing.JLabel();
        comboBoxTipoProduto = new javax.swing.JComboBox<>();
        panelCaracteristicasProduto = new javax.swing.JPanel();
        labelMarcaProduto = new javax.swing.JLabel();
        textFieldMarcaProduto = new javax.swing.JTextField();
        labelModeloProduto = new javax.swing.JLabel();
        textFieldModeloProduto = new javax.swing.JTextField();
        labelDescricaoProduto = new javax.swing.JLabel();
        scrollPaneDescricaoProduto = new javax.swing.JScrollPane();
        textPaneDescicaoProduto = new javax.swing.JTextPane();
        labelPrecoProduto = new javax.swing.JLabel();
        frmtPrecoProduto = new javax.swing.JFormattedTextField();
        panelAcoesCadProduto = new javax.swing.JPanel();
        buttonCadastrarProduto = new javax.swing.JButton();
        buttonCancelarCadastroProduto = new javax.swing.JButton();
        LabelCamposObrigatorioCliente = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Cadastro de Produtos");

        panelGeralCadastroProduto.setBackground(new java.awt.Color(255, 255, 255));

        panelFiltroProduto.setBackground(new java.awt.Color(255, 255, 255));
        panelFiltroProduto.setBorder(javax.swing.BorderFactory.createTitledBorder("Categoria e Tipo"));

        labelCategoriaProduto.setText("CATEGORIA *");

        comboBoxCategoriaProduto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione -", "Cordas", "Percussão" }));

        labelTipoProduto.setText("TIPO *");

        comboBoxTipoProduto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione -", "Violão", "Guitarra" }));

        javax.swing.GroupLayout panelFiltroProdutoLayout = new javax.swing.GroupLayout(panelFiltroProduto);
        panelFiltroProduto.setLayout(panelFiltroProdutoLayout);
        panelFiltroProdutoLayout.setHorizontalGroup(
            panelFiltroProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFiltroProdutoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelFiltroProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelCategoriaProduto)
                    .addComponent(comboBoxCategoriaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelFiltroProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelTipoProduto)
                    .addComponent(comboBoxTipoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelFiltroProdutoLayout.setVerticalGroup(
            panelFiltroProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFiltroProdutoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelFiltroProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCategoriaProduto)
                    .addComponent(labelTipoProduto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelFiltroProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBoxCategoriaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxTipoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        panelCaracteristicasProduto.setBackground(new java.awt.Color(255, 255, 255));
        panelCaracteristicasProduto.setBorder(javax.swing.BorderFactory.createTitledBorder("Especificações do Produto"));

        labelMarcaProduto.setText("MARCA *");

        labelModeloProduto.setText("MODELO *");

        labelDescricaoProduto.setText("DESCRIÇÃO *");

        scrollPaneDescricaoProduto.setViewportView(textPaneDescicaoProduto);

        labelPrecoProduto.setText("PREÇO *");

        javax.swing.GroupLayout panelCaracteristicasProdutoLayout = new javax.swing.GroupLayout(panelCaracteristicasProduto);
        panelCaracteristicasProduto.setLayout(panelCaracteristicasProdutoLayout);
        panelCaracteristicasProdutoLayout.setHorizontalGroup(
            panelCaracteristicasProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCaracteristicasProdutoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCaracteristicasProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollPaneDescricaoProduto)
                    .addGroup(panelCaracteristicasProdutoLayout.createSequentialGroup()
                        .addGroup(panelCaracteristicasProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelCaracteristicasProdutoLayout.createSequentialGroup()
                                .addGroup(panelCaracteristicasProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelMarcaProduto)
                                    .addComponent(textFieldMarcaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelCaracteristicasProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textFieldModeloProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelModeloProduto)))
                            .addComponent(labelDescricaoProduto))
                        .addGap(0, 390, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCaracteristicasProdutoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(panelCaracteristicasProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelPrecoProduto)
                            .addComponent(frmtPrecoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        panelCaracteristicasProdutoLayout.setVerticalGroup(
            panelCaracteristicasProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCaracteristicasProdutoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCaracteristicasProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelMarcaProduto)
                    .addComponent(labelModeloProduto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelCaracteristicasProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldMarcaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldModeloProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelDescricaoProduto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollPaneDescricaoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelPrecoProduto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(frmtPrecoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelAcoesCadProduto.setBackground(new java.awt.Color(255, 255, 255));

        buttonCadastrarProduto.setText("ENVIAR");
        buttonCadastrarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCadastrarProdutoActionPerformed(evt);
            }
        });

        buttonCancelarCadastroProduto.setText("CANCELAR");

        javax.swing.GroupLayout panelAcoesCadProdutoLayout = new javax.swing.GroupLayout(panelAcoesCadProduto);
        panelAcoesCadProduto.setLayout(panelAcoesCadProdutoLayout);
        panelAcoesCadProdutoLayout.setHorizontalGroup(
            panelAcoesCadProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAcoesCadProdutoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelCamposObrigatorioCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonCancelarCadastroProduto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonCadastrarProduto)
                .addContainerGap())
        );
        panelAcoesCadProdutoLayout.setVerticalGroup(
            panelAcoesCadProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAcoesCadProdutoLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(panelAcoesCadProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonCadastrarProduto)
                    .addComponent(buttonCancelarCadastroProduto)
                    .addComponent(LabelCamposObrigatorioCliente))
                .addContainerGap())
        );

        javax.swing.GroupLayout panelGeralCadastroProdutoLayout = new javax.swing.GroupLayout(panelGeralCadastroProduto);
        panelGeralCadastroProduto.setLayout(panelGeralCadastroProdutoLayout);
        panelGeralCadastroProdutoLayout.setHorizontalGroup(
            panelGeralCadastroProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGeralCadastroProdutoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelGeralCadastroProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelFiltroProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelCaracteristicasProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelAcoesCadProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelGeralCadastroProdutoLayout.setVerticalGroup(
            panelGeralCadastroProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGeralCadastroProdutoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelFiltroProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelCaracteristicasProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelAcoesCadProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelGeralCadastroProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelGeralCadastroProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonCadastrarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCadastrarProdutoActionPerformed
        Validador validador = new Validador();
        
        try {
            validador.ValidarComboBox(comboBoxCategoriaProduto, labelCategoriaProduto, LabelCamposObrigatorioCliente);
            validador.ValidarComboBox(comboBoxTipoProduto, labelTipoProduto, LabelCamposObrigatorioCliente);
            validador.ValidarCampoVazioSimples(textFieldMarcaProduto, labelMarcaProduto, LabelCamposObrigatorioCliente);
            validador.ValidarCampoVazioSimples(textFieldModeloProduto, labelModeloProduto, LabelCamposObrigatorioCliente);
            validador.ValidarCampoVazioSimples(textPaneDescicaoProduto, labelDescricaoProduto, LabelCamposObrigatorioCliente);
        }
        catch(IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, "Não é possível cadastrar, campos obrigatórios não foram preenchidos.");
        }
    }//GEN-LAST:event_buttonCadastrarProdutoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelCamposObrigatorioCliente;
    private javax.swing.JButton buttonCadastrarProduto;
    private javax.swing.JButton buttonCancelarCadastroProduto;
    private javax.swing.JComboBox<String> comboBoxCategoriaProduto;
    private javax.swing.JComboBox<String> comboBoxTipoProduto;
    private javax.swing.JFormattedTextField frmtPrecoProduto;
    private javax.swing.JLabel labelCategoriaProduto;
    private javax.swing.JLabel labelDescricaoProduto;
    private javax.swing.JLabel labelMarcaProduto;
    private javax.swing.JLabel labelModeloProduto;
    private javax.swing.JLabel labelPrecoProduto;
    private javax.swing.JLabel labelTipoProduto;
    private javax.swing.JPanel panelAcoesCadProduto;
    private javax.swing.JPanel panelCaracteristicasProduto;
    private javax.swing.JPanel panelFiltroProduto;
    private javax.swing.JPanel panelGeralCadastroProduto;
    private javax.swing.JScrollPane scrollPaneDescricaoProduto;
    private javax.swing.JTextField textFieldMarcaProduto;
    private javax.swing.JTextField textFieldModeloProduto;
    private javax.swing.JTextPane textPaneDescicaoProduto;
    // End of variables declaration//GEN-END:variables
}
