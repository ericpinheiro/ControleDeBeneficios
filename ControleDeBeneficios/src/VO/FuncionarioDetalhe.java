package VO;

/**
 * @author Jean
 * @author Andressa
 * @author Eric
 */
public class FuncionarioDetalhe extends javax.swing.JFrame {

    public FuncionarioDetalhe() {
        initComponents();
        this.setSize(486, 330);
        this.setLocationRelativeTo(null); //carrega a janela no meio da tela.
        this.btDependente.setEnabled(false);
    }
    
    public FuncionarioDetalhe(FuncionarioVO funcionarioVO) {
        initComponents();
        this.setSize(486, 330);
        this.setLocationRelativeTo(null); //carrega a janela no meio da tela.
        this.btDependente.setEnabled(true);
        //Setar campos com os dados do funcionarioVO -- funcionarioVO.get...
    }
    
    public void setarCombo(FuncionarioVO funcionarioVO){
        //Busca todos os cargos
        
        if(funcionarioVO != null){
            //this.cbCargo.setSelectedIndex();//setar indice do combo
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbSalario = new javax.swing.JLabel();
        lbNome = new javax.swing.JLabel();
        lbCpf = new javax.swing.JLabel();
        txtSalario = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        txtCpf = new javax.swing.JTextField();
        cbCargo = new javax.swing.JComboBox();
        lbCargo = new javax.swing.JLabel();
        blCodigo = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JLabel();
        btExcluir = new javax.swing.JButton();
        btSalvarEditar = new javax.swing.JButton();
        btDependente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        lbSalario.setText("Salário");
        getContentPane().add(lbSalario);
        lbSalario.setBounds(10, 140, 34, 14);

        lbNome.setText("Nome");
        getContentPane().add(lbNome);
        lbNome.setBounds(10, 50, 27, 14);

        lbCpf.setText("CPF");
        getContentPane().add(lbCpf);
        lbCpf.setBounds(10, 80, 19, 14);
        getContentPane().add(txtSalario);
        txtSalario.setBounds(60, 140, 230, 20);

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });
        getContentPane().add(txtNome);
        txtNome.setBounds(60, 50, 230, 20);

        txtCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCpfActionPerformed(evt);
            }
        });
        getContentPane().add(txtCpf);
        txtCpf.setBounds(60, 80, 230, 20);

        cbCargo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(cbCargo);
        cbCargo.setBounds(60, 110, 230, 20);

        lbCargo.setText("Cargo");
        getContentPane().add(lbCargo);
        lbCargo.setBounds(10, 110, 29, 14);

        blCodigo.setText("Código");
        getContentPane().add(blCodigo);
        blCodigo.setBounds(10, 20, 33, 14);

        txtCodigo.setText("-");
        getContentPane().add(txtCodigo);
        txtCodigo.setBounds(60, 20, 230, 14);

        btExcluir.setText("Excluir");
        getContentPane().add(btExcluir);
        btExcluir.setBounds(283, 260, 90, 23);

        btSalvarEditar.setText("Qualquer coisa");
        getContentPane().add(btSalvarEditar);
        btSalvarEditar.setBounds(173, 260, 100, 23);

        btDependente.setText("Dependentes");
        btDependente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDependenteActionPerformed(evt);
            }
        });
        getContentPane().add(btDependente);
        btDependente.setBounds(10, 260, 120, 23);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCpfActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void btDependenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDependenteActionPerformed
        if (!this.txtCodigo.getText().equals("-")) {
            int cod;
            TelaDependente telaDependente = new TelaDependente();
            cod = Integer.parseInt(this.txtCodigo.getText());
            telaDependente.setarTabela(cod);
            telaDependente.setVisible(true);
        }
    }//GEN-LAST:event_btDependenteActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FuncionarioDetalhe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FuncionarioDetalhe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FuncionarioDetalhe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FuncionarioDetalhe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FuncionarioDetalhe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel blCodigo;
    private javax.swing.JButton btDependente;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btSalvarEditar;
    private javax.swing.JComboBox cbCargo;
    private javax.swing.JLabel lbCargo;
    private javax.swing.JLabel lbCpf;
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel lbSalario;
    private javax.swing.JLabel txtCodigo;
    private javax.swing.JTextField txtCpf;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtSalario;
    // End of variables declaration//GEN-END:variables
}
