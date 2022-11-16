/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package br.edu.ifsp.pep.visao;

import br.edu.ifsp.pep.dao.MedicoDAO;
import br.edu.ifsp.pep.modelo.Medico;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sabri
 */
public class GerenciamentoMedicos extends javax.swing.JDialog {

    private List<Medico> med = new ArrayList<>() ;
    private List<Medico> medicos;    
    private final Medico medico = new Medico();
    private static MedicoDAO medicoDAO = new MedicoDAO();    
    
    
    public GerenciamentoMedicos(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.habilitar();
        this.cores();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        paineis = new javax.swing.JTabbedPane();
        paListar = new javax.swing.JPanel();
        txtPesquisaMedico = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaMedico = new javax.swing.JTable();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnCadastrar = new javax.swing.JButton();
        lblNomePesquisar = new javax.swing.JLabel();
        paCadastrar = new javax.swing.JPanel();
        btnCancelarCadastro = new javax.swing.JButton();
        lblNome = new javax.swing.JLabel();
        lblBairro = new javax.swing.JLabel();
        lblNumero = new javax.swing.JLabel();
        lblTelefone = new javax.swing.JLabel();
        lblNascimento = new javax.swing.JLabel();
        lblRua = new javax.swing.JLabel();
        lblCpf = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtCPF = new javax.swing.JFormattedTextField();
        txtTelefone = new javax.swing.JFormattedTextField();
        dataNasc = new com.toedter.calendar.JDateChooser();
        txtEmail = new javax.swing.JTextField();
        txtRua = new javax.swing.JTextField();
        txtNumero = new javax.swing.JTextField();
        txtBairro = new javax.swing.JTextField();
        btnCadastrarMed = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblCRM = new javax.swing.JLabel();
        lblLoginNome = new javax.swing.JLabel();
        lblLoginSenha = new javax.swing.JLabel();
        txtCRM = new javax.swing.JTextField();
        txtLoginNome = new javax.swing.JTextField();
        txtLoginSenha = new javax.swing.JTextField();
        txtEspecialidade = new javax.swing.JTextField();
        paAlterar = new javax.swing.JPanel();
        lblNomeAlt = new javax.swing.JLabel();
        txtNomeAlt = new javax.swing.JTextField();
        lblCpfAlt = new javax.swing.JLabel();
        txtCPFAlt = new javax.swing.JFormattedTextField();
        lblNascimentoAlt = new javax.swing.JLabel();
        dataNascAlt = new com.toedter.calendar.JDateChooser();
        lblTelefoneAlt = new javax.swing.JLabel();
        txtTelefoneAlt = new javax.swing.JFormattedTextField();
        lblEmailAlt = new javax.swing.JLabel();
        txtEmailAlt = new javax.swing.JTextField();
        lblRuaAlt = new javax.swing.JLabel();
        txtRuaAlt = new javax.swing.JTextField();
        lblNumeroAlt = new javax.swing.JLabel();
        txtNumeroAlt = new javax.swing.JTextField();
        lblBairroAlt = new javax.swing.JLabel();
        txtBairroAlt = new javax.swing.JTextField();
        btnCancelarAlt = new javax.swing.JButton();
        btnSalvarAlt = new javax.swing.JButton();
        lblStatusAlt = new javax.swing.JLabel();
        cbStatusAlt = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        txtEspecialidadeAlt = new javax.swing.JTextField();
        lblCRM1 = new javax.swing.JLabel();
        txtCRMAlt = new javax.swing.JTextField();
        lblLoginNome1 = new javax.swing.JLabel();
        txtLoginNomeAlt = new javax.swing.JTextField();
        lblLoginSenha1 = new javax.swing.JLabel();
        txtLoginSenhaAlt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblTitulo.setFont(new java.awt.Font("Times New Roman", 0, 48)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(24, 156, 184));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Médicos");

        paineis.setForeground(new java.awt.Color(24, 156, 184));
        paineis.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        paListar.setForeground(new java.awt.Color(24, 156, 184));
        paListar.setToolTipText("");
        paListar.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        txtPesquisaMedico.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        btnPesquisar.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        tabelaMedico.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        tabelaMedico.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CPF", "Nome", "CRM", "Especialidade", "Status"
            }
        ));
        jScrollPane1.setViewportView(tabelaMedico);
        if (tabelaMedico.getColumnModel().getColumnCount() > 0) {
            tabelaMedico.getColumnModel().getColumn(1).setPreferredWidth(250);
        }

        btnAlterar.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnExcluir.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnExcluir.setText("Excluir registro");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnCadastrar.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        lblNomePesquisar.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblNomePesquisar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNomePesquisar.setText("Nome do médico:");

        javax.swing.GroupLayout paListarLayout = new javax.swing.GroupLayout(paListar);
        paListar.setLayout(paListarLayout);
        paListarLayout.setHorizontalGroup(
            paListarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paListarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(paListarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 848, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paListarLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(paListarLayout.createSequentialGroup()
                        .addComponent(lblNomePesquisar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPesquisaMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 562, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        paListarLayout.setVerticalGroup(
            paListarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paListarLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(paListarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPesquisaMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNomePesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
                .addGroup(paListarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        paineis.addTab("Listar Médicos", paListar);

        paCadastrar.setForeground(new java.awt.Color(24, 156, 184));
        paCadastrar.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        btnCancelarCadastro.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnCancelarCadastro.setText("Cancelar cadastro");
        btnCancelarCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarCadastroActionPerformed(evt);
            }
        });

        lblNome.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblNome.setText("Nome:");

        lblBairro.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblBairro.setText("Bairro:");

        lblNumero.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblNumero.setText("Número:");

        lblTelefone.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblTelefone.setText("Número telefone:");

        lblNascimento.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblNascimento.setText("Data de nascimento:");

        lblRua.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblRua.setText("Rua:");

        lblCpf.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblCpf.setText("CPF:");

        lblEmail.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblEmail.setText("Email:");

        txtNome.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        try {
            txtCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txtTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefoneActionPerformed(evt);
            }
        });

        txtEmail.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        txtRua.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        txtNumero.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        txtBairro.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        btnCadastrarMed.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnCadastrarMed.setText("Cadastrar médico");
        btnCadastrarMed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarMedActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Especialidade:");

        lblCRM.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblCRM.setText("CRM: ");

        lblLoginNome.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblLoginNome.setText("Login Nome:");

        lblLoginSenha.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblLoginSenha.setText("Login Senha:");

        txtCRM.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        txtLoginNome.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        txtLoginSenha.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        txtEspecialidade.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        javax.swing.GroupLayout paCadastrarLayout = new javax.swing.GroupLayout(paCadastrar);
        paCadastrar.setLayout(paCadastrarLayout);
        paCadastrarLayout.setHorizontalGroup(
            paCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paCadastrarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(paCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paCadastrarLayout.createSequentialGroup()
                        .addComponent(lblNascimento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblTelefone)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTelefone))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paCadastrarLayout.createSequentialGroup()
                        .addComponent(btnCadastrarMed, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(359, 359, 359)
                        .addComponent(btnCancelarCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(paCadastrarLayout.createSequentialGroup()
                        .addGroup(paCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNome)
                            .addComponent(lblEmail)
                            .addComponent(lblRua)
                            .addComponent(lblBairro)
                            .addComponent(lblCRM))
                        .addGap(15, 15, 15)
                        .addGroup(paCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(paCadastrarLayout.createSequentialGroup()
                                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblCpf)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCPF, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE))
                            .addComponent(txtEmail)
                            .addGroup(paCadastrarLayout.createSequentialGroup()
                                .addGroup(paCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtBairro)
                                    .addGroup(paCadastrarLayout.createSequentialGroup()
                                        .addComponent(txtCRM, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(25, 25, 25)
                                        .addComponent(lblLoginNome, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtLoginNome, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                                    .addComponent(txtRua))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(paCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(paCadastrarLayout.createSequentialGroup()
                                        .addComponent(lblNumero)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtNumero))
                                    .addGroup(paCadastrarLayout.createSequentialGroup()
                                        .addGroup(paCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addComponent(lblLoginSenha, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(paCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtLoginSenha)
                                            .addComponent(txtEspecialidade))))))))
                .addContainerGap())
        );
        paCadastrarLayout.setVerticalGroup(
            paCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paCadastrarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(paCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(paCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNascimento, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(paCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(paCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRua, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRua, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(paCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEspecialidade, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(paCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCRM, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(paCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCRM, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblLoginNome, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtLoginNome, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblLoginSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtLoginSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addGroup(paCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCancelarCadastro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCadastrarMed, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        paineis.addTab("Cadastrar Médico", paCadastrar);

        paAlterar.setForeground(new java.awt.Color(24, 156, 184));
        paAlterar.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        lblNomeAlt.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblNomeAlt.setText("Nome:");

        txtNomeAlt.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        lblCpfAlt.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblCpfAlt.setText("CPF:");

        try {
            txtCPFAlt.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        lblNascimentoAlt.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblNascimentoAlt.setText("Data de nascimento:");

        lblTelefoneAlt.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblTelefoneAlt.setText("Número telefone:");

        try {
            txtTelefoneAlt.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTelefoneAlt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefoneAltActionPerformed(evt);
            }
        });

        lblEmailAlt.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblEmailAlt.setText("Email:");

        txtEmailAlt.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        lblRuaAlt.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblRuaAlt.setText("Rua:");

        txtRuaAlt.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        lblNumeroAlt.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblNumeroAlt.setText("Número:");

        txtNumeroAlt.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        lblBairroAlt.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblBairroAlt.setText("Bairro:");

        txtBairroAlt.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        btnCancelarAlt.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnCancelarAlt.setText("Cancelar alteração");
        btnCancelarAlt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarAltActionPerformed(evt);
            }
        });

        btnSalvarAlt.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnSalvarAlt.setText("Salvar alterações");
        btnSalvarAlt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarAltActionPerformed(evt);
            }
        });

        lblStatusAlt.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblStatusAlt.setText("Status:");

        cbStatusAlt.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        cbStatusAlt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Defina o status...", "1 - Ativo", "0 - Inativo" }));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Especialidade:");

        txtEspecialidadeAlt.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        lblCRM1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblCRM1.setText("CRM: ");

        txtCRMAlt.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        lblLoginNome1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblLoginNome1.setText("Login Nome:");

        txtLoginNomeAlt.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        lblLoginSenha1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblLoginSenha1.setText("Login Senha:");

        txtLoginSenhaAlt.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtLoginSenhaAlt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLoginSenhaAltActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout paAlterarLayout = new javax.swing.GroupLayout(paAlterar);
        paAlterar.setLayout(paAlterarLayout);
        paAlterarLayout.setHorizontalGroup(
            paAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paAlterarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(paAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paAlterarLayout.createSequentialGroup()
                        .addComponent(lblNascimentoAlt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dataNascAlt, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblTelefoneAlt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTelefoneAlt))
                    .addGroup(paAlterarLayout.createSequentialGroup()
                        .addGroup(paAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNomeAlt)
                            .addComponent(lblEmailAlt)
                            .addComponent(lblRuaAlt)
                            .addComponent(lblBairroAlt)
                            .addComponent(lblCRM1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(paAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(paAlterarLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(txtNomeAlt, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblCpfAlt)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCPFAlt))
                            .addComponent(txtEmailAlt)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paAlterarLayout.createSequentialGroup()
                                .addComponent(txtRuaAlt, javax.swing.GroupLayout.PREFERRED_SIZE, 561, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblNumeroAlt)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNumeroAlt))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paAlterarLayout.createSequentialGroup()
                                .addGroup(paAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(paAlterarLayout.createSequentialGroup()
                                        .addComponent(txtBairroAlt, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtEspecialidadeAlt)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblStatusAlt))
                                    .addGroup(paAlterarLayout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(txtCRMAlt, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblLoginNome1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtLoginNomeAlt, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblLoginSenha1)
                                        .addGap(5, 5, 5)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(paAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cbStatusAlt, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtLoginSenhaAlt, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paAlterarLayout.createSequentialGroup()
                        .addComponent(btnSalvarAlt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(369, 369, 369)
                        .addComponent(btnCancelarAlt, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        paAlterarLayout.setVerticalGroup(
            paAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paAlterarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(paAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomeAlt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNomeAlt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCpfAlt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCPFAlt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(paAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNascimentoAlt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dataNascAlt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTelefoneAlt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefoneAlt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(paAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmailAlt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmailAlt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(paAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumeroAlt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumeroAlt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRuaAlt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRuaAlt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(paAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBairroAlt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBairroAlt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEspecialidadeAlt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblStatusAlt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbStatusAlt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(paAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCRM1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCRMAlt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLoginNome1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLoginNomeAlt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLoginSenha1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLoginSenhaAlt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addGroup(paAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvarAlt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelarAlt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addComponent(paineis, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 877, Short.MAX_VALUE))
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

    public void cores() {
        Color corJframe = new Color(249, 253, 253);
        getContentPane().setBackground(corJframe); 
        paineis.getParent().setBackground(corJframe);
        paListar.setBackground(corJframe);
        paCadastrar.setBackground(corJframe);
        paAlterar.setBackground(corJframe);
        
        Color corTabela = new Color(246, 246, 246);
        tabelaMedico.getParent().setBackground(corTabela);
        DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer();
        headerRenderer.setBackground(new Color(24, 156, 184));
        headerRenderer.setHorizontalAlignment(SwingConstants.LEFT);
        for (int i = 0; i < tabelaMedico.getModel().getColumnCount(); i++) {
            tabelaMedico.getColumnModel().getColumn(i).setHeaderRenderer(headerRenderer);
        }  
    }
    
    public void habilitar(){
        paineis.setEnabledAt(0,true);
        paineis.setEnabledAt(1,false);
        paineis.setEnabledAt(2,false);
        btnAlterar.setEnabled(false);
        btnExcluir.setEnabled(false);
    }
    
    private void LimparCamposMedico(){
        txtNome.setText(" ");
        txtCPF.setValue(" ");        
        dataNasc.setDate(new Date());
        txtTelefone.setValue(" ");
        txtEmail.setText(" ");
        txtRua.setText(" ");
        txtNumero.setText(" ");
        txtBairro.setText(" ");
        txtEspecialidade.setText(" ");
        txtCRM.setText(" ");
        txtLoginNome.setText(" ");
        txtLoginSenha.setText(" ");
    }
    
    private void LimparCamposAlterarM(){
        txtNomeAlt.setText(" ");
        txtCPFAlt.setValue(" ");        
        dataNascAlt.setDate(new Date());
        txtTelefoneAlt.setValue(" ");
        txtEmailAlt.setText(" ");
        txtRuaAlt.setText(" ");
        txtNumeroAlt.setText(" ");
        txtBairroAlt.setText(" ");
        txtEspecialidadeAlt.setText(" ");
        txtCRMAlt.setText(" ");
        txtLoginNomeAlt.setText(" ");
        txtLoginSenhaAlt.setText(" ");
        cbStatusAlt.setSelectedIndex(0);
        
    }
    
    private void atualizarTabelaMedico(){
        DefaultTableModel modelo = (DefaultTableModel) tabelaMedico.getModel();
        modelo.setNumRows(0);
        if(medicos.isEmpty()){
             JOptionPane.showMessageDialog(null, "Não há correspondência da pesquisa!", "Vazio", JOptionPane.INFORMATION_MESSAGE);
        }else{
            for(Medico medico : medicos){
                modelo.addRow (new Object[] {medico.getCpf(), medico.getNome(),
                    medico.getNumeroRegistro(), medico.getEspecialidade(), medico.getStatus()});
            }          
        }                
    } 
    
    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        btnAlterar.setEnabled(true);
        btnExcluir.setEnabled(true);
        String nome = txtPesquisaMedico.getText();

        if (nome.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Digite o nome do médico!", "Atenção", JOptionPane.WARNING_MESSAGE);
        } else {
            this.medicos = medicoDAO.findByNome(nome);           
            this.atualizarTabelaMedico();
        }
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed

        int linha = tabelaMedico.getSelectedRow();
        if (linha != -1) {

            paineis.setEnabledAt(0, false);
            paineis.setEnabledAt(1, false);
            paineis.setEnabledAt(2, true);
            paineis.setSelectedIndex(2);

            Medico m = this.medicos.get(linha);
            txtNomeAlt.setText(m.getNome());
            txtCPFAlt.setValue(m.getCpf());
            txtCPFAlt.setEnabled(false);
            dataNascAlt.setDate(m.getDataNascimento());
            txtTelefoneAlt.setValue(m.getTelefone());
            txtEmailAlt.setText(m.getEmail());
            String endereco = m.getEndereco();
            String[] textoSeparado = endereco.split(",");
            txtRuaAlt.setText(textoSeparado[0]);
            txtNumeroAlt.setText(textoSeparado[1]);
            txtBairroAlt.setText(textoSeparado[2]);
            txtEspecialidadeAlt.setText(m.getEspecialidade());
            txtCRMAlt.setText(m.getNumeroRegistro());
            txtLoginNomeAlt.setText(m.getLoginNome());
            txtLoginSenhaAlt.setText(m.getLoginSenha());
            
            if(m.getStatus() == true){
                cbStatusAlt.setSelectedIndex(1);
            }else{
                cbStatusAlt.setSelectedIndex(2);
            }
            txtNomeAlt.requestFocus();
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um registro na tabela", "Selecione", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        this.medicos = medicoDAO.findByAll();
        this.atualizarTabelaMedico();
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        int linha = tabelaMedico.getSelectedRow();
        if (linha != -1) {
            Medico m = this.medicos.get(linha);
            if(m.getStatus() == true){
                int confirmacao = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir esse registro?", "Confirmação", JOptionPane.YES_NO_OPTION);
                if(confirmacao == 0){
                    //verificar se o plano esta pago, se estiver exclui, senão apresentar msg de que tem pendências
                    try{
                        medicoDAO.remover(m);
                        JOptionPane.showMessageDialog(null, "Registro excluído!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                    }catch(Exception e){
                        JOptionPane.showMessageDialog(null,"Não é possível excluir o registro","Alerta", JOptionPane.WARNING_MESSAGE);
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "Operação cancelada!", "Cancelada", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        }
        this.medicos = medicoDAO.findByAll();
        this.atualizarTabelaMedico();
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        paineis.setEnabledAt(0, false);
        paineis.setEnabledAt(1, true);
        paineis.setEnabledAt(2, false);
        paineis.setSelectedIndex(1);
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnCancelarCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarCadastroActionPerformed
        paineis.setEnabledAt(0,true);
        paineis.setEnabledAt(1,false);
        paineis.setEnabledAt(2,false);
        paineis.setSelectedIndex(0);
        btnAlterar.setEnabled(false);
        btnExcluir.setEnabled(false);
        LimparCamposMedico();
    }//GEN-LAST:event_btnCancelarCadastroActionPerformed

    private void txtTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefoneActionPerformed

    private void btnCadastrarMedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarMedActionPerformed
        if(txtNome.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Insira o nome do médico!", "Nome", JOptionPane.WARNING_MESSAGE);
        }else{
            medico.setNome(txtNome.getText());
        }
        if(txtCPF.getValue() == null){
            JOptionPane.showMessageDialog(null, "Insira o CPF do médico!", "CPF", JOptionPane.WARNING_MESSAGE);
        }else{
            medico.setCpf(txtCPF.getText());
        }
        if (dataNasc.getDate() == null) {
            JOptionPane.showMessageDialog(null, "Insira a data de nascimento do médico!", "Data de nascimento", JOptionPane.WARNING_MESSAGE);
        } else {
            try {
                medico.setDataNascimento(dataNasc.getDate());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao salvar a data!", "Erro na data", JOptionPane.ERROR);
            }
        }
        if(txtTelefone.getValue() == null){
            JOptionPane.showMessageDialog(null, "Insira o número de telefone do médico!", "Número de telefone", JOptionPane.WARNING_MESSAGE);
        }else{
            medico.setTelefone(txtTelefone.getText());
        }
        if(txtEmail.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Insira o email do médico!", "Email", JOptionPane.WARNING_MESSAGE);
        }else{
            medico.setEmail(txtEmail.getText());
        }
        if(txtRua.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Insira a rua!", "Rua", JOptionPane.WARNING_MESSAGE);
        }else if(txtNumero.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Insira o número da casa!", "Número da casa", JOptionPane.WARNING_MESSAGE);
        }else if(txtBairro.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Insira o bairro!", "Bairro", JOptionPane.WARNING_MESSAGE);
        }else {
            String endereco;
            String rua = txtRua.getText();
            String numero = txtNumero.getText();
            String bairro = txtBairro.getText();
            endereco = rua+", "+numero+", "+bairro;
            medico.setEndereco(endereco);
        }
        if(txtEspecialidade.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Insira a Especialidade do médico!", "Especialidade", JOptionPane.WARNING_MESSAGE);
        }else{
            medico.setEspecialidade(txtEspecialidade.getText());
        }
        if(txtCRM.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Insira o CRM do médico!", "CRM", JOptionPane.WARNING_MESSAGE);
        }else{
            medico.setNumeroRegistro(txtCRM.getText());
        }
        if(txtLoginNome.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Insira o nome de login do médico!", "Login_Nome", JOptionPane.WARNING_MESSAGE);
        }else{
            medico.setLoginNome(txtLoginNome.getText());
        }
        if(txtLoginSenha.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Insira a senha de login do médico!", "Login_Senha", JOptionPane.WARNING_MESSAGE);
        }else{
            medico.setLoginSenha(txtLoginSenha.getText());
        }        
        medico.setStatus(true);
        try {
            medicoDAO.inserir(medico);
            JOptionPane.showMessageDialog(null, "Médico cadastrado", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar médico", "Erro", JOptionPane.ERROR);
        }
        this.LimparCamposMedico();
    }//GEN-LAST:event_btnCadastrarMedActionPerformed

    private void txtTelefoneAltActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefoneAltActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefoneAltActionPerformed

    private void btnCancelarAltActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarAltActionPerformed
        paineis.setEnabledAt(0,true);
        paineis.setEnabledAt(1,false);
        paineis.setEnabledAt(2,false);
        this.LimparCamposAlterarM();
        paineis.setSelectedIndex(0);
        LimparCamposAlterarM();
    }//GEN-LAST:event_btnCancelarAltActionPerformed

    private void btnSalvarAltActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarAltActionPerformed
        if(txtNomeAlt.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Insira o nome do médico !", "Nome", JOptionPane.WARNING_MESSAGE);
        }else{
            this.medico.setNome(txtNomeAlt.getText());
        }
        if(txtCPFAlt.getValue() == null){
            JOptionPane.showMessageDialog(null, "Insira o CPF do médico!", "CPF", JOptionPane.WARNING_MESSAGE);
        }else{
            this.medico.setCpf(txtCPFAlt.getText());
        }
        if (dataNascAlt.getDate() == null) {
            JOptionPane.showMessageDialog(null, "Insira a data de nascimento do médico!", "Data de nascimento", JOptionPane.WARNING_MESSAGE);
        } else {
            try {
                this.medico.setDataNascimento(dataNascAlt.getDate());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao salvar a data!", "Erro na data", JOptionPane.ERROR);
            }
        }
        if(txtTelefoneAlt.getValue() == null){
            JOptionPane.showMessageDialog(null, "Insira o número de telefone do médico!", "Número de telefone", JOptionPane.WARNING_MESSAGE);
        }else{
            this.medico.setTelefone(txtTelefoneAlt.getText());
        }
        if(txtEmailAlt.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Insira o email do médico!", "Email", JOptionPane.WARNING_MESSAGE);
        }else{
            this.medico.setEmail(txtEmailAlt.getText());
        }
        if(txtRuaAlt.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Insira a rua!", "Rua", JOptionPane.WARNING_MESSAGE);
        }else if(txtNumeroAlt.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Insira o número da casa!", "Número da casa", JOptionPane.WARNING_MESSAGE);
        }else if(txtBairroAlt.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Insira o bairro!", "Bairro", JOptionPane.WARNING_MESSAGE);
        }else {
            String endereco;
            String rua = txtRuaAlt.getText();
            String numero = txtNumeroAlt.getText();
            String bairro = txtBairroAlt.getText();
            endereco = rua+", "+numero+", "+bairro;
            this.medico.setEndereco(endereco);
        }
        if (cbStatusAlt.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Defina o status do médico!", "Status", JOptionPane.WARNING_MESSAGE);
        } else if (cbStatusAlt.getSelectedIndex() == 1) {
            this.medico.setStatus(true);
        } else {
            this.medico.setStatus(false);
        }        
        if(txtEspecialidadeAlt.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Insira a especialidade do médico!", "Especialidade", JOptionPane.WARNING_MESSAGE);
        }else{
            this.medico.setEspecialidade(txtEspecialidadeAlt.getText());
        }
        if(txtCRMAlt.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Insira o CRM do médico!", "CRM", JOptionPane.WARNING_MESSAGE);
        }else{
            this.medico.setNumeroRegistro(txtCRMAlt.getText());
        }
        if(txtLoginNomeAlt.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Insira o nome de login do médico!", "Nome_Login", JOptionPane.WARNING_MESSAGE);
        }else{
            this.medico.setLoginNome(txtLoginNomeAlt.getText());
        }
        if(txtLoginSenhaAlt.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Insira a senha de login do médico!", "Senha_Login", JOptionPane.WARNING_MESSAGE);
        }else{
            this.medico.setLoginSenha(txtLoginSenhaAlt.getText());
        }        
        try {
            medicoDAO.alterar(medico);
            JOptionPane.showMessageDialog(null, "informações alteradas", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao alterar informações", "Erro", JOptionPane.ERROR);
        }
        this.LimparCamposAlterarM();

        paineis.setEnabledAt(0,true);
        paineis.setEnabledAt(1,false);
        paineis.setEnabledAt(2,false);
        paineis.setSelectedIndex(0);
        txtPesquisaMedico.setText(" ");
        
        this.medicos = medicoDAO.findByAll();
        this.atualizarTabelaMedico();
    }//GEN-LAST:event_btnSalvarAltActionPerformed

    private void txtLoginSenhaAltActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLoginSenhaAltActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLoginSenhaAltActionPerformed

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
            java.util.logging.Logger.getLogger(GerenciamentoMedicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GerenciamentoMedicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GerenciamentoMedicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GerenciamentoMedicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                GerenciamentoMedicos dialog = new GerenciamentoMedicos(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnCadastrarMed;
    private javax.swing.JButton btnCancelarAlt;
    private javax.swing.JButton btnCancelarCadastro;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnSalvarAlt;
    private javax.swing.JComboBox<String> cbStatusAlt;
    private com.toedter.calendar.JDateChooser dataNasc;
    private com.toedter.calendar.JDateChooser dataNascAlt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBairro;
    private javax.swing.JLabel lblBairroAlt;
    private javax.swing.JLabel lblCRM;
    private javax.swing.JLabel lblCRM1;
    private javax.swing.JLabel lblCpf;
    private javax.swing.JLabel lblCpfAlt;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEmailAlt;
    private javax.swing.JLabel lblLoginNome;
    private javax.swing.JLabel lblLoginNome1;
    private javax.swing.JLabel lblLoginSenha;
    private javax.swing.JLabel lblLoginSenha1;
    private javax.swing.JLabel lblNascimento;
    private javax.swing.JLabel lblNascimentoAlt;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNomeAlt;
    private javax.swing.JLabel lblNomePesquisar;
    private javax.swing.JLabel lblNumero;
    private javax.swing.JLabel lblNumeroAlt;
    private javax.swing.JLabel lblRua;
    private javax.swing.JLabel lblRuaAlt;
    private javax.swing.JLabel lblStatusAlt;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JLabel lblTelefoneAlt;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel paAlterar;
    private javax.swing.JPanel paCadastrar;
    private javax.swing.JPanel paListar;
    private javax.swing.JTabbedPane paineis;
    private javax.swing.JTable tabelaMedico;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtBairroAlt;
    private javax.swing.JFormattedTextField txtCPF;
    private javax.swing.JFormattedTextField txtCPFAlt;
    private javax.swing.JTextField txtCRM;
    private javax.swing.JTextField txtCRMAlt;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEmailAlt;
    private javax.swing.JTextField txtEspecialidade;
    private javax.swing.JTextField txtEspecialidadeAlt;
    private javax.swing.JTextField txtLoginNome;
    private javax.swing.JTextField txtLoginNomeAlt;
    private javax.swing.JTextField txtLoginSenha;
    private javax.swing.JTextField txtLoginSenhaAlt;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNomeAlt;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtNumeroAlt;
    private javax.swing.JTextField txtPesquisaMedico;
    private javax.swing.JTextField txtRua;
    private javax.swing.JTextField txtRuaAlt;
    private javax.swing.JFormattedTextField txtTelefone;
    private javax.swing.JFormattedTextField txtTelefoneAlt;
    // End of variables declaration//GEN-END:variables
}
