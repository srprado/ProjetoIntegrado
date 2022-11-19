
package br.edu.ifsp.pep.visao;

import br.edu.ifsp.pep.dao.SecretariadoDAO;
import br.edu.ifsp.pep.modelo.Secretariado;
import java.awt.Color;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class GerenciamentoSecretariado extends javax.swing.JDialog {
    
    private List<Secretariado> secretariados;
    private SecretariadoDAO secretaDAO = new SecretariadoDAO();
    private final Secretariado secretariado = new Secretariado();

    public GerenciamentoSecretariado(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.cores();
        this.habilitar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        paineis = new javax.swing.JTabbedPane();
        paListar = new javax.swing.JPanel();
        txtPesquisaSecretariado = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaSecretariado = new javax.swing.JTable();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnCadastrar = new javax.swing.JButton();
        btnNomeFuncionario = new javax.swing.JButton();
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
        lblLoginNome = new javax.swing.JLabel();
        lblLoginSenha = new javax.swing.JLabel();
        txtLoginNome = new javax.swing.JTextField();
        txtLoginSenha = new javax.swing.JTextField();
        lblFuncao = new javax.swing.JLabel();
        txtFuncao = new javax.swing.JTextField();
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
        lblLoginNome1 = new javax.swing.JLabel();
        txtLoginNomeAlt = new javax.swing.JTextField();
        lblLoginSenha1 = new javax.swing.JLabel();
        txtLoginSenhaAlt = new javax.swing.JTextField();
        lblFuncaoAlt = new javax.swing.JLabel();
        txtFuncaoAlt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblTitulo.setFont(new java.awt.Font("Times New Roman", 0, 48)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(24, 156, 184));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Secretariado");

        paineis.setForeground(new java.awt.Color(24, 156, 184));
        paineis.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        paListar.setForeground(new java.awt.Color(24, 156, 184));
        paListar.setToolTipText("");
        paListar.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        txtPesquisaSecretariado.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        btnPesquisar.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        tabelaSecretariado.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        tabelaSecretariado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CPF", "Nome", "Função", "Status"
            }
        ));
        jScrollPane1.setViewportView(tabelaSecretariado);
        if (tabelaSecretariado.getColumnModel().getColumnCount() > 0) {
            tabelaSecretariado.getColumnModel().getColumn(1).setPreferredWidth(250);
            tabelaSecretariado.getColumnModel().getColumn(2).setPreferredWidth(200);
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

        btnNomeFuncionario.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnNomeFuncionario.setText("Nome do funcionário:");
        btnNomeFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNomeFuncionarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout paListarLayout = new javax.swing.GroupLayout(paListar);
        paListar.setLayout(paListarLayout);
        paListarLayout.setHorizontalGroup(
            paListarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paListarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(paListarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(paListarLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(paListarLayout.createSequentialGroup()
                        .addComponent(btnNomeFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPesquisaSecretariado, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(157, 157, 157))
        );
        paListarLayout.setVerticalGroup(
            paListarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paListarLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(paListarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPesquisaSecretariado, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNomeFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(paListarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        paineis.addTab("Listar Secretariado", paListar);

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
        btnCadastrarMed.setText("Cadastrar secretariado");
        btnCadastrarMed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarMedActionPerformed(evt);
            }
        });

        lblLoginNome.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblLoginNome.setText("Login Nome:");

        lblLoginSenha.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblLoginSenha.setText("Login Senha:");

        txtLoginNome.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        txtLoginSenha.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        lblFuncao.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblFuncao.setText("Função:");

        txtFuncao.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

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
                        .addComponent(btnCadastrarMed, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                        .addGap(359, 359, 359)
                        .addComponent(btnCancelarCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(paCadastrarLayout.createSequentialGroup()
                        .addGroup(paCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNome)
                            .addComponent(lblRua)
                            .addComponent(lblBairro))
                        .addGroup(paCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(paCadastrarLayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblCpf)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCPF))
                            .addGroup(paCadastrarLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(paCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(paCadastrarLayout.createSequentialGroup()
                                        .addGroup(paCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(paCadastrarLayout.createSequentialGroup()
                                                .addComponent(lblLoginSenha)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtLoginSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(txtRua, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblNumero)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtNumero))
                                    .addGroup(paCadastrarLayout.createSequentialGroup()
                                        .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblFuncao)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtFuncao))))))
                    .addGroup(paCadastrarLayout.createSequentialGroup()
                        .addComponent(lblEmail)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtEmail))
                    .addGroup(paCadastrarLayout.createSequentialGroup()
                        .addComponent(lblLoginNome, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtLoginNome, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
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
                .addGroup(paCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtRua, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(paCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblRua, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(paCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFuncao, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFuncao, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(paCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLoginSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLoginNome, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLoginNome, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLoginSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(paCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCancelarCadastro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCadastrarMed, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        paineis.addTab("Cadastrar Secretariado", paCadastrar);

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

        lblFuncaoAlt.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblFuncaoAlt.setText("Função:");

        txtFuncaoAlt.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        javax.swing.GroupLayout paAlterarLayout = new javax.swing.GroupLayout(paAlterar);
        paAlterar.setLayout(paAlterarLayout);
        paAlterarLayout.setHorizontalGroup(
            paAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paAlterarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(paAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paAlterarLayout.createSequentialGroup()
                        .addComponent(lblLoginNome1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtLoginNomeAlt)
                        .addGap(18, 18, 18)
                        .addComponent(lblLoginSenha1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtLoginSenhaAlt)
                        .addGap(25, 25, 25)
                        .addComponent(lblStatusAlt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbStatusAlt, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paAlterarLayout.createSequentialGroup()
                        .addComponent(lblNascimentoAlt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dataNascAlt, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblTelefoneAlt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTelefoneAlt))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paAlterarLayout.createSequentialGroup()
                        .addComponent(btnSalvarAlt, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCancelarAlt, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paAlterarLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(paAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNomeAlt)
                            .addComponent(lblEmailAlt)
                            .addComponent(lblRuaAlt)
                            .addComponent(lblBairroAlt))
                        .addGroup(paAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(paAlterarLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(txtNomeAlt, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblCpfAlt)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCPFAlt, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(paAlterarLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(paAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtEmailAlt)
                                    .addGroup(paAlterarLayout.createSequentialGroup()
                                        .addGroup(paAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(paAlterarLayout.createSequentialGroup()
                                                .addComponent(txtRuaAlt, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lblNumeroAlt)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtNumeroAlt, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(paAlterarLayout.createSequentialGroup()
                                                .addComponent(txtBairroAlt, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(lblFuncaoAlt)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtFuncaoAlt)))
                                        .addGap(0, 0, Short.MAX_VALUE)))))))
                .addGap(22, 22, 22))
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
                    .addGroup(paAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblNascimentoAlt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(paAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTelefoneAlt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTelefoneAlt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(dataNascAlt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(paAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEmailAlt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmailAlt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(paAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paAlterarLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(lblRuaAlt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(paAlterarLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(paAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtRuaAlt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNumeroAlt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNumeroAlt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(paAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBairroAlt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBairroAlt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFuncaoAlt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFuncaoAlt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(paAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLoginSenha1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLoginNomeAlt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLoginNome1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblStatusAlt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbStatusAlt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLoginSenhaAlt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
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
                    .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 877, Short.MAX_VALUE)
                    .addComponent(paineis, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(paineis, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void atualizarTabelaSecretariado(){
        DefaultTableModel modelo = (DefaultTableModel) tabelaSecretariado.getModel();
        modelo.setNumRows(0);
        if(secretariados.isEmpty()){
            JOptionPane.showMessageDialog(null, "Não há correspondência para a pesquisa!", "Vazio", JOptionPane.INFORMATION_MESSAGE);       
        }else{
            for(Secretariado sec: secretariados){
                modelo.addRow(new Object[]{sec.getCpf(), sec.getNome(), sec.getFuncao(), sec.getStatus()});
            }
        }   
    }
    
    public void cores() {
        Color corJframe = new Color(249, 253, 253);
        getContentPane().setBackground(corJframe); 
        paineis.getParent().setBackground(corJframe);
        paListar.setBackground(corJframe);
        paCadastrar.setBackground(corJframe);
        paAlterar.setBackground(corJframe);
        
        Color corTabela = new Color(246, 246, 246);
        tabelaSecretariado.getParent().setBackground(corTabela);
        DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer();
        headerRenderer.setBackground(new Color(24, 156, 184));
        headerRenderer.setHorizontalAlignment(SwingConstants.LEFT);
        for (int i = 0; i < tabelaSecretariado.getModel().getColumnCount(); i++) {
            tabelaSecretariado.getColumnModel().getColumn(i).setHeaderRenderer(headerRenderer);
        }  
    }
    
    public void habilitar(){
        paineis.setEnabledAt(0,true);
        paineis.setEnabledAt(1,false);
        paineis.setEnabledAt(2,false);
        btnAlterar.setEnabled(false);
        btnExcluir.setEnabled(false);
    }
     
    private void LimparCamposSecretariado(){
        txtNome.setText(" ");
        txtCPF.setValue(" ");        
        dataNasc.setDate(new Date());
        txtTelefone.setValue(" ");
        txtEmail.setText(" ");
        txtRua.setText(" ");
        txtNumero.setText(" ");
        txtBairro.setText(" ");
        txtFuncao.setText(" ");
        txtLoginNome.setText(" ");
        txtLoginSenha.setText(" ");
        txtPesquisaSecretariado.setText(" ");
    }
    
    private void LimparCamposAlterarS(){
        txtNomeAlt.setText(" ");
        txtCPFAlt.setValue(" ");        
        dataNascAlt.setDate(new Date());
        txtTelefoneAlt.setValue(" ");
        txtEmailAlt.setText(" ");
        txtRuaAlt.setText(" ");
        txtNumeroAlt.setText(" ");
        txtBairroAlt.setText(" ");
        txtFuncaoAlt.setText(" ");
        txtLoginNomeAlt.setText(" ");
        txtLoginSenhaAlt.setText(" ");
        cbStatusAlt.setSelectedIndex(0);        
    }
    
    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        btnAlterar.setEnabled(true);
        btnExcluir.setEnabled(true);
        String nome = txtPesquisaSecretariado.getText();

        if (nome.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Digite o nome do funcionário!", "Atenção", JOptionPane.WARNING_MESSAGE);
        } else {
            this.secretariados = secretaDAO.findByNome(nome);
            this.atualizarTabelaSecretariado();
        }
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        int linha = tabelaSecretariado.getSelectedRow();
        if (linha != -1) {

            paineis.setEnabledAt(0, false);
            paineis.setEnabledAt(1, false);
            paineis.setEnabledAt(2, true);
            paineis.setSelectedIndex(2);

            Secretariado s = this.secretariados.get(linha);
            txtNomeAlt.setText(s.getNome());
            txtCPFAlt.setValue(s.getCpf());
            txtCPFAlt.setEnabled(false);
            dataNascAlt.setDate(s.getDataNascimento());
            txtTelefoneAlt.setValue(s.getTelefone());
            txtEmailAlt.setText(s.getEmail());
            String endereco = s.getEndereco();
            String[] textoSeparado = endereco.split(",");
            txtRuaAlt.setText(textoSeparado[0]);
            txtNumeroAlt.setText(textoSeparado[1]);
            txtBairroAlt.setText(textoSeparado[2]);
            txtFuncaoAlt.setText(s.getFuncao());
            txtLoginNomeAlt.setText(s.getLoginNome());
            txtLoginSenhaAlt.setText(s.getLoginSenha());

            if(s.getStatus() == true){
                cbStatusAlt.setSelectedIndex(1);
            }else{
                cbStatusAlt.setSelectedIndex(2);
            }
            txtNomeAlt.requestFocus();
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um registro na tabela", "Selecione", JOptionPane.WARNING_MESSAGE);
            return;
        }
        this.secretariados = secretaDAO.findByAll();
        this.atualizarTabelaSecretariado();
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        int linha = tabelaSecretariado.getSelectedRow();
        if (linha != -1) {
            Secretariado s = this.secretariados.get(linha);
            if(s.getStatus() == true){
                int confirmacao = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir esse registro?", "Confirmação", JOptionPane.YES_NO_OPTION);
                if(confirmacao == 0){
                    //verificar se o plano esta pago, se estiver exclui, senão apresentar msg de que tem pendências
                    try{
                        secretaDAO.remover(s);
                        JOptionPane.showMessageDialog(null, "Registro excluído!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                    }catch(Exception e){
                        JOptionPane.showMessageDialog(null,"Não é possível excluir o registro","Alerta", JOptionPane.WARNING_MESSAGE);
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "Operação cancelada!", "Cancelada", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        }
        this.secretariados = secretaDAO.findByAll();
        this.atualizarTabelaSecretariado();
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
        LimparCamposSecretariado();
        txtPesquisaSecretariado.requestFocus();
    }//GEN-LAST:event_btnCancelarCadastroActionPerformed

    private void txtTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefoneActionPerformed

    private void btnCadastrarMedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarMedActionPerformed
        if(txtNome.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Insira o nome do funcionário!", "Nome", JOptionPane.WARNING_MESSAGE);
        }else{
            secretariado.setNome(txtNome.getText());
        }
        if(txtCPF.getValue() == null){
            JOptionPane.showMessageDialog(null, "Insira o CPF do funcionário!", "CPF", JOptionPane.WARNING_MESSAGE);
        }else{
            secretariado.setCpf(txtCPF.getText());
        }
        if (dataNasc.getDate() == null) {
            JOptionPane.showMessageDialog(null, "Insira a data de nascimento do funcionário!", "Data de nascimento", JOptionPane.WARNING_MESSAGE);
        } else {
            try {
                secretariado.setDataNascimento(dataNasc.getDate());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao salvar a data!", "Erro na data", JOptionPane.ERROR);
            }
        }
        if(txtTelefone.getValue() == null){
            JOptionPane.showMessageDialog(null, "Insira o número de telefone do funcionário!", "Número de telefone", JOptionPane.WARNING_MESSAGE);
        }else{
            secretariado.setTelefone(txtTelefone.getText());
        }
        if(txtEmail.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Insira o email do funcionário!", "Email", JOptionPane.WARNING_MESSAGE);
        }else{
            secretariado.setEmail(txtEmail.getText());
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
            secretariado.setEndereco(endereco);
        }
        
        if(txtFuncao.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Insira a função do funcionário","Função",JOptionPane.WARNING_MESSAGE);
        }else{
            secretariado.setFuncao(txtFuncao.getText());
        }        
        if(txtLoginNome.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Insira o nome de login do funcionário!", "Login_Nome", JOptionPane.WARNING_MESSAGE);
        }else{
            secretariado.setLoginNome(txtLoginNome.getText());
        }
        if(txtLoginSenha.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Insira a senha de login do funcionário!", "Login_Senha", JOptionPane.WARNING_MESSAGE);
        }else{
            secretariado.setLoginSenha(txtLoginSenha.getText());
        }
        secretariado.setStatus(true);
        try {
            secretaDAO.inserir(secretariado);
            JOptionPane.showMessageDialog(null, "Funcionário cadastrado", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar funcionário", "Erro", JOptionPane.ERROR);
        }
        this.LimparCamposSecretariado();
    }//GEN-LAST:event_btnCadastrarMedActionPerformed

    private void txtTelefoneAltActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefoneAltActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefoneAltActionPerformed

    private void btnCancelarAltActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarAltActionPerformed
        paineis.setEnabledAt(0,true);
        paineis.setEnabledAt(1,false);
        paineis.setEnabledAt(2,false);
        paineis.setSelectedIndex(0);
        LimparCamposAlterarS();
    }//GEN-LAST:event_btnCancelarAltActionPerformed

    private void btnSalvarAltActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarAltActionPerformed
        if(txtNomeAlt.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Insira o nome do funcionário !", "Nome", JOptionPane.WARNING_MESSAGE);
        }else{
            this.secretariado.setNome(txtNomeAlt.getText());
        }
        if(txtCPFAlt.getValue() == null){
            JOptionPane.showMessageDialog(null, "Insira o CPF do funcionário!", "CPF", JOptionPane.WARNING_MESSAGE);
        }else{
            this.secretariado.setCpf(txtCPFAlt.getText());
        }
        if (dataNascAlt.getDate() == null) {
            JOptionPane.showMessageDialog(null, "Insira a data de nascimento do funcionário!", "Data de nascimento", JOptionPane.WARNING_MESSAGE);
        } else {
            try {
                this.secretariado.setDataNascimento(dataNascAlt.getDate());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao salvar a data!", "Erro na data", JOptionPane.ERROR);
            }
        }
        if(txtTelefoneAlt.getValue() == null){
            JOptionPane.showMessageDialog(null, "Insira o número de telefone do funcionário!", "Número de telefone", JOptionPane.WARNING_MESSAGE);
        }else{
            this.secretariado.setTelefone(txtTelefoneAlt.getText());
        }
        if(txtEmailAlt.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Insira o email do funcionário!", "Email", JOptionPane.WARNING_MESSAGE);
        }else{
            this.secretariado.setEmail(txtEmailAlt.getText());
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
            this.secretariado.setEndereco(endereco);
        }
        if (cbStatusAlt.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Defina o status do funcionário!", "Status", JOptionPane.WARNING_MESSAGE);
        } else if (cbStatusAlt.getSelectedIndex() == 1) {
            this.secretariado.setStatus(true);
        } else {
            this.secretariado.setStatus(false);
        }
        if(txtFuncaoAlt.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Insira a função do funcionário","Função", JOptionPane.WARNING_MESSAGE);
        }else{
            this.secretariado.setFuncao(txtFuncaoAlt.getText());
        }
        if(txtLoginNomeAlt.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Insira o nome de login do funcionário","Nome_Login", JOptionPane.WARNING_MESSAGE);
        }else{
            this.secretariado.setLoginNome(txtLoginNomeAlt.getText());
        }
        if(txtLoginSenhaAlt.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Insira a senha de login do funcionário","Senha_Login", JOptionPane.WARNING_MESSAGE);
        }else{
            this.secretariado.setLoginSenha(txtLoginSenhaAlt.getText());
        }
        try {
            secretaDAO.alterar(secretariado);
            JOptionPane.showMessageDialog(null, "informações alteradas", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao alterar informações", "Erro", JOptionPane.ERROR);
        }
        this.LimparCamposAlterarS();

        paineis.setEnabledAt(0,true);
        paineis.setEnabledAt(1,false);
        paineis.setEnabledAt(2,false);
        paineis.setSelectedIndex(0);
        this.secretariados = secretaDAO.findByAll();
        this.atualizarTabelaSecretariado();        
        txtPesquisaSecretariado.setText(" ");
    }//GEN-LAST:event_btnSalvarAltActionPerformed

    private void txtLoginSenhaAltActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLoginSenhaAltActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLoginSenhaAltActionPerformed

    private void btnNomeFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNomeFuncionarioActionPerformed
        this.secretariados = secretaDAO.findByAll();
        if (secretariados.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Não há funcionários cadastrados", "Informação", JOptionPane.INFORMATION_MESSAGE);
        } else {
            atualizarTabelaSecretariado();
        }
    }//GEN-LAST:event_btnNomeFuncionarioActionPerformed

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
            java.util.logging.Logger.getLogger(GerenciamentoSecretariado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GerenciamentoSecretariado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GerenciamentoSecretariado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GerenciamentoSecretariado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                GerenciamentoSecretariado dialog = new GerenciamentoSecretariado(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnNomeFuncionario;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnSalvarAlt;
    private javax.swing.JComboBox<String> cbStatusAlt;
    private com.toedter.calendar.JDateChooser dataNasc;
    private com.toedter.calendar.JDateChooser dataNascAlt;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBairro;
    private javax.swing.JLabel lblBairroAlt;
    private javax.swing.JLabel lblCpf;
    private javax.swing.JLabel lblCpfAlt;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEmailAlt;
    private javax.swing.JLabel lblFuncao;
    private javax.swing.JLabel lblFuncaoAlt;
    private javax.swing.JLabel lblLoginNome;
    private javax.swing.JLabel lblLoginNome1;
    private javax.swing.JLabel lblLoginSenha;
    private javax.swing.JLabel lblLoginSenha1;
    private javax.swing.JLabel lblNascimento;
    private javax.swing.JLabel lblNascimentoAlt;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNomeAlt;
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
    private javax.swing.JTable tabelaSecretariado;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtBairroAlt;
    private javax.swing.JFormattedTextField txtCPF;
    private javax.swing.JFormattedTextField txtCPFAlt;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEmailAlt;
    private javax.swing.JTextField txtFuncao;
    private javax.swing.JTextField txtFuncaoAlt;
    private javax.swing.JTextField txtLoginNome;
    private javax.swing.JTextField txtLoginNomeAlt;
    private javax.swing.JTextField txtLoginSenha;
    private javax.swing.JTextField txtLoginSenhaAlt;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNomeAlt;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtNumeroAlt;
    private javax.swing.JTextField txtPesquisaSecretariado;
    private javax.swing.JTextField txtRua;
    private javax.swing.JTextField txtRuaAlt;
    private javax.swing.JFormattedTextField txtTelefone;
    private javax.swing.JFormattedTextField txtTelefoneAlt;
    // End of variables declaration//GEN-END:variables
}
