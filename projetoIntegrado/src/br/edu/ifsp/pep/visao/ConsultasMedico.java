
package br.edu.ifsp.pep.visao;

import br.edu.ifsp.pep.dao.ConsultaDAO;
import br.edu.ifsp.pep.modelo.Cliente;
import br.edu.ifsp.pep.modelo.Consulta;
import br.edu.ifsp.pep.modelo.Medico;
import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import org.w3c.dom.CDATASection;

public class ConsultasMedico extends javax.swing.JFrame {
    
    private static ConsultaDAO consultaDAO = new ConsultaDAO();
    private List<Consulta> consultas;
    private static Medico medicoRecebido = new Medico();
  
    public ConsultasMedico() {
        initComponents();
        this.cores();
        this.atualizarTabelaInicialmente();        
        setExtendedState(MAXIMIZED_BOTH);
    }
    
    public void receberMedico(Medico m){        
        this.medicoRecebido = m;       
    }
        
    private void limparCampos(){
        txtPesquisaCpfCliente.setValue(null);
        txtHoraPesq.setValue(null);
        dataPesquisa.setDate(null);   
    }

    public void cores() {
        Color corJframe = new Color(249, 253, 253);
        getContentPane().setBackground(corJframe);
        lblAjuste1.setForeground(corJframe);
        lblAjuste2.setForeground(corJframe);
        Color panelLateral = new Color(24, 156, 184);
        paLateral.setBackground(panelLateral);
        paImagem.setBackground(panelLateral);
        
        Color corTabela = new Color(246, 246, 246);
        tabelaAgenda.getParent().setBackground(corTabela);
        Color preto = new Color(0,0,0);
        DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer();
        headerRenderer.setBackground(panelLateral);
        headerRenderer.setHorizontalAlignment(SwingConstants.LEFT);
        for (int i = 0; i < tabelaAgenda.getModel().getColumnCount(); i++) {
            tabelaAgenda.getColumnModel().getColumn(i).setHeaderRenderer(headerRenderer);
        }        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        paLateral = new javax.swing.JPanel();
        paImagem = new javax.swing.JPanel();
        btnPerfil = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();
        cbPesquisaC = new javax.swing.JComboBox<>();
        btnPesquisar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaAgenda = new javax.swing.JTable();
        btnCancelarConsulta = new javax.swing.JButton();
        dataPesquisa = new com.toedter.calendar.JDateChooser();
        txtHoraPesq = new javax.swing.JFormattedTextField();
        lblAjuste1 = new javax.swing.JLabel();
        lblAjuste2 = new javax.swing.JLabel();
        BtnTdsConsultas = new javax.swing.JButton();
        btnAgendarRetorno = new javax.swing.JButton();
        txtPesquisaCpfCliente = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("HOME");
        setBackground(new java.awt.Color(249, 253, 253));
        setForeground(new java.awt.Color(204, 204, 204));
        setName("Home"); // NOI18N

        paLateral.setForeground(new java.awt.Color(24, 156, 184));

        btnPerfil.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnPerfil.setText("Perfil");

        javax.swing.GroupLayout paImagemLayout = new javax.swing.GroupLayout(paImagem);
        paImagem.setLayout(paImagemLayout);
        paImagemLayout.setHorizontalGroup(
            paImagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paImagemLayout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(btnPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(77, Short.MAX_VALUE))
        );
        paImagemLayout.setVerticalGroup(
            paImagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paImagemLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(btnPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(80, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout paLateralLayout = new javax.swing.GroupLayout(paLateral);
        paLateral.setLayout(paLateralLayout);
        paLateralLayout.setHorizontalGroup(
            paLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(paImagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        paLateralLayout.setVerticalGroup(
            paLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paLateralLayout.createSequentialGroup()
                .addComponent(paImagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblTitulo.setFont(new java.awt.Font("Times New Roman", 0, 48)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(24, 156, 184));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("AGENDA");
        lblTitulo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        cbPesquisaC.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        cbPesquisaC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pesquisar por", "Somente data", "Data e hora", "CPF Cliente", " ", " " }));
        cbPesquisaC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPesquisaCActionPerformed(evt);
            }
        });

        btnPesquisar.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        tabelaAgenda.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
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
        if (tabelaAgenda.getColumnModel().getColumnCount() > 0) {
            tabelaAgenda.getColumnModel().getColumn(2).setPreferredWidth(300);
            tabelaAgenda.getColumnModel().getColumn(3).setPreferredWidth(300);
        }

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

        dataPesquisa.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        try {
            txtHoraPesq.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtHoraPesq.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        BtnTdsConsultas.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        BtnTdsConsultas.setText("Todas as consultas");
        BtnTdsConsultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnTdsConsultasActionPerformed(evt);
            }
        });

        btnAgendarRetorno.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnAgendarRetorno.setForeground(new java.awt.Color(24, 156, 184));
        btnAgendarRetorno.setText("Agendar retorno");
        btnAgendarRetorno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgendarRetornoActionPerformed(evt);
            }
        });

