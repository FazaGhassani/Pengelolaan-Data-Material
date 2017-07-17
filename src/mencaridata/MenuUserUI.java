package mencaridata;

import java.awt.Image;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
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
        jMenu_Profil.setText(this.Nama);
        jLabel_image.setIcon(new ImageIcon(new ImageIcon(getClass()
                .getResource("/images/granaryicon.png")).getImage().getScaledInstance(200, 130, Image.SCALE_SMOOTH)));
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel_image = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu_Profil = new javax.swing.JMenu();
        jMenuItem_UbahProfil = new javax.swing.JMenuItem();
        jMenuItem_Keluar = new javax.swing.JMenuItem();
        jMenu_DataMaster = new javax.swing.JMenu();
        jMenuItem_KelolaDataMaster = new javax.swing.JMenuItem();
        jMenu_RAB = new javax.swing.JMenu();
        jMenuItem_KelolaRAB = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1366, 768));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Menu Utama", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Selamat Datang, User");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Silahkan pilih menu pada menu bar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_image, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 826, Short.MAX_VALUE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(jLabel2))
                    .addComponent(jLabel_image, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(558, Short.MAX_VALUE))
        );

        jMenu_Profil.setText("User");

        jMenuItem_UbahProfil.setText("Ubah Profil");
        jMenuItem_UbahProfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_UbahProfilActionPerformed(evt);
            }
        });
        jMenu_Profil.add(jMenuItem_UbahProfil);

        jMenuItem_Keluar.setText("Keluar");
        jMenuItem_Keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_KeluarActionPerformed(evt);
            }
        });
        jMenu_Profil.add(jMenuItem_Keluar);

        jMenuBar1.add(jMenu_Profil);

        jMenu_DataMaster.setText("Data Master");

        jMenuItem_KelolaDataMaster.setText("Kelola Data Master");
        jMenuItem_KelolaDataMaster.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_KelolaDataMasterActionPerformed(evt);
            }
        });
        jMenu_DataMaster.add(jMenuItem_KelolaDataMaster);

        jMenuBar1.add(jMenu_DataMaster);

        jMenu_RAB.setText("RAB");

        jMenuItem_KelolaRAB.setText("Kelola RAB");
        jMenuItem_KelolaRAB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_KelolaRABActionPerformed(evt);
            }
        });
        jMenu_RAB.add(jMenuItem_KelolaRAB);

        jMenuBar1.add(jMenu_RAB);

        setJMenuBar(jMenuBar1);

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

    private void jMenuItem_UbahProfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_UbahProfilActionPerformed
        EditUserUI ui = new EditUserUI(this.Nama,this.Username,this.Pass);
        ui.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem_UbahProfilActionPerformed

    private void jMenuItem_KeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_KeluarActionPerformed
        int result = JOptionPane.showConfirmDialog(null,
            "Anda yakin akan keluar?","Konfirmasi keluar",
            JOptionPane.YES_NO_CANCEL_OPTION);
        if (result == JOptionPane.YES_OPTION){
            HalamanUtamaUI a = new HalamanUtamaUI();
            a.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_jMenuItem_KeluarActionPerformed

    private void jMenuItem_KelolaDataMasterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_KelolaDataMasterActionPerformed
        EditDataMasterMenuUI ui = new EditDataMasterMenuUI(this.Nama, this.Username, this.Pass);
        ui.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem_KelolaDataMasterActionPerformed

    private void jMenuItem_KelolaRABActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_KelolaRABActionPerformed
        Name_SearcherUI ui = null;
        try {
            ui = new Name_SearcherUI(this.Nama,this.Username,this.Pass);
        } catch (IOException ex) {
            Logger.getLogger(MenuUserUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        ui.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem_KelolaRABActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel_image;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem_KelolaDataMaster;
    private javax.swing.JMenuItem jMenuItem_KelolaRAB;
    private javax.swing.JMenuItem jMenuItem_Keluar;
    private javax.swing.JMenuItem jMenuItem_UbahProfil;
    private javax.swing.JMenu jMenu_DataMaster;
    private javax.swing.JMenu jMenu_Profil;
    private javax.swing.JMenu jMenu_RAB;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
