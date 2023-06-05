package visao;

import dao.VendasDAO;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Cliente;
import modelo.UsuarioFuncionario;

public class VendasForm extends javax.swing.JFrame {
    private Cliente cliente;
    private UsuarioFuncionario usuario;
    private Cliente clienteSelecionado;
    private List<Cliente> clientes;
    private VendasDAO vendaDao = new VendasDAO();

    public VendasForm(UsuarioFuncionario usuario) {
        initComponents();
        atualizarTabela();
        this.setLocationRelativeTo(null);
        
        this.cliente = cliente;
        jl_logado.setText("Usuário logado: " + usuario.getNome());
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jl_logado = new javax.swing.JLabel();
        jtf_cliente = new javax.swing.JTextField();
        jtf_dataPerfuracao = new javax.swing.JTextField();
        jtf_valorTotal = new javax.swing.JTextField();
        jtf_descricao = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jb_salvar = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jtf_filtrarNome = new javax.swing.JTextField();
        jb_pesquisar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jb_voltar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jtf_local = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Cliente", "Data Perfuração", "Valor", "Descrição", "Local"
            }
        ));
        jScrollPane1.setViewportView(tabela);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 937, 317));

        jLabel1.setFont(new java.awt.Font("Algerian", 0, 24)); // NOI18N
        jLabel1.setText("Manutenção de vendas");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(322, 10, -1, -1));

        jl_logado.setFont(new java.awt.Font("Bell MT", 1, 12)); // NOI18N
        jl_logado.setText("Usuário logado:");
        jPanel1.add(jl_logado, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 40, 280, -1));
        jPanel1.add(jtf_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 340, -1));
        jPanel1.add(jtf_dataPerfuracao, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 340, -1));
        jPanel1.add(jtf_valorTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 340, -1));
        jPanel1.add(jtf_descricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 340, 50));

        jLabel3.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        jLabel3.setText("Cliente:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 90, -1));

        jLabel4.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        jLabel4.setText("Data Perfuração:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 100, -1));

        jLabel5.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        jLabel5.setText("Valor Total:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 90, -1));

        jLabel6.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        jLabel6.setText("Descrição:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 90, -1));

        jButton1.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        jButton1.setText("Alterar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 120, -1));

        jb_salvar.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        jb_salvar.setText("Salvar");
        jb_salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_salvarActionPerformed(evt);
            }
        });
        jPanel1.add(jb_salvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 310, 120, -1));

        jButton3.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        jButton3.setText("Excluir");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 310, 120, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pesquisar", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Bell MT", 0, 14))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        jLabel7.setText("Nome cliente:");

        jb_pesquisar.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        jb_pesquisar.setText("Pesquisar");
        jb_pesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_pesquisarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtf_filtrarNome, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jb_pesquisar)
                .addGap(90, 90, 90))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtf_filtrarNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jb_pesquisar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 100, 280, 180));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visao/semFundo_logoBrasamora.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 0, 140, 110));

        jb_voltar.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        jb_voltar.setText("Voltar");
        jb_voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_voltarActionPerformed(evt);
            }
        });
        jPanel1.add(jb_voltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 310, -1, -1));

        jLabel2.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        jLabel2.setText("Local:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

        jtf_local.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_localActionPerformed(evt);
            }
        });
        jPanel1.add(jtf_local, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, 340, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 674, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       int linha = tabela.getSelectedRow();
            if(linha <= 0){
                JOptionPane.showMessageDialog(null, "Selecione um cliente.", "Atenção", JOptionPane.WARNING_MESSAGE);
                return;
            }
            
            clienteSelecionado = clientes.get(linha);
            int id = clienteSelecionado.getId();
            
            jtf_cliente.setText(clienteSelecionado.getNome());
            jtf_dataPerfuracao.setText(clienteSelecionado.getDataPerfuracao());
            jtf_valorTotal.setText(clienteSelecionado.getValor());
            jtf_descricao.setText(clienteSelecionado.getDescricao());
            jtf_local.setText(clienteSelecionado.getLocal());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int linha = tabela.getSelectedRow();
        if(linha < 0){
            JOptionPane.showMessageDialog(null, "Selecione um cadastro", "Atençao",
                JOptionPane.WARNING_MESSAGE);
            return;
        }

        clienteSelecionado = clientes.get(linha);

        try{
            vendaDao.remover(clienteSelecionado.getId());
            JOptionPane.showMessageDialog(null, "Venda excluída com sucesso.");
            atualizarTabela();
        } catch (SQLException ex){
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jb_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_salvarActionPerformed
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
                atualizarTabela();
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
                atualizarTabela();
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
    }//GEN-LAST:event_jb_salvarActionPerformed

    private void jb_pesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_pesquisarActionPerformed
        atualizarTabela();
    }//GEN-LAST:event_jb_pesquisarActionPerformed

    private void jb_voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_voltarActionPerformed
        dispose();
    }//GEN-LAST:event_jb_voltarActionPerformed

    private void jtf_localActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_localActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_localActionPerformed

        private void atualizarTabela(){
        try {
                clientes = vendaDao.buscarPorNome(jtf_filtrarNome.getText());
                
                DefaultTableModel model = (DefaultTableModel) tabela.getModel();
                model.setNumRows(0);
                    for (int i = 0; i < clientes.size(); i++) {
                        Cliente cliente = clientes.get(i);
                        model.addRow(new Object[]{cliente.getNome(), cliente.getDataPerfuracao(), cliente.getValor(), cliente.getDescricao(),
                        cliente.getLocal()});
                    }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        
    }
    
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new VendasForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jb_pesquisar;
    private javax.swing.JButton jb_salvar;
    private javax.swing.JButton jb_voltar;
    private javax.swing.JLabel jl_logado;
    private javax.swing.JTextField jtf_cliente;
    private javax.swing.JTextField jtf_dataPerfuracao;
    private javax.swing.JTextField jtf_descricao;
    private javax.swing.JTextField jtf_filtrarNome;
    private javax.swing.JTextField jtf_local;
    private javax.swing.JTextField jtf_valorTotal;
    private javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables
}
