package View;

import javax.swing.JDesktopPane;

/**
 * @author Gustavo Santos
 */
public class FormMenuPrincipal extends javax.swing.JFrame {

    public FormMenuPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMenuPrincipal = new javax.swing.JPanel();
        DesktopPaneMenuPrincipal = new javax.swing.JDesktopPane();
        labelIdFuncionarioLogado = new javax.swing.JLabel();
        labelNomeFuncionarioLogado = new javax.swing.JLabel();
        formMenuPrincipalMenuBar = new javax.swing.JMenuBar();
        menuOrcamento = new javax.swing.JMenu();
        menuItemGerarPedido = new javax.swing.JMenuItem();
        menuGerenciar = new javax.swing.JMenu();
        menuGerenciarCliente = new javax.swing.JMenu();
        menuItemNovoCliente = new javax.swing.JMenuItem();
        menuItemCACliente = new javax.swing.JMenuItem();
        menuGerenciarFuncionario = new javax.swing.JMenu();
        menuItemNovoFuncionario = new javax.swing.JMenuItem();
        menuItemCAFuncionario = new javax.swing.JMenuItem();
        menuGerenciarProduto = new javax.swing.JMenu();
        menuItemNovoProduto = new javax.swing.JMenuItem();
        menuRelatorio = new javax.swing.JMenu();
        menuItemRelatorios = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu Principal");
        setResizable(false);
        setSize(new java.awt.Dimension(944, 577));

        panelMenuPrincipal.setBackground(new java.awt.Color(51, 51, 51));

        DesktopPaneMenuPrincipal.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout DesktopPaneMenuPrincipalLayout = new javax.swing.GroupLayout(DesktopPaneMenuPrincipal);
        DesktopPaneMenuPrincipal.setLayout(DesktopPaneMenuPrincipalLayout);
        DesktopPaneMenuPrincipalLayout.setHorizontalGroup(
            DesktopPaneMenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        DesktopPaneMenuPrincipalLayout.setVerticalGroup(
            DesktopPaneMenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 693, Short.MAX_VALUE)
        );

        labelIdFuncionarioLogado.setBackground(new java.awt.Color(255, 255, 255));
        labelIdFuncionarioLogado.setForeground(new java.awt.Color(255, 255, 255));
        labelIdFuncionarioLogado.setText("#");

        labelNomeFuncionarioLogado.setForeground(new java.awt.Color(255, 255, 255));
        labelNomeFuncionarioLogado.setText(".");

