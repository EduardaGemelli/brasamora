package visao;

import dao.UsuarioDAO;
import modelo.UsuarioFuncionario;
import javax.swing.JOptionPane;
import java.sql.SQLException;

public class LoginForm extends javax.swing.JFrame {

    public LoginForm() {
        initComponents();
        this.setLocationRelativeTo(null);
        jtf_login.requestFocus();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jl_login = new javax.swing.JLabel();
        jtf_login = new javax.swing.JTextField();
        jl_senha = new javax.swing.JLabel();
        jb_cadastrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jl_cadastro = new javax.swing.JLabel();
        jb_entrar = new javax.swing.JButton();
        jb_cancelar = new javax.swing.JButton();
        jtf_senha = new javax.swing.JPasswordField();
        jl_img = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jl_login.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        jl_login.setText("Login:");
        getContentPane().add(jl_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, 50, 20));
        getContentPane().add(jtf_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 230, 300, -1));

        jl_senha.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        jl_senha.setText("Senha:");
        getContentPane().add(jl_senha, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 280, -1, -1));

        jb_cadastrar.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        jb_cadastrar.setText("Cadastrar");
        jb_cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_cadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(jb_cadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 440, 120, -1));

        jLabel1.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        jLabel1.setText("Seja bem vindo ao ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 370, 84));

        jLabel3.setFont(new java.awt.Font("Algerian", 0, 48)); // NOI18N
        jLabel3.setText("Brasamora Piercing");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 520, 48));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jl_cadastro.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        jl_cadastro.setText("Não possui login?");
        jPanel1.add(jl_cadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(304, 410, 170, 30));

        jb_entrar.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        jb_entrar.setText("Entrar");
        jb_entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_entrarActionPerformed(evt);
            }
        });
        jPanel1.add(jb_entrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 317, 130, -1));

        jb_cancelar.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        jb_cancelar.setText("Cancelar");
        jb_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_cancelarActionPerformed(evt);
            }
        });
        jPanel1.add(jb_cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(566, 317, -1, -1));
        jPanel1.add(jtf_senha, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 280, 300, -1));

        jl_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visao/log2.png"))); // NOI18N
        jPanel1.add(jl_img, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 227, -1, 213));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 520));

        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 250, 230));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb_cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_cadastrarActionPerformed
        CadastroLoginForm cadastroLogin = new CadastroLoginForm();
        cadastroLogin.setVisible(true);
        
        dispose();
        
    }//GEN-LAST:event_jb_cadastrarActionPerformed

    private void jb_entrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_entrarActionPerformed
        String login = jtf_login.getText();
        String senha = String.valueOf(jtf_senha.getPassword());
        
        if(login.length()>0 && senha.length()>0){
            UsuarioDAO usuarioDao = new UsuarioDAO();
            try{
                UsuarioFuncionario usuario = usuarioDao.login(login, senha);
                if(usuario == null){
                    JOptionPane.showMessageDialog(null, "Login ou senha inválida.",
                            "Erro.", JOptionPane.WARNING_MESSAGE);
                    return;
                }
                
                MenuForm menu = new MenuForm(usuario);
                menu.setVisible(true);
            } catch (SQLException ex){
                JOptionPane.showMessageDialog(null, "Erro ao realizar consulta ao banco de dados",
                        "Erro.", JOptionPane.WARNING_MESSAGE);
            }
        }
        
        dispose();
        
    }//GEN-LAST:event_jb_entrarActionPerformed

    private void jb_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_cancelarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jb_cancelarActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jb_cadastrar;
    private javax.swing.JButton jb_cancelar;
    private javax.swing.JButton jb_entrar;
    private javax.swing.JLabel jl_cadastro;
    private javax.swing.JLabel jl_img;
    private javax.swing.JLabel jl_login;
    private javax.swing.JLabel jl_senha;
    private javax.swing.JTextField jtf_login;
    private javax.swing.JPasswordField jtf_senha;
    // End of variables declaration//GEN-END:variables
}
