package mencaridata;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class DaftarUI extends javax.swing.JFrame {


    public DaftarUI() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel_UlangPassword = new javax.swing.JLabel();
        jTextField_Nama = new javax.swing.JTextField();
        jTextField_Username = new javax.swing.JTextField();
        jLabel_Nama = new javax.swing.JLabel();
        jLabel_Username = new javax.swing.JLabel();
        jLabel_Password = new javax.swing.JLabel();
        jPasswordField_Password1 = new javax.swing.JPasswordField();
        jPasswordField_Password2 = new javax.swing.JPasswordField();
        jButton_Daftar = new javax.swing.JButton();
        jButton_Kembali = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(400, 429));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Daftar", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N

        jLabel_UlangPassword.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_UlangPassword.setText("Ulang Password :");

        jLabel_Nama.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_Nama.setText("Nama :");

        jLabel_Username.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_Username.setText("Username :");

        jLabel_Password.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_Password.setText("Password :");

        jButton_Daftar.setText("Daftar");
        jButton_Daftar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_DaftarActionPerformed(evt);
            }
        });

        jButton_Kembali.setText("Kembali");
        jButton_Kembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_KembaliActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel_Password)
                    .addComponent(jLabel_UlangPassword)
                    .addComponent(jLabel_Username)
                    .addComponent(jLabel_Nama))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField_Nama)
                    .addComponent(jTextField_Username)
                    .addComponent(jPasswordField_Password1)
                    .addComponent(jPasswordField_Password2))
                .addGap(73, 73, 73))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jButton_Daftar, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton_Kembali, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_Nama)
                    .addComponent(jTextField_Nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_Username)
                    .addComponent(jTextField_Username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_Password)
                    .addComponent(jPasswordField_Password1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_UlangPassword)
                    .addComponent(jPasswordField_Password2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Daftar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Kembali, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(125, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_DaftarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_DaftarActionPerformed
           String pass = jPasswordField_Password1.getText();
           String uPass = jPasswordField_Password2.getText();
           PengelolaUser a = null;
           
           if(pass.equals(uPass)){
               JOptionPane.showMessageDialog(null,"Memuat ...","",JOptionPane.INFORMATION_MESSAGE);
               try {
                   a = new PengelolaUser();
               } catch (IOException ex) {
                   Logger.getLogger(DaftarUI.class.getName()).log(Level.SEVERE, null, ex);
               }
               
               boolean hasil = a.Daftar(jTextField_Nama.getText(),jTextField_Username.getText(),jPasswordField_Password1.getText());
               
               if(hasil == true){
                   JOptionPane.showMessageDialog(null,"Pendaftaran Berhasil","",JOptionPane.INFORMATION_MESSAGE);
                   HalamanUtamaUI ui = new HalamanUtamaUI();
                   ui.setVisible(true);
                   this.setVisible(false);
               }else{
                   JOptionPane.showMessageDialog(null,"Pendaftaran gagal, Nama username mungkin sudah ada","",JOptionPane.INFORMATION_MESSAGE);
               }
               
           }else{
               JOptionPane.showMessageDialog(null, "CEK KEMBALI PASSWORD YANG DIINPUT", " ", JOptionPane.WARNING_MESSAGE);
           }
           
    }//GEN-LAST:event_jButton_DaftarActionPerformed

    private void jButton_KembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_KembaliActionPerformed
        HalamanUtamaUI ui = new HalamanUtamaUI();
        ui.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton_KembaliActionPerformed


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
            java.util.logging.Logger.getLogger(DaftarUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DaftarUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DaftarUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DaftarUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DaftarUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Daftar;
    private javax.swing.JButton jButton_Kembali;
    private javax.swing.JLabel jLabel_Nama;
    private javax.swing.JLabel jLabel_Password;
    private javax.swing.JLabel jLabel_UlangPassword;
    private javax.swing.JLabel jLabel_Username;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField_Password1;
    private javax.swing.JPasswordField jPasswordField_Password2;
    private javax.swing.JTextField jTextField_Nama;
    private javax.swing.JTextField jTextField_Username;
    // End of variables declaration//GEN-END:variables
}
