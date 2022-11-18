
package br.edu.ifsp.pep.visao;

import br.edu.ifsp.pep.dao.PlanoMedicoDAO;
import br.edu.ifsp.pep.modelo.PlanoMedico;
import java.awt.Color;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class GerencimentoPlanos extends javax.swing.JDialog {
    private static PlanoMedicoDAO planoDAO = new PlanoMedicoDAO();
    private static PlanoMedico plano = new PlanoMedico();
    private List<PlanoMedico> planos;

    public GerencimentoPlanos(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.cores();
        this.habilitar(); 
        btnAlterar.setEnabled(false);
        btnExcluir.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        paineis = new javax.swing.JTabbedPane();
        paListar = new javax.swing.JPanel();
        txtPesquisaPlano = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaPlanos = new javax.swing.JTable();
        btnExcluir = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnCadastrar = new javax.swing.JButton();
        btnTdsPlanos = new javax.swing.JButton();
        paCadastrar = new javax.swing.JPanel();
        lblNomePlano = new javax.swing.JLabel();
        txtNomePlano = new javax.swing.JTextField();
        lblValor = new javax.swing.JLabel();
        txtValor = new javax.swing.JTextField();
        lblQtdPessoas = new javax.swing.JLabel();
        btnCadastrarPlano = new javax.swing.JButton();
        btnCancelarCadastro = new javax.swing.JButton();
        txtQtdPessoas = new javax.swing.JTextField();
        paAlterar = new javax.swing.JPanel();
        lblNomePlanoAlt = new javax.swing.JLabel();
        txtNomePlanoAlt = new javax.swing.JTextField();
        lblValorAlt = new javax.swing.JLabel();
        txtValorAlt = new javax.swing.JTextField();
        lblQtdPessoasAlt = new javax.swing.JLabel();
        btnSalvarAlteracoes = new javax.swing.JButton();
        btnCancelarAlteracoes = new javax.swing.JButton();
        txtQtdPessoasAlt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblTitulo.setFont(new java.awt.Font("Times New Roman", 0, 48)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(24, 156, 184));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Planos Médicos");

        paListar.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        txtPesquisaPlano.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        btnPesquisar.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        tabelaPlanos.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        tabelaPlanos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Valor"
            }
        ));
        jScrollPane1.setViewportView(tabelaPlanos);
        if (tabelaPlanos.getColumnModel().getColumnCount() > 0) {
            tabelaPlanos.getColumnModel().getColumn(0).setPreferredWidth(300);
        }

        btnExcluir.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnExcluir.setText("Excluir registro");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnAlterar.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnCadastrar.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnTdsPlanos.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnTdsPlanos.setText("Planos:");
        btnTdsPlanos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnTdsPlanos.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnTdsPlanos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTdsPlanosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout paListarLayout = new javax.swing.GroupLayout(paListar);
        paListar.setLayout(paListarLayout);
        paListarLayout.setHorizontalGroup(
            paListarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paListarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(paListarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paListarLayout.createSequentialGroup()
                        .addGap(0, 62, Short.MAX_VALUE)
                        .addComponent(btnCadastrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAlterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnExcluir))
                    .addGroup(paListarLayout.createSequentialGroup()
                        .addComponent(btnTdsPlanos, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPesquisaPlano)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPesquisar)))
                .addContainerGap())
        );
        paListarLayout.setVerticalGroup(
            paListarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paListarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(paListarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPesquisaPlano, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTdsPlanos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(paListarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        paineis.addTab("Listar Planos", paListar);

        paCadastrar.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        lblNomePlano.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblNomePlano.setText("Nome:");

        txtNomePlano.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        lblValor.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblValor.setText("Valor:");

        txtValor.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        lblQtdPessoas.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblQtdPessoas.setText("Quantidade de pessoas:");

        btnCadastrarPlano.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnCadastrarPlano.setText("Cadastrar plano");
        btnCadastrarPlano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarPlanoActionPerformed(evt);
            }
        });

        btnCancelarCadastro.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnCancelarCadastro.setText("Cancelar cadastro");
        btnCancelarCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarCadastroActionPerformed(evt);
            }
        });

        txtQtdPessoas.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        javax.swing.GroupLayout paCadastrarLayout = new javax.swing.GroupLayout(paCadastrar);
        paCadastrar.setLayout(paCadastrarLayout);
        paCadastrarLayout.setHorizontalGroup(
            paCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paCadastrarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(paCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paCadastrarLayout.createSequentialGroup()
                        .addGroup(paCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblValor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblNomePlano, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(paCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNomePlano)
                            .addComponent(txtValor)))
                    .addGroup(paCadastrarLayout.createSequentialGroup()
                        .addComponent(lblQtdPessoas, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtQtdPessoas))
                    .addGroup(paCadastrarLayout.createSequentialGroup()
                        .addComponent(btnCadastrarPlano)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                        .addComponent(btnCancelarCadastro)))
                .addContainerGap())
        );
        paCadastrarLayout.setVerticalGroup(
            paCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paCadastrarLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(paCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomePlano, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNomePlano, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(paCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblValor, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(paCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblQtdPessoas, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtQtdPessoas, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(paCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrarPlano, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelarCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        paineis.addTab("Cadastrar Plano", paCadastrar);

        paAlterar.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        lblNomePlanoAlt.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblNomePlanoAlt.setText("Nome:");

        txtNomePlanoAlt.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        lblValorAlt.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblValorAlt.setText("Valor:");

        txtValorAlt.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        lblQtdPessoasAlt.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblQtdPessoasAlt.setText("Quantidade de pessoas:");

        btnSalvarAlteracoes.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnSalvarAlteracoes.setText("Salvar alterações");
        btnSalvarAlteracoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarAlteracoesActionPerformed(evt);
            }
        });

        btnCancelarAlteracoes.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnCancelarAlteracoes.setText("Cancelar alteração");
        btnCancelarAlteracoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarAlteracoesActionPerformed(evt);
            }
        });

        txtQtdPessoasAlt.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        javax.swing.GroupLayout paAlterarLayout = new javax.swing.GroupLayout(paAlterar);
        paAlterar.setLayout(paAlterarLayout);
        paAlterarLayout.setHorizontalGroup(
            paAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paAlterarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(paAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paAlterarLayout.createSequentialGroup()
                        .addGroup(paAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblValorAlt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblNomePlanoAlt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(paAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNomePlanoAlt)
                            .addComponent(txtValorAlt)))
                    .addGroup(paAlterarLayout.createSequentialGroup()
                        .addComponent(lblQtdPessoasAlt, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtQtdPessoasAlt))
                    .addGroup(paAlterarLayout.createSequentialGroup()
                        .addComponent(btnSalvarAlteracoes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                        .addComponent(btnCancelarAlteracoes)))
                .addContainerGap())
        );
        paAlterarLayout.setVerticalGroup(
            paAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paAlterarLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(paAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomePlanoAlt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNomePlanoAlt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(paAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblValorAlt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtValorAlt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(paAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblQtdPessoasAlt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtQtdPessoasAlt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(paAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvarAlteracoes, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelarAlteracoes, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        paineis.addTab("Alterar Informações", paAlterar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(paineis))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(paineis)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        paineis.setEnabledAt(0,false);
        paineis.setEnabledAt(1,true);
        paineis.setEnabledAt(2,false);
        paineis.setSelectedIndex(1);
    }//GEN-LAST:event_btnCadastrarActionPerformed
    
    private void atualizarTabelaPlanos(){
        DefaultTableModel modelo = (DefaultTableModel) tabelaPlanos.getModel();
        modelo.setNumRows(0);
        if (planos.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Não há correspondência para a pesquisa!", "Vazio", JOptionPane.INFORMATION_MESSAGE);
        } else {
            for (PlanoMedico plano : planos) {
                modelo.addRow(new Object[]{plano.getNome(), plano.getValorMensal()});
            }
        }    
    }
    
    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        btnAlterar.setEnabled(true);
        btnExcluir.setEnabled(true);
        String nome = txtPesquisaPlano.getText();

        if (nome.isEmpty()) {            
            JOptionPane.showMessageDialog(null, "Digite o nome do plano!", "Atenção", JOptionPane.WARNING_MESSAGE);
        } else {
            this.planos = planoDAO.findByNome(nome);
            this.atualizarTabelaPlanos();
        }
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnCadastrarPlanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarPlanoActionPerformed
        if(txtNomePlano.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Digite o nome do plano!", "Atenção", JOptionPane.WARNING_MESSAGE);
        }else{
            plano.setNome(txtNomePlano.getText());
        }
        if(txtValor.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Digite o valor do plano!", "Atenção", JOptionPane.WARNING_MESSAGE);
        }else{
            plano.setValorMensal(new BigDecimal(txtValor.getText()));
        }
        if(txtQtdPessoas.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Digite a quantidade de pessoas permitidas nesse plano!", "Atenção", JOptionPane.WARNING_MESSAGE);
        }else{
            plano.setQtdPessoas(Integer.parseInt(txtQtdPessoas.getText()));
        }
        try {
            planoDAO.inserir(plano);
            JOptionPane.showMessageDialog(null, "Plano cadastrado!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar plano","Erro", JOptionPane.ERROR);
        } 
        LimparCampos();
        txtPesquisaPlano.requestFocus();
        this.planos = planoDAO.findByAll();
        this.atualizarTabelaPlanos();
    }//GEN-LAST:event_btnCadastrarPlanoActionPerformed

    private void btnCancelarCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarCadastroActionPerformed
        paineis.setEnabledAt(0,true);
        paineis.setEnabledAt(1,false);
        paineis.setEnabledAt(2,false);
        paineis.setSelectedIndex(0);
        btnAlterar.setEnabled(false);
        btnExcluir.setEnabled(false);
        LimparCampos();
        txtPesquisaPlano.requestFocus();
    }//GEN-LAST:event_btnCancelarCadastroActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        int linha = tabelaPlanos.getSelectedRow();
        if(linha != -1){
            paineis.setEnabledAt(0, false);
            paineis.setEnabledAt(1, false);
            paineis.setEnabledAt(2, true);
            paineis.setSelectedIndex(2);
            
            PlanoMedico p = this.planos.get(linha);
            txtNomePlanoAlt.setText(p.getNome());
            txtValorAlt.setText(String.valueOf(p.getValorMensal()));
            txtQtdPessoasAlt.setText(String.valueOf(p.getQtdPessoas()));        
        }else{
            JOptionPane.showMessageDialog(null, "Selecione um registro na tabela", "Selecione", JOptionPane.WARNING_MESSAGE);            
        }
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnSalvarAlteracoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarAlteracoesActionPerformed
        if(txtNomePlanoAlt.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Digite o nome do plano!", "Atenção", JOptionPane.WARNING_MESSAGE);
        }else{
            this.plano.setNome(txtNomePlanoAlt.getText());
        }
        if(txtValorAlt.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Digite o valor do plano!", "Atenção", JOptionPane.WARNING_MESSAGE);
        }else{
            this.plano.setValorMensal(new BigDecimal(txtValorAlt.getText()));
        }
        if(txtQtdPessoasAlt.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Digite a quantidade de pessoas permitidas neste plano!", "Atenção", JOptionPane.WARNING_MESSAGE);
        }else{
            this.plano.setQtdPessoas(Integer.parseInt(txtQtdPessoasAlt.getText()));
        }
        try {
            planoDAO.alterar(plano);
            JOptionPane.showMessageDialog(null, "informações alteradas", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao alterar informações", "Erro", JOptionPane.ERROR);
        } 
        this.LimparCamposAlterar();       
        paineis.setEnabledAt(0,true);
        paineis.setEnabledAt(1,false);
        paineis.setEnabledAt(2,false);
        paineis.setSelectedIndex(0); 
        this.planos = planoDAO.findByAll();
        this.atualizarTabelaPlanos();
        
        txtPesquisaPlano.setText(" ");
        txtPesquisaPlano.requestFocus();
    }//GEN-LAST:event_btnSalvarAlteracoesActionPerformed

    private void btnCancelarAlteracoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarAlteracoesActionPerformed
        paineis.setEnabledAt(0, true);
        paineis.setEnabledAt(1, false);
        paineis.setEnabledAt(2, false);
        this.LimparCamposAlterar();
        paineis.setSelectedIndex(0);
        this.atualizarTabelaPlanos();
        txtPesquisaPlano.setText(" ");
        txtPesquisaPlano.requestFocus();
    }//GEN-LAST:event_btnCancelarAlteracoesActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        int linha = tabelaPlanos.getSelectedRow();
        if (linha != -1) {
            PlanoMedico p = this.planos.get(linha);
            int confirmacao = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir esse registro?", "Confirmação", JOptionPane.YES_NO_OPTION);
            if (confirmacao == 0) {
                try {
                    planoDAO.remover(p);
                    JOptionPane.showMessageDialog(null, "Registro excluído!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Não é possível excluir o registro", "Alerta", JOptionPane.WARNING_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Operação cancelada!", "Cancelada", JOptionPane.INFORMATION_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Operação cancelada!", "Cancelada", JOptionPane.INFORMATION_MESSAGE);
        }
        
        this.planos = planoDAO.findByAll();
        this.atualizarTabelaPlanos();
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnTdsPlanosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTdsPlanosActionPerformed
        btnAlterar.setEnabled(true);
        btnExcluir.setEnabled(true);
        this.planos = planoDAO.findByAll();
        this.atualizarTabelaPlanos();
    }//GEN-LAST:event_btnTdsPlanosActionPerformed
    
    private void LimparCampos(){
        txtNomePlano.setText(" ");
        txtValor.setText(" ");
        txtQtdPessoas.setText(" ");
    }
    
    private void LimparCamposAlterar(){
        txtNomePlanoAlt.setText(" ");
        txtValorAlt.setText(" ");
        txtQtdPessoasAlt.setText(" ");
    }
    
    public void habilitar(){
        paineis.setEnabledAt(0,true);
        paineis.setEnabledAt(1,false);
        paineis.setEnabledAt(2,false);
    }
    
    public void cores() {
        Color corJframe = new Color(249, 253, 253);
        getContentPane().setBackground(corJframe); 
        paineis.getParent().setBackground(corJframe);
        paListar.setBackground(corJframe);
        paCadastrar.setBackground(corJframe);
        paAlterar.setBackground(corJframe);
        
        Color corTabela = new Color(246, 246, 246);
        tabelaPlanos.getParent().setBackground(corTabela);
        DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer();
        headerRenderer.setBackground(new Color(24, 156, 184));
        headerRenderer.setHorizontalAlignment(SwingConstants.LEFT);
        for (int i = 0; i < tabelaPlanos.getModel().getColumnCount(); i++) {
            tabelaPlanos.getColumnModel().getColumn(i).setHeaderRenderer(headerRenderer);
        }  
    }
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
            java.util.logging.Logger.getLogger(GerencimentoPlanos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GerencimentoPlanos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GerencimentoPlanos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GerencimentoPlanos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                GerencimentoPlanos dialog = new GerencimentoPlanos(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnCadastrarPlano;
    private javax.swing.JButton btnCancelarAlteracoes;
    private javax.swing.JButton btnCancelarCadastro;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnSalvarAlteracoes;
    private javax.swing.JButton btnTdsPlanos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblNomePlano;
    private javax.swing.JLabel lblNomePlanoAlt;
    private javax.swing.JLabel lblQtdPessoas;
    private javax.swing.JLabel lblQtdPessoasAlt;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblValor;
    private javax.swing.JLabel lblValorAlt;
    private javax.swing.JPanel paAlterar;
    private javax.swing.JPanel paCadastrar;
    private javax.swing.JPanel paListar;
    private javax.swing.JTabbedPane paineis;
    private javax.swing.JTable tabelaPlanos;
    private javax.swing.JTextField txtNomePlano;
    private javax.swing.JTextField txtNomePlanoAlt;
    private javax.swing.JTextField txtPesquisaPlano;
    private javax.swing.JTextField txtQtdPessoas;
    private javax.swing.JTextField txtQtdPessoasAlt;
    private javax.swing.JTextField txtValor;
    private javax.swing.JTextField txtValorAlt;
    // End of variables declaration//GEN-END:variables
}
