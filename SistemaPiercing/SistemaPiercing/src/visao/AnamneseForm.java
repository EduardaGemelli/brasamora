package visao;

import modelo.UsuarioFuncionario;

public class AnamneseForm extends javax.swing.JFrame {

    public AnamneseForm(UsuarioFuncionario usuario) {
        initComponents();
        this.setLocationRelativeTo(null);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jl_logado2 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jtf_componentesQuimicos = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jtf_dermatite = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jtf_infecto = new javax.swing.JTextField();
        jcb_diabete = new javax.swing.JCheckBox();
        jcb_epilepsia = new javax.swing.JCheckBox();
        jcb_hipertensao = new javax.swing.JCheckBox();
        jcb_marcapasso = new javax.swing.JCheckBox();
        jcb_alergia = new javax.swing.JCheckBox();
        jcb_convulsao = new javax.swing.JCheckBox();
        jcb_cicatrizacao = new javax.swing.JCheckBox();
        jcb_problemasSangue = new javax.swing.JCheckBox();
        jcb_infecto = new javax.swing.JCheckBox();
        jcb_dermatite = new javax.swing.JCheckBox();
        jcb_componentesQuimicos = new javax.swing.JCheckBox();
        jPanel6 = new javax.swing.JPanel();
        jl_drogas = new javax.swing.JLabel();
        jl_higCorpo = new javax.swing.JLabel();
        jl_higBucal = new javax.swing.JLabel();
        jrb_simDrogas = new javax.swing.JRadioButton();
        jrb_naoDrogas = new javax.swing.JRadioButton();
        jLabel28 = new javax.swing.JLabel();
        jtf_drogas = new javax.swing.JTextField();
        jrb_simHigieneBucal = new javax.swing.JRadioButton();
        jrb_naoHigieneBucal = new javax.swing.JRadioButton();
        jrb_boaHigieneCorporal = new javax.swing.JRadioButton();
        jrb_naoHigieneCorporal = new javax.swing.JRadioButton();
        jl_gravida = new javax.swing.JLabel();
        jrb_naoGravida = new javax.swing.JRadioButton();
        jrb_simGravida = new javax.swing.JRadioButton();
        jl_obs = new javax.swing.JLabel();
        jtf_outrasInfosSaude = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jtf_nomeFicha = new javax.swing.JTextField();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jb_voltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jl_logado2.setFont(new java.awt.Font("Bell MT", 1, 12)); // NOI18N
        jl_logado2.setText("Usuário Logado:");
        jPanel4.add(jl_logado2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 310, -1));

