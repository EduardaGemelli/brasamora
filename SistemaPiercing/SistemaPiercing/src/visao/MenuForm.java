package visao;


import dao.ClienteDAO;
import modelo.Cliente;
import modelo.UsuarioFuncionario;

import visao.AuricularForm;
import visao.OralForm;
import visao.OutrasForm;
import visao.TermoResponsabilidadeForm;

import java.util.List;

public class MenuForm extends javax.swing.JFrame {
        private Cliente cliente;
        private UsuarioFuncionario usuario = new UsuarioFuncionario();
        String sexo = null;
        private ClienteDAO clienteDao = new ClienteDAO();
        private List<Cliente> clientes;
        private Cliente clienteSelecionado;
        
    public MenuForm(UsuarioFuncionario usuario) {
        initComponents();
        this.setLocationRelativeTo(null);
        
        this.usuario = usuario;
        jl_usuario.setText("Usuário logado: " + usuario.getNome());
        controleNivelAcesso();
    }
    
    private void controleNivelAcesso(){
        if(usuario.getNivel().equals("admin")){
            this.jm_manutencao.setVisible(true);
            this.jm_relatorios.setVisible(true);
            this.jm_sobre.setVisible(true);
            this.jm_termoResp.setVisible(true);
            this.jm_vendas.setVisible(true);
        } else if(usuario.getNivel().equals("funcionario")){
            this.jm_manutencao.setVisible(true);
            this.jm_relatorios.setVisible(false);
            this.jm_sobre.setVisible(true);
            this.jm_termoResp.setVisible(true);
            this.jm_vendas.setVisible(true);
        }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jl_usuario = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jb_sair = new javax.swing.JButton();
        jb_trocarUsuario = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jm_vendas = new javax.swing.JMenu();
        jmi_oral = new javax.swing.JMenuItem();
        jmi_orelha = new javax.swing.JMenuItem();
        jmi_intima = new javax.swing.JMenuItem();
        jmi_nariz = new javax.swing.JMenuItem();
        jmi_outras = new javax.swing.JMenuItem();
        jm_termoResp = new javax.swing.JMenu();
        jmi_termo = new javax.swing.JMenuItem();
        jm_anamnese = new javax.swing.JMenu();
        jmi_anamnese = new javax.swing.JMenuItem();
        jm_manutencao = new javax.swing.JMenu();
        jmi_cadastrar = new javax.swing.JMenuItem();
        jmi_vendas = new javax.swing.JMenuItem();
        jm_relatorios = new javax.swing.JMenu();
        jmi_relatorios = new javax.swing.JMenuItem();
        jm_sobre = new javax.swing.JMenu();
        jmi_sobre = new javax.swing.JMenuItem();

        jMenuItem6.setText("jMenuItem6");

        jMenuItem1.setText("jMenuItem1");

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        jMenuItem2.setText("jMenuItem2");

        jMenuItem3.setText("jMenuItem3");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jl_usuario.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        jl_usuario.setText("Usuário logado:");
        jPanel1.add(jl_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visao/log2.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 180, 210, 180));

