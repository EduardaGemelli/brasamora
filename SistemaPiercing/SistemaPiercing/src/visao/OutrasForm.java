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

public class OutrasForm extends javax.swing.JFrame {
    private Cliente cliente;
    private UsuarioFuncionario usuario;
    private List<Cliente> clientes;
    private VendasDAO vendaDao = new VendasDAO();
    private ClienteDAO clienteDao = new ClienteDAO();
    private Cliente clienteSelecionado;
    int r = 0;
    double totalCada;
    double totalFinal;
    double diferenca;
   

    public OutrasForm(UsuarioFuncionario usuario) {
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
        jl_micro = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jl_recado1 = new javax.swing.JLabel();
        jl_recado3 = new javax.swing.JLabel();
        jp_micro = new javax.swing.JPanel();
        jrb_240titanioMicro = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jl_surface = new javax.swing.JLabel();
        jp_surface = new javax.swing.JPanel();
        jrb_240titanioSurface = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jl_sobrancelha = new javax.swing.JLabel();
        jp_sobrancelha = new javax.swing.JPanel();
        jrb_100acoSobrancelha = new javax.swing.JRadioButton();
        jrb_120titanioSobrancelha = new javax.swing.JRadioButton();
        jl_logo = new javax.swing.JLabel();
        jb_calcular = new javax.swing.JButton();
        jb_voltar = new javax.swing.JButton();
        jl_recado7 = new javax.swing.JLabel();
        jtf_valorTotal = new javax.swing.JTextField();
        jl_recado4 = new javax.swing.JLabel();
        jl_recado5 = new javax.swing.JLabel();
        jl_recado6 = new javax.swing.JLabel();
        jl_umbigo = new javax.swing.JLabel();
        jp_umbigo = new javax.swing.JPanel();
        jrb_100acoUmbigo = new javax.swing.JRadioButton();
        jrb_130titanioUmbigo = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jtf_diferencaJoia = new javax.swing.JTextField();
        jl_logado = new javax.swing.JLabel();
        jb_relatorio = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jtf_cliente = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jtf_dataPerfuracao = new javax.swing.JTextField();
        jl_local = new javax.swing.JLabel();
        jtf_local = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jtf_descricao = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jl_micro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visao/micro.jpg"))); // NOI18N
        jPanel1.add(jl_micro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 220, 270));

