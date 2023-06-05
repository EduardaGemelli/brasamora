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

public class AuricularForm extends javax.swing.JFrame {
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

    public AuricularForm(UsuarioFuncionario usuario) {
        initComponents();
        //atualizarTabela();
        this.setLocationRelativeTo(null);
        
        this.cliente = cliente;
        jl_logado.setText("Usuário logado: " + usuario.getNome());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jp_fundo = new javax.swing.JPanel();
        jp_cartilagem = new javax.swing.JPanel();
        jrb_100acoDaith = new javax.swing.JRadioButton();
        jrb_150titanioDaith = new javax.swing.JRadioButton();
        jl_orelha = new javax.swing.JLabel();
        jl_nome = new javax.swing.JLabel();
        jl_recado = new javax.swing.JLabel();
        jp_cartilagem2 = new javax.swing.JPanel();
        jrb_100acoSnug = new javax.swing.JRadioButton();
        jrb_150titanioSnug = new javax.swing.JRadioButton();
        jp_lobulo = new javax.swing.JPanel();
        jrb_100lobulo1 = new javax.swing.JRadioButton();
        jrb_180lobulo2 = new javax.swing.JRadioButton();
        jrb_150lobulo3 = new javax.swing.JRadioButton();
        jp_transversal = new javax.swing.JPanel();
        jrb_150acoTransversal = new javax.swing.JRadioButton();
        jrb_200titanioTransversal = new javax.swing.JRadioButton();
        jl_recado2 = new javax.swing.JLabel();
        jl_recado1 = new javax.swing.JLabel();
        jl_recado3 = new javax.swing.JLabel();
        jb_calcular = new javax.swing.JButton();
        jb_voltar = new javax.swing.JButton();
        jtf_valorTotal = new javax.swing.JTextField();
        jl_recado4 = new javax.swing.JLabel();
        jl_recado5 = new javax.swing.JLabel();
        jl_recado6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jrb_100acoRook = new javax.swing.JRadioButton();
        jrb_150titanioRook = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        jrb_100acoHelix = new javax.swing.JRadioButton();
        jrb_150titanioHelix = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        jrb_100acoAntiHelix = new javax.swing.JRadioButton();
        jrb_150titanioAntiHelix = new javax.swing.JRadioButton();
        jPanel4 = new javax.swing.JPanel();
        jrb_100acoTragus = new javax.swing.JRadioButton();
        jrb_150titanioTragus = new javax.swing.JRadioButton();
        jPanel5 = new javax.swing.JPanel();
        jrb_100acoAntiTragus = new javax.swing.JRadioButton();
        jrb_150titanioAntiTragus = new javax.swing.JRadioButton();
        jPanel6 = new javax.swing.JPanel();
        jrb_100acoConch = new javax.swing.JRadioButton();
        jrb_150titanioConch = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jtf_diferencaJoia = new javax.swing.JTextField();
        jl_logado = new javax.swing.JLabel();
        jb_relatorio = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtf_cliente = new javax.swing.JTextField();
        jtf_dataPerfuracao = new javax.swing.JTextField();
        jtf_descricao = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jtf_local = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jp_fundo.setBackground(new java.awt.Color(255, 255, 255));
        jp_fundo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jp_cartilagem.setBackground(new java.awt.Color(255, 255, 255));
        jp_cartilagem.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Daith", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Bell MT", 0, 18))); // NOI18N

        jrb_100acoDaith.setBackground(new java.awt.Color(255, 255, 255));
        jrb_100acoDaith.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        jrb_100acoDaith.setText("R$ 100,00 - Jóia simples Aço");
        jrb_100acoDaith.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrb_100acoDaithActionPerformed(evt);
            }
        });

        jrb_150titanioDaith.setBackground(new java.awt.Color(255, 255, 255));
        jrb_150titanioDaith.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        jrb_150titanioDaith.setText("R$ 150,00 - Jóia simples Titânio ");
        jrb_150titanioDaith.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrb_150titanioDaithActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jp_cartilagemLayout = new javax.swing.GroupLayout(jp_cartilagem);
        jp_cartilagem.setLayout(jp_cartilagemLayout);
        jp_cartilagemLayout.setHorizontalGroup(
            jp_cartilagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_cartilagemLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_cartilagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jrb_100acoDaith)
                    .addComponent(jrb_150titanioDaith))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jp_cartilagemLayout.setVerticalGroup(
            jp_cartilagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_cartilagemLayout.createSequentialGroup()
                .addComponent(jrb_100acoDaith)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jrb_150titanioDaith)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jp_fundo.add(jp_cartilagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, 80));

        jl_orelha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visao/orelha.png"))); // NOI18N
        jp_fundo.add(jl_orelha, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 10, -1, 363));

        jl_nome.setBackground(new java.awt.Color(255, 255, 255));
        jl_nome.setFont(new java.awt.Font("Algerian", 0, 24)); // NOI18N
        jl_nome.setText("PERFURAÇÕES AURICULARES");
        jp_fundo.add(jl_nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 336, 38));

        jl_recado.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        jl_recado.setText("Os valores variam conforme perfuração e jóia escolhida.");
        jp_fundo.add(jl_recado, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 370, -1));

        jp_cartilagem2.setBackground(new java.awt.Color(255, 255, 255));
        jp_cartilagem2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Snug", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Bell MT", 0, 18))); // NOI18N

        jrb_100acoSnug.setBackground(new java.awt.Color(255, 255, 255));
        jrb_100acoSnug.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        jrb_100acoSnug.setText("R$ 100,00 - Jóia simples Aço");
        jrb_100acoSnug.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrb_100acoSnugActionPerformed(evt);
            }
        });

        jrb_150titanioSnug.setBackground(new java.awt.Color(255, 255, 255));
        jrb_150titanioSnug.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        jrb_150titanioSnug.setText("R$ 150,00 - Jóia simples Titânio");
        jrb_150titanioSnug.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrb_150titanioSnugActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jp_cartilagem2Layout = new javax.swing.GroupLayout(jp_cartilagem2);
        jp_cartilagem2.setLayout(jp_cartilagem2Layout);
        jp_cartilagem2Layout.setHorizontalGroup(
            jp_cartilagem2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_cartilagem2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_cartilagem2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jrb_100acoSnug, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jp_cartilagem2Layout.createSequentialGroup()
                        .addComponent(jrb_150titanioSnug)
                        .addGap(0, 9, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jp_cartilagem2Layout.setVerticalGroup(
            jp_cartilagem2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_cartilagem2Layout.createSequentialGroup()
                .addComponent(jrb_100acoSnug)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jrb_150titanioSnug)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jp_fundo.add(jp_cartilagem2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 420, 220, 90));

        jp_lobulo.setBackground(new java.awt.Color(255, 255, 255));
        jp_lobulo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lóbulos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Bell MT", 0, 18))); // NOI18N

        jrb_100lobulo1.setBackground(new java.awt.Color(255, 255, 255));
        jrb_100lobulo1.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        jrb_100lobulo1.setText("1 par - R$ 100,00 ");
        jrb_100lobulo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrb_100lobulo1ActionPerformed(evt);
            }
        });

        jrb_180lobulo2.setBackground(new java.awt.Color(255, 255, 255));
        jrb_180lobulo2.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        jrb_180lobulo2.setText("2 pares - R$ 180,00");
        jrb_180lobulo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrb_180lobulo2ActionPerformed(evt);
            }
        });

        jrb_150lobulo3.setBackground(new java.awt.Color(255, 255, 255));
        jrb_150lobulo3.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        jrb_150lobulo3.setText("3 pares - R$ 150,00");
        jrb_150lobulo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrb_150lobulo3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jp_lobuloLayout = new javax.swing.GroupLayout(jp_lobulo);
        jp_lobulo.setLayout(jp_lobuloLayout);
        jp_lobuloLayout.setHorizontalGroup(
            jp_lobuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_lobuloLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_lobuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jrb_180lobulo2)
                    .addComponent(jrb_100lobulo1)
                    .addComponent(jrb_150lobulo3))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        jp_lobuloLayout.setVerticalGroup(
            jp_lobuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_lobuloLayout.createSequentialGroup()
                .addComponent(jrb_100lobulo1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jrb_180lobulo2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jrb_150lobulo3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jp_fundo.add(jp_lobulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 520, -1, -1));

        jp_transversal.setBackground(new java.awt.Color(255, 255, 255));
        jp_transversal.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Transversal", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Bell MT", 0, 18))); // NOI18N

        jrb_150acoTransversal.setBackground(new java.awt.Color(255, 255, 255));
        jrb_150acoTransversal.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        jrb_150acoTransversal.setText("R$ 150,00 - Jóia simples Aço");
        jrb_150acoTransversal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrb_150acoTransversalActionPerformed(evt);
            }
        });

        jrb_200titanioTransversal.setBackground(new java.awt.Color(255, 255, 255));
        jrb_200titanioTransversal.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        jrb_200titanioTransversal.setText("R$ 200,00 - Jóia simples Titânio");
        jrb_200titanioTransversal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrb_200titanioTransversalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jp_transversalLayout = new javax.swing.GroupLayout(jp_transversal);
        jp_transversal.setLayout(jp_transversalLayout);
        jp_transversalLayout.setHorizontalGroup(
            jp_transversalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_transversalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_transversalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jrb_150acoTransversal)
                    .addComponent(jrb_200titanioTransversal))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jp_transversalLayout.setVerticalGroup(
            jp_transversalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_transversalLayout.createSequentialGroup()
                .addComponent(jrb_150acoTransversal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jrb_200titanioTransversal)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jp_fundo.add(jp_transversal, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 520, 223, 108));

        jl_recado2.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        jl_recado2.setText("Jóias elaboradas deverão ser escolhidas na hora da perfuração.");
        jp_fundo.add(jl_recado2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 370, -1));

        jl_recado1.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        jl_recado1.setText("Reajuste e diferença de valor é calculado no ato da escolha de jóia.");
        jp_fundo.add(jl_recado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        jl_recado3.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        jl_recado3.setText("Valor total:");
        jp_fundo.add(jl_recado3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 490, -1, -1));

        jb_calcular.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        jb_calcular.setText("Calcular ");
        jb_calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_calcularActionPerformed(evt);
            }
        });
        jp_fundo.add(jb_calcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 430, 120, -1));

        jb_voltar.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        jb_voltar.setText("Voltar");
        jb_voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_voltarActionPerformed(evt);
            }
        });
        jp_fundo.add(jb_voltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 430, 110, -1));

        jtf_valorTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_valorTotalActionPerformed(evt);
            }
        });
        jp_fundo.add(jtf_valorTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 490, 230, -1));

        jl_recado4.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        jl_recado4.setText("MANTENHA SUA PERFURAÇÃO LIMPA. ");
        jp_fundo.add(jl_recado4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 700, -1, 20));

        jl_recado5.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        jl_recado5.setText("NÃO GIRE A JÓIA.");
        jp_fundo.add(jl_recado5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 680, -1, -1));

        jl_recado6.setFont(new java.awt.Font("Bell MT", 1, 12)); // NOI18N
        jl_recado6.setText("LEMBRE-SE");
        jp_fundo.add(jl_recado6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 660, 90, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Rook", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Bell MT", 0, 18))); // NOI18N

        jrb_100acoRook.setBackground(new java.awt.Color(255, 255, 255));
        jrb_100acoRook.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        jrb_100acoRook.setText("R$ 100,00 - Jóia simples Aço");
        jrb_100acoRook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrb_100acoRookActionPerformed(evt);
            }
        });

        jrb_150titanioRook.setBackground(new java.awt.Color(255, 255, 255));
        jrb_150titanioRook.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        jrb_150titanioRook.setText("R$ 150,00 - Jóia simples Titânio");
        jrb_150titanioRook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrb_150titanioRookActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jrb_100acoRook)
                    .addComponent(jrb_150titanioRook))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jrb_100acoRook)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jrb_150titanioRook)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jp_fundo.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, 220, 80));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Hélix", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Bell MT", 0, 18))); // NOI18N

        jrb_100acoHelix.setBackground(new java.awt.Color(255, 255, 255));
        jrb_100acoHelix.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        jrb_100acoHelix.setText("R$ 100,00 - Jóia simples Aço");
        jrb_100acoHelix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrb_100acoHelixActionPerformed(evt);
            }
        });

        jrb_150titanioHelix.setBackground(new java.awt.Color(255, 255, 255));
        jrb_150titanioHelix.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        jrb_150titanioHelix.setText("R$ 150,00 - Jóia simples Titânio");
        jrb_150titanioHelix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrb_150titanioHelixActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jrb_100acoHelix)
                    .addComponent(jrb_150titanioHelix))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jrb_100acoHelix)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jrb_150titanioHelix)
                .addGap(0, 5, Short.MAX_VALUE))
        );

        jp_fundo.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 230, 220, 80));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Anti-Hélix", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Bell MT", 0, 18))); // NOI18N

        jrb_100acoAntiHelix.setBackground(new java.awt.Color(255, 255, 255));
        jrb_100acoAntiHelix.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        jrb_100acoAntiHelix.setText("R$ 100,00 - Jóia simples Aço");
        jrb_100acoAntiHelix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrb_100acoAntiHelixActionPerformed(evt);
            }
        });

        jrb_150titanioAntiHelix.setBackground(new java.awt.Color(255, 255, 255));
        jrb_150titanioAntiHelix.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        jrb_150titanioAntiHelix.setText("R$ 150,00 - Jóia simples Titânio");
        jrb_150titanioAntiHelix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrb_150titanioAntiHelixActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jrb_150titanioAntiHelix)
                    .addComponent(jrb_100acoAntiHelix))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jrb_100acoAntiHelix)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jrb_150titanioAntiHelix)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jp_fundo.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 320, 220, 90));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tragus", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Bell MT", 0, 18))); // NOI18N

        jrb_100acoTragus.setBackground(new java.awt.Color(255, 255, 255));
        jrb_100acoTragus.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        jrb_100acoTragus.setText("R$ 100,00 - Jóia simples Aço");
        jrb_100acoTragus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrb_100acoTragusActionPerformed(evt);
            }
        });

        jrb_150titanioTragus.setBackground(new java.awt.Color(255, 255, 255));
        jrb_150titanioTragus.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        jrb_150titanioTragus.setText("R$ 150,00 - Jóia simples Titânio");
        jrb_150titanioTragus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrb_150titanioTragusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jrb_100acoTragus)
                    .addComponent(jrb_150titanioTragus))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jrb_100acoTragus)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jrb_150titanioTragus)
                .addContainerGap())
        );

        jp_fundo.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 230, 80));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Anti-Tragus", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Bell MT", 0, 18))); // NOI18N

        jrb_100acoAntiTragus.setBackground(new java.awt.Color(255, 255, 255));
        jrb_100acoAntiTragus.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        jrb_100acoAntiTragus.setText("R$ 100,00 - Jóia simples Aço");
        jrb_100acoAntiTragus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrb_100acoAntiTragusActionPerformed(evt);
            }
        });

        jrb_150titanioAntiTragus.setBackground(new java.awt.Color(255, 255, 255));
        jrb_150titanioAntiTragus.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        jrb_150titanioAntiTragus.setText("R$ 150,00 - Jóia simples Titânio");
        jrb_150titanioAntiTragus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrb_150titanioAntiTragusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jrb_100acoAntiTragus, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 19, Short.MAX_VALUE))
                    .addComponent(jrb_150titanioAntiTragus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jrb_100acoAntiTragus)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jrb_150titanioAntiTragus)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jp_fundo.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 230, 90));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Conch", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Bell MT", 0, 18))); // NOI18N

        jrb_100acoConch.setBackground(new java.awt.Color(255, 255, 255));
        jrb_100acoConch.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        jrb_100acoConch.setText("R$ 100,00 - Jóia simples Aço");
        jrb_100acoConch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrb_100acoConchActionPerformed(evt);
            }
        });

        jrb_150titanioConch.setBackground(new java.awt.Color(255, 255, 255));
        jrb_150titanioConch.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        jrb_150titanioConch.setText("R$ 150,00 - Jóia simples Titânio");
        jrb_150titanioConch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrb_150titanioConchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jrb_150titanioConch, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                    .addComponent(jrb_100acoConch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jrb_100acoConch)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jrb_150titanioConch)
                .addGap(0, 13, Short.MAX_VALUE))
        );

        jp_fundo.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 230, 90));

        jLabel1.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        jLabel1.setText("Diferença de valor de jóia:");
        jp_fundo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 390, -1, -1));

        jtf_diferencaJoia.setText("0.0");
        jtf_diferencaJoia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_diferencaJoiaActionPerformed(evt);
            }
        });
        jp_fundo.add(jtf_diferencaJoia, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 390, 270, -1));

        jl_logado.setFont(new java.awt.Font("Bell MT", 1, 12)); // NOI18N
        jl_logado.setText("Usuário Logado: ");
        jp_fundo.add(jl_logado, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 360, -1));

        jb_relatorio.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        jb_relatorio.setText("Gerar Relatório");
        jb_relatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_relatorioActionPerformed(evt);
            }
        });
        jp_fundo.add(jb_relatorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 660, 130, -1));

        jLabel2.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        jLabel2.setText("Cliente:");
        jp_fundo.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 520, -1, -1));

        jLabel3.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        jLabel3.setText("Data perfuração:");
        jp_fundo.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 550, -1, -1));

        jLabel4.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        jLabel4.setText("Descrição:");
        jp_fundo.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 580, -1, -1));
        jp_fundo.add(jtf_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 520, 230, -1));
        jp_fundo.add(jtf_dataPerfuracao, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 550, 200, -1));
        jp_fundo.add(jtf_descricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 580, 230, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visao/semFundo_logoBrasamora.png"))); // NOI18N
        jp_fundo.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 610, 140, 110));

        jLabel9.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        jLabel9.setText("Local:");
        jp_fundo.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 620, -1, -1));
        jp_fundo.add(jtf_local, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 620, 230, -1));

        getContentPane().add(jp_fundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 810));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb_relatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_relatorioActionPerformed
       //atualizarTabela();
        
        String relatorio = "--- Dados de venda --- \n" + "Piercing Auriculares \n" +
                " Cliente: " + jtf_cliente.getText() + "\n Data perfuração: " + jtf_dataPerfuracao.getText() +  
                "\n Valor Total: " + jtf_valorTotal.getText() + "\n Descrição: " + jtf_descricao.getText() + "\n Local: " + jtf_local.getText();

        byte[] buff=relatorio.getBytes();

        try{
            r++;
            RandomAccessFile raf = new RandomAccessFile("c:\\relatoriosPiercing\\Auriculares\\auricular " + jtf_cliente.getText() + ".txt", "rw");
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

    private void jtf_diferencaJoiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_diferencaJoiaActionPerformed

    }//GEN-LAST:event_jtf_diferencaJoiaActionPerformed

    private void jrb_150titanioConchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrb_150titanioConchActionPerformed
        if (jrb_150titanioConch.isSelected()){
            jrb_100acoConch.setSelected(false);
        }
    }//GEN-LAST:event_jrb_150titanioConchActionPerformed

    private void jrb_100acoConchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrb_100acoConchActionPerformed
        if (jrb_100acoConch.isSelected()){
            jrb_150titanioConch.setSelected(false);
        }
    }//GEN-LAST:event_jrb_100acoConchActionPerformed

    private void jrb_150titanioAntiTragusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrb_150titanioAntiTragusActionPerformed
        if (jrb_150titanioAntiTragus.isSelected()){
            jrb_100acoAntiTragus.setSelected(false);
        }
    }//GEN-LAST:event_jrb_150titanioAntiTragusActionPerformed

    private void jrb_100acoAntiTragusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrb_100acoAntiTragusActionPerformed
        if (jrb_100acoAntiTragus.isSelected()){
            jrb_150titanioAntiTragus.setSelected(false);
        }
    }//GEN-LAST:event_jrb_100acoAntiTragusActionPerformed

    private void jrb_150titanioTragusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrb_150titanioTragusActionPerformed
        if (jrb_150titanioTragus.isSelected()){
            jrb_100acoTragus.setSelected(false);
        }
    }//GEN-LAST:event_jrb_150titanioTragusActionPerformed

    private void jrb_100acoTragusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrb_100acoTragusActionPerformed
        if (jrb_100acoTragus.isSelected()){
            jrb_150titanioTragus.setSelected(false);
        }
    }//GEN-LAST:event_jrb_100acoTragusActionPerformed

    private void jrb_150titanioAntiHelixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrb_150titanioAntiHelixActionPerformed
        if (jrb_150titanioAntiHelix.isSelected()){
            jrb_100acoAntiHelix.setSelected(false);
        }
    }//GEN-LAST:event_jrb_150titanioAntiHelixActionPerformed

    private void jrb_100acoAntiHelixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrb_100acoAntiHelixActionPerformed
        if (jrb_100acoAntiHelix.isSelected()){
            jrb_150titanioAntiHelix.setSelected(false);
        }
    }//GEN-LAST:event_jrb_100acoAntiHelixActionPerformed

    private void jrb_150titanioHelixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrb_150titanioHelixActionPerformed
        if (jrb_150titanioHelix.isSelected()){
            jrb_100acoHelix.setSelected(false);
        }
    }//GEN-LAST:event_jrb_150titanioHelixActionPerformed

    private void jrb_100acoHelixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrb_100acoHelixActionPerformed
        if (jrb_100acoHelix.isSelected()){
            jrb_150titanioHelix.setSelected(false);
        }
    }//GEN-LAST:event_jrb_100acoHelixActionPerformed

    private void jrb_150titanioRookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrb_150titanioRookActionPerformed
        if (jrb_150titanioRook.isSelected()){
            jrb_100acoRook.setSelected(false);
        }
    }//GEN-LAST:event_jrb_150titanioRookActionPerformed

    private void jrb_100acoRookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrb_100acoRookActionPerformed
        if (jrb_100acoRook.isSelected()){
            jrb_150titanioRook.setSelected(false);
        }
    }//GEN-LAST:event_jrb_100acoRookActionPerformed

    private void jtf_valorTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_valorTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_valorTotalActionPerformed

    private void jb_voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_voltarActionPerformed
        dispose();
    }//GEN-LAST:event_jb_voltarActionPerformed

    private void jb_calcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_calcularActionPerformed
        double totalFinal = 0;
        double totalCada = 0;
        double diferenca = 0;

        if(jrb_100acoDaith.isSelected()){
            totalCada = totalCada + 100.00;
        } else if (jrb_150titanioDaith.isSelected()){
            totalCada = totalCada + 150.00;
        }

        if(jrb_100acoTragus.isSelected()){
            totalCada = totalCada + 100.00;
        } else if (jrb_150titanioTragus.isSelected()){
            totalCada = totalCada + 150.00;
        }

        if(jrb_100acoAntiTragus.isSelected()){
            totalCada = totalCada + 100.00;
        } else if (jrb_150titanioAntiTragus.isSelected()){
            totalCada = totalCada + 150.00;
        }

        if(jrb_100acoConch.isSelected()){
            totalCada = totalCada + 100.00;
        } else if (jrb_150titanioConch.isSelected()){
            totalCada = totalCada + 150.00;
        }

        if(jrb_100acoHelix.isSelected()){
            totalCada = totalCada + 100.00;
        } else if (jrb_150titanioHelix.isSelected()){
            totalCada = totalCada + 150.00;
        }
        
        if(jrb_100acoAntiHelix.isSelected()){
            totalCada = totalCada + 100.00;
        } else if (jrb_150titanioAntiHelix.isSelected()){
            totalCada = totalCada + 150.00;
        }
                
        if(jrb_100acoRook.isSelected()){
            totalCada = totalCada + 100.00;
        } else if (jrb_150titanioRook.isSelected()){
            totalCada = totalCada + 150.00;
        }

        if(jrb_100acoSnug.isSelected()){
            totalCada = totalCada + 100.00;
        } else if(jrb_150titanioSnug.isSelected()) {
            totalCada = totalCada + 150.00;
        }

        if(jrb_150acoTransversal.isSelected()){
            totalCada = totalCada + 150.00;
        } else if (jrb_200titanioTransversal.isSelected()) {
            totalCada = totalCada + 200.00;
        }

        if(jrb_100lobulo1.isSelected()){
            totalCada = totalCada + 100.00;
        } else if (jrb_180lobulo2.isSelected()) {
            totalCada = totalCada + 180.00;
        } else if (jrb_150lobulo3.isSelected()) {
            totalCada = totalCada + 150.00;
        }

        diferenca = Double.parseDouble((jtf_diferencaJoia.getText()));

        totalFinal = totalCada + diferenca;

        jtf_valorTotal.setText(Double.toString(totalFinal));
        totalFinal = Double.parseDouble((jtf_valorTotal.getText()));
    }//GEN-LAST:event_jb_calcularActionPerformed

    private void jrb_200titanioTransversalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrb_200titanioTransversalActionPerformed
        if(jrb_200titanioTransversal.isSelected()){
            jrb_150acoTransversal.setSelected(false);
        }
    }//GEN-LAST:event_jrb_200titanioTransversalActionPerformed

    private void jrb_150acoTransversalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrb_150acoTransversalActionPerformed
        if(jrb_150acoTransversal.isSelected()){
            jrb_200titanioTransversal.setSelected(false);
        }
    }//GEN-LAST:event_jrb_150acoTransversalActionPerformed

    private void jrb_150lobulo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrb_150lobulo3ActionPerformed
        if(jrb_150lobulo3.isSelected()){
            jrb_180lobulo2.setSelected(false);
            jrb_100lobulo1.setSelected(false);
        }
    }//GEN-LAST:event_jrb_150lobulo3ActionPerformed

    private void jrb_180lobulo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrb_180lobulo2ActionPerformed
        if(jrb_180lobulo2.isSelected()){
            jrb_100lobulo1.setSelected(false);
            jrb_150lobulo3.setSelected(false);
        }
    }//GEN-LAST:event_jrb_180lobulo2ActionPerformed

    private void jrb_100lobulo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrb_100lobulo1ActionPerformed
        if(jrb_100lobulo1.isSelected()){
            jrb_180lobulo2.setSelected(false);
            jrb_150lobulo3.setSelected(false);
        }
    }//GEN-LAST:event_jrb_100lobulo1ActionPerformed

    private void jrb_150titanioSnugActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrb_150titanioSnugActionPerformed
        if (jrb_150titanioSnug.isSelected()){
            jrb_100acoSnug.setSelected(false);
        }
    }//GEN-LAST:event_jrb_150titanioSnugActionPerformed

    private void jrb_100acoSnugActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrb_100acoSnugActionPerformed
        if (jrb_100acoSnug.isSelected()){
            jrb_150titanioSnug.setSelected(false);
        }
    }//GEN-LAST:event_jrb_100acoSnugActionPerformed

    private void jrb_150titanioDaithActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrb_150titanioDaithActionPerformed
        if (jrb_150titanioDaith.isSelected()){
            jrb_100acoDaith.setSelected(false);
        }
    }//GEN-LAST:event_jrb_150titanioDaithActionPerformed

    private void jrb_100acoDaithActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrb_100acoDaithActionPerformed
        if (jrb_100acoDaith.isSelected()){
            jrb_150titanioDaith.setSelected(false);
        }
    }//GEN-LAST:event_jrb_100acoDaithActionPerformed

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
                //new AuricularForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JButton jb_calcular;
    private javax.swing.JButton jb_relatorio;
    private javax.swing.JButton jb_voltar;
    private javax.swing.JLabel jl_logado;
    private javax.swing.JLabel jl_nome;
    private javax.swing.JLabel jl_orelha;
    private javax.swing.JLabel jl_recado;
    private javax.swing.JLabel jl_recado1;
    private javax.swing.JLabel jl_recado2;
    private javax.swing.JLabel jl_recado3;
    private javax.swing.JLabel jl_recado4;
    private javax.swing.JLabel jl_recado5;
    private javax.swing.JLabel jl_recado6;
    private javax.swing.JPanel jp_cartilagem;
    private javax.swing.JPanel jp_cartilagem2;
    private javax.swing.JPanel jp_fundo;
    private javax.swing.JPanel jp_lobulo;
    private javax.swing.JPanel jp_transversal;
    private javax.swing.JRadioButton jrb_100acoAntiHelix;
    private javax.swing.JRadioButton jrb_100acoAntiTragus;
    private javax.swing.JRadioButton jrb_100acoConch;
    private javax.swing.JRadioButton jrb_100acoDaith;
    private javax.swing.JRadioButton jrb_100acoHelix;
    private javax.swing.JRadioButton jrb_100acoRook;
    private javax.swing.JRadioButton jrb_100acoSnug;
    private javax.swing.JRadioButton jrb_100acoTragus;
    private javax.swing.JRadioButton jrb_100lobulo1;
    private javax.swing.JRadioButton jrb_150acoTransversal;
    private javax.swing.JRadioButton jrb_150lobulo3;
    private javax.swing.JRadioButton jrb_150titanioAntiHelix;
    private javax.swing.JRadioButton jrb_150titanioAntiTragus;
    private javax.swing.JRadioButton jrb_150titanioConch;
    private javax.swing.JRadioButton jrb_150titanioDaith;
    private javax.swing.JRadioButton jrb_150titanioHelix;
    private javax.swing.JRadioButton jrb_150titanioRook;
    private javax.swing.JRadioButton jrb_150titanioSnug;
    private javax.swing.JRadioButton jrb_150titanioTragus;
    private javax.swing.JRadioButton jrb_180lobulo2;
    private javax.swing.JRadioButton jrb_200titanioTransversal;
    private javax.swing.JTextField jtf_cliente;
    private javax.swing.JTextField jtf_dataPerfuracao;
    private javax.swing.JTextField jtf_descricao;
    private javax.swing.JTextField jtf_diferencaJoia;
    private javax.swing.JTextField jtf_local;
    private javax.swing.JTextField jtf_valorTotal;
    // End of variables declaration//GEN-END:variables
}
