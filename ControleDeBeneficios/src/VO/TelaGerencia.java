package VO;

import PERS.GerenciaPERS;
import RN.GerenciaRN;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

/**
 * @author Jean
 * @author Andressa
 * @author Eric
 */
public class TelaGerencia extends javax.swing.JFrame {

    public TelaGerencia() {
        initComponents();
        this.setSize(486, 330);
        this.setLocationRelativeTo(null); //carrega a janela no meio da tela.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btModificar = new javax.swing.JButton();
        txtBusca = new javax.swing.JTextField();
        btMostrarRelacao = new javax.swing.JButton();
        btIncluir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        lbImagemFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gerencia");
        setResizable(false);
        getContentPane().setLayout(null);

        btModificar.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        btModificar.setText("Modificar");
        btModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btModificarActionPerformed(evt);
            }
        });
        getContentPane().add(btModificar);
        btModificar.setBounds(230, 240, 110, 27);

        txtBusca.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        getContentPane().add(txtBusca);
        txtBusca.setBounds(40, 6, 370, 27);

        btMostrarRelacao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VO/imgs/bt_lupa_buscar.png"))); // NOI18N
        btMostrarRelacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMostrarRelacaoActionPerformed(evt);
            }
        });
        getContentPane().add(btMostrarRelacao);
        btMostrarRelacao.setBounds(410, 5, 60, 30);

        btIncluir.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        btIncluir.setText("Incluir");
        btIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btIncluirActionPerformed(evt);
            }
        });
        getContentPane().add(btIncluir);
        btIncluir.setBounds(345, 240, 120, 27);

        tabela.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Salário Adicional"
            }
        ));
        tabela.setGridColor(new java.awt.Color(255, 51, 51));
        tabela.setSelectionBackground(new java.awt.Color(255, 51, 51));
        jScrollPane1.setViewportView(tabela);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 60, 460, 170);

        lbImagemFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VO/imgs/bg_telaBusca.png"))); // NOI18N
        getContentPane().add(lbImagemFundo);
        lbImagemFundo.setBounds(0, 0, 486, 302);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btModificarActionPerformed
        if (tabela.getSelectedRowCount() == 1) {
            GerenciaVO gerenciaVO = new GerenciaVO();
            gerenciaVO.setCod(Integer.parseInt(tabela.getValueAt(tabela.getSelectedRow(), 0).toString()));
            gerenciaVO.setNome(tabela.getValueAt(tabela.getSelectedRow(), 1).toString());
            gerenciaVO.setSalario(Double.parseDouble(tabela.getValueAt(tabela.getSelectedRow(), 2).toString()));
            TelaGerenciaDetalhe tela = new TelaGerenciaDetalhe(gerenciaVO);
            tela.setBotaoSalvarEditar("Salvar");
            tela.setVisible(true);
            this.dispose();
        } else {
            if (tabela.getSelectedRowCount() == 0) {
                JOptionPane.showMessageDialog(this, "Selecione um item para modificar", null, JOptionPane.ERROR_MESSAGE, null);
            } else {
                JOptionPane.showMessageDialog(this, "Selecione somente um item para modificar", null, JOptionPane.ERROR_MESSAGE, null);
            }
        }
    }//GEN-LAST:event_btModificarActionPerformed

    private void btIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btIncluirActionPerformed
        TelaGerenciaDetalhe tela = new TelaGerenciaDetalhe();
        tela.setBotaoSalvarEditar("Salvar");
        tela.setBotaoExcluir(this.btIncluir.getText());
        tela.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btIncluirActionPerformed

    private void btMostrarRelacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMostrarRelacaoActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
        modelo.setNumRows(0);
        GerenciaVO gerenciaVO = new GerenciaVO();
        GerenciaRN gerenciaRN = new GerenciaRN(gerenciaVO);
        GerenciaPERS gerenciaPERS = new GerenciaPERS(gerenciaRN);

        ArrayList<GerenciaVO> lista = gerenciaPERS.carregarTabela(txtBusca.getText());

        for (int i = 0; i < lista.size(); i++) {
            modelo.addRow(new Object[]{lista.get(i).getCod(), lista.get(i).getNome(), lista.get(i).getSalario()});
        }

    }//GEN-LAST:event_btMostrarRelacaoActionPerformed

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
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaGerencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaGerencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaGerencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaGerencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaGerencia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btIncluir;
    private javax.swing.JButton btModificar;
    private javax.swing.JButton btMostrarRelacao;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbImagemFundo;
    private javax.swing.JTable tabela;
    private javax.swing.JTextField txtBusca;
    // End of variables declaration//GEN-END:variables
}
