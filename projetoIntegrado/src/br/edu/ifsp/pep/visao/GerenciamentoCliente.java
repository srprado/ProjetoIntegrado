
package br.edu.ifsp.pep.visao;

import br.edu.ifsp.pep.dao.ClienteDAO;
import br.edu.ifsp.pep.dao.PlanoMedicoDAO;
import br.edu.ifsp.pep.modelo.Cliente;
import br.edu.ifsp.pep.modelo.PlanoMedico;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class GerenciamentoCliente extends javax.swing.JDialog {
    private List<Cliente> clies = new ArrayList<>() ;
    private List<Cliente> clientes;    
    private final Cliente cliente = new Cliente();
    private static ClienteDAO clienteDAO = new ClienteDAO();    
    private final PlanoMedicoDAO planoDAO = new PlanoMedicoDAO();   
    
    public GerenciamentoCliente(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.cores();
        this.habilitar();
        this.carregarPlanosMedicos();
        this.carregarPlanosMedicosAlt();
    }
    
    public void habilitar(){
        paineis.setEnabledAt(0,true);
        paineis.setEnabledAt(1,false);
        paineis.setEnabledAt(2,false);
        btnAlterar.setEnabled(false);
        btnExcluir.setEnabled(false);
        btnListarAssociados.setEnabled(false);
    }
    
    public void cores() {
        Color corJframe = new Color(249, 253, 253);
        getContentPane().setBackground(corJframe); 
        paineis.getParent().setBackground(corJframe);
        paListar.setBackground(corJframe);
        paCadastrar.setBackground(corJframe);
        paAlterar.setBackground(corJframe);
        
        Color corTabela = new Color(246, 246, 246);
        tabela.getParent().setBackground(corTabela);
        DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer();
        headerRenderer.setBackground(new Color(24, 156, 184));
        headerRenderer.setHorizontalAlignment(SwingConstants.LEFT);
        for (int i = 0; i < tabela.getModel().getColumnCount(); i++) {
            tabela.getColumnModel().getColumn(i).setHeaderRenderer(headerRenderer);
        }  
    }
    
    private void atualizarTabela() {
        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
        modelo.setNumRows(0);
        if (clientes.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Não há correspondência para a pesquisa!", "Vazio", JOptionPane.INFORMATION_MESSAGE);
        } else {
            btnAlterar.setEnabled(true);
            btnExcluir.setEnabled(true);
            btnListarAssociados.setEnabled(true);
            for (Cliente cliente : clientes) {
                modelo.addRow(new Object[]{cliente.getCpf(), cliente.getNome(),
                    cliente.getPlanoMedico().getNome(), cliente.getStatus(), cliente.getTitularCpf()});
            }
        }
    }   
    
    private void atualizarTabelaByCPF(Cliente cli) {
        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
        modelo.setNumRows(0);
        clies.add(cli);
        modelo.addRow(new Object[]{cli.getCpf(), cli.getNome(),
        cli.getPlanoMedico().getNome(), cli.isStatus(), cli.getTitularCpf()});              
   }
    
    private void carregarPlanosMedicos(){         
        DefaultComboBoxModel modelo = (DefaultComboBoxModel) cbPlanoMedico.getModel();
        modelo.addElement("Planos Médicos...");
        for (PlanoMedico plano : planoDAO.findByAll()) {
            modelo.addElement(plano);
        }
    }
    
    private void carregarPlanosMedicosAlt(){        
        DefaultComboBoxModel modelo = (DefaultComboBoxModel) cbPlanoMedicoAlt.getModel();
        modelo.addElement("Planos Médicos...");
        for (PlanoMedico plano : planoDAO.findByAll()) {
            modelo.addElement(plano);
        }
    }
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        lblTitulo = new javax.swing.JLabel();
        paineis = new javax.swing.JTabbedPane();
        paListar = new javax.swing.JPanel();
        txtPesquisaCliente = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnCadastrar = new javax.swing.JButton();
        btnNomeCliente = new javax.swing.JButton();
        btnListarAssociados = new javax.swing.JButton();
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
        lblTitular = new javax.swing.JLabel();
        cbPlanoMedico = new javax.swing.JComboBox<>();
        txtNome = new javax.swing.JTextField();
        txtCPF = new javax.swing.JFormattedTextField();
        txtTelefone = new javax.swing.JFormattedTextField();
        dataNasc = new com.toedter.calendar.JDateChooser();
        txtEmail = new javax.swing.JTextField();
        txtRua = new javax.swing.JTextField();
        txtNumero = new javax.swing.JTextField();
        txtBairro = new javax.swing.JTextField();
        txtTitular = new javax.swing.JFormattedTextField();
        btnCadastrarCli = new javax.swing.JButton();
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
        cbPlanoMedicoAlt = new javax.swing.JComboBox<>();
        lblTitularAlt = new javax.swing.JLabel();
        txtTitularAlt = new javax.swing.JFormattedTextField();
        btnCancelarAlt = new javax.swing.JButton();
        btnSalvarAlt = new javax.swing.JButton();
        lblStatusAlt = new javax.swing.JLabel();
        cbStatusAlt = new javax.swing.JComboBox<>();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblTitulo.setFont(new java.awt.Font("Times New Roman", 0, 48)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(24, 156, 184));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Clientes");

        paineis.setForeground(new java.awt.Color(24, 156, 184));
        paineis.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        paListar.setForeground(new java.awt.Color(24, 156, 184));
        paListar.setToolTipText("");
        paListar.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        txtPesquisaCliente.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        btnPesquisar.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        tabela.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CPF", "Nome", "Plano", "Status", "Titular"
            }
        ));
        jScrollPane1.setViewportView(tabela);
        if (tabela.getColumnModel().getColumnCount() > 0) {
            tabela.getColumnModel().getColumn(1).setPreferredWidth(220);
            tabela.getColumnModel().getColumn(3).setPreferredWidth(20);
            tabela.getColumnModel().getColumn(4).setPreferredWidth(200);
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

        btnNomeCliente.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnNomeCliente.setText("Nome de cliente:");
        btnNomeCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNomeClienteActionPerformed(evt);
            }
        });

        btnListarAssociados.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnListarAssociados.setText("Listar associados");

        javax.swing.GroupLayout paListarLayout = new javax.swing.GroupLayout(paListar);
        paListar.setLayout(paListarLayout);
        paListarLayout.setHorizontalGroup(
            paListarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paListarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(paListarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paListarLayout.createSequentialGroup()
                        .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnListarAssociados, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(paListarLayout.createSequentialGroup()
                        .addComponent(btnNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPesquisaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 549, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        paListarLayout.setVerticalGroup(
            paListarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paListarLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(paListarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPesquisaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(paListarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnListarAssociados, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        paineis.addTab("Listar Clientes", paListar);

        paCadastrar.setForeground(new java.awt.Color(24, 156, 184));
        paCadastrar.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        btnCancelarCadastro.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnCancelarCadastro.setText("Cancelar cadastro");
        btnCancelarCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarCadastroActionPerformed(evt);
            }
        });
        btnCancelarCadastro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnCancelarCadastroKeyPressed(evt);
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

        lblTitular.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblTitular.setText("Titular:");

        cbPlanoMedico.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        cbPlanoMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPlanoMedicoActionPerformed(evt);
            }
        });
        cbPlanoMedico.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cbPlanoMedicoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cbPlanoMedicoKeyTyped(evt);
            }
        });

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

        try {
            txtTitular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        btnCadastrarCli.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnCadastrarCli.setText("Cadastrar cliente");
        btnCadastrarCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarCliActionPerformed(evt);
            }
        });

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
                    .addGroup(paCadastrarLayout.createSequentialGroup()
                        .addGroup(paCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNome)
                            .addComponent(lblEmail)
                            .addComponent(lblRua)
                            .addComponent(lblBairro)
                            .addComponent(lblTitular))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(paCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(paCadastrarLayout.createSequentialGroup()
                                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblCpf)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCPF))
                            .addGroup(paCadastrarLayout.createSequentialGroup()
                                .addGroup(paCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtRua, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
                                    .addComponent(txtBairro))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(paCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(paCadastrarLayout.createSequentialGroup()
                                        .addComponent(lblNumero)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtNumero))
                                    .addComponent(cbPlanoMedico, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(txtEmail)
                            .addGroup(paCadastrarLayout.createSequentialGroup()
                                .addComponent(txtTitular, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paCadastrarLayout.createSequentialGroup()
                        .addComponent(btnCadastrarCli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(359, 359, 359)
                        .addComponent(btnCancelarCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                    .addComponent(cbPlanoMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(paCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitular, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTitular, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addGroup(paCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelarCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCadastrarCli, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        btnCancelarCadastro.getAccessibleContext().setAccessibleName("");

        paineis.addTab("Cadastrar Cliente", paCadastrar);

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

        cbPlanoMedicoAlt.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        cbPlanoMedicoAlt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPlanoMedicoAltActionPerformed(evt);
            }
        });

        lblTitularAlt.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblTitularAlt.setText("Titular:");

        try {
            txtTitularAlt.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

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
                            .addComponent(lblTitularAlt))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(paAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(paAlterarLayout.createSequentialGroup()
                                .addComponent(txtNomeAlt, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblCpfAlt)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCPFAlt))
                            .addComponent(txtEmailAlt)
                            .addGroup(paAlterarLayout.createSequentialGroup()
                                .addGroup(paAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(paAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtRuaAlt)
                                        .addComponent(txtBairroAlt, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtTitularAlt, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(paAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(paAlterarLayout.createSequentialGroup()
                                        .addComponent(lblNumeroAlt)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtNumeroAlt))
                                    .addComponent(cbPlanoMedicoAlt, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(paAlterarLayout.createSequentialGroup()
                                        .addComponent(lblStatusAlt)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cbStatusAlt, 0, 1, Short.MAX_VALUE))))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paAlterarLayout.createSequentialGroup()
                        .addComponent(btnSalvarAlt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(335, 335, 335)
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
                    .addComponent(cbPlanoMedicoAlt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(paAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitularAlt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTitularAlt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblStatusAlt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbStatusAlt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(paineis)
                    .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        paineis.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed

        String nome = txtPesquisaCliente.getText();
        if (nome.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Digite o nome do cliente!", "Atenção", JOptionPane.WARNING_MESSAGE);
        } else {
            this.clientes = clienteDAO.findByNome(nome);
            this.atualizarTabela();            
        }
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        paineis.setEnabledAt(0,false);
        paineis.setEnabledAt(1,true);
        paineis.setEnabledAt(2,false);
        paineis.setSelectedIndex(1);
        txtTitular.setEnabled(false);       
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
         
        int linha = tabela.getSelectedRow();
        if (linha != -1) {
            
            paineis.setEnabledAt(0, false);
            paineis.setEnabledAt(1, false);
            paineis.setEnabledAt(2, true);
            paineis.setSelectedIndex(2);
            
            Cliente c = this.clientes.get(linha);
            txtNomeAlt.setText(c.getNome());
            txtCPFAlt.setValue(c.getCpf());
            txtCPFAlt.setEnabled(false);
            dataNascAlt.setDate(c.getDataNascimento());
            txtTelefoneAlt.setValue(c.getTelefone());
            txtEmailAlt.setText(c.getEmail());
            String endereco = c.getEndereco();
            String[] textoSeparado = endereco.split(",");
            txtRuaAlt.setText(textoSeparado[0]);
            txtNumeroAlt.setText(textoSeparado[1]);
            txtBairroAlt.setText(textoSeparado[2]);
            txtTitularAlt.setValue(c.getTitularCpf());
            txtTitularAlt.setEnabled(false);
            if(c.getStatus() == true){
                cbStatusAlt.setSelectedIndex(1);            
            }else{
                cbStatusAlt.setSelectedIndex(2);
            }
            cbPlanoMedicoAlt.setSelectedItem(c.getPlanoMedico());
//            System.out.println(Arrays.toString(textoSeparado));            
            txtNomeAlt.requestFocus();           
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um registro na tabela", "Selecione", JOptionPane.WARNING_MESSAGE);            
        }      
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void txtTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefoneActionPerformed

    private void cbPlanoMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPlanoMedicoActionPerformed
 
    }//GEN-LAST:event_cbPlanoMedicoActionPerformed

    private void btnCancelarCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarCadastroActionPerformed
        paineis.setSelectedIndex(0);
        paineis.setEnabledAt(0,true);
        paineis.setEnabledAt(1,false);
        paineis.setEnabledAt(2,false);        
        btnAlterar.setEnabled(false);
        btnExcluir.setEnabled(false);
        LimparCampos();
        txtPesquisaCliente.requestFocus();
        
    }//GEN-LAST:event_btnCancelarCadastroActionPerformed
    
    private void LimparCampos(){
        txtNome.setText(" ");
        txtCPF.setValue(" ");        
        dataNasc.setDate(new Date());
        txtTelefone.setValue(" ");
        txtEmail.setText(" ");
        txtRua.setText(" ");
        txtNumero.setText(" ");
        txtBairro.setText(" ");
        cbPlanoMedico.setSelectedIndex(0);
        txtPesquisaCliente.setText(" ");
    }
    
    private void LimparCamposAlterar(){
        txtNomeAlt.setText(" ");
        txtCPFAlt.setValue(" ");        
        dataNascAlt.setDate(new Date());
        txtTelefoneAlt.setValue(" ");
        txtEmailAlt.setText(" ");
        txtRuaAlt.setText(" ");
        txtNumeroAlt.setText(" ");
        txtBairroAlt.setText(" ");
        cbPlanoMedicoAlt.setSelectedIndex(0);
        cbStatusAlt.setSelectedIndex(0);
    }
    
    private void btnCadastrarCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarCliActionPerformed
        if(txtNome.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Insira o nome do paciente!", "Nome", JOptionPane.WARNING_MESSAGE);
        }else{
            cliente.setNome(txtNome.getText());       
        }
        if(txtCPF.getValue() == null){
            JOptionPane.showMessageDialog(null, "Insira o CPF do paciente!", "CPF", JOptionPane.WARNING_MESSAGE);
        }else{
            cliente.setCpf(txtCPF.getText());
        }        
        if (dataNasc.getDate() == null) {
            JOptionPane.showMessageDialog(null, "Insira a data de nascimento do paciente!", "Data de nascimento", JOptionPane.WARNING_MESSAGE);
        } else {
            try {
                cliente.setDataNascimento(dataNasc.getDate());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao salvar a data!", "Erro na data", JOptionPane.ERROR);
            }
        }
        if(txtTelefone.getValue() == null){
            JOptionPane.showMessageDialog(null, "Insira o número de telefone do paciente!", "Número de telefone", JOptionPane.WARNING_MESSAGE);
        }else{
            cliente.setTelefone(txtTelefone.getText());
        }
        if(txtEmail.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Insira o email do paciente!", "Email", JOptionPane.WARNING_MESSAGE);
        }else{
            cliente.setEmail(txtEmail.getText());
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
            cliente.setEndereco(endereco);      
        }
        
        DefaultComboBoxModel modelopm = (DefaultComboBoxModel) cbPlanoMedico.getModel();
        if(cbPlanoMedico.getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(null, "Selecione um Plano Médico!", "Plano médico", JOptionPane.WARNING_MESSAGE);           
        }else {
            try {
                cliente.setPlanoMedico((PlanoMedico) modelopm.getSelectedItem());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao inserir o plano médico!", "Erro", JOptionPane.ERROR);
            }
        }
        cliente.setStatus(true);  
        try {
            clienteDAO.inserir(cliente);
            JOptionPane.showMessageDialog(null, "Cliente cadastrado", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar cliente", "Erro", JOptionPane.ERROR);
        }         
     
        if(cbPlanoMedico.getSelectedIndex() == 1){
            this.LimparCampos();
            this.habilitar();
        }else if (cbPlanoMedico.getSelectedIndex() == 2) {
            int index = cbPlanoMedico.getSelectedIndex();
            AssociadoDuo duo = new AssociadoDuo(this, true);
            duo.receberValorComboBox(index);
            duo.receberNumeroCPF(cliente);
            duo.setLocationRelativeTo(null);
            duo.setVisible(true);
            this.LimparCampos();
            this.habilitar();
            this.atualizarTabela();
        }else if(cbPlanoMedico.getSelectedIndex()==3){
            int index = cbPlanoMedico.getSelectedIndex();            
            AssociadoFamilia familia = new AssociadoFamilia(this, true);
            familia.receberValorComboBox(index);
            familia.receberNumeroCPFTitular(cliente);
            familia.setLocationRelativeTo(null);
            familia.setVisible(true);
            this.LimparCampos();
            this.habilitar();
            this.atualizarTabela();        
        }             
    }//GEN-LAST:event_btnCadastrarCliActionPerformed

    private void txtTelefoneAltActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefoneAltActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefoneAltActionPerformed

    private void cbPlanoMedicoAltActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPlanoMedicoAltActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbPlanoMedicoAltActionPerformed

    private void btnSalvarAltActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarAltActionPerformed
        if(txtNomeAlt.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Insira o nome do paciente!", "Nome", JOptionPane.WARNING_MESSAGE);
        }else{
            this.cliente.setNome(txtNomeAlt.getText());       
        }
        if(txtCPFAlt.getValue() == null){
            JOptionPane.showMessageDialog(null, "Insira o CPF do paciente!", "CPF", JOptionPane.WARNING_MESSAGE);
        }else{
            this.cliente.setCpf(txtCPFAlt.getText());
        }        
        if (dataNascAlt.getDate() == null) {
            JOptionPane.showMessageDialog(null, "Insira a data de nascimento do paciente!", "Data de nascimento", JOptionPane.WARNING_MESSAGE);
        } else {
            try {
                this.cliente.setDataNascimento(dataNascAlt.getDate());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao salvar a data!", "Erro na data", JOptionPane.ERROR);
            }
        }
        if(txtTelefoneAlt.getValue() == null){
            JOptionPane.showMessageDialog(null, "Insira o número de telefone do paciente!", "Número de telefone", JOptionPane.WARNING_MESSAGE);
        }else{
            this.cliente.setTelefone(txtTelefoneAlt.getText());
        }
        if(txtEmailAlt.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Insira o email do paciente!", "Email", JOptionPane.WARNING_MESSAGE);
        }else{
            this.cliente.setEmail(txtEmailAlt.getText());
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
            this.cliente.setEndereco(endereco);      
        }        
        DefaultComboBoxModel modelopm = (DefaultComboBoxModel) cbPlanoMedicoAlt.getModel();
        if(cbPlanoMedicoAlt.getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(null, "Selecione um Plano Médico!", "Plano médico", JOptionPane.WARNING_MESSAGE);           
        }else {
            try {
                this.cliente.setPlanoMedico((PlanoMedico) modelopm.getSelectedItem());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Plano médico não encontrado!", "Erro", JOptionPane.ERROR);
            }
        }
        if (cbStatusAlt.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Defina o status do cliente!", "Status", JOptionPane.WARNING_MESSAGE);
        } else if (cbStatusAlt.getSelectedIndex() == 1) {
            this.cliente.setStatus(true);
        } else {
            this.cliente.setStatus(false);
        }       
        try {
            clienteDAO.alterar(cliente);
            JOptionPane.showMessageDialog(null, "informações alteradas", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao alterar informações", "Erro", JOptionPane.ERROR);
        } 
        this.LimparCamposAlterar();
 
        paineis.setEnabledAt(0,true);
        paineis.setEnabledAt(1,false);
        paineis.setEnabledAt(2,false);
        paineis.setSelectedIndex(0);        
        this.clientes = clienteDAO.findByAll();
        this.atualizarTabela();
        txtPesquisaCliente.setText(" ");
        txtPesquisaCliente.requestFocus();
    }//GEN-LAST:event_btnSalvarAltActionPerformed

    private void btnCancelarAltActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarAltActionPerformed
        paineis.setSelectedIndex(0);
        paineis.setEnabledAt(0,true);
        paineis.setEnabledAt(1,false);
        paineis.setEnabledAt(2,false);
        this.LimparCamposAlterar();        
        this.atualizarTabela();
    }//GEN-LAST:event_btnCancelarAltActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        int linha = tabela.getSelectedRow();
        if (linha != -1) {           
            Cliente c = this.clientes.get(linha);
            if(c.getStatus() == true){
                int confirmacao = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir esse registro?", "Confirmação", JOptionPane.YES_NO_OPTION);
                if(confirmacao == 0){
                    //verificar se o plano esta pago, se estiver exclui, senão apresentar msg de que tem pendências
                    try{
                    clienteDAO.remover(c);
                    JOptionPane.showMessageDialog(null, "Registro excluído!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);                    
                    }catch(Exception e){
                        JOptionPane.showMessageDialog(null,"Não é possível excluir o registro","Alerta", JOptionPane.WARNING_MESSAGE);
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "Operação cancelada!", "Cancelada", JOptionPane.INFORMATION_MESSAGE);                   
                }               
            }            
        }
        this.clientes = clienteDAO.findByAll();
        this.atualizarTabela();
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnNomeClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNomeClienteActionPerformed
        this.clientes = clienteDAO.findByAll();
        if (clientes.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Não há clientes cadastrados", "Informação", JOptionPane.INFORMATION_MESSAGE);
        } else {
            atualizarTabela();
        }
    }//GEN-LAST:event_btnNomeClienteActionPerformed

    private void cbPlanoMedicoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbPlanoMedicoKeyTyped

    }//GEN-LAST:event_cbPlanoMedicoKeyTyped

    private void btnCancelarCadastroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnCancelarCadastroKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelarCadastroKeyPressed

    private void cbPlanoMedicoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbPlanoMedicoKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbPlanoMedicoKeyPressed

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
            java.util.logging.Logger.getLogger(GerenciamentoCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GerenciamentoCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GerenciamentoCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GerenciamentoCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                GerenciamentoCliente dialog = new GerenciamentoCliente(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnCadastrarCli;
    private javax.swing.JButton btnCancelarAlt;
    private javax.swing.JButton btnCancelarCadastro;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnListarAssociados;
    private javax.swing.JButton btnNomeCliente;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnSalvarAlt;
    private javax.swing.JComboBox<String> cbPlanoMedico;
    private javax.swing.JComboBox<String> cbPlanoMedicoAlt;
    private javax.swing.JComboBox<String> cbStatusAlt;
    private com.toedter.calendar.JDateChooser dataNasc;
    private com.toedter.calendar.JDateChooser dataNascAlt;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBairro;
    private javax.swing.JLabel lblBairroAlt;
    private javax.swing.JLabel lblCpf;
    private javax.swing.JLabel lblCpfAlt;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEmailAlt;
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
    private javax.swing.JLabel lblTitular;
    private javax.swing.JLabel lblTitularAlt;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel paAlterar;
    private javax.swing.JPanel paCadastrar;
    private javax.swing.JPanel paListar;
    private javax.swing.JTabbedPane paineis;
    private javax.swing.JTable tabela;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtBairroAlt;
    private javax.swing.JFormattedTextField txtCPF;
    private javax.swing.JFormattedTextField txtCPFAlt;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEmailAlt;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNomeAlt;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtNumeroAlt;
    private javax.swing.JTextField txtPesquisaCliente;
    private javax.swing.JTextField txtRua;
    private javax.swing.JTextField txtRuaAlt;
    private javax.swing.JFormattedTextField txtTelefone;
    private javax.swing.JFormattedTextField txtTelefoneAlt;
    private javax.swing.JFormattedTextField txtTitular;
    private javax.swing.JFormattedTextField txtTitularAlt;
    // End of variables declaration//GEN-END:variables
}
