package View;

import Utils.Validador;
import javax.swing.JOptionPane;
import Controller.ProdutoController;
/**
 * @author Gustavo Santos
 */
public class CadastroProduto extends javax.swing.JInternalFrame {

    public static Validador validador = new Validador();

    public CadastroProduto() {
        initComponents();
        // Carregar o combobox com as categorias
        // Carregar o combobox com os tipos
        ProdutoController.buscarProdutos(tableProdutos);
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
        textFieldQuantidadeEstoque = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        panelAcoesCadProduto = new javax.swing.JPanel();
        buttonCadastrarProduto = new javax.swing.JButton();
        buttonCancelarCadastroProduto = new javax.swing.JButton();
        LabelCamposObrigatorioCliente = new javax.swing.JLabel();
        buttonDeletarProduto = new javax.swing.JButton();
        buttonSalvarAlteracaoProduto = new javax.swing.JToggleButton();
        buttonSelecionarProduto = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableProdutos = new javax.swing.JTable();

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelCaracteristicasProduto.setBackground(new java.awt.Color(255, 255, 255));
        panelCaracteristicasProduto.setBorder(javax.swing.BorderFactory.createTitledBorder("Especificações do Produto"));

        labelMarcaProduto.setText("MARCA *");

        labelModeloProduto.setText("MODELO *");

        labelDescricaoProduto.setText("DESCRIÇÃO *");

        scrollPaneDescricaoProduto.setViewportView(textPaneDescicaoProduto);

        labelPrecoProduto.setText("PREÇO *");

        frmtPrecoProduto.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));

        jLabel1.setText("QUANDTIDADE *");

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
                                    .addComponent(labelModeloProduto)
                                    .addComponent(textFieldModeloProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(labelDescricaoProduto))
                        .addGap(0, 390, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCaracteristicasProdutoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(panelCaracteristicasProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textFieldQuantidadeEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                .addComponent(scrollPaneDescricaoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelCaracteristicasProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPrecoProduto)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelCaracteristicasProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textFieldQuantidadeEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(frmtPrecoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        panelAcoesCadProduto.setBackground(new java.awt.Color(51, 153, 255));

        buttonCadastrarProduto.setText("ENVIAR");
        buttonCadastrarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCadastrarProdutoActionPerformed(evt);
            }
        });

        buttonCancelarCadastroProduto.setText("CANCELAR");

        buttonDeletarProduto.setText("DELETAR");
        buttonDeletarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDeletarProdutoActionPerformed(evt);
            }
        });

        buttonSalvarAlteracaoProduto.setText("SALVAR");
        buttonSalvarAlteracaoProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSalvarAlteracaoProdutoActionPerformed(evt);
            }
        });

        buttonSelecionarProduto.setText("SELECIONAR");
        buttonSelecionarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSelecionarProdutoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelAcoesCadProdutoLayout = new javax.swing.GroupLayout(panelAcoesCadProduto);
        panelAcoesCadProduto.setLayout(panelAcoesCadProdutoLayout);
        panelAcoesCadProdutoLayout.setHorizontalGroup(
            panelAcoesCadProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAcoesCadProdutoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelAcoesCadProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAcoesCadProdutoLayout.createSequentialGroup()
                        .addComponent(LabelCamposObrigatorioCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 683, Short.MAX_VALUE)
                        .addComponent(buttonCancelarCadastroProduto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonCadastrarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelAcoesCadProdutoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(buttonSelecionarProduto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonDeletarProduto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonSalvarAlteracaoProduto)))
                .addContainerGap())
        );
        panelAcoesCadProdutoLayout.setVerticalGroup(
            panelAcoesCadProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAcoesCadProdutoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelAcoesCadProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonDeletarProduto)
                    .addComponent(buttonSalvarAlteracaoProduto)
                    .addComponent(buttonSelecionarProduto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelAcoesCadProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonCadastrarProduto)
                    .addComponent(buttonCancelarCadastroProduto)
                    .addComponent(LabelCamposObrigatorioCliente))
                .addContainerGap())
        );

        tableProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID Produto", "Marca", "Modelo", "Descrição", "Preço", "Estoque", "Categoria", "Tipo"
            }
        ));
        jScrollPane1.setViewportView(tableProdutos);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(248, 248, 248))
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
                    .addComponent(panelAcoesCadProduto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelGeralCadastroProdutoLayout.setVerticalGroup(
            panelGeralCadastroProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGeralCadastroProdutoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelFiltroProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelCaracteristicasProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelAcoesCadProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        try {
            validador.ValidarComboBox(comboBoxCategoriaProduto, labelCategoriaProduto, LabelCamposObrigatorioCliente);
            validador.ValidarComboBox(comboBoxTipoProduto, labelTipoProduto, LabelCamposObrigatorioCliente);
            validador.ValidarCampoVazioSimples(textFieldMarcaProduto, labelMarcaProduto, LabelCamposObrigatorioCliente);
            validador.ValidarCampoVazioSimples(textFieldModeloProduto, labelModeloProduto, LabelCamposObrigatorioCliente);
            validador.ValidarCampoVazioSimples(textPaneDescicaoProduto, labelDescricaoProduto, LabelCamposObrigatorioCliente);
            // TODO VALIDAR DECIMAL, PRECO
            Double preco = validador.validarDouble(frmtPrecoProduto);
            // TODO VALIDAR NUMERICO, QUANTIDADE
            int quantidadeEstoque = Integer.parseInt(textFieldQuantidadeEstoque.getText());
            
            // Grava o produto na base
            boolean retorno = ProdutoController.criarProduto(textFieldMarcaProduto.getText(), textFieldModeloProduto.getText(), textPaneDescicaoProduto.getText(), preco, quantidadeEstoque, comboBoxTipoProduto.getSelectedIndex());
            
            if (retorno) {
                JOptionPane.showMessageDialog(null, "Produto gravado com sucesso");
                ProdutoController.buscarProdutos(tableProdutos); // recarregar o jTable
            } 
            else {
                JOptionPane.showMessageDialog(null, "NÃ£o foi possÃ­vel gravar o produto em questÃ£o.");
            }
        }
        catch(IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, "NÃ£o Ã© possÃ­vel cadastrar, campos obrigatÃ³rios nÃ£o foram preenchidos.");
        }
    }//GEN-LAST:event_buttonCadastrarProdutoActionPerformed

    private void buttonDeletarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDeletarProdutoActionPerformed
        if (tableProdutos.getRowCount() > 0) {
            int linhaSelecionada = tableProdutos.getSelectedRow();
            int idProduto = Integer.parseInt(tableProdutos.getModel().getValueAt(linhaSelecionada, 0).toString());
            
            if (ProdutoController.deletarProduto(idProduto)) {
                ProdutoController.buscarProdutos(tableProdutos);
                JOptionPane.showMessageDialog(null, "Produto Deletado com sucesso!");
            }
            else {
                ProdutoController.buscarProdutos(tableProdutos);
                JOptionPane.showMessageDialog(null, "Houve algum problema ao deletar cliente, tente novamente.");
            }
        }
    }//GEN-LAST:event_buttonDeletarProdutoActionPerformed

    private void buttonSelecionarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSelecionarProdutoActionPerformed
        int linhaSelecionada = tableProdutos.getSelectedRow();
        
        if (tableProdutos.getRowCount() > 0) {
            
            int idProduto = Integer.parseInt(tableProdutos.getModel().getValueAt(linhaSelecionada, 0).toString());
            String marca = tableProdutos.getModel().getValueAt(linhaSelecionada, 1).toString();
            String modelo = tableProdutos.getModel().getValueAt(linhaSelecionada, 2).toString();
            String descricao = tableProdutos.getModel().getValueAt(linhaSelecionada, 3).toString();
            Double preco = Double.parseDouble(tableProdutos.getModel().getValueAt(linhaSelecionada, 4).toString());
            int quantidadeEstoque = Integer.parseInt(tableProdutos.getModel().getValueAt(linhaSelecionada, 5).toString()); 
            //int categoria = Integer.parseInt(tableProdutos.getModel().getValueAt(linhaSelecionada, 6).toString());
            int tipo = Integer.parseInt(tableProdutos.getModel().getValueAt(linhaSelecionada, 6).toString());
        
            textFieldMarcaProduto.setText(marca);
            textFieldModeloProduto.setText(modelo);
            textPaneDescicaoProduto.setText(descricao);
            frmtPrecoProduto.setText(preco.toString());
            textFieldQuantidadeEstoque.setText(Integer.toString(quantidadeEstoque));
            comboBoxTipoProduto.setSelectedIndex(tipo);
        }
    }//GEN-LAST:event_buttonSelecionarProdutoActionPerformed

    private void buttonSalvarAlteracaoProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalvarAlteracaoProdutoActionPerformed
        int linhaSelecionada = tableProdutos.getSelectedRow();
        
        if (tableProdutos.getRowCount() > 0) {
            
            int idProduto = Integer.parseInt(tableProdutos.getModel().getValueAt(linhaSelecionada, 0).toString());
            String marca = textFieldMarcaProduto.getText();
            String modelo = textFieldModeloProduto.getText();
            String descricao = textPaneDescicaoProduto.getText();
            Double preco = Double.parseDouble(frmtPrecoProduto.getText());
            int quantidadeEstoque = Integer.parseInt(textFieldQuantidadeEstoque.getText()); 
            //int categoria = Integer.parseInt(tableProdutos.getModel().getValueAt(linhaSelecionada, 6).toString());
            int tipo = comboBoxTipoProduto.getSelectedIndex();
        
            boolean retorno = ProdutoController.alterarProduto(idProduto, marca, modelo, descricao, preco, quantidadeEstoque, tipo);

            if (retorno) {
                JOptionPane.showMessageDialog(null, "Produto aleterado com sucesso.");
                ProdutoController.buscarProdutos(tableProdutos); // recarregar o jTable
            } 
            else {
                JOptionPane.showMessageDialog(null, "NÃ£o foi possÃ­vel alterar o produto em questÃ£o.");
            }
        }
    }//GEN-LAST:event_buttonSalvarAlteracaoProdutoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelCamposObrigatorioCliente;
    private javax.swing.JButton buttonCadastrarProduto;
    private javax.swing.JButton buttonCancelarCadastroProduto;
    private javax.swing.JButton buttonDeletarProduto;
    private javax.swing.JToggleButton buttonSalvarAlteracaoProduto;
    private javax.swing.JButton buttonSelecionarProduto;
    private javax.swing.JComboBox<String> comboBoxCategoriaProduto;
    private javax.swing.JComboBox<String> comboBoxTipoProduto;
    private javax.swing.JFormattedTextField frmtPrecoProduto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
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
    private javax.swing.JTable tableProdutos;
    private javax.swing.JTextField textFieldMarcaProduto;
    private javax.swing.JTextField textFieldModeloProduto;
    private javax.swing.JTextField textFieldQuantidadeEstoque;
    private javax.swing.JTextPane textPaneDescicaoProduto;
    // End of variables declaration//GEN-END:variables
}
