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

public class NarizForm extends javax.swing.JFrame {
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

    public NarizForm(UsuarioFuncionario usuario) {
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
        jl_nariz = new javax.swing.JLabel();
        jl_nome = new javax.swing.JLabel();
        jl_recado = new javax.swing.JLabel();
        jl_recado1 = new javax.swing.JLabel();
        jl_recado2 = new javax.swing.JLabel();
        jl_bridge = new javax.swing.JLabel();
        jp_bridge = new javax.swing.JPanel();
        jrb_120acoBridge = new javax.swing.JRadioButton();
        jrb_160titanioBridge = new javax.swing.JRadioButton();
        jp_abaNasal = new javax.swing.JPanel();
        jrb_100acoNariz = new javax.swing.JRadioButton();
        jrb_120titanioNariz = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jp_septo = new javax.swing.JPanel();
        jrb_100acoSepto = new javax.swing.JRadioButton();
        jrb_130titanioSepto = new javax.swing.JRadioButton();
        jl_recado3 = new javax.swing.JLabel();
        jl_recado4 = new javax.swing.JLabel();
        jl_recado5 = new javax.swing.JLabel();
        jl_logo = new javax.swing.JLabel();
        jb_voltar = new javax.swing.JButton();
        jb_calcular = new javax.swing.JButton();
        jl_recado6 = new javax.swing.JLabel();
        jtf_valorTotal = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jtf_diferencaJoia = new javax.swing.JTextField();
        jl_logado = new javax.swing.JLabel();
        jb_relatorio = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtf_cliente = new javax.swing.JTextField();
        jtf_dataPerfuracao = new javax.swing.JTextField();
        jtf_descricao = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jtf_local = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jl_nariz.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visao/nariz.jpg"))); // NOI18N
        jPanel1.add(jl_nariz, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 0, -1, 290));

