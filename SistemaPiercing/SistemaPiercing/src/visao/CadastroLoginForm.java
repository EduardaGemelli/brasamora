package visao;

import dao.UsuarioDAO;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelo.UsuarioFuncionario;

public class CadastroLoginForm extends javax.swing.JFrame {
    String nivel = null;
    private UsuarioDAO usuarioDao = new UsuarioDAO();
    
    public CadastroLoginForm() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jl_nome = new javax.swing.JLabel();
        jl_login = new javax.swing.JLabel();
        jl_senha = new javax.swing.JLabel();
        jtf_nome = new javax.swing.JTextField();
        jtf_login = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jrb_admin = new javax.swing.JRadioButton();
        jrb_funcionario = new javax.swing.JRadioButton();
        jb_finalizarCadastro = new javax.swing.JButton();
        jl_img = new javax.swing.JLabel();
        jpf_senha = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jl_nome.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        jl_nome.setText("Nome completo:");
        getContentPane().add(jl_nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 58, 354, -1));

        jl_login.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        jl_login.setText("Login:");
        getContentPane().add(jl_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 116, 354, -1));

        jl_senha.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        jl_senha.setText("Senha:");
        getContentPane().add(jl_senha, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 178, 354, -1));
        getContentPane().add(jtf_nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 79, 354, -1));
        getContentPane().add(jtf_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 141, 354, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        jLabel4.setText("Preencha seus dados corretamente.");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 21, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nível de cadastro", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Bell MT", 0, 14))); // NOI18N
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jrb_admin.setBackground(new java.awt.Color(255, 255, 255));
        jrb_admin.setText("Administrador(a)");
        jrb_admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrb_adminActionPerformed(evt);
            }
        });

        jrb_funcionario.setBackground(new java.awt.Color(255, 255, 255));
        jrb_funcionario.setText("Funcionário(a)");
        jrb_funcionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrb_funcionarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jrb_admin)
                    .addComponent(jrb_funcionario))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jrb_admin)
                .addGap(12, 12, 12)
                .addComponent(jrb_funcionario)
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 254, -1, -1));

        jb_finalizarCadastro.setBackground(new java.awt.Color(255, 255, 255));
        jb_finalizarCadastro.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        jb_finalizarCadastro.setText("Finalizar Cadastro");
        jb_finalizarCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_finalizarCadastroActionPerformed(evt);
            }
        });
        jPanel1.add(jb_finalizarCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 363, 164, -1));

        jl_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visao/semFundo_logoBrasamora.png"))); // NOI18N
        jPanel1.add(jl_img, new org.netbeans.lib.awtextra.AbsoluteConstraints(219, 227, 155, 130));
        jPanel1.add(jpf_senha, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 360, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jrb_adminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrb_adminActionPerformed
        if(jrb_admin.isSelected()){
            jrb_funcionario.setSelected(false);
        }
    }//GEN-LAST:event_jrb_adminActionPerformed

    private void jrb_funcionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrb_funcionarioActionPerformed
        if(jrb_funcionario.isSelected()){
            jrb_admin.setSelected(false);
        }
    }//GEN-LAST:event_jrb_funcionarioActionPerformed

    private void jb_finalizarCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_finalizarCadastroActionPerformed
        String nome = jtf_nome.getText();
        String login = jtf_login.getText();
        String senha = jpf_senha.getText();
        
        if(jrb_funcionario.isSelected()){
            nivel = "Funcionário(a)";
        }
        if(jrb_admin.isSelected()){
            nivel = "Administrador(a)";
        }
        
        UsuarioFuncionario usuario = new UsuarioFuncionario(nome, login, senha, nivel);
            
           try{
            usuarioDao.adicionar(usuario);
            JOptionPane.showMessageDialog(null, "Pessoa cadastrada com sucesso");
            jtf_nome.setText(" ");
            jtf_login.setText(" ");
            jpf_senha.setText(" ");
            jrb_admin.setSelected(false);
            jrb_funcionario.setSelected(false);
            
            LoginForm loginF = new LoginForm();
            loginF.setVisible(true);
            
        }catch(SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao inserir no banco de dados.", 
                    "erro", JOptionPane.WARNING_MESSAGE);
        }
           
           dispose();
    }//GEN-LAST:event_jb_finalizarCadastroActionPerformed

    public static void main(String args[]) {
  
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroLoginForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jb_finalizarCadastro;
    private javax.swing.JLabel jl_img;
    private javax.swing.JLabel jl_login;
    private javax.swing.JLabel jl_nome;
    private javax.swing.JLabel jl_senha;
    private javax.swing.JPasswordField jpf_senha;
    private javax.swing.JRadioButton jrb_admin;
    private javax.swing.JRadioButton jrb_funcionario;
    private javax.swing.JTextField jtf_login;
    private javax.swing.JTextField jtf_nome;
    // End of variables declaration//GEN-END:variables
}
