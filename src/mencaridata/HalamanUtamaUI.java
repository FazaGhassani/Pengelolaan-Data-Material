package mencaridata;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class HalamanUtamaUI extends javax.swing.JFrame {

    /**
     * Creates new form HalamanUtamaUI
     */
    public HalamanUtamaUI() {
        initComponents();
        jLabel_image.setIcon(new ImageIcon(new ImageIcon(getClass()
                .getResource("/images/granaryicon.png")).getImage().getScaledInstance(200, 130, Image.SCALE_SMOOTH)));
        setLocationRelativeTo(null);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton_Masuk = new javax.swing.JButton();
        jButton_Daftar = new javax.swing.JButton();
        jButton_Keluar = new javax.swing.JButton();
        jLabel_image = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton_Masuk.setText("Masuk");
        jButton_Masuk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_MasukActionPerformed(evt);
            }
        });

        jButton_Daftar.setText("Daftar");
        jButton_Daftar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_DaftarActionPerformed(evt);
            }
        });

        jButton_Keluar.setText("Keluar");
        jButton_Keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_KeluarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton_Keluar, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                            .addComponent(jButton_Masuk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton_Daftar, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(jLabel_image, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(106, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(68, Short.MAX_VALUE)
                .addComponent(jLabel_image, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jButton_Masuk, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Daftar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Keluar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_MasukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_MasukActionPerformed
        LoginUI loginGUI = new LoginUI();
        loginGUI.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton_MasukActionPerformed

    private void jButton_DaftarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_DaftarActionPerformed
        DaftarUI DaftarGUI = new DaftarUI();
        DaftarGUI.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton_DaftarActionPerformed

    private void jButton_KeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_KeluarActionPerformed
        int result = JOptionPane.showConfirmDialog(null,
                "Anda yakin akan keluar?","Konfirmasi keluar", 
                JOptionPane.YES_NO_CANCEL_OPTION);
        if (result == JOptionPane.YES_OPTION) System.exit(0);
    }//GEN-LAST:event_jButton_KeluarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Daftar;
    private javax.swing.JButton jButton_Keluar;
    private javax.swing.JButton jButton_Masuk;
    private javax.swing.JLabel jLabel_image;
    // End of variables declaration//GEN-END:variables
}
