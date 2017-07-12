package mencaridata;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class LoginUI extends javax.swing.JFrame {

    public LoginUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextField_Username = new javax.swing.JTextField();
        jLabel_Username = new javax.swing.JLabel();
        jLabel_Password = new javax.swing.JLabel();
        jPasswordField = new javax.swing.JPasswordField();
        jButton_Confirm = new javax.swing.JButton();
        jButton_Kembali = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Masuk", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N

        jLabel_Username.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_Username.setText("Username :");

        jLabel_Password.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_Password.setText("Password :");

        jPasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordFieldActionPerformed(evt);
            }
        });

        jButton_Confirm.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_Confirm.setText("Confirm");
        jButton_Confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ConfirmActionPerformed(evt);
            }
        });

        jButton_Kembali.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
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
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel_Username)
                            .addComponent(jLabel_Password))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPasswordField)
                            .addComponent(jTextField_Username, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton_Confirm, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton_Kembali, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_Username)
                    .addComponent(jTextField_Username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_Password)
                    .addComponent(jPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Kembali, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Confirm, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(164, Short.MAX_VALUE))
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

    private void jPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordFieldActionPerformed

    private void jButton_KembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_KembaliActionPerformed
        HalamanUtamaUI ui = new HalamanUtamaUI();
        ui.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton_KembaliActionPerformed

    private void jButton_ConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ConfirmActionPerformed
        PengelolaUser a=null;

        try {
            a = new PengelolaUser();
        } catch (IOException ex) {
            Logger.getLogger(LoginUI.class.getName()).log(Level.SEVERE, null, ex);
        }

        boolean login = a.Login(jTextField_Username.getText(), jPasswordField.getText());

        if(login == true){
            JOptionPane.showMessageDialog(null, "Selamat datang: "+jTextField_Username.getText(), "", JOptionPane.INFORMATION_MESSAGE);
            MenuUserUI ui = null;
            ui = new MenuUserUI(a.getNama(),a.getUsrnm(),a.getPass());
            ui.setVisible(true);
            this.setVisible(false);
        }else{
            JOptionPane.showMessageDialog(null, "USERNAME ATAU PASSWORD SALAH", "", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButton_ConfirmActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Confirm;
    private javax.swing.JButton jButton_Kembali;
    private javax.swing.JLabel jLabel_Password;
    private javax.swing.JLabel jLabel_Username;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField;
    private javax.swing.JTextField jTextField_Username;
    // End of variables declaration//GEN-END:variables
}