        try {
            txtPesquisaCpfCliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtPesquisaCpfCliente.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(paLateral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCancelarConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                        .addGap(385, 385, 385)
                        .addComponent(btnAgendarRetorno, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cbPesquisaC, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblAjuste1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BtnTdsConsultas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtPesquisaCpfCliente)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                                    .addComponent(lblAjuste2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(dataPesquisa, javax.swing.GroupLayout.DEFAULT_SIZE, 432, Short.MAX_VALUE)
                                .addGap(30, 30, 30)
                                .addComponent(txtHoraPesq, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE))))
                    .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(paLateral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cbPesquisaC, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPesquisaCpfCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addComponent(BtnTdsConsultas, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(1, 1, 1)
                            .addComponent(txtHoraPesq, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(dataPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 2, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAjuste1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAjuste2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelarConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgendarRetorno, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        btnPesquisar.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void atualizarTabelaInicialmente() {  
        this.consultas = consultaDAO.findByCPFMedico(medicoRecebido);
        DefaultTableModel modelo = (DefaultTableModel) tabelaAgenda.getModel();
        modelo.setNumRows(0);
        for (Consulta consulta : consultas) {
            modelo.addRow(new Object[]{
                new SimpleDateFormat("dd/MM/yyyy").format(consulta.getData().getTime()),
                new SimpleDateFormat("HH:mm").format(consulta.getHorario().getTime()),
                consulta.getClienteCpf().getNome(), consulta.getMedicoCpf().getNome(),
                consulta.getStatus()});
        }
    }
     
    private void atualizarTabelaPesquisa() {
        DefaultTableModel modelo = (DefaultTableModel) tabelaAgenda.getModel();
        modelo.setNumRows(0);
        if (consultas.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Não há resultados para sua pesquisa", "Informação", JOptionPane.INFORMATION_MESSAGE);
        } else {
            for (Consulta consulta : consultas) {
                modelo.addRow(new Object[]{
                    new SimpleDateFormat("dd/MM/yyyy").format(consulta.getData().getTime()),
                    new SimpleDateFormat("HH:mm").format(consulta.getHorario().getTime()),
                    consulta.getClienteCpf().getNome(), consulta.getMedicoCpf().getNome(),
                    consulta.getStatus()});
            }
        }
    }
    
    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        int selecao = cbPesquisaC.getSelectedIndex();
        switch (selecao) {
            case 0:
                JOptionPane.showMessageDialog(null, "Selecione um método de pesquisa", "Atenção", JOptionPane.WARNING_MESSAGE);
                break;
            case 1:
                if (dataPesquisa.getDate() == null) {
                    JOptionPane.showMessageDialog(null, "Selecione a data para pesquisa", "Atenção", JOptionPane.WARNING_MESSAGE);
                } else {
                    try {
                        this.consultas = consultaDAO.findByDayandMedico(dataPesquisa.getDate(), medicoRecebido);
                        this.atualizarTabelaPesquisa();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Sem respostas", "Informação", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
                break;
            case 2:
                if (dataPesquisa.getDate() == null) {
                    JOptionPane.showMessageDialog(null, "Selecione a data para pesquisa", "Atenção", JOptionPane.WARNING_MESSAGE);
                } else if (txtHoraPesq.getValue() == null) {
                    JOptionPane.showMessageDialog(null, "Digite o horário desejado", "Atenção", JOptionPane.WARNING_MESSAGE);
                } else {
                    try {
                        SimpleDateFormat formatoh = new SimpleDateFormat("HH:mm");
                        this.consultas = consultaDAO.findByDayTimeandMedico(dataPesquisa.getDate(), medicoRecebido, formatoh.parse((String) txtHoraPesq.getValue()));
                        this.atualizarTabelaPesquisa();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Sem respostas", "Informação", JOptionPane.INFORMATION_MESSAGE);
                    }

                }
                break;
            case 3:
                if (txtPesquisaCpfCliente.getText().trim().equals("")) {
                    JOptionPane.showMessageDialog(null, "Digite o cpf do cliente", "Atenção", JOptionPane.WARNING_MESSAGE);
                } else {
                    try {
                        Cliente c = new Cliente();
                        c.setCpf(txtPesquisaCpfCliente.getText());
                        this.consultas = consultaDAO.findByCPFClienteandMedico(c,medicoRecebido);
                        this.atualizarTabelaPesquisa();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Não há consultas para este cliente", "Informação", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
                break;
            case 4:
                break;

            default:
                throw new AssertionError();
        }

    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void BtnTdsConsultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnTdsConsultasActionPerformed
        this.atualizarTabelaInicialmente();
    }//GEN-LAST:event_BtnTdsConsultasActionPerformed

    private void btnCancelarConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarConsultaActionPerformed
        int linha = tabelaAgenda.getSelectedRow();
        if (linha == -1) {
            JOptionPane.showMessageDialog(null, "Selecione uma consulta!", "Atenção", JOptionPane.WARNING_MESSAGE);
        } else {
            Consulta c = this.consultas.get(linha);
            if (c.getStatus() == true) {
                int confirmacao = JOptionPane.showConfirmDialog(null, "Deseja realmente cancelar essa consulta?", "Confirmação", JOptionPane.YES_NO_OPTION);
                if (confirmacao == 0) {
                    //verificar se o plano esta pago, se estiver exclui, senão apresentar msg de que tem pendências
                    try {
                        consultaDAO.remover(c);
                        JOptionPane.showMessageDialog(null, "Consulta cancelada!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Não é possível cancelar a consulta", "Alerta", JOptionPane.WARNING_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Operação cancelada!", "Cancelada", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        }
        this.atualizarTabelaInicialmente();
    }//GEN-LAST:event_btnCancelarConsultaActionPerformed

    private void cbPesquisaCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPesquisaCActionPerformed
        this.limparCampos();
    }//GEN-LAST:event_cbPesquisaCActionPerformed

    private void btnAgendarRetornoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgendarRetornoActionPerformed

        CadConsultas cadConsultas = new CadConsultas(this,true);
        //Abrir a tela no meio da tela
        cadConsultas.setLocationRelativeTo(null);
        cadConsultas.receberValor("Retorno");
        cadConsultas.receberMedicoSelecionado(medicoRecebido);
        cadConsultas.travartxtTipo();
        cadConsultas.setVisible(true);
    }//GEN-LAST:event_btnAgendarRetornoActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultasMedico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnTdsConsultas;
    private javax.swing.JButton btnAgendarRetorno;
    private javax.swing.JButton btnCancelarConsulta;
    private javax.swing.JButton btnPerfil;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JComboBox<String> cbPesquisaC;
    private com.toedter.calendar.JDateChooser dataPesquisa;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAjuste1;
    private javax.swing.JLabel lblAjuste2;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel paImagem;
    private javax.swing.JPanel paLateral;
    private javax.swing.JTable tabelaAgenda;
    private javax.swing.JFormattedTextField txtHoraPesq;
    private javax.swing.JFormattedTextField txtPesquisaCpfCliente;
    // End of variables declaration//GEN-END:variables
}
