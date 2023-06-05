package visao;

import dao.ClienteDAO;
import dao.VendasDAO;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.List;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelo.Cliente;
import modelo.UsuarioFuncionario;
import dao.UsuarioDAO;
import javax.swing.table.DefaultTableModel;

public class IntimasForm extends javax.swing.JFrame {
    private Cliente cliente;
    private UsuarioFuncionario usuario;
    private List<Cliente> clientes;
    private VendasDAO vendaDao = new VendasDAO();
    private ClienteDAO clienteDao = new ClienteDAO();
    private Cliente clienteSelecionado;
    int r = 0;
    double totalFinal;
    double totalCada; 
    double diferenca;

    public IntimasForm(UsuarioFuncionario usuario) {
        initComponents();
        //atualizarTabela();
        this.setLocationRelativeTo(null);
        
        this.cliente = cliente;
        jl_logado.setText("Usuário logado: " + usuario.getNome());
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jl_recado = new javax.swing.JLabel();
        jl_recado1 = new javax.swing.JLabel();
        jl_recado2 = new javax.swing.JLabel();
        jl_recado3 = new javax.swing.JLabel();
        jl_recado5 = new javax.swing.JLabel();
        jl_recado6 = new javax.swing.JLabel();
        jl_recado4 = new javax.swing.JLabel();
        jl_christina = new javax.swing.JLabel();
        jl_jbarChristina = new javax.swing.JLabel();
        jl_mamiloFem = new javax.swing.JLabel();
        jp_mamilos = new javax.swing.JPanel();
        jrb_120acoMamiloF1 = new javax.swing.JRadioButton();
        jrb_200acoMamiloF2 = new javax.swing.JRadioButton();
        jrb_150titanioMamiloF1 = new javax.swing.JRadioButton();
        jrb_280titanioMamiloF2 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jp_christina = new javax.swing.JPanel();
        jrb_240titanioChristina = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtf_valorTotal = new javax.swing.JTextField();
        jb_calcular = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jrb_100acoMamiloM1 = new javax.swing.JRadioButton();
        jrb_170acoMamiloM2 = new javax.swing.JRadioButton();
        jrb_120titanioMamiloM1 = new javax.swing.JRadioButton();
        jrb_200titanioMamiloM2 = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        jrb_240titanioCapuz = new javax.swing.JRadioButton();
        jl_lbarCapuz = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jtf_diferencaJoia = new javax.swing.JTextField();
        jl_logado = new javax.swing.JLabel();
        jb_relatorio = new javax.swing.JButton();
        jb_voltar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jtf_cliente = new javax.swing.JTextField();
        jtf_dataPerfuracao = new javax.swing.JTextField();
        jtf_descricao = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jtf_local = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Algerian", 0, 24)); // NOI18N
        jLabel2.setText("PERFURAÇÕES ÍNTIMAS");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(313, 10, -1, -1));

