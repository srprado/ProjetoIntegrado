
package br.edu.ifsp.pep.visao;

import br.edu.ifsp.pep.dao.ConsultaDAO;
import br.edu.ifsp.pep.modelo.Consulta;
import java.awt.Color;
import java.util.List;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import org.w3c.dom.CDATASection;

/**
 *
 * @author sabri
 */
public class TelaInicial extends javax.swing.JFrame {
    
    private static ConsultaDAO consultaDAO = new ConsultaDAO();
    private List<Consulta> consulta;

   
    public TelaInicial() {
        initComponents();
        this.cores();
//        this.atualizarTabela();        
    }

    public void cores() {
        Color corJframe = new Color(249, 253, 253);
        getContentPane().setBackground(corJframe);
        Color panelLateral = new Color(24, 156, 184);
        paLateral.setBackground(panelLateral);
        
        Color corTabela = new Color(246, 246, 246);
        tabelaAgenda.getParent().setBackground(corTabela);
        DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer();
        headerRenderer.setBackground(panelLateral);
        headerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        for (int i = 0; i < tabelaAgenda.getModel().getColumnCount(); i++) {
            tabelaAgenda.getColumnModel().getColumn(i).setHeaderRenderer(headerRenderer);
        }
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        paLateral = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        cbPesquisa = new javax.swing.JComboBox<>();
        txtPesquisa = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaAgenda = new javax.swing.JTable();
        btnAgendarConsulta = new javax.swing.JButton();
        btnCancelarConsulta = new javax.swing.JButton();
        btnAgendarRetorno = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("HOME");
        setBackground(new java.awt.Color(249, 253, 253));
        setForeground(new java.awt.Color(204, 204, 204));
        setName("Home"); // NOI18N

        paLateral.setForeground(new java.awt.Color(24, 156, 184));

        javax.swing.GroupLayout paLateralLayout = new javax.swing.GroupLayout(paLateral);
        paLateral.setLayout(paLateralLayout);
        paLateralLayout.setHorizontalGroup(
            paLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 302, Short.MAX_VALUE)
        );
        paLateralLayout.setVerticalGroup(
            paLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        lblTitulo.setFont(new java.awt.Font("Times New Roman", 0, 48)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(24, 156, 184));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("AGENDA");
        lblTitulo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        cbPesquisa.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        cbPesquisa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione ..." }));

        txtPesquisa.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        btnPesquisar.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        tabelaAgenda.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        tabelaAgenda.setForeground(new java.awt.Color(255, 255, 255));
        tabelaAgenda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Dia", "Horário", "Cliente", "Médico", "Status"
            }
        ));
        tabelaAgenda.setDragEnabled(true);
        tabelaAgenda.setGridColor(new java.awt.Color(255, 255, 255));
        tabelaAgenda.setInheritsPopupMenu(true);
        tabelaAgenda.setName(""); // NOI18N
        tabelaAgenda.setShowGrid(true);
        tabelaAgenda.setSurrendersFocusOnKeystroke(true);
        jScrollPane1.setViewportView(tabelaAgenda);

        btnAgendarConsulta.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnAgendarConsulta.setForeground(new java.awt.Color(24, 156, 184));
        btnAgendarConsulta.setText("Agendar consulta");

        btnCancelarConsulta.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnCancelarConsulta.setForeground(new java.awt.Color(24, 156, 184));
        btnCancelarConsulta.setText("Cancelar \nConsulta");
        btnCancelarConsulta.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCancelarConsulta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCancelarConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarConsultaActionPerformed(evt);
            }
        });

        btnAgendarRetorno.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnAgendarRetorno.setForeground(new java.awt.Color(24, 156, 184));
        btnAgendarRetorno.setText("Agendar retorno");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(paLateral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cbPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPesquisa)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAgendarRetorno, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(btnAgendarConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(btnCancelarConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE))
                            .addComponent(jScrollPane1))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(paLateral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgendarRetorno, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgendarConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelarConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13))
        );

        txtPesquisa.getAccessibleContext().setAccessibleName("");
        btnPesquisar.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void atualizarTabela(){
        DefaultTableModel modelo = (DefaultTableModel) tabelaAgenda.getModel();
        modelo.setNumRows(0);
        for(Consulta consultas : consulta){
            if(consultas.getStatus()== true){
                modelo.addRow (new Object[] {consultas.getDia(), consultas.getHorario(),
                consultas.getClienteCpf().getNome(), consultas.getMedicoCpf().getNome(),
                consultas.getStatus()});
            }          
        }        
    } 
    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnCancelarConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarConsultaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelarConsultaActionPerformed

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
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgendarConsulta;
    private javax.swing.JButton btnAgendarRetorno;
    private javax.swing.JButton btnCancelarConsulta;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JComboBox<String> cbPesquisa;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel paLateral;
    private javax.swing.JTable tabelaAgenda;
    private javax.swing.JTextField txtPesquisa;
    // End of variables declaration//GEN-END:variables
}
