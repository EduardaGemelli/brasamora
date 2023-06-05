package visao;

import dao.ClienteDAO;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Cliente;
import modelo.UsuarioFuncionario;

public class DadosForm extends javax.swing.JFrame {
    private Cliente cliente;
    private UsuarioFuncionario usuario;
    String sexo = null;
    private ClienteDAO clienteDao = new ClienteDAO();
    private List<Cliente> clientes;
    private Cliente clienteSelecionado;

    public DadosForm(UsuarioFuncionario usuario) {
        initComponents();
        this.setLocationRelativeTo(null);
        atualizarTabela();
        atualizarBotao(true);
        habilitarFormulario(false);
        
        this.cliente = cliente;
        jl_logado.setText("Usuário logado: " + usuario.getNome());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jSplitPane1 = new javax.swing.JSplitPane();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        nome = new javax.swing.JLabel();
        nascimento = new javax.swing.JLabel();
        preencha1 = new javax.swing.JLabel();
        preencha = new javax.swing.JLabel();
        jtf_nome = new javax.swing.JTextField();
        cpf = new javax.swing.JLabel();
        telefone = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        jl_sexo = new javax.swing.JLabel();
        jtf_email = new javax.swing.JTextField();
        jrb_masc = new javax.swing.JRadioButton();
        jrb_fem = new javax.swing.JRadioButton();
        jftf_nascimento = new javax.swing.JFormattedTextField();
        jftf_cpf = new javax.swing.JFormattedTextField();
        jftf_telefone = new javax.swing.JFormattedTextField();
        jPanel3 = new javax.swing.JPanel();
        dadosRes = new javax.swing.JLabel();
        rua = new javax.swing.JLabel();
        jtf_rua = new javax.swing.JTextField();
        jtf_numeroCasa = new javax.swing.JTextField();
        jl_numero = new javax.swing.JLabel();
        jl_bairro = new javax.swing.JLabel();
        jtf_bairro = new javax.swing.JTextField();
        jftf_cep = new javax.swing.JFormattedTextField();
        jl_cep = new javax.swing.JLabel();
        jl_cidade = new javax.swing.JLabel();
        jtf_cidade = new javax.swing.JTextField();
        jtf_estado = new javax.swing.JTextField();
        estado = new javax.swing.JLabel();
        jftf_telefoneRecados = new javax.swing.JFormattedTextField();
        jl_recados = new javax.swing.JLabel();
        imgCasa = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        img = new javax.swing.JLabel();
        jb_salvar = new javax.swing.JButton();
        jb_cancelar = new javax.swing.JButton();
        jb_excluir = new javax.swing.JButton();
        jb_alterar = new javax.swing.JButton();
        jb_cadastrar = new javax.swing.JButton();
        jl_logado = new javax.swing.JLabel();
        filtrar = new javax.swing.JLabel();
        jb_pesquisarCpf = new javax.swing.JButton();
        jftf_filtrarCpf = new javax.swing.JTextField();
        jb_voltar = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setBackground(new java.awt.Color(204, 204, 255));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nome.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        nome.setText("Nome completo:");
        jPanel5.add(nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 110, -1));

