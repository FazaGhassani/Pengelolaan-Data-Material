package mencaridata;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EditDataMasterMenuUI extends javax.swing.JFrame {

    private String Username;
    private String Pass;
    private String Nama;
    
    public EditDataMasterMenuUI(String nama, String username, String pass) {
        initComponents();
        this.Username = username;
        this.Pass =pass;
        this.Nama = nama;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton_EditData = new javax.swing.JButton();
        jButton_TambahData = new javax.swing.JButton();
        jButton_Kembali = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Edit Data Master", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jButton_EditData.setText("Edit/Delete Data");
        jButton_EditData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_EditDataActionPerformed(evt);
            }
        });

        jButton_TambahData.setText("Tambah Data");
        jButton_TambahData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_TambahDataActionPerformed(evt);
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
                .addGap(83, 83, 83)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton_EditData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton_TambahData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton_Kembali, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE))
                .addContainerGap(102, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addComponent(jButton_TambahData, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton_EditData, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton_Kembali, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(123, Short.MAX_VALUE))
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

    private void jButton_KembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_KembaliActionPerformed
        MenuUserUI ui = new MenuUserUI(this.Nama,this.Username,this.Pass);
        ui.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton_KembaliActionPerformed

    private void jButton_TambahDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_TambahDataActionPerformed
        EditDataMasterTambahUI ui = new EditDataMasterTambahUI(this.Nama,this.Username,this.Pass);
        ui.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton_TambahDataActionPerformed

    private void jButton_EditDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_EditDataActionPerformed
        EditDataMasterDeleteEditUI ui=null;
        try {
            ui = new EditDataMasterDeleteEditUI(this.Nama,this.Username,this.Pass);
        } catch (IOException ex) {
            Logger.getLogger(EditDataMasterMenuUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        ui.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton_EditDataActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_EditData;
    private javax.swing.JButton jButton_Kembali;
    private javax.swing.JButton jButton_TambahData;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
