package Interface;

import java.awt.BorderLayout;
import javax.swing.JOptionPane;

public class HomeGerente extends javax.swing.JFrame {

    public HomeGerente() {
        initComponents();
        adicionarTelaHome();
        

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        painelBotoes = new javax.swing.JPanel();
        nomeFuncionario = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnHome = new javax.swing.JPanel();
        labelHome = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnHome1 = new javax.swing.JPanel();
        label_Infor_Venda = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnHome2 = new javax.swing.JPanel();
        labelAdiFilme = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnHome3 = new javax.swing.JPanel();
        labelAdcUsuario = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnHome4 = new javax.swing.JPanel();
        LabelDesconectar = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jDktopTelas = new javax.swing.JDesktopPane();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new java.awt.BorderLayout());

        painelBotoes.setBackground(new java.awt.Color(7, 34, 39));
        painelBotoes.setPreferredSize(new java.awt.Dimension(400, 585));

        nomeFuncionario.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        nomeFuncionario.setForeground(new java.awt.Color(255, 255, 255));
        nomeFuncionario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nomeFuncionario.setText("Nome funcionario");
        nomeFuncionario.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        btnHome.setBackground(new java.awt.Color(7, 34, 39));

        labelHome.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        labelHome.setForeground(new java.awt.Color(255, 255, 255));
        labelHome.setText("Home");
        labelHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelHomeMouseClicked(evt);
            }
        });

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/house-32.png"))); // NOI18N

        javax.swing.GroupLayout btnHomeLayout = new javax.swing.GroupLayout(btnHome);
        btnHome.setLayout(btnHomeLayout);
        btnHomeLayout.setHorizontalGroup(
            btnHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnHomeLayout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelHome, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(121, Short.MAX_VALUE))
        );
        btnHomeLayout.setVerticalGroup(
            btnHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
            .addComponent(labelHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        btnHome1.setBackground(new java.awt.Color(7, 34, 39));

        label_Infor_Venda.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        label_Infor_Venda.setForeground(new java.awt.Color(255, 255, 255));
        label_Infor_Venda.setText("Informação Venda");
        label_Infor_Venda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_Infor_VendaMouseClicked(evt);
            }
        });

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/cart-45-32.png"))); // NOI18N

        javax.swing.GroupLayout btnHome1Layout = new javax.swing.GroupLayout(btnHome1);
        btnHome1.setLayout(btnHome1Layout);
        btnHome1Layout.setHorizontalGroup(
            btnHome1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnHome1Layout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label_Infor_Venda, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(121, Short.MAX_VALUE))
        );
        btnHome1Layout.setVerticalGroup(
            btnHome1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
            .addComponent(label_Infor_Venda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        btnHome2.setBackground(new java.awt.Color(7, 34, 39));

        labelAdiFilme.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        labelAdiFilme.setForeground(new java.awt.Color(255, 255, 255));
        labelAdiFilme.setText("Adicionar Filme");
        labelAdiFilme.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelAdiFilmeMouseClicked(evt);
            }
        });

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/video-add-32.png"))); // NOI18N

        javax.swing.GroupLayout btnHome2Layout = new javax.swing.GroupLayout(btnHome2);
        btnHome2.setLayout(btnHome2Layout);
        btnHome2Layout.setHorizontalGroup(
            btnHome2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnHome2Layout.createSequentialGroup()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelAdiFilme, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(121, Short.MAX_VALUE))
        );
        btnHome2Layout.setVerticalGroup(
            btnHome2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
            .addComponent(labelAdiFilme, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        btnHome3.setBackground(new java.awt.Color(7, 34, 39));

        labelAdcUsuario.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        labelAdcUsuario.setForeground(new java.awt.Color(255, 255, 255));
        labelAdcUsuario.setText("Adicionar Usuário");
        labelAdcUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelAdcUsuarioMouseClicked(evt);
            }
        });

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/add-user-2-32.png"))); // NOI18N

        javax.swing.GroupLayout btnHome3Layout = new javax.swing.GroupLayout(btnHome3);
        btnHome3.setLayout(btnHome3Layout);
        btnHome3Layout.setHorizontalGroup(
            btnHome3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnHome3Layout.createSequentialGroup()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelAdcUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(121, Short.MAX_VALUE))
        );
        btnHome3Layout.setVerticalGroup(
            btnHome3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
            .addComponent(labelAdcUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        btnHome4.setBackground(new java.awt.Color(7, 34, 39));

        LabelDesconectar.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        LabelDesconectar.setForeground(new java.awt.Color(255, 255, 255));
        LabelDesconectar.setText("Desconectar");
        LabelDesconectar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LabelDesconectarMouseClicked(evt);
            }
        });

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/power-4-32.png"))); // NOI18N

        javax.swing.GroupLayout btnHome4Layout = new javax.swing.GroupLayout(btnHome4);
        btnHome4.setLayout(btnHome4Layout);
        btnHome4Layout.setHorizontalGroup(
            btnHome4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnHome4Layout.createSequentialGroup()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LabelDesconectar, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(109, Short.MAX_VALUE))
        );
        btnHome4Layout.setVerticalGroup(
            btnHome4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
            .addComponent(LabelDesconectar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout painelBotoesLayout = new javax.swing.GroupLayout(painelBotoes);
        painelBotoes.setLayout(painelBotoesLayout);
        painelBotoesLayout.setHorizontalGroup(
            painelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nomeFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelBotoesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
            .addGroup(painelBotoesLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(painelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnHome4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHome3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHome2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHome1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelBotoesLayout.setVerticalGroup(
            painelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBotoesLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(nomeFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnHome1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnHome2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnHome3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnHome4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(119, Short.MAX_VALUE))
        );

        jPanel1.add(painelBotoes, java.awt.BorderLayout.WEST);

        javax.swing.GroupLayout jDktopTelasLayout = new javax.swing.GroupLayout(jDktopTelas);
        jDktopTelas.setLayout(jDktopTelasLayout);
        jDktopTelasLayout.setHorizontalGroup(
            jDktopTelasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        jDktopTelasLayout.setVerticalGroup(
            jDktopTelasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 604, Short.MAX_VALUE)
        );

        jPanel1.add(jDktopTelas, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void labelHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelHomeMouseClicked
        // TODO add your handling code here:
        VendaIngress telaHome = new VendaIngress();
        telaHome.setSize(800, 800);//Aqui onde muda o tamanho da tela
        telaHome.setLocation(0, 0);

        jDktopTelas.removeAll();
        jDktopTelas.add(telaHome, BorderLayout.CENTER);
        jDktopTelas.revalidate();
        jDktopTelas.repaint();


    }//GEN-LAST:event_labelHomeMouseClicked

    private void label_Infor_VendaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_Infor_VendaMouseClicked
        // TODO add your handling code here:
        InformVenda telaHome = new InformVenda();
        telaHome.setSize(800, 800);//Aqui onde muda o tamanho da tela
        telaHome.setLocation(0, 0);

        jDktopTelas.removeAll();
        jDktopTelas.add(telaHome, BorderLayout.CENTER);
        jDktopTelas.revalidate();
        jDktopTelas.repaint();


    }//GEN-LAST:event_label_Infor_VendaMouseClicked

    private void labelAdiFilmeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelAdiFilmeMouseClicked
        // TODO add your handling code here:

        CadastrarFilme telaHome = new CadastrarFilme();
        telaHome.setSize(800, 800);//Aqui onde muda o tamanho da tela
        telaHome.setLocation(0, 0);

        jDktopTelas.removeAll();
        jDktopTelas.add(telaHome, BorderLayout.CENTER);
        jDktopTelas.revalidate();
        jDktopTelas.repaint();


    }//GEN-LAST:event_labelAdiFilmeMouseClicked

    private void labelAdcUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelAdcUsuarioMouseClicked
        // TODO add your handling code here:

        CadastrarUsuario telaHome = new CadastrarUsuario();
        telaHome.setSize(800, 800);//Aqui onde muda o tamanho da tela
        telaHome.setLocation(0, 0);

        jDktopTelas.removeAll();
        jDktopTelas.add(telaHome, BorderLayout.CENTER);
        jDktopTelas.revalidate();
        jDktopTelas.repaint();
    }//GEN-LAST:event_labelAdcUsuarioMouseClicked

    private void LabelDesconectarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelDesconectarMouseClicked
        // TODO add your handling code here:

        int sair = JOptionPane.showConfirmDialog(null, "Tem Certeza que deseza sair?", "" , JOptionPane.YES_NO_OPTION);
        if (sair == JOptionPane.YES_OPTION) {
            Login tela = new Login();
            tela.setVisible(true);
            dispose();
                    
                    
                       
        }


    }//GEN-LAST:event_LabelDesconectarMouseClicked

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HomeGerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeGerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeGerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeGerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeGerente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelDesconectar;
    private javax.swing.JPanel btnHome;
    private javax.swing.JPanel btnHome1;
    private javax.swing.JPanel btnHome2;
    private javax.swing.JPanel btnHome3;
    private javax.swing.JPanel btnHome4;
    private javax.swing.JDesktopPane jDktopTelas;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labelAdcUsuario;
    private javax.swing.JLabel labelAdiFilme;
    private javax.swing.JLabel labelHome;
    private javax.swing.JLabel label_Infor_Venda;
    public static javax.swing.JLabel nomeFuncionario;
    private javax.swing.JPanel painelBotoes;
    // End of variables declaration//GEN-END:variables

    public void adicionarTelaHome() {
        VendaIngress telaHome = new VendaIngress();
        telaHome.setSize(800, 800);//Aqui onde muda o tamanho da tela
        telaHome.setLocation(0, 0);

        jDktopTelas.removeAll();
        jDktopTelas.add(telaHome, BorderLayout.CENTER);
        jDktopTelas.revalidate();
        jDktopTelas.repaint();




    }

}