        nascimento.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        nascimento.setText("Data nascimento:");
        jPanel5.add(nascimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 110, -1));

        preencha1.setFont(new java.awt.Font("Bell MT", 0, 24)); // NOI18N
        preencha1.setText("Preencha seus dados pessoais ");
        jPanel5.add(preencha1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, -1, -1));

        preencha.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        preencha.setText("Atenção, preencha corretamente.");
        jPanel5.add(preencha, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 40, -1, -1));

        jtf_nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_nomeActionPerformed(evt);
            }
        });
        jPanel5.add(jtf_nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 579, 20));

        cpf.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        cpf.setText("CPF:");
        jPanel5.add(cpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 100, -1));

        telefone.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        telefone.setText("Telefone:");
        jPanel5.add(telefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 90, -1));

        email.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        email.setText("E-mail:");
        jPanel5.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 80, -1));

        jl_sexo.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        jl_sexo.setText("Sexo:");
        jPanel5.add(jl_sexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 50, -1));
        jPanel5.add(jtf_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, 579, 20));

        jrb_masc.setBackground(new java.awt.Color(255, 255, 255));
        jrb_masc.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        jrb_masc.setText("Masculino");
        jPanel5.add(jrb_masc, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, 124, -1));

        jrb_fem.setBackground(new java.awt.Color(255, 255, 255));
        jrb_fem.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        jrb_fem.setText("Feminino");
        jPanel5.add(jrb_fem, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 270, -1, 20));

        try {
            jftf_nascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jftf_nascimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jftf_nascimentoActionPerformed(evt);
            }
        });
        jPanel5.add(jftf_nascimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 580, -1));

        try {
            jftf_cpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jftf_cpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jftf_cpfActionPerformed(evt);
            }
        });
        jPanel5.add(jftf_cpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 580, -1));

        try {
            jftf_telefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel5.add(jftf_telefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 580, -1));

        jTabbedPane1.addTab("Dados Pessoais", jPanel5);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dadosRes.setFont(new java.awt.Font("Bell MT", 0, 24)); // NOI18N
        dadosRes.setText("Dados residenciais");
        jPanel3.add(dadosRes, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, -1, -1));

        rua.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        rua.setText("Rua:");
        jPanel3.add(rua, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 64, 20));

        jtf_rua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_ruaActionPerformed(evt);
            }
        });
        jPanel3.add(jtf_rua, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, 440, -1));
        jPanel3.add(jtf_numeroCasa, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 130, 440, -1));

        jl_numero.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        jl_numero.setText("Número");
        jPanel3.add(jl_numero, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, 70, 20));

        jl_bairro.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        jl_bairro.setText("Bairro:");
        jPanel3.add(jl_bairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, 70, 20));
        jPanel3.add(jtf_bairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 160, 440, -1));

        try {
            jftf_cep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel3.add(jftf_cep, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 190, 440, -1));

        jl_cep.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        jl_cep.setText("CEP:");
        jPanel3.add(jl_cep, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, 70, 20));

        jl_cidade.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        jl_cidade.setText("Cidade:");
        jPanel3.add(jl_cidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, -1, -1));
        jPanel3.add(jtf_cidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 220, 440, -1));
        jPanel3.add(jtf_estado, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 250, 440, -1));

        estado.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        estado.setText("Estado:");
        jPanel3.add(estado, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 250, 70, 20));

        try {
            jftf_telefoneRecados.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel3.add(jftf_telefoneRecados, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 210, -1));

        jl_recados.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        jl_recados.setText("Telefone para recados:");
        jPanel3.add(jl_recados, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));

        imgCasa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visao/casa.jpg"))); // NOI18N
        jPanel3.add(imgCasa, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 251, 180));

        jTabbedPane1.addTab("Dados Residenciais", jPanel3);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 350));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visao/semFundo_logoBrasamora.png"))); // NOI18N
        jPanel7.add(img, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 0, 132, 130));

        jb_salvar.setBackground(new java.awt.Color(204, 204, 255));
        jb_salvar.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        jb_salvar.setText("Salvar");
        jb_salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_salvarActionPerformed(evt);
            }
        });
        jPanel7.add(jb_salvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 50, 100, -1));

        jb_cancelar.setBackground(new java.awt.Color(204, 204, 255));
        jb_cancelar.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        jb_cancelar.setText("Cancelar");
        jb_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_cancelarActionPerformed(evt);
            }
        });
        jPanel7.add(jb_cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 50, 100, -1));

        jb_excluir.setBackground(new java.awt.Color(204, 204, 255));
        jb_excluir.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        jb_excluir.setText("Excluir");
        jb_excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_excluirActionPerformed(evt);
            }
        });
        jPanel7.add(jb_excluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, 100, -1));

        jb_alterar.setBackground(new java.awt.Color(204, 204, 255));
        jb_alterar.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        jb_alterar.setText("Alterar");
        jb_alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_alterarActionPerformed(evt);
            }
        });
        jPanel7.add(jb_alterar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 100, -1));

        jb_cadastrar.setBackground(new java.awt.Color(204, 204, 255));
        jb_cadastrar.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        jb_cadastrar.setText("Cadastrar");
        jb_cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_cadastrarActionPerformed(evt);
            }
        });
        jPanel7.add(jb_cadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 100, -1));

        jl_logado.setFont(new java.awt.Font("Bell MT", 1, 12)); // NOI18N
        jl_logado.setText("Usuário logado:");
        jPanel7.add(jl_logado, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 340, -1));

        filtrar.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        filtrar.setText("Filtrar por CPF:");
        jPanel7.add(filtrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        jb_pesquisarCpf.setBackground(new java.awt.Color(204, 204, 255));
        jb_pesquisarCpf.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        jb_pesquisarCpf.setText("Pesquisar");
        jb_pesquisarCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_pesquisarCpfActionPerformed(evt);
            }
        });
        jPanel7.add(jb_pesquisarCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, -1, -1));
        jPanel7.add(jftf_filtrarCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 160, -1));

        jb_voltar.setBackground(new java.awt.Color(204, 204, 255));
        jb_voltar.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        jb_voltar.setText("Voltar");
        jb_voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_voltarActionPerformed(evt);
            }
        });
        jPanel7.add(jb_voltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 50, -1, -1));

        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 560, 960, 140));

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nome", "Nascimento", "CPF", "Telefone", "E-mail", "Sexo", "Rua", "Nº", "Bairro", "CEP", "Cidade", "Estado", "Telefone Recado"
            }
        ));
        jScrollPane2.setViewportView(tabela);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 950, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 960, 210));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_salvarActionPerformed
        atualizarBotao(true);
        habilitarFormulario(false);
        String nome = jtf_nome.getText();
        String cpf = jftf_cpf.getText();
        String telefone = jftf_telefone.getText();
        String nascimento = jftf_nascimento.getText();
        String email = jtf_email.getText();
        String rua = jtf_rua.getText();
        String numero = jtf_numeroCasa.getText();
        String bairro = jtf_bairro.getText();
        String cep = jftf_cep.getText();
        String cidade = jtf_cidade.getText();
        String estado = jtf_estado.getText();
        String telefoneContato = jftf_telefoneRecados.getText();
        int id = 0;
            
        if (nome.length() == 0) {
            JOptionPane.showMessageDialog(null, "Informe um nome.", "Atenção", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (sexo.length() == 0) {
            JOptionPane.showMessageDialog(null, "Informe seu sexo.", "Atenção", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (cpf.length() == 0) {
            JOptionPane.showMessageDialog(null, "Informe um CPF.", "Atenção", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (telefone.length() == 0) {
            JOptionPane.showMessageDialog(null, "Informe um telefone.", "Atenção", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (nascimento.length() == 0) {
            JOptionPane.showMessageDialog(null, "Informe uma data de nascimento.", "Atenção", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (email.length() == 0) {
            JOptionPane.showMessageDialog(null, "Informe um E-mail.", "Atenção", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (rua.length() == 0) {
            JOptionPane.showMessageDialog(null, "Informe uma rua.", "Atenção", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (numero.length() == 0) {
            JOptionPane.showMessageDialog(null, "Informe um número.", "Atenção", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (bairro.length() == 0) {
            JOptionPane.showMessageDialog(null, "Informe um bairro.", "Atenção", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (cep.length() == 0) {
            JOptionPane.showMessageDialog(null, "Informe um CEP.", "Atenção", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (cidade.length() == 0) {
            JOptionPane.showMessageDialog(null, "Informe uma cidade.", "Atenção", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (estado.length() == 0) {
            JOptionPane.showMessageDialog(null, "Informe um estado.", "Atenção", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (telefoneContato.length() == 0) {
            JOptionPane.showMessageDialog(null, "Informe um telefone de contato.", "Atenção", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        if (clienteSelecionado == null){
            Cliente cliente = new Cliente ();
            cliente.setNome(nome);
            if(jrb_fem.isSelected()){
                sexo = "Feminino";
            }
            if(jrb_masc.isSelected()){
                sexo = "Masculino";
            }
            cliente.setSexo(sexo);
            cliente.setCpf(cpf);
            cliente.setTelefone(telefone);
            cliente.setNascimento(nascimento);
            cliente.setEmail(email);
            cliente.setRua(rua);
            cliente.setNumero(numero);
            cliente.setBairro(bairro);
            cliente.setCep(cep);
            cliente.setCidade(cidade);
            cliente.setEstado(estado);
            cliente.setTelefoneRecado(telefoneContato);

            try {
                clienteDao.adicionarCliente(cliente);
                JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso.");
                atualizarTabela();
                jtf_nome.setText("");
                jrb_fem.setSelected(false);
                jrb_masc.setSelected(false);
                jftf_cpf.setText("");
                jftf_telefone.setText("");
                jftf_nascimento.setText("");
                jtf_email.setText("");
                jtf_rua.setText("");
                jtf_numeroCasa.setText("");
                jtf_bairro.setText("");
                jftf_cep.setText("");
                jtf_cidade.setText("");
                jtf_estado.setText("");
                jftf_telefoneRecados.setText("");
                
            } catch (SQLException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(null, "Erro ao inserir no banco de dados.", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            clienteSelecionado.setNome(nome);
            clienteSelecionado.setSexo(sexo);
            clienteSelecionado.setCpf(cpf);
            clienteSelecionado.setTelefone(telefone);
            clienteSelecionado.setNascimento(nascimento);
            clienteSelecionado.setEmail(email);
            clienteSelecionado.setRua(rua);
            clienteSelecionado.setNumero(numero);
            clienteSelecionado.setBairro(bairro);
            clienteSelecionado.setCep(cep);
            clienteSelecionado.setCidade(cidade);
            clienteSelecionado.setEstado(estado);
            clienteSelecionado.setTelefoneRecado(telefoneContato);

            try{
                clienteDao.alterar(clienteSelecionado);
                JOptionPane.showMessageDialog(null, "Cadastro de cliente alterado com sucesso.");
                atualizarTabela();
                jtf_nome.setText("");
                jftf_nascimento.setText("");
                jftf_cpf.setText("");
                jftf_telefone.setText("");
                jrb_fem.setSelected(false);
                jrb_masc.setSelected(false);
                jtf_rua.setText("");
                jtf_numeroCasa.setText("");
                jtf_bairro.setText("");
                jftf_cep.setText("");
                jtf_cidade.setText("");
                jtf_estado.setText("");
                jftf_telefoneRecados.setText("");
                
            } catch (SQLException ex){
                ex.printStackTrace();
            }
        }
        clienteSelecionado = null; 
        
    }//GEN-LAST:event_jb_salvarActionPerformed

        
    private void jb_alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_alterarActionPerformed
        int linha = tabela.getSelectedRow();
            if(linha < 0){
                JOptionPane.showMessageDialog(null, "Selecione um cliente.", "Atenção", JOptionPane.WARNING_MESSAGE);
                return;
            }
            
            atualizarBotao(false);
            habilitarFormulario(true);
            
            clienteSelecionado = clientes.get(linha);
            jtf_nome.setText(clienteSelecionado.getNome());
            //(clienteSelecionado.getSexo());
            jftf_cpf.setText(clienteSelecionado.getCpf());
            jftf_telefone.setText(clienteSelecionado.getTelefone());
            jftf_nascimento.setText(clienteSelecionado.getNascimento());
            jtf_email.setText(clienteSelecionado.getEmail());
            jtf_rua.setText(clienteSelecionado.getRua());
            jtf_numeroCasa.setText(clienteSelecionado.getNumero());
            jtf_bairro.setText(clienteSelecionado.getBairro());
            jftf_cep.setText(clienteSelecionado.getCep());
            jtf_cidade.setText(clienteSelecionado.getCidade());
            jtf_estado.setText(clienteSelecionado.getEstado());
            jftf_telefoneRecados.setText(clienteSelecionado.getTelefoneRecado());
    }//GEN-LAST:event_jb_alterarActionPerformed

    private void jb_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_excluirActionPerformed
        int linha = tabela.getSelectedRow();
        if(linha < 0){
            JOptionPane.showMessageDialog(null, "Selecione um cadastro", "Atençao",
                JOptionPane.WARNING_MESSAGE);
            return;
        }

        clienteSelecionado = clientes.get(linha);

        try{
            clienteDao.remover(clienteSelecionado.getId());
            JOptionPane.showMessageDialog(null, "Cadastro excluído com sucesso.");
            atualizarTabela();
        } catch (SQLException ex){
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jb_excluirActionPerformed

    private void jb_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_cancelarActionPerformed
        atualizarBotao(true);
        habilitarFormulario(false);
        clienteSelecionado = null;
    }//GEN-LAST:event_jb_cancelarActionPerformed

    private void jb_cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_cadastrarActionPerformed
        atualizarBotao(false);
        habilitarFormulario(true);
        jtf_nome.requestFocus();
        clienteSelecionado = null;
    }//GEN-LAST:event_jb_cadastrarActionPerformed

    private void jtf_ruaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_ruaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_ruaActionPerformed

    private void jftf_cpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jftf_cpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jftf_cpfActionPerformed

    private void jftf_nascimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jftf_nascimentoActionPerformed

    }//GEN-LAST:event_jftf_nascimentoActionPerformed

    private void jtf_nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_nomeActionPerformed

    private void jb_pesquisarCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_pesquisarCpfActionPerformed
        atualizarTabela();
    }//GEN-LAST:event_jb_pesquisarCpfActionPerformed

    private void jb_voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_voltarActionPerformed
        dispose();
    }//GEN-LAST:event_jb_voltarActionPerformed

    private void atualizarBotao(boolean status) {
            jb_cadastrar.setEnabled(status);
            jb_excluir.setEnabled(status);
            jb_alterar.setEnabled(status);
            jb_salvar.setEnabled(!status);
            jb_cancelar.setEnabled(!status);
            jb_pesquisarCpf.setEnabled(status);
        
    }
    
    private void habilitarFormulario(boolean status){
        jtf_nome.setEnabled(status);
        jftf_nascimento.setEnabled(status);
        jftf_cpf.setEnabled(status);
        jftf_telefone.setEnabled(status);
        jtf_email.setEnabled(status);
        
        if(jrb_fem.isSelected()){
                sexo = "Feminino";
            }
            if(jrb_masc.isSelected()){
                sexo = "Masculino";
            }
    }
    
    private void atualizarTabela(){
        try {
                clientes = clienteDao.buscarPorCPF(jftf_filtrarCpf.getText());
                
                DefaultTableModel model = (DefaultTableModel) tabela.getModel();
                model.setNumRows(0);
                    for (int i = 0; i < clientes.size(); i++) {
                        Cliente cliente = clientes.get(i);
                        model.addRow(new Object[]{cliente.getNome(), cliente.getNascimento(), cliente.getCpf(), cliente.getTelefone(),
                        cliente.getSexo(),  cliente.getEmail(), cliente.getRua(), cliente.getNumero(), cliente.getBairro(),
                        cliente.getCep(), cliente.getCidade(), cliente.getEstado(), cliente.getTelefoneRecado()});
                    }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        
    }
    
   

    
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new DadosForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cpf;
    private javax.swing.JLabel dadosRes;
    private javax.swing.JLabel email;
    private javax.swing.JLabel estado;
    private javax.swing.JLabel filtrar;
    private javax.swing.JLabel img;
    private javax.swing.JLabel imgCasa;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton jb_alterar;
    private javax.swing.JButton jb_cadastrar;
    private javax.swing.JButton jb_cancelar;
    private javax.swing.JButton jb_excluir;
    private javax.swing.JButton jb_pesquisarCpf;
    private javax.swing.JButton jb_salvar;
    private javax.swing.JButton jb_voltar;
    private javax.swing.JFormattedTextField jftf_cep;
    private javax.swing.JFormattedTextField jftf_cpf;
    private javax.swing.JTextField jftf_filtrarCpf;
    private javax.swing.JFormattedTextField jftf_nascimento;
    private javax.swing.JFormattedTextField jftf_telefone;
    private javax.swing.JFormattedTextField jftf_telefoneRecados;
    private javax.swing.JLabel jl_bairro;
    private javax.swing.JLabel jl_cep;
    private javax.swing.JLabel jl_cidade;
    private javax.swing.JLabel jl_logado;
    private javax.swing.JLabel jl_numero;
    private javax.swing.JLabel jl_recados;
    private javax.swing.JLabel jl_sexo;
    private javax.swing.JRadioButton jrb_fem;
    private javax.swing.JRadioButton jrb_masc;
    private javax.swing.JTextField jtf_bairro;
    private javax.swing.JTextField jtf_cidade;
    private javax.swing.JTextField jtf_email;
    private javax.swing.JTextField jtf_estado;
    private javax.swing.JTextField jtf_nome;
    private javax.swing.JTextField jtf_numeroCasa;
    private javax.swing.JTextField jtf_rua;
    private javax.swing.JLabel nascimento;
    private javax.swing.JLabel nome;
    private javax.swing.JLabel preencha;
    private javax.swing.JLabel preencha1;
    private javax.swing.JLabel rua;
    private javax.swing.JTable tabela;
    private javax.swing.JLabel telefone;
    // End of variables declaration//GEN-END:variables
}
