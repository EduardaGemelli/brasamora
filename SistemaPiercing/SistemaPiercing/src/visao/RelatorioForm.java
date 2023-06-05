package visao;

import modelo.Relatorios;

public class RelatorioForm extends javax.swing.JFrame {
    private Relatorios relatorio;

    public RelatorioForm() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtf_material = new javax.swing.JTextField();
        jtf_valorMaterial = new javax.swing.JTextField();
        jtf_qtdMaterial = new javax.swing.JTextField();
        jtf_valorPerf = new javax.swing.JTextField();
        jtf_qtdPerf = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        jLabel1.setText("MATERIAIS");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(375, 10, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
                {null, null, null, null, null}
            },
            new String [] {
                "MATERIAL", "VALOR", "QUANTIDADE", "QUANTIDADE POR PERFURAÇÃO ", "VALOR POR PERFURAÇÃO"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 225, 892, 282));

        jLabel2.setText("Material:");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 93, -1));

        jLabel3.setText("Valor:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 120, -1));

        jLabel4.setText("Quantidade:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 100, -1));

        jLabel5.setText("Quantidade por perfuração:");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 50, 130, -1));

        jLabel6.setText("Valor por perfuração:");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, 110, -1));
        jPanel3.add(jtf_material, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 270, -1));

        jtf_valorMaterial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_valorMaterialActionPerformed(evt);
            }
        });
        jPanel3.add(jtf_valorMaterial, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 270, -1));

        jtf_qtdMaterial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_qtdMaterialActionPerformed(evt);
            }
        });
        jPanel3.add(jtf_qtdMaterial, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 270, -1));
        jPanel3.add(jtf_valorPerf, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 120, 270, -1));
        jPanel3.add(jtf_qtdPerf, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 70, 270, -1));

        jButton1.setText("Alterar");
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 520, -1, -1));

        jButton2.setText("Excluir");
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 520, -1, -1));

        jButton3.setText("Salvar");
        jPanel3.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 520, -1, -1));

        jTabbedPane1.addTab("Custo Materiais", jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 917, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("tab3", jPanel4);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 917, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("tab4", jPanel5);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 917, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 581, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtf_valorMaterialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_valorMaterialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_valorMaterialActionPerformed

    private void jtf_qtdMaterialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_qtdMaterialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_qtdMaterialActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RelatorioForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jtf_material;
    private javax.swing.JTextField jtf_qtdMaterial;
    private javax.swing.JTextField jtf_qtdPerf;
    private javax.swing.JTextField jtf_valorMaterial;
    private javax.swing.JTextField jtf_valorPerf;
    // End of variables declaration//GEN-END:variables
}
