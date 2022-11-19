
package br.edu.ifsp.pep.visao;

import br.edu.ifsp.pep.dao.ClienteDAO;
import br.edu.ifsp.pep.dao.PlanoMedicoDAO;
import br.edu.ifsp.pep.modelo.Cliente;
import javax.swing.DefaultComboBoxModel;

public class AssociadoFamilia extends javax.swing.JDialog {
    
    private final Cliente cliente = new Cliente();
    private static Cliente titular = new Cliente();
    private static ClienteDAO clienteDAO = new ClienteDAO();
    private final PlanoMedicoDAO planoDAO = new PlanoMedicoDAO();

    public AssociadoFamilia(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    
    public void receberValorComboBox(int x){
        DefaultComboBoxModel modelo = (DefaultComboBoxModel) cbPlanoMedico.getModel();
        cbPlanoMedico.setSelectedIndex(x); 
        cbPlanoMedico.setEnabled(false);
    }
    
    public void receberNumeroCPF(Cliente titNum){
        this.titular = titNum;
        txtTitular.setValue(titular.getCpf());
        txtTitular.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        cadastro1 = new javax.swing.JTabbedPane();
        cadastrar1 = new javax.swing.JPanel();
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
        txtCPFAss = new javax.swing.JFormattedTextField();
        txtTelefone = new javax.swing.JFormattedTextField();
        dataNasc = new com.toedter.calendar.JDateChooser();
        txtEmail = new javax.swing.JTextField();
        txtRua = new javax.swing.JTextField();
        txtNumero = new javax.swing.JTextField();
        txtBairro = new javax.swing.JTextField();
        txtTitular = new javax.swing.JFormattedTextField();
        btnProximo1 = new javax.swing.JButton();
        cadastrar2 = new javax.swing.JPanel();
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
        btnProximo2 = new javax.swing.JButton();
        cadastrar3 = new javax.swing.JPanel();
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
        btnProximo3 = new javax.swing.JButton();
        cadastrar4 = new javax.swing.JPanel();
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
        btnCadastrarAssociados = new javax.swing.JButton();

        setEnabled(false);
        setSize(new java.awt.Dimension(1000, 0));

        lblTitulo.setFont(new java.awt.Font("Times New Roman", 0, 48)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(24, 156, 184));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Associados");

        cadastro1.setForeground(new java.awt.Color(24, 156, 184));
        cadastro1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        cadastrar1.setForeground(new java.awt.Color(24, 156, 184));
        cadastrar1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

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

        txtNome.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        try {
            txtCPFAss.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txtTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTelefone.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
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
        txtTitular.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        btnProximo1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnProximo1.setText("Próximo");

        javax.swing.GroupLayout cadastrar1Layout = new javax.swing.GroupLayout(cadastrar1);
        cadastrar1.setLayout(cadastrar1Layout);
        cadastrar1Layout.setHorizontalGroup(
            cadastrar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cadastrar1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cadastrar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cadastrar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(cadastrar1Layout.createSequentialGroup()
                            .addComponent(lblNome)
                            .addGap(19, 19, 19)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblCpf)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtCPFAss, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(cadastrar1Layout.createSequentialGroup()
                            .addGroup(cadastrar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblEmail)
                                .addComponent(lblRua))
                            .addGap(18, 18, 18)
                            .addGroup(cadastrar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(cadastrar1Layout.createSequentialGroup()
                                    .addComponent(txtRua, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(lblNumero)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 774, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(cadastrar1Layout.createSequentialGroup()
                            .addComponent(lblNascimento)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(dataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblTelefone)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(cadastrar1Layout.createSequentialGroup()
                            .addComponent(lblBairro)
                            .addGap(15, 15, 15)
                            .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(cbPlanoMedico, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(cadastrar1Layout.createSequentialGroup()
                        .addComponent(lblTitular)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTitular, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cadastrar1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnProximo1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        cadastrar1Layout.setVerticalGroup(
            cadastrar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cadastrar1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cadastrar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCPFAss, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(cadastrar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cadastrar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(dataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(cadastrar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(cadastrar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRua, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRua, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(cadastrar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbPlanoMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(cadastrar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTitular, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTitular, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnProximo1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        cadastro1.addTab("Associado 1", cadastrar1);

        cadastrar2.setForeground(new java.awt.Color(24, 156, 184));
        cadastrar2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

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

        txtNumero1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        txtBairro1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        try {
            txtTitular1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTitular1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        btnProximo2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnProximo2.setText("Próximo");

        javax.swing.GroupLayout cadastrar2Layout = new javax.swing.GroupLayout(cadastrar2);
        cadastrar2.setLayout(cadastrar2Layout);
        cadastrar2Layout.setHorizontalGroup(
            cadastrar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cadastrar2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cadastrar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cadastrar2Layout.createSequentialGroup()
                        .addComponent(lblNascimento1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dataNasc1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTelefone1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTelefone1, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(cadastrar2Layout.createSequentialGroup()
                        .addGroup(cadastrar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNome1)
                            .addComponent(lblEmail1)
                            .addComponent(lblBairro1)
                            .addComponent(lblTitular1)
                            .addComponent(lblRua1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(cadastrar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEmail1)
                            .addGroup(cadastrar2Layout.createSequentialGroup()
                                .addComponent(txtNome1, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblCpf1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCPFAss1))
                            .addComponent(txtTitular1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(cadastrar2Layout.createSequentialGroup()
                                .addGroup(cadastrar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtRua1)
                                    .addComponent(txtBairro1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(cadastrar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(cadastrar2Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(lblNumero1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtNumero1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(cbPlanoMedico1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addComponent(btnProximo2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        cadastrar2Layout.setVerticalGroup(
            cadastrar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cadastrar2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cadastrar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNome1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCpf1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCPFAss1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(cadastrar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cadastrar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblNascimento1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(cadastrar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTelefone1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTelefone1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(dataNasc1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(cadastrar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmail1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmail1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(cadastrar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNumero1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRua1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRua1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNumero1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(cadastrar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBairro1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBairro1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbPlanoMedico1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(cadastrar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitular1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTitular1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(btnProximo2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        cadastro1.addTab("Associado 2", cadastrar2);

        cadastrar3.setForeground(new java.awt.Color(24, 156, 184));
        cadastrar3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

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

        try {
            txtTelefone2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
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

        btnProximo3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnProximo3.setText("Próximo");

        javax.swing.GroupLayout cadastrar3Layout = new javax.swing.GroupLayout(cadastrar3);
        cadastrar3.setLayout(cadastrar3Layout);
        cadastrar3Layout.setHorizontalGroup(
            cadastrar3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cadastrar3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cadastrar3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cadastrar3Layout.createSequentialGroup()
                        .addComponent(lblNascimento2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dataNasc2, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTelefone2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTelefone2, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(cadastrar3Layout.createSequentialGroup()
                        .addGroup(cadastrar3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNome2)
                            .addComponent(lblEmail2)
                            .addComponent(lblBairro2)
                            .addComponent(lblRua2))
                        .addGap(15, 15, 15)
                        .addGroup(cadastrar3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(cadastrar3Layout.createSequentialGroup()
                                .addComponent(txtBairro2, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbPlanoMedico2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(txtEmail2)
                            .addGroup(cadastrar3Layout.createSequentialGroup()
                                .addComponent(txtNome2, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblCpf2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCPFAss2))
                            .addGroup(cadastrar3Layout.createSequentialGroup()
                                .addComponent(txtRua2)
                                .addGap(12, 12, 12)
                                .addComponent(lblNumero2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNumero2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(cadastrar3Layout.createSequentialGroup()
                        .addComponent(lblTitular2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTitular2, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btnProximo3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        cadastrar3Layout.setVerticalGroup(
            cadastrar3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cadastrar3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cadastrar3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNome2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCpf2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCPFAss2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(cadastrar3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cadastrar3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblNascimento2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(cadastrar3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTelefone2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTelefone2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(dataNasc2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(cadastrar3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmail2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmail2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(cadastrar3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumero2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumero2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRua2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRua2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(cadastrar3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBairro2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBairro2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbPlanoMedico2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(cadastrar3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitular2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTitular2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(btnProximo3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        cadastro1.addTab("Associado 3", cadastrar3);

        cadastrar4.setForeground(new java.awt.Color(24, 156, 184));
        cadastrar4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

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

        btnCadastrarAssociados.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnCadastrarAssociados.setText("Cadastrar Associados");

        javax.swing.GroupLayout cadastrar4Layout = new javax.swing.GroupLayout(cadastrar4);
        cadastrar4.setLayout(cadastrar4Layout);
        cadastrar4Layout.setHorizontalGroup(
            cadastrar4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cadastrar4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cadastrar4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cadastrar4Layout.createSequentialGroup()
                        .addGroup(cadastrar4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNome3)
                            .addComponent(lblEmail3)
                            .addComponent(lblBairro3)
                            .addComponent(lblTitular3)
                            .addComponent(lblRua3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(cadastrar4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cadastrar4Layout.createSequentialGroup()
                                .addComponent(txtRua3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblNumero3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNumero3, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(cadastrar4Layout.createSequentialGroup()
                                .addComponent(txtBairro3, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbPlanoMedico3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(txtEmail3)
                            .addGroup(cadastrar4Layout.createSequentialGroup()
                                .addComponent(txtNome3, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblCpf3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCPFAss3))
                            .addGroup(cadastrar4Layout.createSequentialGroup()
                                .addComponent(txtTitular3, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cadastrar4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(cadastrar4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cadastrar4Layout.createSequentialGroup()
                                .addComponent(lblNascimento3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(dataNasc3, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblTelefone3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTelefone3, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnCadastrarAssociados, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        cadastrar4Layout.setVerticalGroup(
            cadastrar4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cadastrar4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cadastrar4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNome3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCpf3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCPFAss3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(cadastrar4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cadastrar4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblNascimento3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(cadastrar4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTelefone3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTelefone3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(dataNasc3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(cadastrar4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmail3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmail3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(cadastrar4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumero3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumero3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRua3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRua3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(cadastrar4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBairro3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBairro3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbPlanoMedico3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(cadastrar4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitular3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTitular3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(btnCadastrarAssociados, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        cadastro1.addTab("Associado 4", cadastrar4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cadastro1, javax.swing.GroupLayout.PREFERRED_SIZE, 876, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(cadastro1, javax.swing.GroupLayout.PREFERRED_SIZE, 483, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        cadastro1.getAccessibleContext().setAccessibleName("Associado 1");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbPlanoMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPlanoMedicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbPlanoMedicoActionPerformed

    private void txtTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefoneActionPerformed

    private void cbPlanoMedico1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPlanoMedico1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbPlanoMedico1ActionPerformed

    private void txtTelefone1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefone1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefone1ActionPerformed

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
    private javax.swing.JButton btnCadastrarAssociados;
    private javax.swing.JButton btnProximo1;
    private javax.swing.JButton btnProximo2;
    private javax.swing.JButton btnProximo3;
    private javax.swing.JPanel cadastrar1;
    private javax.swing.JPanel cadastrar2;
    private javax.swing.JPanel cadastrar3;
    private javax.swing.JPanel cadastrar4;
    private javax.swing.JTabbedPane cadastro1;
    private javax.swing.JComboBox<String> cbPlanoMedico;
    private javax.swing.JComboBox<String> cbPlanoMedico1;
    private javax.swing.JComboBox<String> cbPlanoMedico2;
    private javax.swing.JComboBox<String> cbPlanoMedico3;
    private com.toedter.calendar.JDateChooser dataNasc;
    private com.toedter.calendar.JDateChooser dataNasc1;
    private com.toedter.calendar.JDateChooser dataNasc2;
    private com.toedter.calendar.JDateChooser dataNasc3;
    private javax.swing.JLabel lblBairro;
    private javax.swing.JLabel lblBairro1;
    private javax.swing.JLabel lblBairro2;
    private javax.swing.JLabel lblBairro3;
    private javax.swing.JLabel lblCpf;
    private javax.swing.JLabel lblCpf1;
    private javax.swing.JLabel lblCpf2;
    private javax.swing.JLabel lblCpf3;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEmail1;
    private javax.swing.JLabel lblEmail2;
    private javax.swing.JLabel lblEmail3;
    private javax.swing.JLabel lblNascimento;
    private javax.swing.JLabel lblNascimento1;
    private javax.swing.JLabel lblNascimento2;
    private javax.swing.JLabel lblNascimento3;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNome1;
    private javax.swing.JLabel lblNome2;
    private javax.swing.JLabel lblNome3;
    private javax.swing.JLabel lblNumero;
    private javax.swing.JLabel lblNumero1;
    private javax.swing.JLabel lblNumero2;
    private javax.swing.JLabel lblNumero3;
    private javax.swing.JLabel lblRua;
    private javax.swing.JLabel lblRua1;
    private javax.swing.JLabel lblRua2;
    private javax.swing.JLabel lblRua3;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JLabel lblTelefone1;
    private javax.swing.JLabel lblTelefone2;
    private javax.swing.JLabel lblTelefone3;
    private javax.swing.JLabel lblTitular;
    private javax.swing.JLabel lblTitular1;
    private javax.swing.JLabel lblTitular2;
    private javax.swing.JLabel lblTitular3;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtBairro1;
    private javax.swing.JTextField txtBairro2;
    private javax.swing.JTextField txtBairro3;
    private javax.swing.JFormattedTextField txtCPFAss;
    private javax.swing.JFormattedTextField txtCPFAss1;
    private javax.swing.JFormattedTextField txtCPFAss2;
    private javax.swing.JFormattedTextField txtCPFAss3;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEmail1;
    private javax.swing.JTextField txtEmail2;
    private javax.swing.JTextField txtEmail3;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNome1;
    private javax.swing.JTextField txtNome2;
    private javax.swing.JTextField txtNome3;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtNumero1;
    private javax.swing.JTextField txtNumero2;
    private javax.swing.JTextField txtNumero3;
    private javax.swing.JTextField txtRua;
    private javax.swing.JTextField txtRua1;
    private javax.swing.JTextField txtRua2;
    private javax.swing.JTextField txtRua3;
    private javax.swing.JFormattedTextField txtTelefone;
    private javax.swing.JFormattedTextField txtTelefone1;
    private javax.swing.JFormattedTextField txtTelefone2;
    private javax.swing.JFormattedTextField txtTelefone3;
    private javax.swing.JFormattedTextField txtTitular;
    private javax.swing.JFormattedTextField txtTitular1;
    private javax.swing.JFormattedTextField txtTitular2;
    private javax.swing.JFormattedTextField txtTitular3;
    // End of variables declaration//GEN-END:variables
}
