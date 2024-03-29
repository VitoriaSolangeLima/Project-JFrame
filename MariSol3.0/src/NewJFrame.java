
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author vitor
 */
public class NewJFrame extends javax.swing.JFrame {

    int idade;

    public NewJFrame() {
        initComponents();
        lblResp.setVisible(false);
        txtResp.setVisible(false);
        lblResp1.setVisible(false);
        lblNresp.setVisible(false);
        panDados.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        panDados = new javax.swing.JPanel();
        btnVoltar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblResp = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        lblData = new javax.swing.JLabel();
        lblSerie = new javax.swing.JLabel();
        lblcurso = new javax.swing.JLabel();
        lblNresp = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        panCadastro = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtData = new javax.swing.JFormattedTextField();
        btnCadastro = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        radEletro = new javax.swing.JRadioButton();
        radTI = new javax.swing.JRadioButton();
        txtNome = new javax.swing.JTextField();
        txtSerie = new javax.swing.JTextField();
        lblResp1 = new javax.swing.JLabel();
        txtResp = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panDados.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                panDadosAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        panDados.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnVoltar.setBackground(new java.awt.Color(51, 204, 255));
        btnVoltar.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnVoltar.setForeground(new java.awt.Color(255, 255, 255));
        btnVoltar.setText("VOLTAR");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        panDados.add(btnVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 340, -1, -1));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("NOME:");
        panDados.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("DATA DE NASCIMENTO:");
        panDados.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("CURSO:");
        panDados.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 70, -1));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("SÉRIE:");
        panDados.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 70, -1));

        lblResp.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lblResp.setForeground(new java.awt.Color(255, 255, 255));
        lblResp.setText("NOME DO RESPONSAVEL:");
        panDados.add(lblResp, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 220, -1));

        lblNome.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lblNome.setForeground(new java.awt.Color(255, 255, 255));
        panDados.add(lblNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 642, -1));

        lblData.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lblData.setForeground(new java.awt.Color(255, 255, 255));
        panDados.add(lblData, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, 116, -1));

        lblSerie.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lblSerie.setForeground(new java.awt.Color(255, 255, 255));
        panDados.add(lblSerie, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 140, -1));

        lblcurso.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lblcurso.setForeground(new java.awt.Color(255, 255, 255));
        panDados.add(lblcurso, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 231, -1));

        lblNresp.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lblNresp.setForeground(new java.awt.Color(255, 255, 255));
        lblNresp.setText("jLabel14");
        panDados.add(lblNresp, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, 477, -1));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("DADOS CADASTRADOS");
        panDados.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, 253, -1));

        jButton2.setBackground(new java.awt.Color(51, 204, 255));
        jButton2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("SAIR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        panDados.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 340, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/canva/FundoJframe.jpg"))); // NOI18N
        jLabel10.setText("jLabel10");
        panDados.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 780, -1));

        panCadastro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("NOME:");
        panCadastro.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 51, -1));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("DATA DE NASCIMENTO:");
        panCadastro.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, -1, -1));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("SÉRIE:");
        panCadastro.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 48, 20));

        txtData.setBackground(new java.awt.Color(204, 255, 255));
        txtData.setForeground(new java.awt.Color(0, 0, 0));
        try {
            txtData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtData.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtData.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDataFocusLost(evt);
            }
        });
        panCadastro.add(txtData, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, 126, -1));

        btnCadastro.setBackground(new java.awt.Color(51, 204, 255));
        btnCadastro.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnCadastro.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastro.setText("CADASTRAR");
        btnCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastroActionPerformed(evt);
            }
        });
        panCadastro.add(btnCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 320, -1, -1));

        jPanel1.setBackground(new java.awt.Color(0, 255, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "SELECIONE SEU CURSO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setAutoscrolls(true);

        buttonGroup1.add(radEletro);
        radEletro.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        radEletro.setForeground(new java.awt.Color(255, 255, 255));
        radEletro.setText("ELETROTÉCNICA");

        buttonGroup1.add(radTI);
        radTI.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        radTI.setForeground(new java.awt.Color(255, 255, 255));
        radTI.setText("INFORMÁTICA");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(radEletro, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(radTI, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radEletro)
                    .addComponent(radTI))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        panCadastro.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 390, -1));

        txtNome.setBackground(new java.awt.Color(204, 255, 255));
        txtNome.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtNome.setForeground(new java.awt.Color(0, 0, 0));
        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });
        panCadastro.add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 620, -1));

        txtSerie.setBackground(new java.awt.Color(204, 255, 255));
        txtSerie.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtSerie.setForeground(new java.awt.Color(0, 0, 0));
        panCadastro.add(txtSerie, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 71, -1));

        lblResp1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lblResp1.setForeground(new java.awt.Color(255, 255, 255));
        lblResp1.setText("NOME DO RESPONSAVEL:");
        panCadastro.add(lblResp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, -1, -1));

        txtResp.setBackground(new java.awt.Color(204, 255, 255));
        txtResp.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtResp.setForeground(new java.awt.Color(0, 0, 0));
        txtResp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRespActionPerformed(evt);
            }
        });
        panCadastro.add(txtResp, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, 532, -1));

        jButton1.setBackground(new java.awt.Color(51, 204, 255));
        jButton1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("SAIR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        panCadastro.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 320, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/canva/FundoJframe.jpg"))); // NOI18N
        panCadastro.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, 800, 530));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 799, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panDados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(panDados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDataFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDataFocusLost

        Date dataNascimento = null;
        SimpleDateFormat formatodata = new SimpleDateFormat("dd/MM/yyyy");
        formatodata.setLenient(false);
        String date = (txtData.getText());
        try {
            dataNascimento = formatodata.parse(date);
            System.out.println(dataNascimento);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "DATA INVALIDA");
        }
        // CALCULAR IDADE DO USUARIO
        Calendar dataNasc = Calendar.getInstance();
        dataNasc.setTime(dataNascimento);

        Calendar hoje = Calendar.getInstance();
        hoje.getTime();

        idade = hoje.get(Calendar.YEAR) - dataNasc.get(Calendar.YEAR);

        dataNasc.add(Calendar.YEAR, idade);

        if (hoje.before(dataNasc)) {
            idade--;
        }
      
        if (idade < 18) {
            lblResp.setVisible(true);
            txtResp.setVisible(true);
            lblResp1.setVisible(true);
            lblNresp.setVisible(true);
           
        } else {
            lblResp.setVisible(false);
            txtResp.setVisible(false);
            lblResp1.setVisible(false);
            lblNresp.setVisible(false);
        }
    }//GEN-LAST:event_txtDataFocusLost

    private void btnCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastroActionPerformed
        
        // PEGAR OS DADOS INSERIDOS NO PAINEL DE CADASTRO
        String nome = txtNome.getText();
        String resp = txtResp.getText();
        String date = txtData.getText();
        String serie = txtSerie.getText();
        String curso = "";
        if (radEletro.isSelected()) {
            curso = radEletro.getText();

        }
        if (radTI.isSelected()) {
            curso = radTI.getText();

        }
       
        // CADASTRAR SE TODOS OS CAMPOS ESTIVEREM PREENCHIDOS
        System.out.println(idade);
        
        if ((nome.isEmpty()) || (resp.isEmpty() && idade < 18) || (date.isEmpty()) || (serie.isEmpty())) {
            JOptionPane.showMessageDialog(null, "PREENCHA TODOS OS CAMPOS");
        } else {
            // EXIBIR OS DADOS CADASTRADOS
            lblNome.setText(nome);
            lblNresp.setText(resp);
            lblData.setText(date);
            lblSerie.setText(serie);
            lblcurso.setText(curso);
    

            // ALTERAR A VISIBILIDADE BOTÃO VOLTAR E DOS PAINÉIS
            panCadastro.setVisible(false);
            panDados.setVisible(true);
            btnVoltar.setVisible(true);
        }
    }//GEN-LAST:event_btnCadastroActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        // ALTERAR A VISIBILIDADE DOS PAINÉIS
        panCadastro.setVisible(true);
        panDados.setVisible(false);

        // LIMPAR O PAINEL DE CADASTRO
        txtNome.setText(" ");
        txtResp.setText(" ");
        txtSerie.setText(" ");
        txtData.setValue(null);
        buttonGroup1.clearSelection();
        lblResp.setVisible(false);
        txtResp.setVisible(false);
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void txtRespActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRespActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRespActionPerformed

    private void panDadosAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_panDadosAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_panDadosAncestorAdded

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastro;
    private javax.swing.JButton btnVoltar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNresp;
    private javax.swing.JLabel lblResp;
    private javax.swing.JLabel lblResp1;
    private javax.swing.JLabel lblSerie;
    private javax.swing.JLabel lblcurso;
    private javax.swing.JPanel panCadastro;
    private javax.swing.JPanel panDados;
    private javax.swing.JRadioButton radEletro;
    private javax.swing.JRadioButton radTI;
    private javax.swing.JFormattedTextField txtData;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtResp;
    private javax.swing.JTextField txtSerie;
    // End of variables declaration//GEN-END:variables
}
