
package br.edu.ifsp.pep.visao;

import br.edu.ifsp.pep.dao.ClienteDAO;
import br.edu.ifsp.pep.dao.PlanoMedicoDAO;
import br.edu.ifsp.pep.modelo.Cliente;
import br.edu.ifsp.pep.modelo.PlanoMedico;
import java.awt.Color;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class AssociadoFamilia extends javax.swing.JDialog {

    private final Cliente cliente1 = new Cliente();
    private final Cliente cliente2 = new Cliente();
    private final Cliente cliente3 = new Cliente();
    private final Cliente cliente4 = new Cliente();
    private static Cliente titular = new Cliente();
    private static ClienteDAO clienteDAO = new ClienteDAO();
    private final PlanoMedicoDAO planoDAO = new PlanoMedicoDAO();
    
    public AssociadoFamilia(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.corespaineis();
        this.habilitar();
        this.carregarPlanosMedicos();
    }    
    
     public void habilitar(){
        cadastro1.setEnabledAt(0,true);
        cadastro1.setEnabledAt(1,false);
        cadastro1.setEnabledAt(2,false);
        cadastro1.setEnabledAt(3,false);     
    }
    
    public void receberValorComboBox(int x){
        DefaultComboBoxModel modelo = (DefaultComboBoxModel) cbPlanoMedico1.getModel();
        cbPlanoMedico1.setSelectedIndex(x); 
        cbPlanoMedico1.setEnabled(false);
    }
    
    public void receberNumeroCPFTitular(Cliente titNum){
        this.titular = titNum;
        txtTitular1.setValue(titular.getCpf());
        txtTitular1.setEnabled(false);
    }
    
    public void corespaineis(){
        Color paineis = new Color(249,253,253);
        //getContentPane().setBackground(paineis);
        cadastro1.getParent().setBackground(paineis);
        cadastrar1.setBackground(paineis);
        cadastrar2.setBackground(paineis);
        cadastrar3.setBackground(paineis);
        cadastrar4.setBackground(paineis);    
    }    
    
    private void carregarPlanosMedicos(){          
        DefaultComboBoxModel modelo1 = (DefaultComboBoxModel) cbPlanoMedico1.getModel();
        modelo1.addElement("Planos Médicos...");
        for (PlanoMedico plano1 : planoDAO.findByAll()) {
            modelo1.addElement(plano1);
        }
        
        DefaultComboBoxModel modelo2 = (DefaultComboBoxModel) cbPlanoMedico2.getModel();
        modelo2.addElement("Planos Médicos...");
        for (PlanoMedico plano2 : planoDAO.findByAll()) {
            modelo2.addElement(plano2);
        }
        
        DefaultComboBoxModel modelo3 = (DefaultComboBoxModel) cbPlanoMedico3.getModel();
        modelo3.addElement("Planos Médicos...");
        for (PlanoMedico plano3 : planoDAO.findByAll()) {
            modelo3.addElement(plano3);
        }
        
        DefaultComboBoxModel modelo4 = (DefaultComboBoxModel) cbPlanoMedico4.getModel();
        modelo4.addElement("Planos Médicos...");
        for (PlanoMedico plano4 : planoDAO.findByAll()) {
            modelo4.addElement(plano4);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        cadastro1 = new javax.swing.JTabbedPane();
        cadastrar1 = new javax.swing.JPanel();
        lblNome1 = new javax.swing.JLabel();
        lblBairro1 = new javax.swing.JLabel();
        lblNumero1 = new javax.swing.JLabel();
        lblTelefone1 = new javax.swing.JLabel();
        lblNascimento1 = new javax.swing.JLabel();
        lblRua1 = new javax.swing.JLabel();
        lblCpf1 = new javax.swing.JLabel();
        lblEmail1 = new javax.swing.JLabel();
        lblTitular1 = new javax.swing.JLabel();
        cbPlanoMedico1 = new javax.swing.JComboBox<>();
        txtNome1 = new javax.swing.JTextField();
        txtCPFAss1 = new javax.swing.JFormattedTextField();
        txtTelefone1 = new javax.swing.JFormattedTextField();
        dataNasc1 = new com.toedter.calendar.JDateChooser();
        txtEmail1 = new javax.swing.JTextField();
        txtRua1 = new javax.swing.JTextField();
        txtNumero1 = new javax.swing.JTextField();
        txtBairro1 = new javax.swing.JTextField();
        txtTitular1 = new javax.swing.JFormattedTextField();
        btnCadastrarPassar1 = new javax.swing.JButton();
        cadastrar2 = new javax.swing.JPanel();
        lblNome2 = new javax.swing.JLabel();
        lblBairro2 = new javax.swing.JLabel();
        lblNumero2 = new javax.swing.JLabel();
        lblTelefone2 = new javax.swing.JLabel();
        lblNascimento2 = new javax.swing.JLabel();
        lblRua2 = new javax.swing.JLabel();
        lblCpf2 = new javax.swing.JLabel();
        lblEmail2 = new javax.swing.JLabel();
        lblTitular2 = new javax.swing.JLabel();
        cbPlanoMedico2 = new javax.swing.JComboBox<>();
        txtNome2 = new javax.swing.JTextField();
        txtCPFAss2 = new javax.swing.JFormattedTextField();
        txtTelefone2 = new javax.swing.JFormattedTextField();
        dataNasc2 = new com.toedter.calendar.JDateChooser();
        txtEmail2 = new javax.swing.JTextField();
        txtRua2 = new javax.swing.JTextField();
        txtNumero2 = new javax.swing.JTextField();
        txtBairro2 = new javax.swing.JTextField();
        txtTitular2 = new javax.swing.JFormattedTextField();
        btnCadastrarPassar2 = new javax.swing.JButton();
        cadastrar3 = new javax.swing.JPanel();
        lblNome3 = new javax.swing.JLabel();
        lblBairro3 = new javax.swing.JLabel();
        lblNumero3 = new javax.swing.JLabel();
        lblTelefone3 = new javax.swing.JLabel();
        lblNascimento3 = new javax.swing.JLabel();
        lblRua3 = new javax.swing.JLabel();
        lblCpf3 = new javax.swing.JLabel();
        lblEmail3 = new javax.swing.JLabel();
        lblTitular3 = new javax.swing.JLabel();
        cbPlanoMedico3 = new javax.swing.JComboBox<>();
        txtNome3 = new javax.swing.JTextField();
        txtCPFAss3 = new javax.swing.JFormattedTextField();
        txtTelefone3 = new javax.swing.JFormattedTextField();
        dataNasc3 = new com.toedter.calendar.JDateChooser();
        txtEmail3 = new javax.swing.JTextField();
        txtRua3 = new javax.swing.JTextField();
        txtNumero3 = new javax.swing.JTextField();
        txtBairro3 = new javax.swing.JTextField();
        txtTitular3 = new javax.swing.JFormattedTextField();
        btnCadastrarPassar3 = new javax.swing.JButton();
        cadastrar4 = new javax.swing.JPanel();
        lblNome4 = new javax.swing.JLabel();
        lblBairro4 = new javax.swing.JLabel();
        lblNumero4 = new javax.swing.JLabel();
        lblTelefone4 = new javax.swing.JLabel();
        lblNascimento4 = new javax.swing.JLabel();
        lblRua4 = new javax.swing.JLabel();
        lblCpf4 = new javax.swing.JLabel();
        lblEmail4 = new javax.swing.JLabel();
        lblTitular4 = new javax.swing.JLabel();
        cbPlanoMedico4 = new javax.swing.JComboBox<>();
        txtNome4 = new javax.swing.JTextField();
        txtCPFAss4 = new javax.swing.JFormattedTextField();
        txtTelefone4 = new javax.swing.JFormattedTextField();
        dataNasc4 = new com.toedter.calendar.JDateChooser();
        txtEmail4 = new javax.swing.JTextField();
        txtRua4 = new javax.swing.JTextField();
        txtNumero4 = new javax.swing.JTextField();
        txtBairro4 = new javax.swing.JTextField();
        txtTitular4 = new javax.swing.JFormattedTextField();
        btnCadastrarPassar4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblTitulo.setFont(new java.awt.Font("Times New Roman", 0, 48)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(24, 156, 184));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Associados");

        cadastro1.setForeground(new java.awt.Color(24, 156, 184));
        cadastro1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        cadastrar1.setForeground(new java.awt.Color(24, 156, 184));
        cadastrar1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        lblNome1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblNome1.setText("Nome:");

        lblBairro1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblBairro1.setText("Bairro:");

        lblNumero1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblNumero1.setText("Número:");

        lblTelefone1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblTelefone1.setText("Número telefone:");

        lblNascimento1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblNascimento1.setText("Data de nascimento:");

        lblRua1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblRua1.setText("Rua:");

        lblCpf1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblCpf1.setText("CPF:");

        lblEmail1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblEmail1.setText("Email:");

        lblTitular1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblTitular1.setText("Titular:");

        cbPlanoMedico1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        cbPlanoMedico1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPlanoMedico1ActionPerformed(evt);
            }
        });

        txtNome1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        try {
            txtCPFAss1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCPFAss1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        try {
            txtTelefone1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTelefone1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtTelefone1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefone1ActionPerformed(evt);
            }
        });

        txtEmail1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        txtRua1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtRua1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRua1ActionPerformed(evt);
            }
        });

        txtNumero1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        txtBairro1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        try {
            txtTitular1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTitular1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        btnCadastrarPassar1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnCadastrarPassar1.setText("Cadastrar e próximo");
        btnCadastrarPassar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarPassar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout cadastrar1Layout = new javax.swing.GroupLayout(cadastrar1);
        cadastrar1.setLayout(cadastrar1Layout);
        cadastrar1Layout.setHorizontalGroup(
            cadastrar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cadastrar1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cadastrar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cadastrar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(cadastrar1Layout.createSequentialGroup()
                            .addComponent(lblNome1)
                            .addGap(19, 19, 19)
                            .addComponent(txtNome1, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblCpf1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtCPFAss1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(cadastrar1Layout.createSequentialGroup()
                            .addGroup(cadastrar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblEmail1)
                                .addComponent(lblRua1))
                            .addGap(18, 18, 18)
                            .addGroup(cadastrar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(cadastrar1Layout.createSequentialGroup()
                                    .addComponent(txtRua1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(lblNumero1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtNumero1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(txtEmail1, javax.swing.GroupLayout.PREFERRED_SIZE, 774, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(cadastrar1Layout.createSequentialGroup()
                            .addComponent(lblNascimento1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(dataNasc1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblTelefone1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtTelefone1, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(cadastrar1Layout.createSequentialGroup()
                            .addComponent(lblBairro1)
                            .addGap(15, 15, 15)
                            .addComponent(txtBairro1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(cbPlanoMedico1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(cadastrar1Layout.createSequentialGroup()
                        .addComponent(lblTitular1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTitular1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cadastrar1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCadastrarPassar1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        cadastrar1Layout.setVerticalGroup(
            cadastrar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cadastrar1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cadastrar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNome1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCpf1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCPFAss1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(cadastrar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cadastrar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtTelefone1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblTelefone1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(dataNasc1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNascimento1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(cadastrar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmail1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmail1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(cadastrar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumero1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRua1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRua1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumero1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(cadastrar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBairro1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBairro1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbPlanoMedico1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(cadastrar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTitular1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTitular1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCadastrarPassar1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        cadastro1.addTab("Associado 1", cadastrar1);

        cadastrar2.setForeground(new java.awt.Color(24, 156, 184));
        cadastrar2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        lblNome2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblNome2.setText("Nome:");

        lblBairro2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblBairro2.setText("Bairro:");

        lblNumero2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblNumero2.setText("Número:");

        lblTelefone2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblTelefone2.setText("Número telefone:");

        lblNascimento2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblNascimento2.setText("Data de nascimento:");

        lblRua2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblRua2.setText("Rua:");

        lblCpf2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblCpf2.setText("CPF:");

        lblEmail2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblEmail2.setText("Email:");

        lblTitular2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblTitular2.setText("Titular:");

        cbPlanoMedico2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        cbPlanoMedico2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPlanoMedico2ActionPerformed(evt);
            }
        });

        txtNome2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        try {
            txtCPFAss2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCPFAss2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        try {
            txtTelefone2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTelefone2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtTelefone2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefone2ActionPerformed(evt);
            }
        });

        txtEmail2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        txtRua2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        txtNumero2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        txtBairro2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        try {
            txtTitular2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTitular2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        btnCadastrarPassar2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnCadastrarPassar2.setText("Cadastrar e próximo");
        btnCadastrarPassar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarPassar2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout cadastrar2Layout = new javax.swing.GroupLayout(cadastrar2);
        cadastrar2.setLayout(cadastrar2Layout);
        cadastrar2Layout.setHorizontalGroup(
            cadastrar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cadastrar2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cadastrar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cadastrar2Layout.createSequentialGroup()
                        .addComponent(lblNascimento2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dataNasc2, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTelefone2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTelefone2, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(cadastrar2Layout.createSequentialGroup()
                        .addGroup(cadastrar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNome2)
                            .addComponent(lblEmail2)
                            .addComponent(lblBairro2)
                            .addComponent(lblTitular2)
                            .addComponent(lblRua2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(cadastrar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEmail2)
                            .addGroup(cadastrar2Layout.createSequentialGroup()
                                .addComponent(txtNome2, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblCpf2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCPFAss2))
                            .addComponent(txtTitular2, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(cadastrar2Layout.createSequentialGroup()
                                .addGroup(cadastrar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtRua2)
                                    .addComponent(txtBairro2, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(cadastrar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(cadastrar2Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(lblNumero2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtNumero2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(cbPlanoMedico2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addComponent(btnCadastrarPassar2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        cadastrar2Layout.setVerticalGroup(
            cadastrar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cadastrar2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cadastrar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNome2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCpf2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCPFAss2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(cadastrar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cadastrar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblNascimento2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(cadastrar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTelefone2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTelefone2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(dataNasc2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(cadastrar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmail2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmail2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(cadastrar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNumero2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRua2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRua2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNumero2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(cadastrar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBairro2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBairro2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbPlanoMedico2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(cadastrar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitular2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTitular2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(btnCadastrarPassar2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        cadastro1.addTab("Associado 2", cadastrar2);

        cadastrar3.setForeground(new java.awt.Color(24, 156, 184));
        cadastrar3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        lblNome3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblNome3.setText("Nome:");

        lblBairro3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblBairro3.setText("Bairro:");

        lblNumero3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblNumero3.setText("Número:");

        lblTelefone3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblTelefone3.setText("Número telefone:");

        lblNascimento3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblNascimento3.setText("Data de nascimento:");

        lblRua3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblRua3.setText("Rua:");

        lblCpf3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblCpf3.setText("CPF:");

        lblEmail3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblEmail3.setText("Email:");

        lblTitular3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblTitular3.setText("Titular:");

        cbPlanoMedico3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        cbPlanoMedico3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPlanoMedico3ActionPerformed(evt);
            }
        });

        txtNome3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        try {
            txtCPFAss3.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCPFAss3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        try {
            txtTelefone3.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTelefone3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefone3ActionPerformed(evt);
            }
        });

        txtEmail3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        txtRua3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        txtNumero3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        txtBairro3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        try {
            txtTitular3.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTitular3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtTitular3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTitular3ActionPerformed(evt);
            }
        });

        btnCadastrarPassar3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnCadastrarPassar3.setText("Cadastrar e próximo");

        javax.swing.GroupLayout cadastrar3Layout = new javax.swing.GroupLayout(cadastrar3);
        cadastrar3.setLayout(cadastrar3Layout);
        cadastrar3Layout.setHorizontalGroup(
            cadastrar3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cadastrar3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cadastrar3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cadastrar3Layout.createSequentialGroup()
                        .addComponent(lblNascimento3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dataNasc3, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTelefone3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTelefone3, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(cadastrar3Layout.createSequentialGroup()
                        .addGroup(cadastrar3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNome3)
                            .addComponent(lblEmail3)
                            .addComponent(lblBairro3)
                            .addComponent(lblRua3))
                        .addGap(15, 15, 15)
                        .addGroup(cadastrar3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(cadastrar3Layout.createSequentialGroup()
                                .addComponent(txtBairro3, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbPlanoMedico3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(txtEmail3)
                            .addGroup(cadastrar3Layout.createSequentialGroup()
                                .addComponent(txtNome3, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblCpf3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCPFAss3))
                            .addGroup(cadastrar3Layout.createSequentialGroup()
                                .addComponent(txtRua3)
                                .addGap(12, 12, 12)
                                .addComponent(lblNumero3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNumero3, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(cadastrar3Layout.createSequentialGroup()
                        .addComponent(lblTitular3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTitular3, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btnCadastrarPassar3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        cadastrar3Layout.setVerticalGroup(
            cadastrar3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cadastrar3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cadastrar3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNome3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCpf3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCPFAss3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(cadastrar3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cadastrar3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblNascimento3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(cadastrar3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTelefone3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTelefone3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(dataNasc3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(cadastrar3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmail3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmail3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(cadastrar3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumero3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumero3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRua3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRua3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(cadastrar3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBairro3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBairro3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbPlanoMedico3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(cadastrar3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitular3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTitular3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(btnCadastrarPassar3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        cadastro1.addTab("Associado 3", cadastrar3);

        cadastrar4.setForeground(new java.awt.Color(24, 156, 184));
        cadastrar4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        lblNome4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblNome4.setText("Nome:");

        lblBairro4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblBairro4.setText("Bairro:");

        lblNumero4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblNumero4.setText("Número:");

        lblTelefone4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblTelefone4.setText("Número telefone:");

        lblNascimento4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblNascimento4.setText("Data de nascimento:");

        lblRua4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblRua4.setText("Rua:");

        lblCpf4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblCpf4.setText("CPF:");

        lblEmail4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblEmail4.setText("Email:");

        lblTitular4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblTitular4.setText("Titular:");

        cbPlanoMedico4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        cbPlanoMedico4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPlanoMedico4ActionPerformed(evt);
            }
        });

        txtNome4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        try {
            txtCPFAss4.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txtTelefone4.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTelefone4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefone4ActionPerformed(evt);
            }
        });

        txtEmail4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        txtRua4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        txtNumero4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        txtBairro4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtBairro4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBairro4ActionPerformed(evt);
            }
        });

        try {
            txtTitular4.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTitular4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        btnCadastrarPassar4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnCadastrarPassar4.setText("Cadastrar e fechar");

        javax.swing.GroupLayout cadastrar4Layout = new javax.swing.GroupLayout(cadastrar4);
        cadastrar4.setLayout(cadastrar4Layout);
        cadastrar4Layout.setHorizontalGroup(
            cadastrar4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cadastrar4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cadastrar4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cadastrar4Layout.createSequentialGroup()
                        .addGroup(cadastrar4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNome4)
                            .addComponent(lblEmail4)
                            .addComponent(lblBairro4)
                            .addComponent(lblTitular4)
                            .addComponent(lblRua4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(cadastrar4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cadastrar4Layout.createSequentialGroup()
                                .addComponent(txtRua4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblNumero4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNumero4, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(cadastrar4Layout.createSequentialGroup()
                                .addComponent(txtBairro4, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbPlanoMedico4, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(txtEmail4)
                            .addGroup(cadastrar4Layout.createSequentialGroup()
                                .addComponent(txtNome4, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblCpf4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCPFAss4))
                            .addGroup(cadastrar4Layout.createSequentialGroup()
                                .addComponent(txtTitular4, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cadastrar4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(cadastrar4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cadastrar4Layout.createSequentialGroup()
                                .addComponent(lblNascimento4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(dataNasc4, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblTelefone4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTelefone4, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnCadastrarPassar4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        cadastrar4Layout.setVerticalGroup(
            cadastrar4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cadastrar4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cadastrar4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNome4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCpf4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCPFAss4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(cadastrar4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cadastrar4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblNascimento4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(cadastrar4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTelefone4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTelefone4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(dataNasc4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(cadastrar4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmail4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmail4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(cadastrar4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumero4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumero4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRua4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRua4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(cadastrar4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBairro4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBairro4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbPlanoMedico4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(cadastrar4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitular4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTitular4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(btnCadastrarPassar4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        cadastro1.addTab("Associado 4", cadastrar4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cadastro1)
                    .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
                .addGap(18, 18, 18)
                .addComponent(cadastro1, javax.swing.GroupLayout.PREFERRED_SIZE, 483, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbPlanoMedico1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPlanoMedico1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbPlanoMedico1ActionPerformed

    private void txtTelefone1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefone1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefone1ActionPerformed

    private void txtRua1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRua1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRua1ActionPerformed

    private void btnCadastrarPassar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarPassar1ActionPerformed
        if (txtNome1.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Insira o nome do paciente!", "Nome", JOptionPane.WARNING_MESSAGE);
        } else {
            cliente1.setNome(txtNome1.getText());
        }
        if (txtCPFAss1.getValue() == null) {
            JOptionPane.showMessageDialog(null, "Insira o CPF do paciente!", "CPF", JOptionPane.WARNING_MESSAGE);
        } else {
            cliente1.setCpf(txtCPFAss1.getText());
        }
        if (dataNasc1.getDate() == null) {
            JOptionPane.showMessageDialog(null, "Insira a data de nascimento do paciente!", "Data de nascimento", JOptionPane.WARNING_MESSAGE);
        } else {
            try {
                cliente1.setDataNascimento(dataNasc1.getDate());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao salvar a data!", "Erro na data", JOptionPane.ERROR);
            }
        }
        if (txtTelefone1.getValue() == null) {
            JOptionPane.showMessageDialog(null, "Insira o número de telefone do paciente!", "Número de telefone", JOptionPane.WARNING_MESSAGE);
        } else {
            cliente1.setTelefone(txtTelefone1.getText());
        }
        if (txtEmail1.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Insira o email do paciente!", "Email", JOptionPane.WARNING_MESSAGE);
        } else {
            cliente1.setEmail(txtEmail1.getText());
        }
        if (txtRua1.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Insira a rua!", "Rua", JOptionPane.WARNING_MESSAGE);
        } else if (txtNumero1.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Insira o número da casa!", "Número da casa", JOptionPane.WARNING_MESSAGE);
        } else if (txtBairro1.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Insira o bairro!", "Bairro", JOptionPane.WARNING_MESSAGE);
        } else {
            String endereco;
            String rua = txtRua1.getText();
            String numero = txtNumero1.getText();
            String bairro = txtBairro1.getText();
            endereco = rua + ", " + numero + ", " + bairro;
            cliente1.setEndereco(endereco);
        }
        cliente1.setTitularCpf(titular);

        DefaultComboBoxModel modelopm = (DefaultComboBoxModel) cbPlanoMedico1.getModel();
        cliente1.setPlanoMedico((PlanoMedico) modelopm.getSelectedItem());

        cliente1.setStatus(true);
        try {
            clienteDAO.inserir(cliente1);
            JOptionPane.showMessageDialog(null, "Cliente cadastrado", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar cliente", "Erro", JOptionPane.ERROR);
        }

        cadastro1.setEnabledAt(0,false);
        cadastro1.setEnabledAt(1,true);
        cadastro1.setEnabledAt(2,false);
        cadastro1.setEnabledAt(3,false);
        cadastro1.setSelectedIndex(1); 
    }//GEN-LAST:event_btnCadastrarPassar1ActionPerformed

    private void cbPlanoMedico2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPlanoMedico2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbPlanoMedico2ActionPerformed

    private void txtTelefone2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefone2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefone2ActionPerformed

    private void cbPlanoMedico3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPlanoMedico3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbPlanoMedico3ActionPerformed

    private void txtTelefone3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefone3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefone3ActionPerformed

    private void txtTitular3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTitular3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTitular3ActionPerformed

    private void cbPlanoMedico4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPlanoMedico4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbPlanoMedico4ActionPerformed

    private void txtTelefone4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefone4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefone4ActionPerformed

    private void txtBairro4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBairro4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBairro4ActionPerformed

    private void btnCadastrarPassar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarPassar2ActionPerformed
       if(txtNome2.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Insira o nome do paciente!", "Nome", JOptionPane.WARNING_MESSAGE);
        }else{
            cliente2.setNome(txtNome2.getText());
        }
        if(txtCPFAss2.getValue() == null){
            JOptionPane.showMessageDialog(null, "Insira o CPF do paciente!", "CPF", JOptionPane.WARNING_MESSAGE);
        }else{
            cliente2.setCpf(txtCPFAss2.getText());
        }
        if (dataNasc2.getDate() == null) {
            JOptionPane.showMessageDialog(null, "Insira a data de nascimento do paciente!", "Data de nascimento", JOptionPane.WARNING_MESSAGE);
        } else {
            try {
                cliente2.setDataNascimento(dataNasc2.getDate());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao salvar a data!", "Erro na data", JOptionPane.ERROR);
            }
        }
        if(txtTelefone2.getValue() == null){
            JOptionPane.showMessageDialog(null, "Insira o número de telefone do paciente!", "Número de telefone", JOptionPane.WARNING_MESSAGE);
        }else{
            cliente2.setTelefone(txtTelefone2.getText());
        }
        if(txtEmail2.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Insira o email do paciente!", "Email", JOptionPane.WARNING_MESSAGE);
        }else{
            cliente2.setEmail(txtEmail2.getText());
        }
        if(txtRua2.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Insira a rua!", "Rua", JOptionPane.WARNING_MESSAGE);
        }else if(txtNumero2.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Insira o número da casa!", "Número da casa", JOptionPane.WARNING_MESSAGE);
        }else if(txtBairro2.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Insira o bairro!", "Bairro", JOptionPane.WARNING_MESSAGE);
        }else {
            String endereco;
            String rua = txtRua2.getText();
            String numero = txtNumero2.getText();
            String bairro = txtBairro2.getText();
            endereco = rua+", "+numero+", "+bairro;
            cliente2.setEndereco(endereco);
        }
        cliente2.setTitularCpf(titular);
        DefaultComboBoxModel modelopm = (DefaultComboBoxModel) cbPlanoMedico2.getModel();        
        cliente2.setPlanoMedico((PlanoMedico) modelopm.getSelectedItem());
      
        cliente2.setStatus(true);
        try {
            clienteDAO.inserir(cliente2);
            JOptionPane.showMessageDialog(null, "Cliente cadastrado", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar cliente", "Erro", JOptionPane.ERROR);
        }
        
        cadastro1.setEnabledAt(0,false);
        cadastro1.setEnabledAt(1,false);
        cadastro1.setEnabledAt(2,true);
        cadastro1.setEnabledAt(3,false);
        cadastro1.setSelectedIndex(2);        
    }//GEN-LAST:event_btnCadastrarPassar2ActionPerformed

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
            java.util.logging.Logger.getLogger(AssociadoFamilia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AssociadoFamilia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AssociadoFamilia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AssociadoFamilia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AssociadoFamilia dialog = new AssociadoFamilia(new javax.swing.JDialog(), true);
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
    private javax.swing.JButton btnCadastrarPassar1;
    private javax.swing.JButton btnCadastrarPassar2;
    private javax.swing.JButton btnCadastrarPassar3;
    private javax.swing.JButton btnCadastrarPassar4;
    private javax.swing.JPanel cadastrar1;
    private javax.swing.JPanel cadastrar2;
    private javax.swing.JPanel cadastrar3;
    private javax.swing.JPanel cadastrar4;
    private javax.swing.JTabbedPane cadastro1;
    private javax.swing.JComboBox<String> cbPlanoMedico1;
    private javax.swing.JComboBox<String> cbPlanoMedico2;
    private javax.swing.JComboBox<String> cbPlanoMedico3;
    private javax.swing.JComboBox<String> cbPlanoMedico4;
    private com.toedter.calendar.JDateChooser dataNasc1;
    private com.toedter.calendar.JDateChooser dataNasc2;
    private com.toedter.calendar.JDateChooser dataNasc3;
    private com.toedter.calendar.JDateChooser dataNasc4;
    private javax.swing.JLabel lblBairro1;
    private javax.swing.JLabel lblBairro2;
    private javax.swing.JLabel lblBairro3;
    private javax.swing.JLabel lblBairro4;
    private javax.swing.JLabel lblCpf1;
    private javax.swing.JLabel lblCpf2;
    private javax.swing.JLabel lblCpf3;
    private javax.swing.JLabel lblCpf4;
    private javax.swing.JLabel lblEmail1;
    private javax.swing.JLabel lblEmail2;
    private javax.swing.JLabel lblEmail3;
    private javax.swing.JLabel lblEmail4;
    private javax.swing.JLabel lblNascimento1;
    private javax.swing.JLabel lblNascimento2;
    private javax.swing.JLabel lblNascimento3;
    private javax.swing.JLabel lblNascimento4;
    private javax.swing.JLabel lblNome1;
    private javax.swing.JLabel lblNome2;
    private javax.swing.JLabel lblNome3;
    private javax.swing.JLabel lblNome4;
    private javax.swing.JLabel lblNumero1;
    private javax.swing.JLabel lblNumero2;
    private javax.swing.JLabel lblNumero3;
    private javax.swing.JLabel lblNumero4;
    private javax.swing.JLabel lblRua1;
    private javax.swing.JLabel lblRua2;
    private javax.swing.JLabel lblRua3;
    private javax.swing.JLabel lblRua4;
    private javax.swing.JLabel lblTelefone1;
    private javax.swing.JLabel lblTelefone2;
    private javax.swing.JLabel lblTelefone3;
    private javax.swing.JLabel lblTelefone4;
    private javax.swing.JLabel lblTitular1;
    private javax.swing.JLabel lblTitular2;
    private javax.swing.JLabel lblTitular3;
    private javax.swing.JLabel lblTitular4;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtBairro1;
    private javax.swing.JTextField txtBairro2;
    private javax.swing.JTextField txtBairro3;
    private javax.swing.JTextField txtBairro4;
    private javax.swing.JFormattedTextField txtCPFAss1;
    private javax.swing.JFormattedTextField txtCPFAss2;
    private javax.swing.JFormattedTextField txtCPFAss3;
    private javax.swing.JFormattedTextField txtCPFAss4;
    private javax.swing.JTextField txtEmail1;
    private javax.swing.JTextField txtEmail2;
    private javax.swing.JTextField txtEmail3;
    private javax.swing.JTextField txtEmail4;
    private javax.swing.JTextField txtNome1;
    private javax.swing.JTextField txtNome2;
    private javax.swing.JTextField txtNome3;
    private javax.swing.JTextField txtNome4;
    private javax.swing.JTextField txtNumero1;
    private javax.swing.JTextField txtNumero2;
    private javax.swing.JTextField txtNumero3;
    private javax.swing.JTextField txtNumero4;
    private javax.swing.JTextField txtRua1;
    private javax.swing.JTextField txtRua2;
    private javax.swing.JTextField txtRua3;
    private javax.swing.JTextField txtRua4;
    private javax.swing.JFormattedTextField txtTelefone1;
    private javax.swing.JFormattedTextField txtTelefone2;
    private javax.swing.JFormattedTextField txtTelefone3;
    private javax.swing.JFormattedTextField txtTelefone4;
    private javax.swing.JFormattedTextField txtTitular1;
    private javax.swing.JFormattedTextField txtTitular2;
    private javax.swing.JFormattedTextField txtTitular3;
    private javax.swing.JFormattedTextField txtTitular4;
    // End of variables declaration//GEN-END:variables
}
