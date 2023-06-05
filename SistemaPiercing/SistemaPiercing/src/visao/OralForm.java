package visao;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import modelo.Cliente;
import dao.VendasDAO;
import dao.ClienteDAO;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import modelo.UsuarioFuncionario;

public class OralForm extends javax.swing.JFrame {
    private Cliente cliente;
    private UsuarioFuncionario usuario;
    private List<Cliente> clientes;
    private VendasDAO vendaDao = new VendasDAO();
    private ClienteDAO clienteDao = new ClienteDAO();
    private Cliente clienteSelecionado;
    int r = 0;
    double totalFinal;
    double totalCada ;
    double diferenca;

    public OralForm(UsuarioFuncionario usuario) {
        initComponents();
        //atualizarTabela();
        this.setLocationRelativeTo(null);
        this.cliente = cliente;
        jl_logado.setText("Usuário logado: " + usuario.getNome());
        
        //carregarNomes();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg_labrets = new javax.swing.ButtonGroup();
        bg_monroe = new javax.swing.ButtonGroup();
        bg_medusa = new javax.swing.ButtonGroup();
        bg_lingua = new javax.swing.ButtonGroup();
        bg_labretVertical = new javax.swing.ButtonGroup();
        bg_madonna = new javax.swing.ButtonGroup();
        jPanel3 = new javax.swing.JPanel();
        jl_nome = new javax.swing.JLabel();
        jl_logado = new javax.swing.JLabel();
        jl_recado = new javax.swing.JLabel();
        jl_recado1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jl_labrets = new javax.swing.JLabel();
        jl_vertical = new javax.swing.JLabel();
        jl_lingua = new javax.swing.JLabel();
        jp_lingua = new javax.swing.JPanel();
        jrb_150acoLingua = new javax.swing.JRadioButton();
        jrb_200titanioLingua = new javax.swing.JRadioButton();
        jl_trioLabret = new javax.swing.JLabel();
        jl_recado3 = new javax.swing.JLabel();
        jl_recado4 = new javax.swing.JLabel();
        jl_recado5 = new javax.swing.JLabel();
        jb_calcular = new javax.swing.JButton();
        jp_labrets = new javax.swing.JPanel();
        jrb_100acoLabret = new javax.swing.JRadioButton();
        jrb_150titanioLabret = new javax.swing.JRadioButton();
        jrb_200acoLabret2 = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jrb_250titanioLabret2 = new javax.swing.JRadioButton();
        jl_recado6 = new javax.swing.JLabel();
        jtf_valorTotal = new javax.swing.JTextField();
        jl_logo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jrb_100acoLabretVert = new javax.swing.JRadioButton();
        jrb_150titanioLabretVert = new javax.swing.JRadioButton();
        jPanel4 = new javax.swing.JPanel();
        jrb_100acoMadonna = new javax.swing.JRadioButton();
        jrb_150titanioMadonna = new javax.swing.JRadioButton();
        jPanel5 = new javax.swing.JPanel();
        jrb_100acoMonroe = new javax.swing.JRadioButton();
        jrb_150titanioMonroe = new javax.swing.JRadioButton();
        jPanel6 = new javax.swing.JPanel();
        jrb_100acoMedusa = new javax.swing.JRadioButton();
        jrb_150titanioMedusa = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jtf_diferencaJoia = new javax.swing.JTextField();
        jl_recado2 = new javax.swing.JLabel();
        jb_relatorio = new javax.swing.JButton();
        jb_voltar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtf_dataPerfuracao = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jtf_descricao = new javax.swing.JTextField();
        jtf_cliente = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jtf_local = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jl_nome.setFont(new java.awt.Font("Algerian", 0, 24)); // NOI18N
        jl_nome.setText("perfurações orais");
        jPanel3.add(jl_nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 270, -1));

