package Interface;

import DAO.FilmeDAO;
import DAO.VendaDAO;
import DTO.FilmeDTO;
import DTO.VendaDTO;
import java.text.DateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class VendaIngress extends javax.swing.JPanel {

    public VendaIngress() {
        initComponents();
        dataHoje();
        pesquisarFilme();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtIdFilme = new javax.swing.JTextField();
        txtNomeFilme = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtSessao = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtSala = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtDuracao = new javax.swing.JTextField();
        btnCarregar = new javax.swing.JButton();
        btnCancelarFilme = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtableFilme = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtData = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtQuantidade = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        btnFinalizar = new javax.swing.JButton();
        btnCancelarVenda = new javax.swing.JButton();
        comBoxValor = new javax.swing.JComboBox<>();
        btnCalcular = new javax.swing.JButton();

        jLabel3.setText("jLabel3");

        setBackground(new java.awt.Color(235, 237, 236));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel1.setText("ID Filme:");

        txtIdFilme.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        txtIdFilme.setEnabled(false);

        txtNomeFilme.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        txtNomeFilme.setEnabled(false);

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel2.setText("Nome Filme:");

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel4.setText("Sessao");

        txtSessao.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        txtSessao.setEnabled(false);

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel5.setText("Sala");

        txtSala.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        txtSala.setEnabled(false);

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel6.setText("Duracao");

        txtDuracao.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        txtDuracao.setEnabled(false);

        btnCarregar.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnCarregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/carregando (1).png"))); // NOI18N
        btnCarregar.setText("Carregar");
        btnCarregar.setEnabled(false);
        btnCarregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarregarActionPerformed(evt);
            }
        });

        btnCancelarFilme.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnCancelarFilme.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/ic_cancel_128_28318.png"))); // NOI18N
        btnCancelarFilme.setText("Cancelar");
        btnCancelarFilme.setEnabled(false);
        btnCancelarFilme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarFilmeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(txtDuracao, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCarregar, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCancelarFilme, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtIdFilme, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtSessao, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSala, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNomeFilme, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSala, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(txtIdFilme, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)
                        .addComponent(txtSessao, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNomeFilme, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelarFilme)
                    .addComponent(btnCarregar)
                    .addComponent(txtDuracao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(19, 19, 19))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Filmes Cadastrados");

        jtableFilme.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "nome", "Classificacao", "Duracao", "Data", "Sessao", "Sala", "Genero"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtableFilme.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtableFilmeMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtableFilme);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(4, 4, 4)
                    .addComponent(jScrollPane1)
                    .addGap(4, 4, 4)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(204, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(37, 37, 37)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel7.setText("Valor");

        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel9.setText("Data");

        txtData.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        txtData.setEnabled(false);

        jLabel10.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel10.setText("Quantidade:");

        txtQuantidade.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        txtQuantidade.setEnabled(false);

        jLabel11.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel11.setText("Total:");

        txtTotal.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        txtTotal.setEnabled(false);

        btnFinalizar.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnFinalizar.setText("Finalizar");
        btnFinalizar.setEnabled(false);
        btnFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarActionPerformed(evt);
            }
        });

        btnCancelarVenda.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnCancelarVenda.setText("Cancelar");
        btnCancelarVenda.setEnabled(false);
        btnCancelarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarVendaActionPerformed(evt);
            }
        });

        comBoxValor.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        comBoxValor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar", "15.00", "20.00", "25.00" }));
        comBoxValor.setEnabled(false);

        btnCalcular.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnCalcular.setText("Calcular");
        btnCalcular.setEnabled(false);
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTotal))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(comBoxValor, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnFinalizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCancelarVenda, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                    .addComponent(btnCalcular, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9)
                            .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(comBoxValor)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 35, Short.MAX_VALUE))
                .addGap(30, 30, 30))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnCalcular)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnFinalizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCancelarVenda)
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jtableFilmeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtableFilmeMouseClicked
        // TODO add your handling code here:
        statusBotoesFilme(true);

    }//GEN-LAST:event_jtableFilmeMouseClicked

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        // TODO add your handling code here:
        calcularVenda();
        btnFinalizar.setEnabled(true);
        btnCancelarVenda.setEnabled(true);

    }//GEN-LAST:event_btnCalcularActionPerformed

    private void btnCarregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarregarActionPerformed
        // TODO add your handling code here:
        carregarCampos();
        statusCamposVenda(true);
    }//GEN-LAST:event_btnCarregarActionPerformed

    private void btnCancelarFilmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarFilmeActionPerformed
        // TODO add your handling code here:
        limparCampos();
        statusBotoesFilme(false);
        btnCalcular.setEnabled(false);
    }//GEN-LAST:event_btnCancelarFilmeActionPerformed

    private void btnCancelarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarVendaActionPerformed
        // TODO add your handling code here:

        int sair = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja cancelar a venda?", "", JOptionPane.YES_NO_OPTION);
        if (sair == JOptionPane.YES_OPTION) {
            limparTudo();

        }
    }//GEN-LAST:event_btnCancelarVendaActionPerformed

    private void btnFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarActionPerformed
        // TODO add your handling code here:
        adicionarVenda();
    }//GEN-LAST:event_btnFinalizarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnCancelarFilme;
    private javax.swing.JButton btnCancelarVenda;
    private javax.swing.JButton btnCarregar;
    private javax.swing.JButton btnFinalizar;
    private javax.swing.JComboBox<String> comBoxValor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtableFilme;
    private javax.swing.JTextField txtData;
    private javax.swing.JTextField txtDuracao;
    private javax.swing.JTextField txtIdFilme;
    private javax.swing.JTextField txtNomeFilme;
    private javax.swing.JTextField txtQuantidade;
    private javax.swing.JTextField txtSala;
    private javax.swing.JTextField txtSessao;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables

    public void adicionarVenda() {

        try {
            VendaDTO classe = new VendaDTO();
            VendaDAO conexao = new VendaDAO();

            ////////////////////////
            int idFilme = Integer.valueOf(txtIdFilme.getText());

            String selecionarValor = comBoxValor.getSelectedItem().toString();
            double valor = Double.valueOf(selecionarValor);

            int quantidade = Integer.valueOf(txtQuantidade.getText());
            double valorTotal = Double.valueOf(txtTotal.getText());
            String sessao = txtSessao.getText();
            
            String data = txtData.getText();

            ////////////////////////////
            classe.setIdFilme(idFilme);
            classe.setValor(valor);
            classe.setQuantidade(quantidade);
            classe.setValorTotal(valorTotal);
            classe.setSessao(sessao);
            classe.setDataVenda(data);

            ////////////////////////////
            conexao.adicionarVendas(classe);

            JOptionPane.showMessageDialog(null, "Venda finalizada com sucesso");
            limparTudo();

        } catch (Exception erro) {
            System.out.println("Erro classe(Venda Ingressos) Metodo(adicionarFilme)" + erro.getMessage());

        }

    }

    public void dataHoje() {

        LocalDate now = LocalDate.now();
        int dia = now.getDayOfMonth();
        int mes = now.getMonthValue();
        int ano = now.getYear();

        if (mes < 10) {
            txtData.setText(dia + "/0" + mes + "/" + ano);

        } else {
            txtData.setText(dia + "/0" + mes + "/" + ano);

        }

    }

    public void pesquisarFilme() {
        try {
            FilmeDAO conexao = new FilmeDAO();

            DefaultTableModel tableModel = (DefaultTableModel) jtableFilme.getModel();
            tableModel.setNumRows(0);

            ArrayList<FilmeDTO> listaFilme;

            listaFilme = conexao.pesquisarFilme();

            for (int num = 0; num < listaFilme.size(); num++) {
                tableModel.addRow(new Object[]{
                    listaFilme.get(num).getId_Filme(),
                    listaFilme.get(num).getNomeFilme(),
                    listaFilme.get(num).getClassificacao(),
                    listaFilme.get(num).getDuracao(),
                    listaFilme.get(num).getDataCadastro(),
                    listaFilme.get(num).getSessao(),
                    listaFilme.get(num).getSala(),
                    listaFilme.get(num).getGenero()});
            }

        } catch (Exception erro) {
            System.out.println("Erro classe(Venda Ingressos) Metodo(PesquisarFilme)" + erro.getMessage());

        }

    }

    public void statusBotoesFilme(boolean status) {
        btnCarregar.setEnabled(status);
        btnCancelarFilme.setEnabled(status);

    }

    public void statusCamposVenda(boolean status) {
        comBoxValor.setEnabled(status);
        txtQuantidade.setEnabled(status);
        btnCalcular.setEnabled(status);

    }

    public void calcularVenda() {
        String selecionarValor = comBoxValor.getSelectedItem().toString();
        double valor = Double.valueOf(selecionarValor);

        int quantidade = Integer.valueOf(txtQuantidade.getText());
        ///////////

        if (quantidade <= 0) {
            JOptionPane.showMessageDialog(null, "Erro na quantidade de ingressos");
            txtQuantidade.setText("");

        } else {
            double total = valor * quantidade;
            txtTotal.setText(String.valueOf(total));

        }
    }

    public void carregarCampos() {

        int linha = jtableFilme.getSelectedRow();

        txtIdFilme.setText(jtableFilme.getModel().getValueAt(linha, 0).toString());
        txtNomeFilme.setText(jtableFilme.getModel().getValueAt(linha, 1).toString());
        txtDuracao.setText(jtableFilme.getModel().getValueAt(linha, 3).toString());
        txtSessao.setText(jtableFilme.getModel().getValueAt(linha, 5).toString());
        txtSala.setText(jtableFilme.getModel().getValueAt(linha, 6).toString());

    }

    public void limparCampos() {

        txtIdFilme.setText("");
        txtNomeFilme.setText("");
        txtDuracao.setText("");
        txtSessao.setText("");
        txtSala.setText("");
        txtQuantidade.setText("");
        comBoxValor.setSelectedIndex(0);

    }

    public void limparTudo() {

        limparCampos();
        statusBotoesFilme(false);
        statusCamposVenda(false);
        /////////////
        btnFinalizar.setEnabled(false);
        btnCancelarVenda.setEnabled(false);

    }

}
