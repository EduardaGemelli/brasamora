package visao;

import modelo.Cliente;
import modelo.UsuarioFuncionario;

public class TermoResponsabilidadeForm extends javax.swing.JFrame {
    private Cliente cliente;
    private UsuarioFuncionario usuario;

    public TermoResponsabilidadeForm(UsuarioFuncionario usuario) {
        initComponents();
        this.setLocationRelativeTo(null);
        
        this.cliente = cliente;
        jl_logado.setText("Usuário logado: " + usuario.getNome());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jl_img = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jtf_nomeResponsavel = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jtf_menorIdade = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jtf_sexoResponsavel = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jftf_rgResponsavel = new javax.swing.JFormattedTextField();
        jftf_cpfResponsavel = new javax.swing.JFormattedTextField();
        jftf_nascimentoResponsavel = new javax.swing.JFormattedTextField();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jl_logado = new javax.swing.JLabel();
        jb_voltarMenu = new javax.swing.JButton();

        jLabel2.setText("jLabel2");

        jLabel4.setText("jLabel4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Algerian", 0, 24)); // NOI18N
        jLabel1.setText("Termo de responsabilidade para perfuração em menor de idade");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 27, -1, 50));
        getContentPane().add(jl_img, new org.netbeans.lib.awtextra.AbsoluteConstraints(847, 0, -1, 162));

        jLabel3.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        jLabel3.setText("Eu, acima identificado (a), autorizo o (a) menor citada acima, do qual sou responsável legal,");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 255, -1, 30));

        jLabel5.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        jLabel5.setText(" a  submeter-se a aplicação de piercing. ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(568, 255, -1, 30));

        jLabel6.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        jLabel6.setText("técnicas e materiais utilizados, assim como todos os cuidados pós perfuração necessários para que ");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(342, 291, 592, -1));

        jLabel7.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        jLabel7.setText("ocorra uma cicatrização correta e sem complicações que foram orientados pelo ");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 318, -1, 15));

        jLabel8.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        jLabel8.setText("Declaro ainda, que a profissional fica isenta de  qualquer responsabilidade, salvo aquelas decorrentes de imperícia técnica. ");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 339, 1006, 21));

        jLabel9.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        jLabel9.setText("DADOS PESSOAIS DO (A) RESPONSÁVEL:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 83, 309, 32));

        jLabel10.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        jLabel10.setText("EU, ");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 135, -1, -1));
        getContentPane().add(jtf_nomeResponsavel, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 133, 215, -1));

        jLabel11.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        jLabel11.setText(", portador(a) do RG:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 135, -1, -1));
        getContentPane().add(jtf_menorIdade, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 195, 431, -1));

        jLabel12.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        jLabel12.setText(", e CPF:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(557, 134, -1, -1));

        jLabel13.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        jLabel13.setText(", nascido(a) no dia:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 171, -1, -1));

        jLabel14.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        jLabel14.setText(", de sexo:");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(243, 171, -1, -1));
        getContentPane().add(jtf_sexoResponsavel, new org.netbeans.lib.awtextra.AbsoluteConstraints(308, 170, 133, -1));

        jLabel15.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        jLabel15.setText(", autorizo a aplicação de piercing sob o menor de minha responsabilidade");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(451, 171, -1, -1));

        jLabel16.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        jLabel16.setText("Declaro em pleno juízo estar ciente de todo processo,  ");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 291, 322, -1));

        jLabel17.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        jLabel17.setText("profissional responsável pela perfuração.");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(486, 317, 313, -1));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visao/18.png"))); // NOI18N
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(865, 0, 151, 162));

        jLabel19.setText(".");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(443, 198, 36, -1));

        try {
            jftf_rgResponsavel.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("########-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(jftf_rgResponsavel, new org.netbeans.lib.awtextra.AbsoluteConstraints(385, 133, 168, -1));

        try {
            jftf_cpfResponsavel.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(jftf_cpfResponsavel, new org.netbeans.lib.awtextra.AbsoluteConstraints(609, 133, 234, -1));

        try {
            jftf_nascimentoResponsavel.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(jftf_nascimentoResponsavel, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 170, 115, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visao/impressora.png"))); // NOI18N
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 370, 130, 90));

        jLabel20.setText("__________________________________________________________________");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, 370, -1));

        jLabel21.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        jLabel21.setText("Assinatura do responsável");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 440, -1, -1));

        jl_logado.setFont(new java.awt.Font("Bell MT", 1, 12)); // NOI18N
        jl_logado.setText("Usuário logado:");
        jPanel1.add(jl_logado, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 280, -1));

        jb_voltarMenu.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        jb_voltarMenu.setText("Voltar ao Menu");
        jb_voltarMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_voltarMenuActionPerformed(evt);
            }
        });
        jPanel1.add(jb_voltarMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 433, 150, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb_voltarMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_voltarMenuActionPerformed
        dispose();
    }//GEN-LAST:event_jb_voltarMenuActionPerformed


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new TermoResponsabilidadeForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jb_voltarMenu;
    private javax.swing.JFormattedTextField jftf_cpfResponsavel;
    private javax.swing.JFormattedTextField jftf_nascimentoResponsavel;
    private javax.swing.JFormattedTextField jftf_rgResponsavel;
    private javax.swing.JLabel jl_img;
    private javax.swing.JLabel jl_logado;
    private javax.swing.JTextField jtf_menorIdade;
    private javax.swing.JTextField jtf_nomeResponsavel;
    private javax.swing.JTextField jtf_sexoResponsavel;
    // End of variables declaration//GEN-END:variables
}