        jl_nome.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        jl_nome.setText("Perfurações Região Nariz");
        jPanel1.add(jl_nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 400, 30));

        jl_recado.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        jl_recado.setText("Os valores variam conforme perfuração e jóia escolhida.");
        jPanel1.add(jl_recado, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        jl_recado1.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        jl_recado1.setText("Jóias elaboradas deverão ser escolhidas na hora da perfuração.");
        jPanel1.add(jl_recado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        jl_recado2.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        jl_recado2.setText("Reajuste e diferença de valor é calculado no ato da escolha de jóia.");
        jPanel1.add(jl_recado2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jl_bridge.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visao/bridge.jpg"))); // NOI18N
        jPanel1.add(jl_bridge, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 530, 300, 90));

        jp_bridge.setBackground(new java.awt.Color(255, 255, 255));
        jp_bridge.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Bridge", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Bell MT", 0, 18))); // NOI18N

        jrb_120acoBridge.setBackground(new java.awt.Color(255, 255, 255));
        jrb_120acoBridge.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        jrb_120acoBridge.setText("R$ 120,00 - Jóia simples Aço");
        jrb_120acoBridge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrb_120acoBridgeActionPerformed(evt);
            }
        });

        jrb_160titanioBridge.setBackground(new java.awt.Color(255, 255, 255));
        jrb_160titanioBridge.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        jrb_160titanioBridge.setText("R$ 160,00 - Jóia simples Titânio");
        jrb_160titanioBridge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrb_160titanioBridgeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jp_bridgeLayout = new javax.swing.GroupLayout(jp_bridge);
        jp_bridge.setLayout(jp_bridgeLayout);
        jp_bridgeLayout.setHorizontalGroup(
            jp_bridgeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_bridgeLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jp_bridgeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jrb_120acoBridge, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jrb_160titanioBridge, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(86, Short.MAX_VALUE))
        );
        jp_bridgeLayout.setVerticalGroup(
            jp_bridgeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_bridgeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jrb_120acoBridge)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jrb_160titanioBridge)
                .addContainerGap(7, Short.MAX_VALUE))
        );

        jPanel1.add(jp_bridge, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, -1, 90));

        jp_abaNasal.setBackground(new java.awt.Color(255, 255, 255));
        jp_abaNasal.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Aba nasal", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Bell MT", 0, 18))); // NOI18N

        jrb_100acoNariz.setBackground(new java.awt.Color(255, 255, 255));
        jrb_100acoNariz.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        jrb_100acoNariz.setText("R$ 100,00 - Jóia simples Aço");
        jrb_100acoNariz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrb_100acoNarizActionPerformed(evt);
            }
        });

        jrb_120titanioNariz.setBackground(new java.awt.Color(255, 255, 255));
        jrb_120titanioNariz.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        jrb_120titanioNariz.setText("R$ 120,00 - Jóia simples Titânio");
        jrb_120titanioNariz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrb_120titanioNarizActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Bell MT", 0, 10)); // NOI18N
        jLabel1.setText("Opção em pedrinha e argola.");

        javax.swing.GroupLayout jp_abaNasalLayout = new javax.swing.GroupLayout(jp_abaNasal);
        jp_abaNasal.setLayout(jp_abaNasalLayout);
        jp_abaNasalLayout.setHorizontalGroup(
            jp_abaNasalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_abaNasalLayout.createSequentialGroup()
                .addGroup(jp_abaNasalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_abaNasalLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jp_abaNasalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jrb_120titanioNariz)
                            .addComponent(jrb_100acoNariz)))
                    .addGroup(jp_abaNasalLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jLabel1)))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        jp_abaNasalLayout.setVerticalGroup(
            jp_abaNasalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_abaNasalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jrb_100acoNariz)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jrb_120titanioNariz)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel1.add(jp_abaNasal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, -1, 140));

        jp_septo.setBackground(new java.awt.Color(255, 255, 255));
        jp_septo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Septo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Bell MT", 0, 18))); // NOI18N

        jrb_100acoSepto.setBackground(new java.awt.Color(255, 255, 255));
        jrb_100acoSepto.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        jrb_100acoSepto.setText("R$ 100,00 - Jóia simples Aço");
        jrb_100acoSepto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrb_100acoSeptoActionPerformed(evt);
            }
        });

        jrb_130titanioSepto.setBackground(new java.awt.Color(255, 255, 255));
        jrb_130titanioSepto.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        jrb_130titanioSepto.setText("R$ 130,00 - Jóia simples Titânio");
        jrb_130titanioSepto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrb_130titanioSeptoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jp_septoLayout = new javax.swing.GroupLayout(jp_septo);
        jp_septo.setLayout(jp_septoLayout);
        jp_septoLayout.setHorizontalGroup(
            jp_septoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_septoLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jp_septoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jrb_130titanioSepto)
                    .addComponent(jrb_100acoSepto))
                .addContainerGap(86, Short.MAX_VALUE))
        );
        jp_septoLayout.setVerticalGroup(
            jp_septoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_septoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jrb_100acoSepto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jrb_130titanioSepto)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jPanel1.add(jp_septo, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 180, -1, 110));

        jl_recado3.setFont(new java.awt.Font("Bell MT", 1, 12)); // NOI18N
        jl_recado3.setText("LEMBRE-SE");
        jPanel1.add(jl_recado3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 320, -1, -1));

        jl_recado4.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        jl_recado4.setText("MANTENHA SUA PERFURAÇÃO LIMPA.");
        jPanel1.add(jl_recado4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, -1, -1));

        jl_recado5.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        jl_recado5.setText("NÃO GIRE A JÓIA.");
        jPanel1.add(jl_recado5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 350, -1, -1));

        jl_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visao/semFundo_logoBrasamora.png"))); // NOI18N
        jPanel1.add(jl_logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 360, 180, 160));

        jb_voltar.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        jb_voltar.setText("Voltar");
        jb_voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_voltarActionPerformed(evt);
            }
        });
        jPanel1.add(jb_voltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 440, 90, -1));

        jb_calcular.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        jb_calcular.setText("Calcular");
        jb_calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_calcularActionPerformed(evt);
            }
        });
        jPanel1.add(jb_calcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 440, 100, -1));

        jl_recado6.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        jl_recado6.setText("Valor total:");
        jPanel1.add(jl_recado6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 480, -1, -1));
        jPanel1.add(jtf_valorTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 480, 210, -1));

        jLabel2.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        jLabel2.setText("Diferença de valor de jóia:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 360, -1, -1));

        jtf_diferencaJoia.setText("0.0");
        jPanel1.add(jtf_diferencaJoia, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 390, 150, -1));

        jl_logado.setFont(new java.awt.Font("Bell MT", 1, 12)); // NOI18N
        jl_logado.setText("Usuário Logado:");
        jPanel1.add(jl_logado, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 360, -1));

        jb_relatorio.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        jb_relatorio.setText("Gerar Relatório");
        jb_relatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_relatorioActionPerformed(evt);
            }
        });
        jPanel1.add(jb_relatorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 600, 160, -1));

        jLabel3.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        jLabel3.setText("Cliente:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 510, -1, -1));

        jLabel4.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        jLabel4.setText("Descrição:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 570, -1, -1));

        jLabel5.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        jLabel5.setText("Data perfuração:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 540, -1, -1));
        jPanel1.add(jtf_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 510, 220, -1));
        jPanel1.add(jtf_dataPerfuracao, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 540, 180, -1));
        jPanel1.add(jtf_descricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 570, 220, -1));

        jLabel6.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        jLabel6.setText("Local:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 600, -1, -1));
        jPanel1.add(jtf_local, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 600, 220, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 940, 670));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jrb_100acoNarizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrb_100acoNarizActionPerformed
        if (jrb_100acoNariz.isSelected()){
            jrb_120titanioNariz.setSelected(false);
        }
    }//GEN-LAST:event_jrb_100acoNarizActionPerformed

    private void jrb_120titanioNarizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrb_120titanioNarizActionPerformed
        if (jrb_120titanioNariz.isSelected()){
            jrb_100acoNariz.setSelected(false);
        }
    }//GEN-LAST:event_jrb_120titanioNarizActionPerformed

    private void jrb_100acoSeptoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrb_100acoSeptoActionPerformed
        if (jrb_100acoSepto.isSelected()){
            jrb_130titanioSepto.setSelected(false);
        }
    }//GEN-LAST:event_jrb_100acoSeptoActionPerformed

    private void jrb_120acoBridgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrb_120acoBridgeActionPerformed
        if (jrb_120acoBridge.isSelected()){
            jrb_160titanioBridge.setSelected(false);
        }
    }//GEN-LAST:event_jrb_120acoBridgeActionPerformed

    private void jrb_130titanioSeptoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrb_130titanioSeptoActionPerformed
        if (jrb_130titanioSepto.isSelected()){
            jrb_100acoSepto.setSelected(false);
        }
    }//GEN-LAST:event_jrb_130titanioSeptoActionPerformed

    private void jrb_160titanioBridgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrb_160titanioBridgeActionPerformed
        if (jrb_160titanioBridge.isSelected()){
            jrb_120acoBridge.setSelected(false);
        }
    }//GEN-LAST:event_jrb_160titanioBridgeActionPerformed

    private void jb_calcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_calcularActionPerformed
        if (jrb_100acoNariz.isSelected()){
            totalCada = totalCada + 100.00;
        } else if (jrb_120titanioNariz.isSelected()){
            totalCada = totalCada + 120.00;
        }
        
        if (jrb_100acoSepto.isSelected()){
            totalCada = totalCada + 100.00;
        } else if (jrb_130titanioSepto.isSelected()){
            totalCada = totalCada + 130.00;
        }
        
        if (jrb_120acoBridge.isSelected()){
            totalCada = totalCada + 120.00;
        } else if (jrb_160titanioBridge.isSelected()){
            totalCada = totalCada + 160.00;
        }
        
        diferenca = Double.parseDouble((jtf_diferencaJoia.getText()));
        
        totalFinal = totalCada + diferenca;
        
        jtf_valorTotal.setText(Double.toString(totalFinal));
        totalFinal = Double.parseDouble((jtf_valorTotal.getText()));
    }//GEN-LAST:event_jb_calcularActionPerformed

    private void jb_relatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_relatorioActionPerformed
        //atualizarTabela();
        
        String relatorio = "--- Dados de venda --- \n" + "Piercing Nariz \n" +
                " Cliente: " + jtf_cliente.getText() + "\n Data perfuração: " + jtf_dataPerfuracao.getText() +  
                "\n Valor Total: " + jtf_valorTotal.getText() + "\n Descrição: " + jtf_descricao.getText() + "\n Local: " + jtf_local.getText();

        byte[] buff=relatorio.getBytes();

        try{
            r++;
            RandomAccessFile raf = new RandomAccessFile("c:\\relatoriosPiercing\\Nariz\\nariz " + jtf_cliente.getText() + ".txt", "rw");
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
                jtf_descricao.setText("");
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
                //new NarizForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jb_calcular;
    private javax.swing.JButton jb_relatorio;
    private javax.swing.JButton jb_voltar;
    private javax.swing.JLabel jl_bridge;
    private javax.swing.JLabel jl_logado;
    private javax.swing.JLabel jl_logo;
    private javax.swing.JLabel jl_nariz;
    private javax.swing.JLabel jl_nome;
    private javax.swing.JLabel jl_recado;
    private javax.swing.JLabel jl_recado1;
    private javax.swing.JLabel jl_recado2;
    private javax.swing.JLabel jl_recado3;
    private javax.swing.JLabel jl_recado4;
    private javax.swing.JLabel jl_recado5;
    private javax.swing.JLabel jl_recado6;
    private javax.swing.JPanel jp_abaNasal;
    private javax.swing.JPanel jp_bridge;
    private javax.swing.JPanel jp_septo;
    private javax.swing.JRadioButton jrb_100acoNariz;
    private javax.swing.JRadioButton jrb_100acoSepto;
    private javax.swing.JRadioButton jrb_120acoBridge;
    private javax.swing.JRadioButton jrb_120titanioNariz;
    private javax.swing.JRadioButton jrb_130titanioSepto;
    private javax.swing.JRadioButton jrb_160titanioBridge;
    private javax.swing.JTextField jtf_cliente;
    private javax.swing.JTextField jtf_dataPerfuracao;
    private javax.swing.JTextField jtf_descricao;
    private javax.swing.JTextField jtf_diferencaJoia;
    private javax.swing.JTextField jtf_local;
    private javax.swing.JTextField jtf_valorTotal;
    // End of variables declaration//GEN-END:variables
}
