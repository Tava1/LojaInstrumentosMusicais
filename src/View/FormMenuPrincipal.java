package View;

import javax.swing.JDesktopPane;

/**
 * @author Gustavo Santos
 */
public class FormMenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form FormMenuPrincipal
     */
    public FormMenuPrincipal() {
        initComponents();
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
        menuRelatorio = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        menuGerenciar = new javax.swing.JMenu();
        menuItemEstoque = new javax.swing.JMenuItem();
        menuGerenciarCliente = new javax.swing.JMenu();
        menuItemNovoCliente = new javax.swing.JMenuItem();
        menuItemCACliente = new javax.swing.JMenuItem();
        menuGerenciarFuncionario = new javax.swing.JMenu();
        menuItemNovoFuncionario = new javax.swing.JMenuItem();
        menuItemCAFuncionario = new javax.swing.JMenuItem();
        menuGerenciarProduto = new javax.swing.JMenu();
        menuItemNovoProduto = new javax.swing.JMenuItem();
        menuItemCAProduto = new javax.swing.JMenuItem();

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
            .addGap(0, 944, Short.MAX_VALUE)
        );
        DesktopPaneMenuPrincipalLayout.setVerticalGroup(
            DesktopPaneMenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
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
            .addComponent(DesktopPaneMenuPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMenuPrincipalLayout.createSequentialGroup()
                .addGroup(panelMenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelNomeFuncionarioLogado)
                    .addComponent(labelIdFuncionarioLogado))
                .addGap(66, 66, 66))
        );
        panelMenuPrincipalLayout.setVerticalGroup(
            panelMenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMenuPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelIdFuncionarioLogado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelNomeFuncionarioLogado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(DesktopPaneMenuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        menuOrcamento.setText("Orçamento");
        formMenuPrincipalMenuBar.add(menuOrcamento);

        menuRelatorio.setText("Relatório");

        jMenuItem1.setText("Simples");
        menuRelatorio.add(jMenuItem1);

        jMenuItem2.setText("Analítico");
        menuRelatorio.add(jMenuItem2);

        formMenuPrincipalMenuBar.add(menuRelatorio);

        menuGerenciar.setText("Gerenciar");

        menuItemEstoque.setText("Estoque");
        menuGerenciar.add(menuItemEstoque);

        menuGerenciarCliente.setText("Cliente");

        menuItemNovoCliente.setText("Novo...");
        menuGerenciarCliente.add(menuItemNovoCliente);

        menuItemCACliente.setText("Consultar / Alterar");
        menuGerenciarCliente.add(menuItemCACliente);

        menuGerenciar.add(menuGerenciarCliente);

        menuGerenciarFuncionario.setText("Funcionário");

        menuItemNovoFuncionario.setText("Novo...");
        menuGerenciarFuncionario.add(menuItemNovoFuncionario);

        menuItemCAFuncionario.setText("Consultar / Alterar");
        menuGerenciarFuncionario.add(menuItemCAFuncionario);

        menuGerenciar.add(menuGerenciarFuncionario);

        menuGerenciarProduto.setText("Produto");

        menuItemNovoProduto.setText("Novo...");
        menuGerenciarProduto.add(menuItemNovoProduto);

        menuItemCAProduto.setText("Consultar / Alterar");
        menuGerenciarProduto.add(menuItemCAProduto);

        menuGerenciar.add(menuGerenciarProduto);

        formMenuPrincipalMenuBar.add(menuGerenciar);

        setJMenuBar(formMenuPrincipalMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMenuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMenuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JLabel labelIdFuncionarioLogado;
    private javax.swing.JLabel labelNomeFuncionarioLogado;
    private javax.swing.JMenu menuGerenciar;
    private javax.swing.JMenu menuGerenciarCliente;
    private javax.swing.JMenu menuGerenciarFuncionario;
    private javax.swing.JMenu menuGerenciarProduto;
    private javax.swing.JMenuItem menuItemCACliente;
    private javax.swing.JMenuItem menuItemCAFuncionario;
    private javax.swing.JMenuItem menuItemCAProduto;
    private javax.swing.JMenuItem menuItemEstoque;
    private javax.swing.JMenuItem menuItemNovoCliente;
    private javax.swing.JMenuItem menuItemNovoFuncionario;
    private javax.swing.JMenuItem menuItemNovoProduto;
    private javax.swing.JMenu menuOrcamento;
    private javax.swing.JMenu menuRelatorio;
    private javax.swing.JPanel panelMenuPrincipal;
    // End of variables declaration//GEN-END:variables
}