        jLabel3.setFont(new java.awt.Font("Algerian", 0, 24)); // NOI18N
        jLabel3.setText("Outras perfurações");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 270, 40));

        jLabel1.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        jLabel1.setText("Os valores variam conforme perfuração e jóia escolhida.");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 80, -1, -1));

        jl_recado1.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        jl_recado1.setText("Jóias elaboradas deverão ser escolhidas na hora da perfuração.");
        jPanel1.add(jl_recado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, -1, -1));

        jl_recado3.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        jl_recado3.setText("Reajuste e diferença de valor é calculado no ato da escolha de jóia.");
        jPanel1.add(jl_recado3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, -1, -1));

        jp_micro.setBackground(new java.awt.Color(255, 255, 255));
        jp_micro.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Microdermal", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Bell MT", 0, 18))); // NOI18N

        jrb_240titanioMicro.setBackground(new java.awt.Color(255, 255, 255));
        jrb_240titanioMicro.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        jrb_240titanioMicro.setText("R$ 240,00 - Jóia simples Titânio");

        jLabel6.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        jLabel6.setText("O microdermal, deve ser aplicado");

        jLabel7.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        jLabel7.setText("único e exclusivamente com jóia em titânio.");

        javax.swing.GroupLayout jp_microLayout = new javax.swing.GroupLayout(jp_micro);
        jp_micro.setLayout(jp_microLayout);
        jp_microLayout.setHorizontalGroup(
            jp_microLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_microLayout.createSequentialGroup()
                .addGroup(jp_microLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_microLayout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(218, 218, 218))
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jp_microLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jrb_240titanioMicro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jp_microLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jp_microLayout.setVerticalGroup(
            jp_microLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_microLayout.createSequentialGroup()
                .addComponent(jrb_240titanioMicro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addGap(109, 109, 109)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jp_micro, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 240, 100));

        jl_surface.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visao/surface.jpg"))); // NOI18N
        jPanel1.add(jl_surface, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 230, 200));

        jp_surface.setBackground(new java.awt.Color(255, 255, 255));
        jp_surface.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Surface", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Bell MT", 0, 18))); // NOI18N

        jrb_240titanioSurface.setBackground(new java.awt.Color(255, 255, 255));
        jrb_240titanioSurface.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        jrb_240titanioSurface.setText("R$ 240,00 - Jóia simples Titânio");
        jrb_240titanioSurface.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrb_240titanioSurfaceActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        jLabel9.setText("Como o microdermal, o surface deve");

        jLabel10.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        jLabel10.setText("ser aplicado com jóia de titânio.");

        javax.swing.GroupLayout jp_surfaceLayout = new javax.swing.GroupLayout(jp_surface);
        jp_surface.setLayout(jp_surfaceLayout);
        jp_surfaceLayout.setHorizontalGroup(
            jp_surfaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_surfaceLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_surfaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jp_surfaceLayout.createSequentialGroup()
                        .addGroup(jp_surfaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jrb_240titanioSurface))
                        .addGap(0, 1, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jp_surfaceLayout.setVerticalGroup(
            jp_surfaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_surfaceLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jrb_240titanioSurface)
                .addGap(31, 31, 31)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jp_surface, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, 220, 130));

        jl_sobrancelha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visao/sobrancelha.jpg"))); // NOI18N
        jPanel1.add(jl_sobrancelha, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 10, 220, 220));

        jp_sobrancelha.setBackground(new java.awt.Color(255, 255, 255));
        jp_sobrancelha.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sobrancelha", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Bell MT", 0, 18))); // NOI18N

        jrb_100acoSobrancelha.setBackground(new java.awt.Color(255, 255, 255));
        jrb_100acoSobrancelha.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        jrb_100acoSobrancelha.setText("R$ 100,00 - Jóia simples Aço");
        jrb_100acoSobrancelha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrb_100acoSobrancelhaActionPerformed(evt);
            }
        });

        jrb_120titanioSobrancelha.setBackground(new java.awt.Color(255, 255, 255));
        jrb_120titanioSobrancelha.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        jrb_120titanioSobrancelha.setText("R$ 120,00 - Jóia simples Titânio");
        jrb_120titanioSobrancelha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrb_120titanioSobrancelhaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jp_sobrancelhaLayout = new javax.swing.GroupLayout(jp_sobrancelha);
        jp_sobrancelha.setLayout(jp_sobrancelhaLayout);
        jp_sobrancelhaLayout.setHorizontalGroup(
            jp_sobrancelhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_sobrancelhaLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jp_sobrancelhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jrb_120titanioSobrancelha)
                    .addComponent(jrb_100acoSobrancelha))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jp_sobrancelhaLayout.setVerticalGroup(
            jp_sobrancelhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_sobrancelhaLayout.createSequentialGroup()
                .addComponent(jrb_100acoSobrancelha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jrb_120titanioSobrancelha)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jp_sobrancelha, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 150, 250, 80));

        jl_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visao/semFundo_logoBrasamora.png"))); // NOI18N
        jPanel1.add(jl_logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 500, 140, 120));

        jb_calcular.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        jb_calcular.setText("Calcular");
        jb_calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_calcularActionPerformed(evt);
            }
        });
        jPanel1.add(jb_calcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 480, 120, -1));

        jb_voltar.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        jb_voltar.setText("Voltar");
        jb_voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_voltarActionPerformed(evt);
            }
        });
        jPanel1.add(jb_voltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 480, 120, -1));

        jl_recado7.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        jl_recado7.setText("Valor total:");
        jPanel1.add(jl_recado7, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 520, -1, -1));
        jPanel1.add(jtf_valorTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 520, 220, -1));

        jl_recado4.setFont(new java.awt.Font("Bell MT", 1, 12)); // NOI18N
        jl_recado4.setText("LEMBRE-SE");
        jPanel1.add(jl_recado4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 580, -1, -1));

        jl_recado5.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        jl_recado5.setText("MANTENHA SUA PERFURAÇÃO LIMPA");
        jPanel1.add(jl_recado5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 620, -1, -1));

        jl_recado6.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        jl_recado6.setText("NÃO GIRE A JÓIA");
        jPanel1.add(jl_recado6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 600, -1, -1));

        jl_umbigo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visao/umbigo.jpg"))); // NOI18N
        jPanel1.add(jl_umbigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 250, 250, 220));

        jp_umbigo.setBackground(new java.awt.Color(255, 255, 255));
        jp_umbigo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Umbigo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Bell MT", 0, 18))); // NOI18N

        jrb_100acoUmbigo.setBackground(new java.awt.Color(255, 255, 255));
        jrb_100acoUmbigo.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        jrb_100acoUmbigo.setText("R$ 100,00 - Jóia simples Aço");
        jrb_100acoUmbigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrb_100acoUmbigoActionPerformed(evt);
            }
        });

        jrb_130titanioUmbigo.setBackground(new java.awt.Color(255, 255, 255));
        jrb_130titanioUmbigo.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        jrb_130titanioUmbigo.setText("R$ 130,00 - Jóia simples Titânio");
        jrb_130titanioUmbigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrb_130titanioUmbigoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        jLabel2.setText("Todos os umbigos são diferentes,");

        jLabel4.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        jLabel4.setText("portanto, nem todos podem usar a jóia");

        jLabel5.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        jLabel5.setText("tradicional.");

        javax.swing.GroupLayout jp_umbigoLayout = new javax.swing.GroupLayout(jp_umbigo);
        jp_umbigo.setLayout(jp_umbigoLayout);
        jp_umbigoLayout.setHorizontalGroup(
            jp_umbigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_umbigoLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jp_umbigoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_umbigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jp_umbigoLayout.createSequentialGroup()
                        .addGroup(jp_umbigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jrb_130titanioUmbigo, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jrb_100acoUmbigo))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jp_umbigoLayout.setVerticalGroup(
            jp_umbigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_umbigoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jrb_100acoUmbigo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jrb_130titanioUmbigo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addContainerGap())
        );

        jPanel1.add(jp_umbigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 250, 250, 170));

        jLabel11.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        jLabel11.setText("Diferença de valor de jóia:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 440, -1, -1));

        jtf_diferencaJoia.setText("0.0");
        jPanel1.add(jtf_diferencaJoia, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 440, 140, -1));

        jl_logado.setFont(new java.awt.Font("Bell MT", 1, 12)); // NOI18N
        jl_logado.setText("Usuário Logado:");
        jPanel1.add(jl_logado, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 40, 300, -1));

        jb_relatorio.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        jb_relatorio.setText("Gerar Relatório");
        jb_relatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_relatorioActionPerformed(evt);
            }
        });
        jPanel1.add(jb_relatorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 640, 150, -1));

        jLabel12.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        jLabel12.setText("Cliente:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 550, -1, -1));
        jPanel1.add(jtf_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 550, 220, -1));

        jLabel13.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        jLabel13.setText("Data perfuração:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 580, -1, -1));
        jPanel1.add(jtf_dataPerfuracao, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 580, 200, -1));

        jl_local.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        jl_local.setText("Local:");
        jPanel1.add(jl_local, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 640, -1, -1));
        jPanel1.add(jtf_local, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 640, 220, -1));

        jLabel17.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        jLabel17.setText("Descrição:");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 610, -1, -1));
        jPanel1.add(jtf_descricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 610, 220, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 697, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jrb_100acoUmbigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrb_100acoUmbigoActionPerformed
        if (jrb_100acoUmbigo.isSelected()){
            jrb_130titanioUmbigo.setSelected(false);
        }
    }//GEN-LAST:event_jrb_100acoUmbigoActionPerformed

    private void jrb_100acoSobrancelhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrb_100acoSobrancelhaActionPerformed
        if (jrb_100acoSobrancelha.isSelected()){
            jrb_120titanioSobrancelha.setSelected(false);
        }
    }//GEN-LAST:event_jrb_100acoSobrancelhaActionPerformed

    private void jrb_120titanioSobrancelhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrb_120titanioSobrancelhaActionPerformed
        if (jrb_120titanioSobrancelha.isSelected()){
            jrb_100acoSobrancelha.setSelected(false);
        }
    }//GEN-LAST:event_jrb_120titanioSobrancelhaActionPerformed

    private void jrb_130titanioUmbigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrb_130titanioUmbigoActionPerformed
        if (jrb_130titanioUmbigo.isSelected()){
            jrb_100acoUmbigo.setSelected(false);
        }
    }//GEN-LAST:event_jrb_130titanioUmbigoActionPerformed

    private void jb_calcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_calcularActionPerformed
        if(jrb_240titanioMicro.isSelected()){
            totalCada = totalCada + 240.00;
        }
        
        if(jrb_240titanioSurface.isSelected()){
            totalCada = totalCada + 240.00;
        }
        
        if (jrb_100acoSobrancelha.isSelected()){
            totalCada = totalCada + 100.00;
        } else if (jrb_120titanioSobrancelha.isSelected()) {
            totalCada = totalCada + 120.00;
        }
        
        if (jrb_100acoUmbigo.isSelected()){
            totalCada = totalCada + 100.00;
        } else if (jrb_130titanioUmbigo.isSelected()){
            totalCada = totalCada + 130.00;
        }
        
        diferenca = Double.parseDouble((jtf_diferencaJoia.getText()));
        
        totalFinal = totalCada + diferenca;
        
        jtf_valorTotal.setText(Double.toString(totalFinal));
        totalFinal = Double.parseDouble((jtf_valorTotal.getText()));
    }//GEN-LAST:event_jb_calcularActionPerformed

    private void jb_relatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_relatorioActionPerformed
        //atualizarTabela();
        
        String relatorio = "--- Dados de venda --- \n" + "Piercing Variados \n" +
                " Cliente: " + jtf_cliente.getText() + "\n Data perfuração: " + jtf_dataPerfuracao.getText() +  
                "\n Valor Total: " + jtf_valorTotal.getText() + "\n Local: " + jtf_local.getText();

        byte[] buff=relatorio.getBytes();

        try{
            r++;
            RandomAccessFile raf = new RandomAccessFile("c:\\relatoriosPiercing\\Outras\\outras " + jtf_cliente.getText() + ".txt", "rw");
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
                jtf_local.setText("");
            } catch (SQLException ex){
                ex.printStackTrace();
                JOptionPane.showMessageDialog(null, "Erro ao inserir no banco de dados.", "Erro", JOptionPane.WARNING_MESSAGE);
            }
        } else {
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
                jtf_local.setText("");
                
            } catch (SQLException ex) {
                ex.printStackTrace();
            }  
        }
        clienteSelecionado = null; 
        
    }//GEN-LAST:event_jb_relatorioActionPerformed

    private void jb_voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_voltarActionPerformed
        dispose();
    }//GEN-LAST:event_jb_voltarActionPerformed

    private void jrb_240titanioSurfaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrb_240titanioSurfaceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrb_240titanioSurfaceActionPerformed

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
                //new OutrasForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jb_calcular;
    private javax.swing.JButton jb_relatorio;
    private javax.swing.JButton jb_voltar;
    private javax.swing.JLabel jl_local;
    private javax.swing.JLabel jl_logado;
    private javax.swing.JLabel jl_logo;
    private javax.swing.JLabel jl_micro;
    private javax.swing.JLabel jl_recado1;
    private javax.swing.JLabel jl_recado3;
    private javax.swing.JLabel jl_recado4;
    private javax.swing.JLabel jl_recado5;
    private javax.swing.JLabel jl_recado6;
    private javax.swing.JLabel jl_recado7;
    private javax.swing.JLabel jl_sobrancelha;
    private javax.swing.JLabel jl_surface;
    private javax.swing.JLabel jl_umbigo;
    private javax.swing.JPanel jp_micro;
    private javax.swing.JPanel jp_sobrancelha;
    private javax.swing.JPanel jp_surface;
    private javax.swing.JPanel jp_umbigo;
    private javax.swing.JRadioButton jrb_100acoSobrancelha;
    private javax.swing.JRadioButton jrb_100acoUmbigo;
    private javax.swing.JRadioButton jrb_120titanioSobrancelha;
    private javax.swing.JRadioButton jrb_130titanioUmbigo;
    private javax.swing.JRadioButton jrb_240titanioMicro;
    private javax.swing.JRadioButton jrb_240titanioSurface;
    private javax.swing.JTextField jtf_cliente;
    private javax.swing.JTextField jtf_dataPerfuracao;
    private javax.swing.JTextField jtf_descricao;
    private javax.swing.JTextField jtf_diferencaJoia;
    private javax.swing.JTextField jtf_local;
    private javax.swing.JTextField jtf_valorTotal;
    // End of variables declaration//GEN-END:variables
}