        jl_recado.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        jl_recado.setText("Os valores variam conforme perfuração e jóia escolhida.");
        jPanel1.add(jl_recado, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, -1, -1));

        jl_recado1.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        jl_recado1.setText("Jóias elaboradas deverão ser escolhidas na hora da perfuração.");
        jPanel1.add(jl_recado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, -1, -1));

        jl_recado2.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        jl_recado2.setText("Reajuste e diferença de valor é calculado no ato da escolha de jóia.");
        jPanel1.add(jl_recado2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, -1, -1));

        jl_recado3.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        jl_recado3.setText("LEMBRE-SE");
        jPanel1.add(jl_recado3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 170, 92, -1));

        jl_recado5.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        jl_recado5.setText("MANTENHA SUA PERFURAÇÃO LIMPA.");
        jPanel1.add(jl_recado5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 230, -1, -1));

        jl_recado6.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        jl_recado6.setText("Valor total:");
        jPanel1.add(jl_recado6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 520, -1, -1));

        jl_recado4.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        jl_recado4.setText("NÃO GIRE A JÓIA.");
        jPanel1.add(jl_recado4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 190, -1, -1));

        jl_christina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visao/christina.jpg"))); // NOI18N
        jPanel1.add(jl_christina, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 240, 190));

        jl_jbarChristina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visao/lbar.jpg"))); // NOI18N
        jPanel1.add(jl_jbarChristina, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -40, 240, 370));

        jl_mamiloFem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visao/mamiloFem.jpg"))); // NOI18N
        jPanel1.add(jl_mamiloFem, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 10, 260, 130));

        jp_mamilos.setBackground(new java.awt.Color(255, 255, 255));
        jp_mamilos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Mamilo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Bell MT", 0, 18))); // NOI18N

        jrb_120acoMamiloF1.setBackground(new java.awt.Color(255, 255, 255));
        jrb_120acoMamiloF1.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        jrb_120acoMamiloF1.setText("R$ 120,00 - Jóia simples Aço (1 mamilo)");
        jrb_120acoMamiloF1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrb_120acoMamiloF1ActionPerformed(evt);
            }
        });

        jrb_200acoMamiloF2.setBackground(new java.awt.Color(255, 255, 255));
        jrb_200acoMamiloF2.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        jrb_200acoMamiloF2.setText("R$ 200,00 - Jóias simples Aço (2 mamilos)");
        jrb_200acoMamiloF2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrb_200acoMamiloF2ActionPerformed(evt);
            }
        });

        jrb_150titanioMamiloF1.setBackground(new java.awt.Color(255, 255, 255));
        jrb_150titanioMamiloF1.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        jrb_150titanioMamiloF1.setText("R$ 150,00 - Jóia simples Titânio (1 mamilo)");
        jrb_150titanioMamiloF1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrb_150titanioMamiloF1ActionPerformed(evt);
            }
        });

        jrb_280titanioMamiloF2.setBackground(new java.awt.Color(255, 255, 255));
        jrb_280titanioMamiloF2.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        jrb_280titanioMamiloF2.setText("R$ 280,00 - Jóias simples Titânio (2 mamilos)");
        jrb_280titanioMamiloF2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrb_280titanioMamiloF2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jp_mamilosLayout = new javax.swing.GroupLayout(jp_mamilos);
        jp_mamilos.setLayout(jp_mamilosLayout);
        jp_mamilosLayout.setHorizontalGroup(
            jp_mamilosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_mamilosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_mamilosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jrb_120acoMamiloF1)
                    .addComponent(jrb_200acoMamiloF2)
                    .addComponent(jrb_150titanioMamiloF1)
                    .addComponent(jrb_280titanioMamiloF2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jp_mamilosLayout.setVerticalGroup(
            jp_mamilosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_mamilosLayout.createSequentialGroup()
                .addComponent(jrb_120acoMamiloF1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jrb_200acoMamiloF2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jrb_150titanioMamiloF1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jrb_280titanioMamiloF2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jp_mamilos, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 150, 290, 140));

        jLabel1.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        jLabel1.setText("MANTENHA UMA BOA HIGIENE.");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 210, 200, -1));

        jp_christina.setBackground(new java.awt.Color(255, 255, 255));
        jp_christina.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Christina", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Bell MT", 0, 18))); // NOI18N

        jrb_240titanioChristina.setBackground(new java.awt.Color(255, 255, 255));
        jrb_240titanioChristina.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        jrb_240titanioChristina.setText("R$ 240,00");
        jrb_240titanioChristina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrb_240titanioChristinaActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        jLabel3.setText("Jóia simples Titânio");

        javax.swing.GroupLayout jp_christinaLayout = new javax.swing.GroupLayout(jp_christina);
        jp_christina.setLayout(jp_christinaLayout);
        jp_christinaLayout.setHorizontalGroup(
            jp_christinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_christinaLayout.createSequentialGroup()
                .addGroup(jp_christinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jrb_240titanioChristina)
                    .addGroup(jp_christinaLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jp_christinaLayout.setVerticalGroup(
            jp_christinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_christinaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jrb_240titanioChristina)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap())
        );

        jPanel1.add(jp_christina, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, 170, 110));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visao/semFundo_logoBrasamora.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 490, 130, 120));
        jPanel1.add(jtf_valorTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 520, 220, -1));

        jb_calcular.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        jb_calcular.setText("Calcular");
        jb_calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_calcularActionPerformed(evt);
            }
        });
        jPanel1.add(jb_calcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 470, 130, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Mamilo Masculino", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Bell MT", 0, 18))); // NOI18N

        jrb_100acoMamiloM1.setBackground(new java.awt.Color(255, 255, 255));
        jrb_100acoMamiloM1.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        jrb_100acoMamiloM1.setText("R$ 100,00 - Jóia simples Aço (1 mamilo)");
        jrb_100acoMamiloM1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrb_100acoMamiloM1ActionPerformed(evt);
            }
        });

        jrb_170acoMamiloM2.setBackground(new java.awt.Color(255, 255, 255));
        jrb_170acoMamiloM2.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        jrb_170acoMamiloM2.setText("R$ 170,00 - Jóias simples Aço (2 mamilos)");
        jrb_170acoMamiloM2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrb_170acoMamiloM2ActionPerformed(evt);
            }
        });

        jrb_120titanioMamiloM1.setBackground(new java.awt.Color(255, 255, 255));
        jrb_120titanioMamiloM1.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        jrb_120titanioMamiloM1.setText("R$ 120,00 - Jóia simples Titânio (1 mamilo)");
        jrb_120titanioMamiloM1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrb_120titanioMamiloM1ActionPerformed(evt);
            }
        });

        jrb_200titanioMamiloM2.setBackground(new java.awt.Color(255, 255, 255));
        jrb_200titanioMamiloM2.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        jrb_200titanioMamiloM2.setText("R$ 200,00 - Jóias simples Titânio (2 mamilos)");
        jrb_200titanioMamiloM2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrb_200titanioMamiloM2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jrb_100acoMamiloM1)
                    .addComponent(jrb_120titanioMamiloM1)
                    .addComponent(jrb_200titanioMamiloM2)
                    .addComponent(jrb_170acoMamiloM2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jrb_100acoMamiloM1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jrb_170acoMamiloM2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jrb_120titanioMamiloM1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jrb_200titanioMamiloM2)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 300, 290, 130));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Vertical Hood", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Bell MT", 0, 18))); // NOI18N

        jrb_240titanioCapuz.setBackground(new java.awt.Color(255, 255, 255));
        jrb_240titanioCapuz.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        jrb_240titanioCapuz.setText("R$ 240,00 - Jóia simples Titânio");

        jl_lbarCapuz.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visao/capuz.jpeg"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jrb_240titanioCapuz)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jl_lbarCapuz, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jrb_240titanioCapuz)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jl_lbarCapuz, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 530, 210, 160));

        jLabel7.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        jLabel7.setText("Diferença de valor de jóia:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 420, -1, -1));

        jtf_diferencaJoia.setText("0.0");
        jPanel1.add(jtf_diferencaJoia, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 440, 220, -1));

        jl_logado.setFont(new java.awt.Font("Bell MT", 1, 12)); // NOI18N
        jl_logado.setText("Usuário Logado:");
        jPanel1.add(jl_logado, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, 320, -1));

        jb_relatorio.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        jb_relatorio.setText("Gerar Relatório");
        jb_relatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_relatorioActionPerformed(evt);
            }
        });
        jPanel1.add(jb_relatorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 650, 190, -1));

        jb_voltar.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        jb_voltar.setText("Voltar");
        jb_voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_voltarActionPerformed(evt);
            }
        });
        jPanel1.add(jb_voltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 470, 140, -1));

        jLabel5.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        jLabel5.setText("Cliente:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 550, 50, 20));

        jLabel9.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        jLabel9.setText("Data perfuração:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 580, -1, -1));

        jLabel10.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        jLabel10.setText("Descrição:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 610, -1, -1));
        jPanel1.add(jtf_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 550, 220, -1));
        jPanel1.add(jtf_dataPerfuracao, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 580, 190, -1));
        jPanel1.add(jtf_descricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 610, 220, -1));

        jLabel4.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        jLabel4.setText("Local:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 640, -1, -1));
        jPanel1.add(jtf_local, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 640, 220, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 920, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb_relatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_relatorioActionPerformed
        //atualizarTabela();
        
        String relatorio = "--- Dados de venda --- \n" + "Piercing Intimos \n" +
                " Cliente: " + jtf_cliente.getText() + "\n Data perfuração: " + jtf_dataPerfuracao.getText() +  
                "\n Valor Total: " + jtf_valorTotal.getText() + "\n Descrição: " + jtf_descricao.getText() + "\n Local: " + jtf_local.getText();

        byte[] buff=relatorio.getBytes();

        try{
            r++;
            RandomAccessFile raf = new RandomAccessFile("c:\\relatoriosPiercing\\Íntimos\\intimos " + jtf_cliente.getText() + ".txt", "rw");
            raf.write(buff);
        }
        catch(IOException ex){
            ex.printStackTrace();
        }
        
        //JComboBox<Object> nome = jcb_nomes;
        String nome = jtf_cliente.getText();
        String dataPerfuracao = jtf_dataPerfuracao.getText();
        String valor = jtf_valorTotal.getText();
        String descricao = jtf_descricao.getText();
        String local = jtf_local.getText();
        int id = 0;
        
//        if(jcb_nomes.getSelectedItem().equals("Selecione um cliente")){
//            JOptionPane.showMessageDialog(null, "Selecione um cliente.", "Atenção", JOptionPane.WARNING_MESSAGE);
//            return;
//        }
        if(nome.length() == 0){
            JOptionPane.showMessageDialog(null, "Informe o cliente.", "Atenção", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(dataPerfuracao.length() == 0){
            JOptionPane.showMessageDialog(null, "Informe a data da perfuração.", "Atenção", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(valor.length() == 0){
            JOptionPane.showMessageDialog(null, "Informe um valor.", "Atenção", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(descricao.length() == 0){
            JOptionPane.showMessageDialog(null, "Informe a descrição.", "Atenção", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(local.length() == 0){
            JOptionPane.showMessageDialog(null, "Informe o local.", "Atenção", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        if (clienteSelecionado == null){
            Cliente cliente = new Cliente ();
        cliente.setNome(nome);
        cliente.setDataPerfuracao(dataPerfuracao);
        cliente.setValor(valor);
        cliente.setDescricao(descricao);
        cliente.setLocal(local);
        
            try {
                vendaDao.adicionarVenda(cliente);
                JOptionPane.showMessageDialog(null, "Venda cadastrada com sucesso.");
                //atualizarTabela();
                //jcb_nomes.set("");
                jtf_cliente.setText("");
                jtf_dataPerfuracao.setText("");
                jtf_valorTotal.setText("");
                jtf_descricao.setText("");
                jtf_local.setText("");
            } catch (SQLException ex){
                ex.printStackTrace();
                JOptionPane.showMessageDialog(null, "Erro ao inserir no banco de dados.", "Erro", JOptionPane.WARNING_MESSAGE);
            }
        } else{
            clienteSelecionado.setNome(nome);
            clienteSelecionado.setDataPerfuracao(dataPerfuracao);
            clienteSelecionado.setValor(valor);
            clienteSelecionado.setDescricao(descricao);
            clienteSelecionado.setLocal(local);
            
            try {
                vendaDao.alterar(clienteSelecionado);
                JOptionPane.showMessageDialog(null, "Venda alterada");
                //atualizarTabela();
                jtf_cliente.setText("");
                jtf_dataPerfuracao.setText("");
                jtf_valorTotal.setText("");
                jtf_descricao.setText("");
                jtf_local.setText("");
                
            } catch (SQLException ex) {
                ex.printStackTrace();
            }  
        }
        clienteSelecionado = null; 
        
    }//GEN-LAST:event_jb_relatorioActionPerformed

    private void jrb_200titanioMamiloM2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrb_200titanioMamiloM2ActionPerformed
        if (jrb_200titanioMamiloM2.isSelected()){
            jrb_170acoMamiloM2.setSelected(false);
            jrb_120titanioMamiloM1.setSelected(false);
            jrb_100acoMamiloM1.setSelected(false);
        }
    }//GEN-LAST:event_jrb_200titanioMamiloM2ActionPerformed

    private void jrb_120titanioMamiloM1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrb_120titanioMamiloM1ActionPerformed
        if (jrb_120titanioMamiloM1.isSelected()){
            jrb_170acoMamiloM2.setSelected(false);
            jrb_100acoMamiloM1.setSelected(false);
            jrb_200titanioMamiloM2.setSelected(false);
        }
    }//GEN-LAST:event_jrb_120titanioMamiloM1ActionPerformed

    private void jrb_170acoMamiloM2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrb_170acoMamiloM2ActionPerformed
        if (jrb_170acoMamiloM2.isSelected()){
            jrb_100acoMamiloM1.setSelected(false);
            jrb_120titanioMamiloM1.setSelected(false);
            jrb_200titanioMamiloM2.setSelected(false);
        }
    }//GEN-LAST:event_jrb_170acoMamiloM2ActionPerformed

    private void jrb_100acoMamiloM1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrb_100acoMamiloM1ActionPerformed
        if (jrb_100acoMamiloM1.isSelected()){
            jrb_170acoMamiloM2.setSelected(false);
            jrb_120titanioMamiloM1.setSelected(false);
            jrb_200titanioMamiloM2.setSelected(false);
        }
    }//GEN-LAST:event_jrb_100acoMamiloM1ActionPerformed

    private void jb_calcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_calcularActionPerformed
        double totalFinal = 0;
        double totalCada = 0;
        double diferenca = 0;
        
        if(jrb_240titanioCapuz.isSelected()){
            totalCada = totalCada + 240.00;
        }

        if(jrb_240titanioChristina.isSelected()){
            totalCada = totalCada + 240.00;
        }
        
        if(jrb_120acoMamiloF1.isSelected()){
            totalCada = totalCada + 120.00;
        }else if (jrb_200acoMamiloF2.isSelected()){
            totalCada = totalCada + 200.00;
        } else if (jrb_150titanioMamiloF1.isSelected()){
            totalCada = totalCada + 150.00;
        } else {
            totalCada = totalCada + 280.00;
        }

        if(jrb_100acoMamiloM1.isSelected()){
            totalCada = totalCada + 100.00;
        } else if (jrb_170acoMamiloM2.isSelected()) {
            totalCada = totalCada + 170.00;
        } else if (jrb_120titanioMamiloM1.isSelected()) {
            totalCada = totalCada + 120.00;
        } else {
            totalCada = totalCada + 200.00;
        }

        diferenca = Double.parseDouble((jtf_diferencaJoia.getText()));

        totalFinal = totalCada + diferenca;

        jtf_valorTotal.setText(Double.toString(totalFinal));
        totalFinal = Double.parseDouble((jtf_valorTotal.getText()));

    }//GEN-LAST:event_jb_calcularActionPerformed

    private void jrb_240titanioChristinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrb_240titanioChristinaActionPerformed

    }//GEN-LAST:event_jrb_240titanioChristinaActionPerformed

    private void jrb_280titanioMamiloF2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrb_280titanioMamiloF2ActionPerformed
        if (jrb_280titanioMamiloF2.isSelected()){
            jrb_200acoMamiloF2.setSelected(false);
            jrb_150titanioMamiloF1.setSelected(false);
            jrb_120acoMamiloF1.setSelected(false);
        }
    }//GEN-LAST:event_jrb_280titanioMamiloF2ActionPerformed

    private void jrb_150titanioMamiloF1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrb_150titanioMamiloF1ActionPerformed
        if (jrb_150titanioMamiloF1.isSelected()){
            jrb_200acoMamiloF2.setSelected(false);
            jrb_120acoMamiloF1.setSelected(false);
            jrb_280titanioMamiloF2.setSelected(false);
        }
    }//GEN-LAST:event_jrb_150titanioMamiloF1ActionPerformed

    private void jrb_200acoMamiloF2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrb_200acoMamiloF2ActionPerformed
        if (jrb_200acoMamiloF2.isSelected()){
            jrb_120acoMamiloF1.setSelected(false);
            jrb_150titanioMamiloF1.setSelected(false);
            jrb_280titanioMamiloF2.setSelected(false);
        }
    }//GEN-LAST:event_jrb_200acoMamiloF2ActionPerformed

    private void jrb_120acoMamiloF1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrb_120acoMamiloF1ActionPerformed
        if (jrb_120acoMamiloF1.isSelected()){
            jrb_200acoMamiloF2.setSelected(false);
            jrb_150titanioMamiloF1.setSelected(false);
            jrb_280titanioMamiloF2.setSelected(false);
        }
    }//GEN-LAST:event_jrb_120acoMamiloF1ActionPerformed

    private void jb_voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_voltarActionPerformed
        dispose();
    }//GEN-LAST:event_jb_voltarActionPerformed
    