        jLabel23.setFont(new java.awt.Font("Algerian", 0, 48)); // NOI18N
        jLabel23.setText("FICHA ANAMNESE");
        jPanel4.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 19, 457, -1));

        jLabel24.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jLabel24.setText("Leia o questionário atentamente e responda se é ou não portador das comorbidades citadas");
        jPanel4.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 794, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Selecione quais doenças abaixo você é portador.", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Bell MT", 0, 14))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel25.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        jLabel25.setText("se sim, qual?");
        jPanel2.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 77, -1));
        jPanel2.add(jtf_componentesQuimicos, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 320, 360, -1));

        jLabel26.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        jLabel26.setText("se sim, qual?");
        jPanel2.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 72, -1));
        jPanel2.add(jtf_dermatite, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 360, -1));

        jLabel27.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        jLabel27.setText("se sim, qual?");
        jPanel2.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 73, -1));
        jPanel2.add(jtf_infecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 358, -1));

        jcb_diabete.setBackground(new java.awt.Color(255, 255, 255));
        jcb_diabete.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        jcb_diabete.setText("DIABETES");
        jcb_diabete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcb_diabeteActionPerformed(evt);
            }
        });
        jPanel2.add(jcb_diabete, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 110, -1));

        jcb_epilepsia.setBackground(new java.awt.Color(255, 255, 255));
        jcb_epilepsia.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        jcb_epilepsia.setText("EPILEPSIA");
        jPanel2.add(jcb_epilepsia, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, 120, -1));

        jcb_hipertensao.setBackground(new java.awt.Color(255, 255, 255));
        jcb_hipertensao.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        jcb_hipertensao.setText("HIPERTENSÃO");
        jPanel2.add(jcb_hipertensao, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 39, -1, -1));

        jcb_marcapasso.setBackground(new java.awt.Color(255, 255, 255));
        jcb_marcapasso.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        jcb_marcapasso.setText("MARCAPASSO");
        jPanel2.add(jcb_marcapasso, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, -1, -1));

        jcb_alergia.setBackground(new java.awt.Color(255, 255, 255));
        jcb_alergia.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        jcb_alergia.setText("REAÇÕES ALÉRGICAS");
        jPanel2.add(jcb_alergia, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        jcb_convulsao.setBackground(new java.awt.Color(255, 255, 255));
        jcb_convulsao.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        jcb_convulsao.setText("HISTÓRICO DE CONVULSÃO");
        jPanel2.add(jcb_convulsao, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 80, -1, -1));

        jcb_cicatrizacao.setBackground(new java.awt.Color(255, 255, 255));
        jcb_cicatrizacao.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        jcb_cicatrizacao.setText("PROBLEMAS DE CICATRIZAÇÃO");
        jcb_cicatrizacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcb_cicatrizacaoActionPerformed(evt);
            }
        });
        jPanel2.add(jcb_cicatrizacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jcb_problemasSangue.setBackground(new java.awt.Color(255, 255, 255));
        jcb_problemasSangue.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        jcb_problemasSangue.setText("PROBLEMA DE SANGUE/COAGULAÇÃO");
        jPanel2.add(jcb_problemasSangue, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, -1, -1));

        jcb_infecto.setBackground(new java.awt.Color(255, 255, 255));
        jcb_infecto.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        jcb_infecto.setText("DOENÇAS INFECTOCONTAGIOSAS");
        jPanel2.add(jcb_infecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        jcb_dermatite.setBackground(new java.awt.Color(255, 255, 255));
        jcb_dermatite.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        jcb_dermatite.setText("PROBLEMA DE PELE/DERMATITE");
        jPanel2.add(jcb_dermatite, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        jcb_componentesQuimicos.setBackground(new java.awt.Color(255, 255, 255));
        jcb_componentesQuimicos.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        jcb_componentesQuimicos.setText("HIPERSENSIBILIDADE A COMPONENTES QUÍMICOS");
        jPanel2.add(jcb_componentesQuimicos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));

        jPanel4.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 560, 440));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados extras", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Bell MT", 0, 14))); // NOI18N

        jl_drogas.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        jl_drogas.setText("Está sob efeito de álcool ou drogas?");

        jl_higCorpo.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        jl_higCorpo.setText("Realiza diariamente higiene corporal?");

        jl_higBucal.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        jl_higBucal.setText("Realiza diariamente higiene bucal?");

        jrb_simDrogas.setBackground(new java.awt.Color(255, 255, 255));
        jrb_simDrogas.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        jrb_simDrogas.setText("Sim");
        jrb_simDrogas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrb_simDrogasActionPerformed(evt);
            }
        });

        jrb_naoDrogas.setBackground(new java.awt.Color(255, 255, 255));
        jrb_naoDrogas.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        jrb_naoDrogas.setText("Não");
        jrb_naoDrogas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrb_naoDrogasActionPerformed(evt);
            }
        });

        jLabel28.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        jLabel28.setText("se sim, qual?");

        jtf_drogas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_drogasActionPerformed(evt);
            }
        });

        jrb_simHigieneBucal.setBackground(new java.awt.Color(255, 255, 255));
        jrb_simHigieneBucal.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        jrb_simHigieneBucal.setText("Sim");
        jrb_simHigieneBucal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrb_simHigieneBucalActionPerformed(evt);
            }
        });

        jrb_naoHigieneBucal.setBackground(new java.awt.Color(255, 255, 255));
        jrb_naoHigieneBucal.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        jrb_naoHigieneBucal.setText("Não");
        jrb_naoHigieneBucal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrb_naoHigieneBucalActionPerformed(evt);
            }
        });

        jrb_boaHigieneCorporal.setBackground(new java.awt.Color(255, 255, 255));
        jrb_boaHigieneCorporal.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        jrb_boaHigieneCorporal.setText("Sim");
        jrb_boaHigieneCorporal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrb_boaHigieneCorporalActionPerformed(evt);
            }
        });

        jrb_naoHigieneCorporal.setBackground(new java.awt.Color(255, 255, 255));
        jrb_naoHigieneCorporal.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        jrb_naoHigieneCorporal.setText("Não");
        jrb_naoHigieneCorporal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrb_naoHigieneCorporalActionPerformed(evt);
            }
        });

        jl_gravida.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        jl_gravida.setText("Está grávida?");

        jrb_naoGravida.setBackground(new java.awt.Color(255, 255, 255));
        jrb_naoGravida.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        jrb_naoGravida.setText("Não");
        jrb_naoGravida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrb_naoGravidaActionPerformed(evt);
            }
        });

        jrb_simGravida.setBackground(new java.awt.Color(255, 255, 255));
        jrb_simGravida.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        jrb_simGravida.setText("Sim");
        jrb_simGravida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrb_simGravidaActionPerformed(evt);
            }
        });

        jl_obs.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        jl_obs.setText("Outras observações:");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtf_drogas))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jl_higBucal, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jl_drogas)
                            .addComponent(jl_higCorpo, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jl_gravida, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jl_obs)
                            .addComponent(jtf_outrasInfosSaude, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jrb_boaHigieneCorporal, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jrb_simHigieneBucal, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jrb_simDrogas, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jrb_naoHigieneCorporal, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jrb_naoDrogas, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jrb_naoHigieneBucal, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jrb_naoGravida)
                                    .addComponent(jrb_simGravida))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jl_higBucal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jrb_simHigieneBucal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jrb_naoHigieneBucal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jl_higCorpo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jrb_boaHigieneCorporal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jrb_naoHigieneCorporal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jl_drogas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jrb_simDrogas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jrb_naoDrogas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(jtf_drogas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jl_gravida)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jrb_simGravida)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jrb_naoGravida)
                .addGap(10, 10, 10)
                .addComponent(jl_obs, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtf_outrasInfosSaude, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jPanel4.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 130, 330, 440));

        jLabel29.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        jLabel29.setText("A veracidade das infromações é extremamente importante.");
        jPanel4.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 610, -1, -1));

        jLabel30.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        jLabel30.setText("Por favor, confira se as respostas estão corretas. ");
        jPanel4.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 590, -1, -1));

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visao/saude.png"))); // NOI18N
        jPanel4.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 0, 151, 90));

        jLabel19.setText("___________________________________________________________________");
        jPanel4.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 670, 380, -1));

        jLabel20.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        jLabel20.setText("Assinatura Cliente");
        jPanel4.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 690, -1, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visao/impressora.png"))); // NOI18N
        jPanel4.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 610, 110, 90));

        jLabel21.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        jLabel21.setText("Nome completo: ");
        jPanel4.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 580, -1, -1));

        jLabel22.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        jLabel22.setText("CPF:");
        jPanel4.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 610, -1, -1));
        jPanel4.add(jtf_nomeFicha, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 580, 250, -1));

        jFormattedTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat(""))));
        jPanel4.add(jFormattedTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 610, 250, -1));

        jb_voltar.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        jb_voltar.setText("Voltar");
        jb_voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_voltarActionPerformed(evt);
            }
        });
        jPanel4.add(jb_voltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 680, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 975, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 975, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 739, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 739, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcb_diabeteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcb_diabeteActionPerformed

    }//GEN-LAST:event_jcb_diabeteActionPerformed

    private void jcb_cicatrizacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcb_cicatrizacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcb_cicatrizacaoActionPerformed

    private void jrb_simDrogasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrb_simDrogasActionPerformed
        if (jrb_simDrogas.isSelected()){
            jrb_naoDrogas.setSelected(false);
        }
    }//GEN-LAST:event_jrb_simDrogasActionPerformed

    private void jrb_naoDrogasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrb_naoDrogasActionPerformed
        if (jrb_naoDrogas.isSelected()){
            jrb_simDrogas.setSelected(false);
        }
    }//GEN-LAST:event_jrb_naoDrogasActionPerformed

    private void jtf_drogasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_drogasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_drogasActionPerformed

    private void jrb_simHigieneBucalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrb_simHigieneBucalActionPerformed
        if (jrb_simHigieneBucal.isSelected()){
            jrb_naoHigieneBucal.setSelected(false);
        }
    }//GEN-LAST:event_jrb_simHigieneBucalActionPerformed

    private void jrb_naoHigieneBucalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrb_naoHigieneBucalActionPerformed
        if (jrb_naoHigieneBucal.isSelected()){
            jrb_simHigieneBucal.setSelected(false);
        }
    }//GEN-LAST:event_jrb_naoHigieneBucalActionPerformed

    private void jrb_boaHigieneCorporalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrb_boaHigieneCorporalActionPerformed
        if (jrb_boaHigieneCorporal.isSelected()){
            jrb_naoHigieneCorporal.setSelected(false);
        }
    }//GEN-LAST:event_jrb_boaHigieneCorporalActionPerformed

    private void jrb_naoHigieneCorporalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrb_naoHigieneCorporalActionPerformed
        if (jrb_naoHigieneCorporal.isSelected()){
            jrb_boaHigieneCorporal.setSelected(false);
        }
    }//GEN-LAST:event_jrb_naoHigieneCorporalActionPerformed

    private void jrb_naoGravidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrb_naoGravidaActionPerformed
        if (jrb_naoGravida.isSelected()){
            jrb_simGravida.setSelected(false);
        }
    }//GEN-LAST:event_jrb_naoGravidaActionPerformed

    private void jrb_simGravidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrb_simGravidaActionPerformed
        if (jrb_simGravida.isSelected()){
            jrb_naoGravida.setSelected(false);
        }
    }//GEN-LAST:event_jrb_simGravidaActionPerformed

    private void jb_voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_voltarActionPerformed
        dispose();
    }//GEN-LAST:event_jb_voltarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new AnamneseForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JButton jb_voltar;
    private javax.swing.JCheckBox jcb_alergia;
    private javax.swing.JCheckBox jcb_cicatrizacao;
    private javax.swing.JCheckBox jcb_componentesQuimicos;
    private javax.swing.JCheckBox jcb_convulsao;
    private javax.swing.JCheckBox jcb_dermatite;
    private javax.swing.JCheckBox jcb_diabete;
    private javax.swing.JCheckBox jcb_epilepsia;
    private javax.swing.JCheckBox jcb_hipertensao;
    private javax.swing.JCheckBox jcb_infecto;
    private javax.swing.JCheckBox jcb_marcapasso;
    private javax.swing.JCheckBox jcb_problemasSangue;
    private javax.swing.JLabel jl_drogas;
    private javax.swing.JLabel jl_gravida;
    private javax.swing.JLabel jl_higBucal;
    private javax.swing.JLabel jl_higCorpo;
    private javax.swing.JLabel jl_logado2;
    private javax.swing.JLabel jl_obs;
    private javax.swing.JRadioButton jrb_boaHigieneCorporal;
    private javax.swing.JRadioButton jrb_naoDrogas;
    private javax.swing.JRadioButton jrb_naoGravida;
    private javax.swing.JRadioButton jrb_naoHigieneBucal;
    private javax.swing.JRadioButton jrb_naoHigieneCorporal;
    private javax.swing.JRadioButton jrb_simDrogas;
    private javax.swing.JRadioButton jrb_simGravida;
    private javax.swing.JRadioButton jrb_simHigieneBucal;
    private javax.swing.JTextField jtf_componentesQuimicos;
    private javax.swing.JTextField jtf_dermatite;
    private javax.swing.JTextField jtf_drogas;
    private javax.swing.JTextField jtf_infecto;
    private javax.swing.JTextField jtf_nomeFicha;
    private javax.swing.JTextField jtf_outrasInfosSaude;
    // End of variables declaration//GEN-END:variables
}
