
package br.edu.ifsp.pep.visao;

import br.edu.ifsp.pep.dao.ClienteDAO;
import br.edu.ifsp.pep.dao.MedicoDAO;
import br.edu.ifsp.pep.dao.SecretariadoDAO;
import br.edu.ifsp.pep.modelo.Medico;
import br.edu.ifsp.pep.modelo.Secretariado;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;

public class TelaLogin extends javax.swing.JDialog {

    private MedicoDAO medicoDAO = new MedicoDAO();
    private SecretariadoDAO secretariadoDAO = new SecretariadoDAO();

    public TelaLogin(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.carregarCores();
        setLocationRelativeTo(null);
    }

    public void carregarCores() {
        Color corJframe = new Color(249, 253, 253);
        getContentPane().setBackground(corJframe);
        Color iconCor = new Color(24, 156, 184);
        lblImg.setForeground(iconCor);
        btnEntrar.setBackground(iconCor);
        cbFuncionarios.setBackground(iconCor);
        cbFuncionarios.setForeground(new Color(255,255,255));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblImg = new javax.swing.JLabel();
        lblLogin = new javax.swing.JLabel();
        lblSenha = new javax.swing.JLabel();
        txtLogin = new javax.swing.JTextField();
        txtSenha = new javax.swing.JPasswordField();
        btnEntrar = new javax.swing.JButton();
        cbFuncionarios = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblImg.setBackground(new java.awt.Color(24, 156, 184));
        lblImg.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        lblImg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImg.setText("Login");
        lblImg.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lblLogin.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblLogin.setText("Login:");

        lblSenha.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblSenha.setText("Senha:");

        txtLogin.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        txtSenha.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        btnEntrar.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnEntrar.setText("Entrar");
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });

        cbFuncionarios.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        cbFuncionarios.setForeground(new java.awt.Color(255, 255, 255));
        cbFuncionarios.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione sua função...", "Secretariado", "Médico", " " }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblImg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbFuncionarios, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSenha)
                            .addComponent(lblLogin))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtLogin)
                            .addComponent(txtSenha))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblImg, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cbFuncionarios, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(btnEntrar)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        String login = txtLogin.getText();
        String senha = txtSenha.getText();
        Secretariado lo = null;
        Secretariado se = null;
        Medico loM = null;
        Medico seM = null;
        if (cbFuncionarios.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Selecione sua função", "Função", JOptionPane.WARNING_MESSAGE);
        }
        if (login.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Insira o login!", "Login", JOptionPane.WARNING_MESSAGE);
        }
        if (senha.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Insira a senha!", "Senha", JOptionPane.WARNING_MESSAGE);
        }
        if (cbFuncionarios.getSelectedIndex() == 1) {
            try {
                lo = secretariadoDAO.buscaLogin(login);
                se = secretariadoDAO.buscaSenha(senha);

                if ((login.equals(lo.getLoginNome())) && (senha.equals(se.getLoginSenha()))) {
                    JOptionPane.showMessageDialog(null, "Login Efetuado!", "Sucesso", JOptionPane.WARNING_MESSAGE);

                    TelaInicial telainicial = new TelaInicial();
                    telainicial.setVisible(true);
                    this.dispose();

                } else {
                    JOptionPane.showMessageDialog(null, "Erro ao logar!", "ERRO", JOptionPane.ERROR);
                }

            } catch (Exception e) {
                System.out.println(e);
            }
        }
        if (cbFuncionarios.getSelectedIndex() == 2) {
            try {
                loM = medicoDAO.buscaLogin(login);
                seM = medicoDAO.buscaSenha(senha);

                if ((login.equals(loM.getLoginNome())) && (senha.equals(seM.getLoginSenha()))) {
                    JOptionPane.showMessageDialog(null, "Login Efetuado!", "Sucesso", JOptionPane.WARNING_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Erro ao logar!", "ERRO", JOptionPane.ERROR);
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        
    }//GEN-LAST:event_btnEntrarActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TelaLogin dialog = new TelaLogin(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnEntrar;
    private javax.swing.JComboBox<String> cbFuncionarios;
    private javax.swing.JLabel lblImg;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables
}