        javax.swing.GroupLayout panelMenuPrincipalLayout = new javax.swing.GroupLayout(panelMenuPrincipal);
        panelMenuPrincipal.setLayout(panelMenuPrincipalLayout);
        panelMenuPrincipalLayout.setHorizontalGroup(
            panelMenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMenuPrincipalLayout.createSequentialGroup()
                .addGap(827, 1127, Short.MAX_VALUE)
                .addGroup(panelMenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelNomeFuncionarioLogado)
                    .addComponent(labelIdFuncionarioLogado))
                .addGap(66, 66, 66))
            .addGroup(panelMenuPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(DesktopPaneMenuPrincipal)
                .addContainerGap())
        );
        panelMenuPrincipalLayout.setVerticalGroup(
            panelMenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMenuPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelIdFuncionarioLogado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelNomeFuncionarioLogado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(DesktopPaneMenuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        menuOrcamento.setText("Venda");

        menuItemGerarPedido.setText("Realizar Venda");
        menuItemGerarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemGerarPedidoActionPerformed(evt);
            }
        });
        menuOrcamento.add(menuItemGerarPedido);

        formMenuPrincipalMenuBar.add(menuOrcamento);

        menuGerenciar.setText("Gerenciar");

        menuGerenciarCliente.setText("Cliente");

        menuItemNovoCliente.setText("Novo...");
        menuItemNovoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemNovoClienteActionPerformed(evt);
            }
        });
        menuGerenciarCliente.add(menuItemNovoCliente);

        menuItemCACliente.setText("Consultar / Alterar");
        menuItemCACliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemCAClienteActionPerformed(evt);
            }
        });
        menuGerenciarCliente.add(menuItemCACliente);

        menuGerenciar.add(menuGerenciarCliente);

        menuGerenciarFuncionario.setText("Funcionário");

        menuItemNovoFuncionario.setText("Novo...");
        menuItemNovoFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemNovoFuncionarioActionPerformed(evt);
            }
        });
        menuGerenciarFuncionario.add(menuItemNovoFuncionario);

        menuItemCAFuncionario.setText("Consultar / Alterar");
        menuItemCAFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemCAFuncionarioActionPerformed(evt);
            }
        });
        menuGerenciarFuncionario.add(menuItemCAFuncionario);

        menuGerenciar.add(menuGerenciarFuncionario);

        menuGerenciarProduto.setText("Produto");

        menuItemNovoProduto.setText("Manutenção");
        menuItemNovoProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemNovoProdutoActionPerformed(evt);
            }
        });
        menuGerenciarProduto.add(menuItemNovoProduto);

        menuGerenciar.add(menuGerenciarProduto);

        formMenuPrincipalMenuBar.add(menuGerenciar);

        menuRelatorio.setText("Relatório");

        menuItemRelatorios.setText("Emitir Relatórios");
        menuItemRelatorios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemRelatoriosActionPerformed(evt);
            }
        });
        menuRelatorio.add(menuItemRelatorios);

        formMenuPrincipalMenuBar.add(menuRelatorio);

        setJMenuBar(formMenuPrincipalMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMenuPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMenuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menuItemNovoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemNovoClienteActionPerformed
        CadastroCliente cadastroCliente = new CadastroCliente();
        DesktopPaneMenuPrincipal.add(cadastroCliente);
        cadastroCliente.setVisible(true);
    }//GEN-LAST:event_menuItemNovoClienteActionPerformed

    private void menuItemCAClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemCAClienteActionPerformed
        ManutencaoCliente consultaAlteraCliente = new ManutencaoCliente();
        DesktopPaneMenuPrincipal.add(consultaAlteraCliente);
        consultaAlteraCliente.setVisible(true);
    }//GEN-LAST:event_menuItemCAClienteActionPerformed

    private void menuItemNovoFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemNovoFuncionarioActionPerformed
        CadastroFuncionario cadastroFuncionario = new CadastroFuncionario();
        DesktopPaneMenuPrincipal.add(cadastroFuncionario);
        cadastroFuncionario.setVisible(true);
    }//GEN-LAST:event_menuItemNovoFuncionarioActionPerformed

    private void menuItemCAFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemCAFuncionarioActionPerformed
        ManutencaoFuncionario consultaAlteraFuncionario = new ManutencaoFuncionario();
        DesktopPaneMenuPrincipal.add(consultaAlteraFuncionario);
        consultaAlteraFuncionario.setVisible(true);
    }//GEN-LAST:event_menuItemCAFuncionarioActionPerformed

    private void menuItemNovoProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemNovoProdutoActionPerformed
        CadastroProduto cadastroProduto = new CadastroProduto();
        DesktopPaneMenuPrincipal.add(cadastroProduto);
        cadastroProduto.setVisible(true);
    }//GEN-LAST:event_menuItemNovoProdutoActionPerformed

    private void menuItemRelatoriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemRelatoriosActionPerformed
        GerarRelatorio gerarRelatorio = new GerarRelatorio();
        DesktopPaneMenuPrincipal.add(gerarRelatorio);
        gerarRelatorio.setVisible(true);
    }//GEN-LAST:event_menuItemRelatoriosActionPerformed

    private void menuItemGerarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemGerarPedidoActionPerformed
        GerarPedido gerarPedido = new GerarPedido();
        DesktopPaneMenuPrincipal.add(gerarPedido);
        gerarPedido.setVisible(true);
    }//GEN-LAST:event_menuItemGerarPedidoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                    if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormMenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane DesktopPaneMenuPrincipal;
    private javax.swing.JMenuBar formMenuPrincipalMenuBar;
    private javax.swing.JLabel labelIdFuncionarioLogado;
    private javax.swing.JLabel labelNomeFuncionarioLogado;
    private javax.swing.JMenu menuGerenciar;
    private javax.swing.JMenu menuGerenciarCliente;
    private javax.swing.JMenu menuGerenciarFuncionario;
    private javax.swing.JMenu menuGerenciarProduto;
    private javax.swing.JMenuItem menuItemCACliente;
    private javax.swing.JMenuItem menuItemCAFuncionario;
    private javax.swing.JMenuItem menuItemGerarPedido;
    private javax.swing.JMenuItem menuItemNovoCliente;
    private javax.swing.JMenuItem menuItemNovoFuncionario;
    private javax.swing.JMenuItem menuItemNovoProduto;
    private javax.swing.JMenuItem menuItemRelatorios;
    private javax.swing.JMenu menuOrcamento;
    private javax.swing.JMenu menuRelatorio;
    private javax.swing.JPanel panelMenuPrincipal;
    // End of variables declaration//GEN-END:variables
}