        jLabel2.setFont(new java.awt.Font("Bell MT", 0, 24)); // NOI18N
        jLabel2.setText("O que você deseja fazer hoje?");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 290, 30));

        jLabel3.setBackground(new java.awt.Color(204, 204, 204));
        jLabel3.setFont(new java.awt.Font("Bell MT", 0, 24)); // NOI18N
        jLabel3.setText("Não é só um furinho! ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, 40));

        jLabel4.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        jLabel4.setText("Lembre-se de manter os cadastros");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 280, -1));

        jLabel5.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        jLabel5.setText("sempre atualizados.");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 190, -1));

        jb_sair.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        jb_sair.setText("Sair");
        jb_sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_sairActionPerformed(evt);
            }
        });
        jPanel1.add(jb_sair, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 320, -1, -1));

        jb_trocarUsuario.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        jb_trocarUsuario.setText("Trocar usuário");
        jb_trocarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_trocarUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(jb_trocarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, -1, -1));

        jm_vendas.setText("Vendas (perfurações)");
        jm_vendas.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N

        jmi_oral.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        jmi_oral.setText("Orais");
        jmi_oral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_oralActionPerformed(evt);
            }
        });
        jm_vendas.add(jmi_oral);

        jmi_orelha.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        jmi_orelha.setText("Auriculares");
        jmi_orelha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_orelhaActionPerformed(evt);
            }
        });
        jm_vendas.add(jmi_orelha);

        jmi_intima.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        jmi_intima.setText("Íntimas");
        jmi_intima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_intimaActionPerformed(evt);
            }
        });
        jm_vendas.add(jmi_intima);

        jmi_nariz.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        jmi_nariz.setText("Nariz");
        jmi_nariz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_narizActionPerformed(evt);
            }
        });
        jm_vendas.add(jmi_nariz);

        jmi_outras.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        jmi_outras.setText("Outras");
        jmi_outras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_outrasActionPerformed(evt);
            }
        });
        jm_vendas.add(jmi_outras);

        jMenuBar1.add(jm_vendas);

        jm_termoResp.setText("Termo Responsabilidade");
        jm_termoResp.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N

        jmi_termo.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        jmi_termo.setText("Termo de responsabilidade");
        jmi_termo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_termoActionPerformed(evt);
            }
        });
        jm_termoResp.add(jmi_termo);

        jMenuBar1.add(jm_termoResp);

        jm_anamnese.setText("Anamnese");
        jm_anamnese.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N

        jmi_anamnese.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        jmi_anamnese.setText("Ficha Anamnese");
        jmi_anamnese.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_anamneseActionPerformed(evt);
            }
        });
        jm_anamnese.add(jmi_anamnese);

        jMenuBar1.add(jm_anamnese);

        jm_manutencao.setText("Manutenção");
        jm_manutencao.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N

        jmi_cadastrar.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        jmi_cadastrar.setText("Cadastrar Dados Cliente");
        jmi_cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_cadastrarActionPerformed(evt);
            }
        });
        jm_manutencao.add(jmi_cadastrar);

        jmi_vendas.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        jmi_vendas.setText("Manutenção Vendas");
        jmi_vendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_vendasActionPerformed(evt);
            }
        });
        jm_manutencao.add(jmi_vendas);

        jMenuBar1.add(jm_manutencao);

        jm_relatorios.setText("Relatórios");
        jm_relatorios.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N

        jmi_relatorios.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        jmi_relatorios.setText("Relatórios");
        jm_relatorios.add(jmi_relatorios);

        jMenuBar1.add(jm_relatorios);

        jm_sobre.setText("Sobre");
        jm_sobre.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N

        jmi_sobre.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        jmi_sobre.setText("Sobre");
        jmi_sobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_sobreActionPerformed(evt);
            }
        });
        jm_sobre.add(jmi_sobre);

        jMenuBar1.add(jm_sobre);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmi_intimaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_intimaActionPerformed
        IntimasForm intimas = new IntimasForm(usuario);
        intimas.setVisible(true);
    }//GEN-LAST:event_jmi_intimaActionPerformed

    private void jmi_narizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_narizActionPerformed
        NarizForm nariz = new NarizForm(usuario);
        nariz.setVisible(true);
    }//GEN-LAST:event_jmi_narizActionPerformed

    private void jmi_termoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_termoActionPerformed
        TermoResponsabilidadeForm termo = new TermoResponsabilidadeForm(usuario);
        termo.setVisible(true);
    }//GEN-LAST:event_jmi_termoActionPerformed

    private void jmi_oralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_oralActionPerformed
        OralForm orais = new OralForm(usuario);
        orais.setVisible(true);
    }//GEN-LAST:event_jmi_oralActionPerformed

    private void jmi_orelhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_orelhaActionPerformed
        AuricularForm auricular = new AuricularForm(usuario);
        auricular.setVisible(true);
    }//GEN-LAST:event_jmi_orelhaActionPerformed

    private void jmi_outrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_outrasActionPerformed
        OutrasForm outras = new OutrasForm(usuario);
        outras.setVisible(true);
    }//GEN-LAST:event_jmi_outrasActionPerformed

    private void jmi_sobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_sobreActionPerformed
        SobreForm sobre = new SobreForm();
        sobre.setVisible(true);
    }//GEN-LAST:event_jmi_sobreActionPerformed

    private void jmi_cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_cadastrarActionPerformed
        DadosForm dados = new DadosForm(usuario);
        dados.setVisible(true);
    }//GEN-LAST:event_jmi_cadastrarActionPerformed

    private void jmi_anamneseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_anamneseActionPerformed
        AnamneseForm anamnese = new AnamneseForm(usuario);
        anamnese.setVisible(true);
    }//GEN-LAST:event_jmi_anamneseActionPerformed

    private void jb_sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_sairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jb_sairActionPerformed

    private void jb_trocarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_trocarUsuarioActionPerformed
        LoginForm login = new LoginForm();
        login.setVisible(true);
    }//GEN-LAST:event_jb_trocarUsuarioActionPerformed

    private void jmi_vendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_vendasActionPerformed
        VendasForm manutencaoVenda = new VendasForm(usuario);
        manutencaoVenda.setVisible(true);
    }//GEN-LAST:event_jmi_vendasActionPerformed


    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new MenuForm(usuario).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jb_sair;
    private javax.swing.JButton jb_trocarUsuario;
    private javax.swing.JLabel jl_usuario;
    private javax.swing.JMenu jm_anamnese;
    private javax.swing.JMenu jm_manutencao;
    private javax.swing.JMenu jm_relatorios;
    private javax.swing.JMenu jm_sobre;
    private javax.swing.JMenu jm_termoResp;
    private javax.swing.JMenu jm_vendas;
    private javax.swing.JMenuItem jmi_anamnese;
    private javax.swing.JMenuItem jmi_cadastrar;
    private javax.swing.JMenuItem jmi_intima;
    private javax.swing.JMenuItem jmi_nariz;
    private javax.swing.JMenuItem jmi_oral;
    private javax.swing.JMenuItem jmi_orelha;
    private javax.swing.JMenuItem jmi_outras;
    private javax.swing.JMenuItem jmi_relatorios;
    private javax.swing.JMenuItem jmi_sobre;
    private javax.swing.JMenuItem jmi_termo;
    private javax.swing.JMenuItem jmi_vendas;
    // End of variables declaration//GEN-END:variables
}