        jl_logado.setFont(new java.awt.Font("Bell MT", 1, 12)); // NOI18N
        jl_logado.setText("Usuário Logado:");
        jPanel3.add(jl_logado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 400, -1));

        jl_recado.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        jl_recado.setText("Os valores variam conforme perfuração e jóia escolhida.");
        jPanel3.add(jl_recado, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        jl_recado1.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        jl_recado1.setText("Jóias elaboradas deverão ser escolhidas na hora da perfuração.");
        jPanel3.add(jl_recado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 106, -1, 20));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, 410, 120));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jl_labrets.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visao/labrets.jpg"))); // NOI18N
        jPanel1.add(jl_labrets, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 150, 90));

        jl_vertical.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visao/verticalLabret.jpg"))); // NOI18N
        jPanel1.add(jl_vertical, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 0, 150, 110));

        jl_lingua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visao/lingua.jpg"))); // NOI18N
        jPanel1.add(jl_lingua, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 510, 300, 160));

        jp_lingua.setBackground(new java.awt.Color(255, 255, 255));
        jp_lingua.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Língua", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Bell MT", 0, 18))); // NOI18N
        jp_lingua.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jrb_150acoLingua.setBackground(new java.awt.Color(255, 255, 255));
        bg_lingua.add(jrb_150acoLingua);
        jrb_150acoLingua.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        jrb_150acoLingua.setText("R$ 150,00 - Jóia simples Aço");
        jrb_150acoLingua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrb_150acoLinguaActionPerformed(evt);
            }
        });
        jp_lingua.add(jrb_150acoLingua, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jrb_200titanioLingua.setBackground(new java.awt.Color(255, 255, 255));
        bg_lingua.add(jrb_200titanioLingua);
        jrb_200titanioLingua.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        jrb_200titanioLingua.setText("R$ 200,00 - Jóia simples Titânio");
        jrb_200titanioLingua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrb_200titanioLinguaActionPerformed(evt);
            }
        });
        jp_lingua.add(jrb_200titanioLingua, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jPanel1.add(jp_lingua, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 560, 230, 110));

        jl_trioLabret.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visao/boca.jpg"))); // NOI18N
        jPanel1.add(jl_trioLabret, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, 460, 110));

        jl_recado3.setFont(new java.awt.Font("Bell MT", 1, 12)); // NOI18N
        jl_recado3.setText("LEMBRE-SE");
        jPanel1.add(jl_recado3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 410, -1, -1));

        jl_recado4.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        jl_recado4.setText("MANTENHA SUA PERFURAÇÃO LIMPA");
        jPanel1.add(jl_recado4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 470, -1, -1));

        jl_recado5.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        jl_recado5.setText("NÃO GIRE A JÓIA.");
        jPanel1.add(jl_recado5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 430, -1, -1));

        jb_calcular.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        jb_calcular.setText("Calcular ");
        jb_calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_calcularActionPerformed(evt);
            }
        });
        jPanel1.add(jb_calcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 350, 90, -1));

        jp_labrets.setBackground(new java.awt.Color(255, 255, 255));
        jp_labrets.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Labret's", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Bell MT", 0, 18))); // NOI18N

        jrb_100acoLabret.setBackground(new java.awt.Color(255, 255, 255));
        bg_labrets.add(jrb_100acoLabret);
        jrb_100acoLabret.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        jrb_100acoLabret.setText("R$ 100,00 - Jóia simples Aço (1 lado)");
        jrb_100acoLabret.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrb_100acoLabretActionPerformed(evt);
            }
        });

        jrb_150titanioLabret.setBackground(new java.awt.Color(255, 255, 255));
        bg_labrets.add(jrb_150titanioLabret);
        jrb_150titanioLabret.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        jrb_150titanioLabret.setText("R$ 150,00 - Jóia simples Titânio (1 lado) ");
        jrb_150titanioLabret.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrb_150titanioLabretActionPerformed(evt);
            }
        });

        jrb_200acoLabret2.setBackground(new java.awt.Color(255, 255, 255));
        bg_labrets.add(jrb_200acoLabret2);
        jrb_200acoLabret2.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        jrb_200acoLabret2.setText("R$ 200,00 - Jóia simples Aço (2 lados) ");
        jrb_200acoLabret2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrb_200acoLabret2ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        jLabel2.setText("Esquerdo ou direito");

        jrb_250titanioLabret2.setBackground(new java.awt.Color(255, 255, 255));
        bg_labrets.add(jrb_250titanioLabret2);
        jrb_250titanioLabret2.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        jrb_250titanioLabret2.setText("R$ 250,00 - Jóia simples Titânio (2 lados)");
        jrb_250titanioLabret2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrb_250titanioLabret2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jp_labretsLayout = new javax.swing.GroupLayout(jp_labrets);
        jp_labrets.setLayout(jp_labretsLayout);
        jp_labretsLayout.setHorizontalGroup(
            jp_labretsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_labretsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_labretsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jrb_250titanioLabret2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jrb_150titanioLabret, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jrb_200acoLabret2)
                    .addComponent(jrb_100acoLabret, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(56, 56, 56))
        );
        jp_labretsLayout.setVerticalGroup(
            jp_labretsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_labretsLayout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jrb_100acoLabret)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jrb_150titanioLabret)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jrb_200acoLabret2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jrb_250titanioLabret2)
                .addContainerGap())
        );

        jPanel1.add(jp_labrets, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 270, 160));

        jl_recado6.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        jl_recado6.setText("Valor total:");
        jPanel1.add(jl_recado6, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 420, -1, -1));
        jPanel1.add(jtf_valorTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 440, 200, -1));

        jl_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visao/semFundo_logoBrasamora.png"))); // NOI18N
        jPanel1.add(jl_logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 480, 160, 140));

        jLabel1.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        jLabel1.setText("MANTENHA UMA BOA HIGIENE ORAL.");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 450, 230, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Labret Vertical", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Bell MT", 0, 18))); // NOI18N

        jrb_100acoLabretVert.setBackground(new java.awt.Color(255, 255, 255));
        bg_labretVertical.add(jrb_100acoLabretVert);
        jrb_100acoLabretVert.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        jrb_100acoLabretVert.setText("R$ 100,00 - Jóia simples Aço");
        jrb_100acoLabretVert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrb_100acoLabretVertActionPerformed(evt);
            }
        });

        jrb_150titanioLabretVert.setBackground(new java.awt.Color(255, 255, 255));
        bg_labretVertical.add(jrb_150titanioLabretVert);
        jrb_150titanioLabretVert.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        jrb_150titanioLabretVert.setText("R$ 150,00 - Jóia simples Titânio ");
        jrb_150titanioLabretVert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrb_150titanioLabretVertActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jrb_100acoLabretVert, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
            .addComponent(jrb_150titanioLabretVert, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jrb_100acoLabretVert)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jrb_150titanioLabretVert)
                .addGap(0, 13, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 120, 210, 90));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Madonna", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Bell MT", 0, 18))); // NOI18N

        jrb_100acoMadonna.setBackground(new java.awt.Color(255, 255, 255));
        bg_madonna.add(jrb_100acoMadonna);
        jrb_100acoMadonna.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        jrb_100acoMadonna.setText("R$ 100,00 - Jóia simples Aço");
        jrb_100acoMadonna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrb_100acoMadonnaActionPerformed(evt);
            }
        });

        jrb_150titanioMadonna.setBackground(new java.awt.Color(255, 255, 255));
        bg_madonna.add(jrb_150titanioMadonna);
        jrb_150titanioMadonna.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        jrb_150titanioMadonna.setText("R$ 150,00 - Jóia simples Titânio ");
        jrb_150titanioMadonna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrb_150titanioMadonnaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jrb_100acoMadonna, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(13, 13, 13))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jrb_150titanioMadonna, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jrb_100acoMadonna)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jrb_150titanioMadonna)
                .addContainerGap(7, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 230, 210, 90));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Monroe", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Bell MT", 0, 18))); // NOI18N

        jrb_100acoMonroe.setBackground(new java.awt.Color(255, 255, 255));
        bg_monroe.add(jrb_100acoMonroe);
        jrb_100acoMonroe.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        jrb_100acoMonroe.setText("R$ 100,00 - Jóia simples Aço");
        jrb_100acoMonroe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrb_100acoMonroeActionPerformed(evt);
            }
        });

        jrb_150titanioMonroe.setBackground(new java.awt.Color(255, 255, 255));
        bg_monroe.add(jrb_150titanioMonroe);
        jrb_150titanioMonroe.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        jrb_150titanioMonroe.setText("R$ 150,00 - Jóia simples Titânio ");
        jrb_150titanioMonroe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrb_150titanioMonroeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jrb_100acoMonroe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jrb_150titanioMonroe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jrb_100acoMonroe)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jrb_150titanioMonroe)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 270, 100));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Medusa", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Bell MT", 0, 18))); // NOI18N

        jrb_100acoMedusa.setBackground(new java.awt.Color(255, 255, 255));
        bg_medusa.add(jrb_100acoMedusa);
        jrb_100acoMedusa.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        jrb_100acoMedusa.setText("R$ 100,00 - Jóia simples Aço");
        jrb_100acoMedusa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrb_100acoMedusaActionPerformed(evt);
            }
        });

        jrb_150titanioMedusa.setBackground(new java.awt.Color(255, 255, 255));
        bg_medusa.add(jrb_150titanioMedusa);
        jrb_150titanioMedusa.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        jrb_150titanioMedusa.setText("R$ 150,00 - Jóia simples Titânio ");
        jrb_150titanioMedusa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrb_150titanioMedusaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jrb_100acoMedusa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(21, 21, 21))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jrb_150titanioMedusa, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jrb_100acoMedusa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jrb_150titanioMedusa)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 270, 90));

        jLabel3.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        jLabel3.setText("Diferença de valor de jóia:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 310, -1, -1));

        jtf_diferencaJoia.setText("0.0");
        jtf_diferencaJoia.setActionCommand("<Not Set>");
        jPanel1.add(jtf_diferencaJoia, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 310, 150, -1));

        jl_recado2.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        jl_recado2.setText("Reajuste e diferença de valor é calculado no ato da escolha de jóia.");
        jPanel1.add(jl_recado2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 130, -1, -1));

        jb_relatorio.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        jb_relatorio.setText("Gerar Relatório");
        jb_relatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_relatorioActionPerformed(evt);
            }
        });
        jPanel1.add(jb_relatorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 650, 130, -1));

        jb_voltar.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        jb_voltar.setText("Voltar");
        jb_voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_voltarActionPerformed(evt);
            }
        });
        jPanel1.add(jb_voltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 350, 80, -1));

        jLabel4.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        jLabel4.setText("Cliente:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 470, -1, -1));

        jLabel5.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        jLabel5.setText("Data perfuração:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 520, 160, -1));
        jPanel1.add(jtf_dataPerfuracao, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 540, 200, -1));

        jLabel8.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        jLabel8.setText("Descrição:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 570, -1, -1));
        jPanel1.add(jtf_descricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 590, 200, -1));
        jPanel1.add(jtf_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 490, 200, -1));

        jLabel6.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        jLabel6.setText("Local:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 620, -1, -1));

        jtf_local.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_localActionPerformed(evt);
            }
        });
        jPanel1.add(jtf_local, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 640, 200, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 820));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jrb_150titanioMedusaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrb_150titanioMedusaActionPerformed
        if(jrb_150titanioMedusa.isSelected()){
            jrb_100acoMedusa.setSelected(false);
        }
    }//GEN-LAST:event_jrb_150titanioMedusaActionPerformed

    private void jrb_100acoMadonnaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrb_100acoMadonnaActionPerformed
        if(jrb_100acoMadonna.isSelected()){
            jrb_150titanioMadonna.setSelected(false);
        }
    }//GEN-LAST:event_jrb_100acoMadonnaActionPerformed

    private void jrb_150titanioMadonnaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrb_150titanioMadonnaActionPerformed
        if(jrb_150titanioMadonna.isSelected()){
            jrb_100acoMadonna.setSelected(false);
        }
    }//GEN-LAST:event_jrb_150titanioMadonnaActionPerformed

    private void jrb_150titanioLabretVertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrb_150titanioLabretVertActionPerformed
        if(jrb_150titanioLabretVert.isSelected()){
            jrb_100acoLabretVert.setSelected(false);
        }
    }//GEN-LAST:event_jrb_150titanioLabretVertActionPerformed

    private void jrb_100acoLabretVertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrb_100acoLabretVertActionPerformed
        if(jrb_100acoLabretVert.isSelected()){
            jrb_150titanioLabretVert.setSelected(false);
        }
    }//GEN-LAST:event_jrb_100acoLabretVertActionPerformed

    private void jrb_200titanioLinguaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrb_200titanioLinguaActionPerformed
        if(jrb_200titanioLingua.isSelected()){
            jrb_150acoLingua.setSelected(false);
        }
    }//GEN-LAST:event_jrb_200titanioLinguaActionPerformed

    private void jrb_150acoLinguaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrb_150acoLinguaActionPerformed
        if(jrb_150acoLingua.isSelected()){
            jrb_200titanioLingua.setSelected(false);
        }
    }//GEN-LAST:event_jrb_150acoLinguaActionPerformed

    private void jrb_100acoMedusaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrb_100acoMedusaActionPerformed
        if(jrb_100acoMedusa.isSelected()){
            jrb_150titanioMedusa.setSelected(false);
        }
    }//GEN-LAST:event_jrb_100acoMedusaActionPerformed

    private void jrb_150titanioMonroeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrb_150titanioMonroeActionPerformed
        if(jrb_150titanioMonroe.isSelected()){
            jrb_100acoMonroe.setSelected(false);
        }
    }//GEN-LAST:event_jrb_150titanioMonroeActionPerformed

    private void jrb_100acoMonroeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrb_100acoMonroeActionPerformed
        if(jrb_100acoMonroe.isSelected()){
            jrb_150titanioMonroe.setSelected(false);
        }
    }//GEN-LAST:event_jrb_100acoMonroeActionPerformed

    private void jrb_250titanioLabret2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrb_250titanioLabret2ActionPerformed
        if(jrb_250titanioLabret2.isSelected()){
            jrb_100acoLabret.setSelected(false);
            jrb_150titanioLabret.setSelected(false);
            jrb_200acoLabret2.setSelected(false);
        }
    }//GEN-LAST:event_jrb_250titanioLabret2ActionPerformed

    private void jrb_200acoLabret2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrb_200acoLabret2ActionPerformed
        if(jrb_200acoLabret2.isSelected()){
            jrb_100acoLabret.setSelected(false);
            jrb_150titanioLabret.setSelected(false);
            jrb_250titanioLabret2.setSelected(false);
        }
    }//GEN-LAST:event_jrb_200acoLabret2ActionPerformed

    private void jrb_150titanioLabretActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrb_150titanioLabretActionPerformed
        if(jrb_150titanioLabret.isSelected()){
            jrb_100acoLabret.setSelected(false);
            jrb_200acoLabret2.setSelected(false);
            jrb_250titanioLabret2.setSelected(false);
        }
    }//GEN-LAST:event_jrb_150titanioLabretActionPerformed

    private void jrb_100acoLabretActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrb_100acoLabretActionPerformed
        if(jrb_100acoLabret.isSelected()){
            jrb_200acoLabret2.setSelected(false);
            jrb_150titanioLabret.setSelected(false);
            jrb_250titanioLabret2.setSelected(false);
        }
    }//GEN-LAST:event_jrb_100acoLabretActionPerformed

    private void jb_calcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_calcularActionPerformed
            if (jrb_150titanioMedusa.isSelected()) {
                totalCada = totalCada + 150.00;
            } else if(jrb_100acoMedusa.isSelected()) {
                totalCada = totalCada + 100.00;
            }
            
            if (jrb_100acoMadonna.isSelected()) {
                totalCada = totalCada + 100.00;
            } else if(jrb_150titanioMadonna.isSelected()) {
                totalCada = totalCada + 150.00;
            }

            if (jrb_150titanioLabretVert.isSelected()) {
                totalCada = totalCada + 150.00;
            } else if (jrb_100acoLabretVert.isSelected()){
                totalCada = totalCada + 100.00;
            }

            if (jrb_200titanioLingua.isSelected()) {
                totalCada = totalCada + 200.00;
            } else if(jrb_150acoLingua.isSelected()) {
                totalCada = totalCada + 150.00;
            }

            if (jrb_150titanioMonroe.isSelected()) {
                totalCada = totalCada + 150.00;
            } else if(jrb_100acoMonroe.isSelected()) {
                totalCada = totalCada + 100.00;
            }

            if (jrb_150titanioLabret.isSelected()) {
                totalCada = totalCada + 150.00;
            } else if (jrb_100acoLabret.isSelected()) {
                totalCada = totalCada + 100.00;
            } else if (jrb_200acoLabret2.isSelected()) {
                totalCada = totalCada + 200.00;
            } else if (jrb_250titanioLabret2.isSelected()) {
                totalCada = totalCada + 250.00;
            }
            
            diferenca = Double.parseDouble(jtf_diferencaJoia.getText());
            
            totalFinal = totalCada + diferenca;
            
            jtf_valorTotal.setText(Double.toString(totalFinal));
            totalFinal = Double.parseDouble((jtf_valorTotal.getText()));


    }//GEN-LAST:event_jb_calcularActionPerformed

    private void jb_relatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_relatorioActionPerformed
        //atualizarTabela();
        
        String relatorio = "--- Dados de venda --- \n" + "Piercing Orais \n" +
                " Cliente: " + jtf_cliente.getText() + "\n Data perfuração: " + jtf_dataPerfuracao.getText() +  
                "\n Valor Total: " + jtf_valorTotal.getText() + "\n Descrição: " + jtf_descricao.getText() + "\n Local: " + jtf_local.getText();

        byte[] buff=relatorio.getBytes();

        try{
            r++;
            RandomAccessFile raf = new RandomAccessFile("c:\\relatoriosPiercing\\Orais\\orais " + jtf_cliente.getText() + ".txt", "rw");
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

    private void jtf_localActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_localActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_localActionPerformed

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
    
//    private void carregarNomes(){
//        List<Cliente> clientesListar = clienteDao.buscar();
//        //DefaultComboBoxModel modelo = (DefaultComboBoxModel) jcb_nomes.getModel();
//        modelo.removeAllElements();
//        for(Cliente nomes : clientesListar){
//            modelo.addElement(nomes);
//        }
//    }
    
    public static void main(String args[]) {
  
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new OralForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bg_labretVertical;
    private javax.swing.ButtonGroup bg_labrets;
    private javax.swing.ButtonGroup bg_lingua;
    private javax.swing.ButtonGroup bg_madonna;
    private javax.swing.ButtonGroup bg_medusa;
    private javax.swing.ButtonGroup bg_monroe;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JButton jb_calcular;
    private javax.swing.JButton jb_relatorio;
    private javax.swing.JButton jb_voltar;
    private javax.swing.JLabel jl_labrets;
    private javax.swing.JLabel jl_lingua;
    private javax.swing.JLabel jl_logado;
    private javax.swing.JLabel jl_logo;
    private javax.swing.JLabel jl_nome;
    private javax.swing.JLabel jl_recado;
    private javax.swing.JLabel jl_recado1;
    private javax.swing.JLabel jl_recado2;
    private javax.swing.JLabel jl_recado3;
    private javax.swing.JLabel jl_recado4;
    private javax.swing.JLabel jl_recado5;
    private javax.swing.JLabel jl_recado6;
    private javax.swing.JLabel jl_trioLabret;
    private javax.swing.JLabel jl_vertical;
    private javax.swing.JPanel jp_labrets;
    private javax.swing.JPanel jp_lingua;
    private javax.swing.JRadioButton jrb_100acoLabret;
    private javax.swing.JRadioButton jrb_100acoLabretVert;
    private javax.swing.JRadioButton jrb_100acoMadonna;
    private javax.swing.JRadioButton jrb_100acoMedusa;
    private javax.swing.JRadioButton jrb_100acoMonroe;
    private javax.swing.JRadioButton jrb_150acoLingua;
    private javax.swing.JRadioButton jrb_150titanioLabret;
    private javax.swing.JRadioButton jrb_150titanioLabretVert;
    private javax.swing.JRadioButton jrb_150titanioMadonna;
    private javax.swing.JRadioButton jrb_150titanioMedusa;
    private javax.swing.JRadioButton jrb_150titanioMonroe;
    private javax.swing.JRadioButton jrb_200acoLabret2;
    private javax.swing.JRadioButton jrb_200titanioLingua;
    private javax.swing.JRadioButton jrb_250titanioLabret2;
    private javax.swing.JTextField jtf_cliente;
    private javax.swing.JTextField jtf_dataPerfuracao;
    private javax.swing.JTextField jtf_descricao;
    private javax.swing.JTextField jtf_diferencaJoia;
    private javax.swing.JTextField jtf_local;
    private javax.swing.JTextField jtf_valorTotal;
    // End of variables declaration//GEN-END:variables
}
