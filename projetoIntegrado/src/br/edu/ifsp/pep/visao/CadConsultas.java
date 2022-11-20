
package br.edu.ifsp.pep.visao;

import br.edu.ifsp.pep.dao.ClienteDAO;
import br.edu.ifsp.pep.dao.ConsultaDAO;
import br.edu.ifsp.pep.dao.MedicoDAO;
import br.edu.ifsp.pep.modelo.Cliente;
import br.edu.ifsp.pep.modelo.Consulta;
import br.edu.ifsp.pep.modelo.Medico;
import java.awt.Color;
import static java.lang.String.format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class CadConsultas extends javax.swing.JDialog {
    private final Consulta consulta = new Consulta();
    private final ConsultaDAO consultaDAO = new ConsultaDAO();
    private final ClienteDAO clientesDAO = new ClienteDAO();
    private final MedicoDAO medicosDAO = new MedicoDAO();
    private static Medico med = new Medico();
    
    private static String retorno = "Retorno";    
    List<Cliente> clientes = new ArrayList<>();
    
    public CadConsultas(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.cores();
        this.carregarMedicos();       
    }
    
    public void cores() {
        Color corJframe = new Color(249, 253, 253);
        getContentPane().setBackground(corJframe); 
    }
    
    public void receberValor(String x){
        txtTipo.setText(x);    
    }
    
    public void travartxtTipo(){
        txtTipo.setEditable(false);   
    }
    
    private void atualizarTabela(Cliente cli) {
        DefaultTableModel modelo = (DefaultTableModel) tabelaPesquisaCli.getModel();
        modelo.setNumRows(0);
        clientes.add(cli);
        modelo.addRow(new Object[]{cli.getCpf(), cli.getNome(),
        cli.getPlanoMedico().getNome(), cli.isStatus()});
        
        System.out.println(modelo.getValueAt(0,0));
        
    }
    
    private void LimparCampos(){
        txtPesquisa.setValue(null);
        DefaultTableModel modelo = (DefaultTableModel) tabelaPesquisaCli.getModel();
        modelo.setNumRows(0);
        calendario.setDate(new Date());
        txtHora.setValue("00:00");
        txtTipo.setText(" ");
        cbMedico.setSelectedIndex(0);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        lblHora = new javax.swing.JLabel();
        txtTipo = new javax.swing.JTextField();
        txtHora = new javax.swing.JFormattedTextField();
        lblTipo = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        lblPesquisar = new javax.swing.JLabel();
        btmPesquisar = new javax.swing.JButton();
        txtPesquisa = new javax.swing.JFormattedTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaPesquisaCli = new javax.swing.JTable();
        calendario = new com.toedter.calendar.JCalendar();
        cbMedico = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblTitulo.setFont(new java.awt.Font("Times New Roman", 0, 48)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(24, 156, 184));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Agendar Consulta");
        lblTitulo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lblHora.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblHora.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHora.setText("Horário:");

        txtTipo.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        try {
            txtHora.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        lblTipo.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblTipo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTipo.setText("Tipo:");
        lblTipo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        btnSalvar.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        lblPesquisar.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblPesquisar.setText("CPF do cliente:");
        lblPesquisar.setName("Nome do cliente"); // NOI18N

        btmPesquisar.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btmPesquisar.setText("Pesquisar");
        btmPesquisar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btmPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmPesquisarActionPerformed(evt);
            }
        });

        try {
            txtPesquisa.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        tabelaPesquisaCli.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CPF", "Nome", "Plano", "Status"
            }
        ));
        jScrollPane1.setViewportView(tabelaPesquisaCli);

        cbMedico.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        cbMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMedicoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(lblTitulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(calendario, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtHora, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(lblHora, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTipo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(lblTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(54, 54, 54))))
                            .addComponent(cbMedico, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 554, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btmPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btmPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(lblTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblHora, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtHora, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(cbMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(calendario, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 118, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.LimparCampos();
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btmPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmPesquisarActionPerformed
       Cliente cli = new Cliente();
        if (txtPesquisa.getValue() == null) {
            JOptionPane.showMessageDialog(null, "insira o CPF do cliente!", "Insira o CPF", JOptionPane.INFORMATION_MESSAGE);
        } else {
            try {
                cli = clientesDAO.findByCpfCliente(txtPesquisa.getText());
                this.atualizarTabela(cli);

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Cliente não encontrado!", "Informação", JOptionPane.INFORMATION_MESSAGE);
                txtPesquisa.setText(" ");
            }
        }
    }//GEN-LAST:event_btmPesquisarActionPerformed

    private void carregarMedicos(){  
        
        DefaultComboBoxModel modelo = (DefaultComboBoxModel) cbMedico.getModel();
        modelo.addElement("Médicos...");
        for (Medico medico : medicosDAO.findByAll()) {
            modelo.addElement(medico);
        }
    }
    
    public void receberMedicoSelecionado(Medico medico){
        this.med = medico;
        cbMedico.setSelectedItem(med);   
        cbMedico.setEnabled(false);
    }
    
    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        
        try {                
            consulta.setClienteCpf(clientes.get(0));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Cliente não encontrado!", "Atenção", JOptionPane.WARNING_MESSAGE);

        }        
        if (calendario.getDate() == null) {
            JOptionPane.showMessageDialog(null, "Insira a data da consulta!", "Insira a data", JOptionPane.WARNING_MESSAGE);
        }else if(calendario.getDate().before(new Date())){
            JOptionPane.showMessageDialog(null, "Não é possível marcar em uma data que já passou!", "Data passada", JOptionPane.WARNING_MESSAGE);        
        }else {
            try {
                consulta.setData(calendario.getDate());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao salvar a data!", "Erro na data", JOptionPane.ERROR);
            }
        }        
        if (txtHora.getValue() == null || txtHora.getValue() == "00:00") {
            JOptionPane.showMessageDialog(null, "Insira o horário da consulta!", "Insira a hora", JOptionPane.WARNING_MESSAGE);
        } else {
            try {
                SimpleDateFormat formatoh = new SimpleDateFormat("HH:mm");
                consulta.setHorario(formatoh.parse((String) txtHora.getValue()));

            } catch (ParseException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao salvar o horário!", "Erro no horário", JOptionPane.ERROR);
                txtHora.requestFocus();
            }
        }       
        if(txtTipo.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Insira o tipo da consulta: 'Inicial' ou 'Retorno'!", "Insira o tipo", JOptionPane.WARNING_MESSAGE);
        } else{
            consulta.setTipo(txtTipo.getText());
        }
        consulta.setStatus(true); 
        DefaultComboBoxModel modelocb = (DefaultComboBoxModel) cbMedico.getModel();
        if(cbMedico.getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(null, "Selecione um médico", "Médico", JOptionPane.WARNING_MESSAGE);           
        }else {
            try {
                consulta.setMedicoCpf((Medico) modelocb.getSelectedItem());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Medico não encontrado!", "Erro", JOptionPane.ERROR);
            }
        }
            
        try {
             consultaDAO.inserir(consulta);
             JOptionPane.showMessageDialog(null, "Consulta agendada", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
             txtPesquisa.setValue(" ");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Consulta não agendada!", "Erro", JOptionPane.ERROR);

        }
        this.LimparCampos();               
    }//GEN-LAST:event_btnSalvarActionPerformed
    
    
    private void cbMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMedicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbMedicoActionPerformed
       
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
            java.util.logging.Logger.getLogger(CadConsultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadConsultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadConsultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadConsultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CadConsultas dialog = new CadConsultas(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btmPesquisar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnSalvar;
    private com.toedter.calendar.JCalendar calendario;
    private javax.swing.JComboBox<String> cbMedico;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblHora;
    private javax.swing.JLabel lblPesquisar;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTable tabelaPesquisaCli;
    private javax.swing.JFormattedTextField txtHora;
    private javax.swing.JFormattedTextField txtPesquisa;
    private javax.swing.JTextField txtTipo;
    // End of variables declaration//GEN-END:variables
}
