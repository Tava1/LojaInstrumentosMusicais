package View;

import Utils.Validador;
import Controller.ClienteController;
import Model.Cliente;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import Controller.ProdutoController;

/**
 * @author Gustavo Santos
 */
public class GerarPedido extends javax.swing.JInternalFrame {

    public static Validador validador = new Validador();

    public GerarPedido() {
        initComponents();
        ProdutoController.buscarProdutos(tableEstanteProdutosPedidos);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        panelPedido = new javax.swing.JPanel();
        panelEstante = new javax.swing.JPanel();
        labelCpfClientePedido = new javax.swing.JLabel();
        frmtTextCpfClientePedido = new javax.swing.JFormattedTextField();
        scrollPaneEstanteProdutosPedidos = new javax.swing.JScrollPane();
        tableEstanteProdutosPedidos = new javax.swing.JTable();
        buttonBuscarProdutoPedido = new javax.swing.JButton();
        textFieldCodigoProdutoPedido = new javax.swing.JTextField();
        labelCodidoProdutoPedido = new javax.swing.JLabel();
        textFieldNomeCliente = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        buscarClientePedido = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        textFieldModeloProdutoPedido = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        textFieldMarcaProdutoPedido = new javax.swing.JTextField();
        buttonAdicionarItemPedido = new javax.swing.JButton();
        panelCarrinhoPedido = new javax.swing.JPanel();
        scrollPaneCarrinhoPedido = new javax.swing.JScrollPane();
        tableCarrinhoPedido = new javax.swing.JTable();
        labelTotalPedido = new javax.swing.JLabel();
        textFieldTotalPedido = new javax.swing.JTextField();
        labelDescontoPedido = new javax.swing.JLabel();
        textFieldAplicarDescontoPedido = new javax.swing.JTextField();
        buttonFinalizarPedido = new javax.swing.JButton();
        buttonCancelarPedido = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Gerar Venda");

        panelPedido.setBackground(new java.awt.Color(255, 255, 255));

        panelEstante.setBackground(new java.awt.Color(255, 255, 255));
        panelEstante.setBorder(javax.swing.BorderFactory.createTitledBorder("Estante"));

        labelCpfClientePedido.setText("CPF DO CLIENTE *");

        try {
            frmtTextCpfClientePedido.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        tableEstanteProdutosPedidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID do Produto", "Marca", "Modelo", "Descrição", "Preço Un"
            }
        ));
        scrollPaneEstanteProdutosPedidos.setViewportView(tableEstanteProdutosPedidos);

        buttonBuscarProdutoPedido.setText("BUSCAR");
        buttonBuscarProdutoPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBuscarProdutoPedidoActionPerformed(evt);
            }
        });

        labelCodidoProdutoPedido.setText("CODIGO DO PRODUTO");

        textFieldNomeCliente.setEnabled(false);

        jLabel1.setText("NOME DO CLIENTE");

        buscarClientePedido.setText("BUSCAR");
        buscarClientePedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarClientePedidoActionPerformed(evt);
            }
        });

        jLabel2.setText("MODELO");

        jLabel3.setText("MARCA");

        buttonAdicionarItemPedido.setText("ADICIONAR AO CARRINHO");
        buttonAdicionarItemPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAdicionarItemPedidoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelEstanteLayout = new javax.swing.GroupLayout(panelEstante);
        panelEstante.setLayout(panelEstanteLayout);
        panelEstanteLayout.setHorizontalGroup(
            panelEstanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEstanteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelEstanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelEstanteLayout.createSequentialGroup()
                        .addComponent(labelCpfClientePedido)
                        .addGap(56, 56, 56)
                        .addComponent(jLabel1)
                        .addGap(752, 752, 752))
                    .addGroup(panelEstanteLayout.createSequentialGroup()
                        .addGroup(panelEstanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(scrollPaneEstanteProdutosPedidos)
                            .addGroup(panelEstanteLayout.createSequentialGroup()
                                .addGroup(panelEstanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(frmtTextCpfClientePedido, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                    .addComponent(labelCodidoProdutoPedido)
                                    .addComponent(textFieldCodigoProdutoPedido))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelEstanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelEstanteLayout.createSequentialGroup()
                                        .addGroup(panelEstanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(textFieldMarcaProdutoPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(panelEstanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addGroup(panelEstanteLayout.createSequentialGroup()
                                                .addComponent(textFieldModeloProdutoPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(buttonBuscarProdutoPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(panelEstanteLayout.createSequentialGroup()
                                        .addComponent(textFieldNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 725, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(buscarClientePedido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEstanteLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonAdicionarItemPedido)
                .addContainerGap())
        );
        panelEstanteLayout.setVerticalGroup(
            panelEstanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEstanteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelEstanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCpfClientePedido)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEstanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(frmtTextCpfClientePedido, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscarClientePedido, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelEstanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCodidoProdutoPedido)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEstanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(textFieldCodigoProdutoPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelEstanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(textFieldMarcaProdutoPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(textFieldModeloProdutoPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(buttonBuscarProdutoPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addComponent(scrollPaneEstanteProdutosPedidos, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(buttonAdicionarItemPedido)
                .addContainerGap())
        );

        panelCarrinhoPedido.setBackground(new java.awt.Color(255, 255, 255));
        panelCarrinhoPedido.setBorder(javax.swing.BorderFactory.createTitledBorder("Carrinho"));

        tableCarrinhoPedido.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID do Produto", "Marca", "Modelo", "Descrição", "Quantidade", "Preço Un"
            }
        ));
        scrollPaneCarrinhoPedido.setViewportView(tableCarrinhoPedido);

        labelTotalPedido.setText("TOTAL");

        textFieldTotalPedido.setEnabled(false);

        labelDescontoPedido.setText("DESCONTO");

        buttonFinalizarPedido.setText("FINALIZAR PEDIDO");
        buttonFinalizarPedido.setEnabled(false);
        buttonFinalizarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonFinalizarPedidoActionPerformed(evt);
            }
        });

        buttonCancelarPedido.setText("CANCELAR");

        jButton2.setText("DELETAR ITEM");

        javax.swing.GroupLayout panelCarrinhoPedidoLayout = new javax.swing.GroupLayout(panelCarrinhoPedido);
        panelCarrinhoPedido.setLayout(panelCarrinhoPedidoLayout);
        panelCarrinhoPedidoLayout.setHorizontalGroup(
            panelCarrinhoPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCarrinhoPedidoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCarrinhoPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollPaneCarrinhoPedido, javax.swing.GroupLayout.DEFAULT_SIZE, 1065, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCarrinhoPedidoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(panelCarrinhoPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCarrinhoPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCarrinhoPedidoLayout.createSequentialGroup()
                                    .addGroup(panelCarrinhoPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(textFieldAplicarDescontoPedido)
                                        .addGroup(panelCarrinhoPedidoLayout.createSequentialGroup()
                                            .addComponent(labelDescontoPedido)
                                            .addGap(0, 0, Short.MAX_VALUE)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(panelCarrinhoPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(textFieldTotalPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(labelTotalPedido)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCarrinhoPedidoLayout.createSequentialGroup()
                                    .addComponent(buttonCancelarPedido)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(buttonFinalizarPedido)))
                            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        panelCarrinhoPedidoLayout.setVerticalGroup(
            panelCarrinhoPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCarrinhoPedidoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollPaneCarrinhoPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(panelCarrinhoPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCarrinhoPedidoLayout.createSequentialGroup()
                        .addComponent(labelTotalPedido)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textFieldTotalPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelCarrinhoPedidoLayout.createSequentialGroup()
                        .addComponent(labelDescontoPedido)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textFieldAplicarDescontoPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelCarrinhoPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonFinalizarPedido)
                    .addComponent(buttonCancelarPedido))
                .addContainerGap())
        );

        javax.swing.GroupLayout panelPedidoLayout = new javax.swing.GroupLayout(panelPedido);
        panelPedido.setLayout(panelPedidoLayout);
        panelPedidoLayout.setHorizontalGroup(
            panelPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPedidoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelEstante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelCarrinhoPedido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelPedidoLayout.setVerticalGroup(
            panelPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPedidoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelEstante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelCarrinhoPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPedido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPedido, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buscarClientePedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarClientePedidoActionPerformed
        
        String cpf = validador.ValidarCPF(frmtTextCpfClientePedido);
        
        if (!cpf.isEmpty()) {
            ArrayList<Cliente> listaCliente = ClienteController.buscarCliente(cpf);
        
            if(!listaCliente.isEmpty()) {
                // Preencher o campo nome com o cliente encontrado pelo CPF
                for (Cliente cliente : listaCliente) {
                    textFieldNomeCliente.setText(cliente.getNome());
                    
                } 
                buttonFinalizarPedido.setEnabled(true);
            }
            else {
                // TODO: levar ate a tela de cadastro de clientes
                JOptionPane.showMessageDialog(null, "Nenhum cliente foi encontrado com o CPF indicado.");
            }
        }
        else {
            JOptionPane.showMessageDialog(null, "Necessário preencher o campo CPF do cliente.");
        }
        
    }//GEN-LAST:event_buscarClientePedidoActionPerformed

    private void buttonFinalizarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonFinalizarPedidoActionPerformed
       
        String cpf = validador.ValidarCPF(frmtTextCpfClientePedido);
        
        if (!cpf.isEmpty()) {
            
        }
        else {
            JOptionPane.showMessageDialog(null, "Necessário preencher o campo CPF do cliente.");
        }
        
    }//GEN-LAST:event_buttonFinalizarPedidoActionPerformed

    private void buttonBuscarProdutoPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBuscarProdutoPedidoActionPerformed
        
        // Filtros de buscas por produtos
        String marca = textFieldMarcaProdutoPedido.getText();
        String modelo = textFieldModeloProdutoPedido.getText();

        if (!textFieldCodigoProdutoPedido.getText().isEmpty()) {
            int codigo  = Integer.parseInt(textFieldCodigoProdutoPedido.getText());
            // Limpa as caixas de textos que não serão usadas para este filtro.
            textFieldMarcaProdutoPedido.setText("");
            textFieldModeloProdutoPedido.setText("");
            ProdutoController.buscarProdutos(codigo, tableEstanteProdutosPedidos);
        }
        else if (!marca.isEmpty()) {
            
            ProdutoController.buscarProdutos(marca, tableEstanteProdutosPedidos);
        }
        else if (!modelo.isEmpty()) {
            ProdutoController.buscarProdutos(null, modelo, tableEstanteProdutosPedidos);
        } 
        else {
            ProdutoController.buscarProdutos(tableEstanteProdutosPedidos);
        }
        
        
    }//GEN-LAST:event_buttonBuscarProdutoPedidoActionPerformed

    private void buttonAdicionarItemPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAdicionarItemPedidoActionPerformed
        
        
    }//GEN-LAST:event_buttonAdicionarItemPedidoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscarClientePedido;
    private javax.swing.JButton buttonAdicionarItemPedido;
    private javax.swing.JButton buttonBuscarProdutoPedido;
    private javax.swing.JButton buttonCancelarPedido;
    private javax.swing.JButton buttonFinalizarPedido;
    private javax.swing.JFormattedTextField frmtTextCpfClientePedido;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel labelCodidoProdutoPedido;
    private javax.swing.JLabel labelCpfClientePedido;
    private javax.swing.JLabel labelDescontoPedido;
    private javax.swing.JLabel labelTotalPedido;
    private javax.swing.JPanel panelCarrinhoPedido;
    private javax.swing.JPanel panelEstante;
    private javax.swing.JPanel panelPedido;
    private javax.swing.JScrollPane scrollPaneCarrinhoPedido;
    private javax.swing.JScrollPane scrollPaneEstanteProdutosPedidos;
    private javax.swing.JTable tableCarrinhoPedido;
    private javax.swing.JTable tableEstanteProdutosPedidos;
    private javax.swing.JTextField textFieldAplicarDescontoPedido;
    private javax.swing.JTextField textFieldCodigoProdutoPedido;
    private javax.swing.JTextField textFieldMarcaProdutoPedido;
    private javax.swing.JTextField textFieldModeloProdutoPedido;
    private javax.swing.JTextField textFieldNomeCliente;
    private javax.swing.JTextField textFieldTotalPedido;
    // End of variables declaration//GEN-END:variables
}
