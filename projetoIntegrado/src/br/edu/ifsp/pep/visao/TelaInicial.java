
package br.edu.ifsp.pep.visao;

import br.edu.ifsp.pep.dao.ConsultaDAO;
import br.edu.ifsp.pep.modelo.Consulta;
import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
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
    private List<Consulta> consultas;

   
    public TelaInicial() {
        initComponents();
        this.cores();
        this.consultas = consultaDAO.findByAllTrue(true);
        this.atualizarTabela();   
    }
    
    private void limparCampos(){
        txtPesquisa.setText(" ");
        txtHoraPesq.setValue(" ");
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
        lblImagem = new javax.swing.JLabel();
        btnGeralClientes = new javax.swing.JButton();
        btnGeralMedicos = new javax.swing.JButton();
        btnGeralSecretariado = new javax.swing.JButton();
        btnGeralPlanos = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();
        cbPesquisaC = new javax.swing.JComboBox<>();
        txtPesquisa = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaAgenda = new javax.swing.JTable();
        btnAgendarConsulta = new javax.swing.JButton();
        btnCancelarConsulta = new javax.swing.JButton();
        btnAgendarRetorno = new javax.swing.JButton();
        dataPesquisa = new com.toedter.calendar.JDateChooser();
        txtHoraPesq = new javax.swing.JFormattedTextField();
        lblAjuste1 = new javax.swing.JLabel();
        lblAjuste2 = new javax.swing.JLabel();
        BtnTdsConsultas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("HOME");
        setBackground(new java.awt.Color(249, 253, 253));
        setForeground(new java.awt.Color(204, 204, 204));
        setName("Home"); // NOI18N

        paLateral.setForeground(new java.awt.Color(24, 156, 184));

        lblImagem.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblImagem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImagem.setText("IMAGEM");

        javax.swing.GroupLayout paImagemLayout = new javax.swing.GroupLayout(paImagem);
        paImagem.setLayout(paImagemLayout);
        paImagemLayout.setHorizontalGroup(
            paImagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paImagemLayout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addComponent(lblImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        paImagemLayout.setVerticalGroup(
            paImagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paImagemLayout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(lblImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(80, Short.MAX_VALUE))
        );

        btnGeralClientes.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnGeralClientes.setText("Gerenciar clientes");
        btnGeralClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGeralClientesActionPerformed(evt);
            }
        });

        btnGeralMedicos.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnGeralMedicos.setText("Gerenciar médicos");
        btnGeralMedicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGeralMedicosActionPerformed(evt);
            }
        });

        btnGeralSecretariado.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnGeralSecretariado.setText("Gerenciar secretariado");
        btnGeralSecretariado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGeralSecretariadoActionPerformed(evt);
            }
        });

        btnGeralPlanos.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnGeralPlanos.setText("Gerenciar planos médicos");
        btnGeralPlanos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGeralPlanosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout paLateralLayout = new javax.swing.GroupLayout(paLateral);
        paLateral.setLayout(paLateralLayout);
        paLateralLayout.setHorizontalGroup(
            paLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(paImagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paLateralLayout.createSequentialGroup()
                .addContainerGap(63, Short.MAX_VALUE)
                .addGroup(paLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnGeralPlanos, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGeralClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGeralMedicos, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGeralSecretariado, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37))
        );
        paLateralLayout.setVerticalGroup(
            paLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paLateralLayout.createSequentialGroup()
                .addComponent(paImagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btnGeralClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(btnGeralMedicos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(btnGeralSecretariado, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(btnGeralPlanos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblTitulo.setFont(new java.awt.Font("Times New Roman", 0, 48)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(24, 156, 184));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("AGENDA");
        lblTitulo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        cbPesquisaC.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        cbPesquisaC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pesquisar por", "Data", "Data e hora", "Cliente", "Médico" }));

        txtPesquisa.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesquisaActionPerformed(evt);
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

        btnAgendarConsulta.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnAgendarConsulta.setForeground(new java.awt.Color(24, 156, 184));
        btnAgendarConsulta.setText("Agendar consulta");
        btnAgendarConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgendarConsultaActionPerformed(evt);
            }
        });

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
        btnAgendarRetorno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgendarRetornoActionPerformed(evt);
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
        BtnTdsConsultas.setText("Consultas");
        BtnTdsConsultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnTdsConsultasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(paLateral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(btnAgendarConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(btnAgendarRetorno, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(btnCancelarConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cbPesquisaC, 0, 170, Short.MAX_VALUE)
                                    .addComponent(lblAjuste1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(BtnTdsConsultas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(dataPesquisa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(52, 52, 52)
                                        .addComponent(txtHoraPesq))
                                    .addComponent(txtPesquisa, javax.swing.GroupLayout.DEFAULT_SIZE, 417, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                                    .addComponent(lblAjuste2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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
                    .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbPesquisaC, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dataPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnTdsConsultas, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblAjuste1))
                    .addComponent(txtHoraPesq, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAjuste2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
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
    
    private void atualizarTabela() {        
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
       
    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        int selecao = cbPesquisaC.getSelectedIndex();
        switch (selecao) {
            case 0:
                JOptionPane.showMessageDialog(null, "Selecione um método de pesquisa", "Atenção", JOptionPane.WARNING_MESSAGE);                
                break;
            case 1:
                if(dataPesquisa.getDate() == null){
                    JOptionPane.showMessageDialog(null, "Selecione a data para pesquisa", "Atenção", JOptionPane.WARNING_MESSAGE);                
                }else{
                    try {
                    this.consultas = consultaDAO.findByDay(dataPesquisa.getDate());
                    this.atualizarTabela();                        
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Não há consultas nesse dia", "Informação", JOptionPane.INFORMATION_MESSAGE);                        
                    }                   
                }
                break;
            case 2:                
                if(dataPesquisa.getDate() == null){
                    JOptionPane.showMessageDialog(null, "Selecione a data para pesquisa", "Atenção", JOptionPane.WARNING_MESSAGE);
                }else if(txtHoraPesq.getValue()== null){
                    JOptionPane.showMessageDialog(null, "Digite o horário desejado", "Atenção", JOptionPane.WARNING_MESSAGE);
                }else{
                    try {
                        Date hora = (Date) txtHoraPesq.getValue(); 
                        this.consultas = consultaDAO.findByDayandTime(dataPesquisa.getDate(), hora);   
                        this.atualizarTabela();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Não há consultas nesse dia e horário", "Informação", JOptionPane.INFORMATION_MESSAGE); 
                    }
                
                }
                break;
            case 3:
                if(txtPesquisa.getText().trim().equals("")){
                    JOptionPane.showMessageDialog(null, "Digite o nome do cliente", "Atenção", JOptionPane.WARNING_MESSAGE);                    
                }
                else{
                    try { 
                        
                        this.consultas = consultaDAO.findByNomeCliente(txtPesquisa.getText());
                        this.atualizarTabela();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Não há consultas para esse cliente", "Informação", JOptionPane.INFORMATION_MESSAGE); 
                    }
                }
                break;
            case 4:
                break;
                
            default:
                throw new AssertionError();
        }      
    }//GEN-LAST:event_btnPesquisarActionPerformed

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
        this.consultas = consultaDAO.findByAllTrue(true);
        this.atualizarTabela();
    }//GEN-LAST:event_btnCancelarConsultaActionPerformed

    private void btnAgendarConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgendarConsultaActionPerformed
        CadConsultas cadConsultas = new CadConsultas(this,true);
        cadConsultas.setLocationRelativeTo(null);
        cadConsultas.receberInicial("Inicial");
        cadConsultas.travartxtTipo();
        cadConsultas.setVisible(true);
    }//GEN-LAST:event_btnAgendarConsultaActionPerformed

    private void btnAgendarRetornoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgendarRetornoActionPerformed
        
        CadConsultas cadConsultas = new CadConsultas(this,true);
        //Abrir a tela no meio da tela
        cadConsultas.setLocationRelativeTo(null);
        cadConsultas.receberRetorno("Retorno");
        cadConsultas.travartxtTipo();
        cadConsultas.setVisible(true);

    }//GEN-LAST:event_btnAgendarRetornoActionPerformed

    private void btnGeralClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGeralClientesActionPerformed
        GerenciamentoCliente cliente = new GerenciamentoCliente(this, true);
        cliente.setLocationRelativeTo(null);
        cliente.setVisible(true);
    }//GEN-LAST:event_btnGeralClientesActionPerformed

    private void txtPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPesquisaActionPerformed

    private void BtnTdsConsultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnTdsConsultasActionPerformed

        this.consultas = consultaDAO.findByAllTrue(true);
        if (consultas.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Não há consultas agendadas", "Informação", JOptionPane.INFORMATION_MESSAGE);
        } else {
            atualizarTabela();
        }
        limparCampos();
    }//GEN-LAST:event_BtnTdsConsultasActionPerformed

    private void btnGeralMedicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGeralMedicosActionPerformed
        GerenciamentoMedicos medico = new GerenciamentoMedicos(this,true);
        medico.setLocationRelativeTo(null);
        medico.setVisible(true);
    }//GEN-LAST:event_btnGeralMedicosActionPerformed

    private void btnGeralSecretariadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGeralSecretariadoActionPerformed
        GerenciamentoSecretariado secretariado = new GerenciamentoSecretariado(this, true);
        secretariado.setLocationRelativeTo(null);
        secretariado.setVisible(true);
    }//GEN-LAST:event_btnGeralSecretariadoActionPerformed

    private void btnGeralPlanosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGeralPlanosActionPerformed
       GerencimentoPlanos planosM = new GerencimentoPlanos(this,true);
       planosM.setLocationRelativeTo(null);
       planosM.setVisible(true);
    }//GEN-LAST:event_btnGeralPlanosActionPerformed

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
    private javax.swing.JButton BtnTdsConsultas;
    private javax.swing.JButton btnAgendarConsulta;
    private javax.swing.JButton btnAgendarRetorno;
    private javax.swing.JButton btnCancelarConsulta;
    private javax.swing.JButton btnGeralClientes;
    private javax.swing.JButton btnGeralMedicos;
    private javax.swing.JButton btnGeralPlanos;
    private javax.swing.JButton btnGeralSecretariado;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JComboBox<String> cbPesquisaC;
    private com.toedter.calendar.JDateChooser dataPesquisa;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAjuste1;
    private javax.swing.JLabel lblAjuste2;
    private javax.swing.JLabel lblImagem;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel paImagem;
    private javax.swing.JPanel paLateral;
    private javax.swing.JTable tabelaAgenda;
    private javax.swing.JFormattedTextField txtHoraPesq;
    private javax.swing.JTextField txtPesquisa;
    // End of variables declaration//GEN-END:variables
}
