
package br.edu.ifsp.pep.visao;

import br.edu.ifsp.pep.dao.ClienteDAO;
import br.edu.ifsp.pep.dao.PlanoMedicoDAO;
import br.edu.ifsp.pep.modelo.Cliente;
import br.edu.ifsp.pep.modelo.PlanoMedico;
import java.awt.Color;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;

public class AssociadoDuo extends javax.swing.JDialog {
    
    private final Cliente cliente = new Cliente();
    private static Cliente titular = new Cliente();
    private static ClienteDAO clienteDAO = new ClienteDAO();
    private final PlanoMedicoDAO planoDAO = new PlanoMedicoDAO();

    public AssociadoDuo(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.carregarPlanosMedicos();
        this.cores();
    }

    public void cores() {
        Color corJframe = new Color(249, 253, 253);
        getContentPane().setBackground(corJframe); 
        paineis.getParent().setBackground(corJframe);
        paCadastrar.setBackground(corJframe);
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
        paineis = new javax.swing.JTabbedPane();
        paCadastrar = new javax.swing.JPanel();
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
        btnCadastrarAss = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblTitulo.setFont(new java.awt.Font("Times New Roman", 0, 48)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(24, 156, 184));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Associado");

        paineis.setForeground(new java.awt.Color(24, 156, 184));
        paineis.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        paCadastrar.setForeground(new java.awt.Color(24, 156, 184));
        paCadastrar.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

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

        btnCadastrarAss.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnCadastrarAss.setText("Cadastrar associado");
        btnCadastrarAss.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarAssActionPerformed(evt);
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
                                .addComponent(txtCPFAss, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE))
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
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paCadastrarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCadastrarAss, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(300, 300, 300))
        );
        paCadastrarLayout.setVerticalGroup(
            paCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paCadastrarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(paCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCPFAss, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(btnCadastrarAss, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        paineis.addTab("Cadastrar Associado", paCadastrar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(paineis)
                    .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(paineis, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbPlanoMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPlanoMedicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbPlanoMedicoActionPerformed

    private void txtTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefoneActionPerformed

    private void carregarPlanosMedicos(){          
        DefaultComboBoxModel modelo = (DefaultComboBoxModel) cbPlanoMedico.getModel();
        modelo.addElement("Planos Médicos...");
        for (PlanoMedico plano : planoDAO.findByAll()) {
            modelo.addElement(plano);
        }
    }
    
     private void LimparCampos(){
        txtNome.setText(" ");
        txtCPFAss.setValue(" ");        
        dataNasc.setDate(new Date());
        txtTelefone.setValue(" ");
        txtEmail.setText(" ");
        txtRua.setText(" ");
        txtNumero.setText(" ");
        txtBairro.setText(" ");
        cbPlanoMedico.setSelectedIndex(0);
    }
    
    private void btnCadastrarAssActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarAssActionPerformed
        if(txtNome.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Insira o nome do paciente!", "Nome", JOptionPane.WARNING_MESSAGE);
        }else{
            cliente.setNome(txtNome.getText());
        }
        if(txtCPFAss.getValue() == null){
            JOptionPane.showMessageDialog(null, "Insira o CPF do paciente!", "CPF", JOptionPane.WARNING_MESSAGE);
        }else{
            cliente.setCpf(txtCPFAss.getText());
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
        cliente.setTitularCpf(titular);
        DefaultComboBoxModel modelopm = (DefaultComboBoxModel) cbPlanoMedico.getModel();        
        cliente.setPlanoMedico((PlanoMedico) modelopm.getSelectedItem());
      
        cliente.setStatus(true);
        try {
            clienteDAO.inserir(cliente);
            JOptionPane.showMessageDialog(null, "Cliente cadastrado", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar cliente", "Erro", JOptionPane.ERROR);
        }
        this.LimparCampos();
        this.dispose();
    }//GEN-LAST:event_btnCadastrarAssActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AssociadoDuo dialog = new AssociadoDuo(new javax.swing.JDialog(), true);
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
    private javax.swing.JButton btnCadastrarAss;
    private javax.swing.JComboBox<String> cbPlanoMedico;
    private com.toedter.calendar.JDateChooser dataNasc;
    private javax.swing.JLabel lblBairro;
    private javax.swing.JLabel lblCpf;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblNascimento;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNumero;
    private javax.swing.JLabel lblRua;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JLabel lblTitular;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel paCadastrar;
    private javax.swing.JTabbedPane paineis;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JFormattedTextField txtCPFAss;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtRua;
    private javax.swing.JFormattedTextField txtTelefone;
    private javax.swing.JFormattedTextField txtTitular;
    // End of variables declaration//GEN-END:variables
}
