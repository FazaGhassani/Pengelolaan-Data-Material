package mencaridata;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class MenuUserUI extends javax.swing.JFrame {

    private String Username;
    private String Pass;
    private String Nama;

    public MenuUserUI(String nama, String username, String pass) {
        initComponents();
        this.Username = username;
        this.Pass =pass;
        this.Nama = nama;
        jLabel1.setText("Selamat Datang, "+this.Nama+" !");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton_EditProfile = new javax.swing.JButton();
        jButton_KeloladataMaster = new javax.swing.JButton();
        jButton_KelolaRAB = new javax.swing.JButton();
        jButton_Keluar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Menu Utama", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jButton_EditProfile.setText("Ubah Profil");
        jButton_EditProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_EditProfileActionPerformed(evt);
            }
        });

        jButton_KeloladataMaster.setText("Kelola Data Master");

        jButton_KelolaRAB.setText("Kelola RAB");
        jButton_KelolaRAB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_KelolaRABActionPerformed(evt);
            }
        });

        jButton_Keluar.setText("Keluar");
        jButton_Keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_KeluarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Selamat Datang, User");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Silahkan pilih menu dibawah ini:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jButton_Keluar, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_KelolaRAB, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_KeloladataMaster, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_EditProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(10, 10, 10)))
                .addContainerGap(92, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton_EditProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_KeloladataMaster, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_KelolaRAB, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Keluar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_KeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_KeluarActionPerformed
        int result = JOptionPane.showConfirmDialog(null,
                "Anda yakin akan keluar?","Konfirmasi keluar", 
        JOptionPane.YES_NO_CANCEL_OPTION);
        if (result == JOptionPane.YES_OPTION){
            HalamanUtamaUI a = new HalamanUtamaUI();
            a.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_jButton_KeluarActionPerformed

    private void jButton_KelolaRABActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_KelolaRABActionPerformed
        Name_SearcherUI ui = null;
        try {
            ui = new Name_SearcherUI(this.Nama,this.Username,this.Pass);
        } catch (IOException ex) {
            Logger.getLogger(MenuUserUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        ui.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton_KelolaRABActionPerformed

    private void jButton_EditProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_EditProfileActionPerformed
        EditUserUI ui = new EditUserUI(this.Nama,this.Username,this.Pass);
        ui.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton_EditProfileActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_EditProfile;
    private javax.swing.JButton jButton_KelolaRAB;
    private javax.swing.JButton jButton_KeloladataMaster;
    private javax.swing.JButton jButton_Keluar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