//    private void atualizarTabela(){
//        try {
//                clientes = vendaDao.buscarPorNome(jtf_filtrarNome.getText());
//                
//                DefaultTableModel model = (DefaultTableModel) tabela.getModel();
//                model.setNumRows(0);
//                    for (int i = 0; i < clientes.size(); i++) {
//                        Cliente cliente = clientes.get(i);
//                        model.addRow(new Object[]{cliente.getNome(), cliente.getDataPerfuracao(), cliente.getValor(), cliente.getDescricao()});
//                    }
//            } catch (SQLException ex) {
//                ex.printStackTrace();
//            }
//        
//    }
    
    public static void main(String args[]) {
  
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new DadosPessoaisForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton jb_calcular;
    private javax.swing.JButton jb_relatorio;
    private javax.swing.JButton jb_voltar;
    private javax.swing.JLabel jl_christina;
    private javax.swing.JLabel jl_jbarChristina;
    private javax.swing.JLabel jl_lbarCapuz;
    private javax.swing.JLabel jl_logado;
    private javax.swing.JLabel jl_mamiloFem;
    private javax.swing.JLabel jl_recado;
    private javax.swing.JLabel jl_recado1;
    private javax.swing.JLabel jl_recado2;
    private javax.swing.JLabel jl_recado3;
    private javax.swing.JLabel jl_recado4;
    private javax.swing.JLabel jl_recado5;
    private javax.swing.JLabel jl_recado6;
    private javax.swing.JPanel jp_christina;
    private javax.swing.JPanel jp_mamilos;
    private javax.swing.JRadioButton jrb_100acoMamiloM1;
    private javax.swing.JRadioButton jrb_120acoMamiloF1;
    private javax.swing.JRadioButton jrb_120titanioMamiloM1;
    private javax.swing.JRadioButton jrb_150titanioMamiloF1;
    private javax.swing.JRadioButton jrb_170acoMamiloM2;
    private javax.swing.JRadioButton jrb_200acoMamiloF2;
    private javax.swing.JRadioButton jrb_200titanioMamiloM2;
    private javax.swing.JRadioButton jrb_240titanioCapuz;
    private javax.swing.JRadioButton jrb_240titanioChristina;
    private javax.swing.JRadioButton jrb_280titanioMamiloF2;
    private javax.swing.JTextField jtf_cliente;
    private javax.swing.JTextField jtf_dataPerfuracao;
    private javax.swing.JTextField jtf_descricao;
    private javax.swing.JTextField jtf_diferencaJoia;
    private javax.swing.JTextField jtf_local;
    private javax.swing.JTextField jtf_valorTotal;
    // End of variables declaration//GEN-END:variables
}
