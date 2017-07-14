package mencaridata;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class EditDataMasterDeleteEditUI extends javax.swing.JFrame {

    DefaultTableModel model1;
    //DefaultTableModel model2;
    DefaultTableModel model3;
    private String Username; private String Pass; private String Nama;
    private String material; private int volume; private String unit; private int harga;
    private int pili = 0;
    
    public EditDataMasterDeleteEditUI(String nama, String username, String pass) throws IOException {
        //String nama, String username, String pass
        initComponents();
        model1 = (DefaultTableModel) Tabel_HasilCari.getModel();
        model3 = (DefaultTableModel) Tabel_HasilCari1.getModel();
        this.Username = username;
        this.Pass =pass;
        this.Nama = nama;
        
        //MENAMPILKAN SEMUA DATA
        SHOWALLDATA();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel6 = new javax.swing.JPanel();
        jTextField_CariNama = new javax.swing.JTextField();
        jButton_Cari = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabel_HasilCari = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        jTextField_CariNama1 = new javax.swing.JTextField();
        jButton_Cari1 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        Tabel_HasilCari1 = new javax.swing.JTable();
        jButton_pilih = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jButton_ubah = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton_hapus = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField_jnspekerjaan = new javax.swing.JTextField();
        jTextField_Volume = new javax.swing.JTextField();
        jTextField_unit = new javax.swing.JTextField();
        jTextField_hargasatuan = new javax.swing.JTextField();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem_Profil = new javax.swing.JMenuItem();
        jMenuItem_Keluar = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem_eDataMaster = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1366, 768));
        setSize(new java.awt.Dimension(1366, 768));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ubah / Hapus Data", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jTabbedPane2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jTextField_CariNama.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_CariNamaKeyPressed(evt);
            }
        });

        jButton_Cari.setText("Cari");
        jButton_Cari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_CariActionPerformed(evt);
            }
        });

        Tabel_HasilCari.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Uraian Pekerjaan", "Volume", "Unit/Satuan", "Harga Satuan"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(Tabel_HasilCari);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField_CariNama, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Cari)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 667, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_CariNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Cari))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 497, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Data Harga PO", jPanel6);

        jTextField_CariNama1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_CariNama1KeyPressed(evt);
            }
        });

        jButton_Cari1.setText("Cari");
        jButton_Cari1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Cari1ActionPerformed(evt);
            }
        });

        Tabel_HasilCari1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Uraian Pekerjaan", "Volume", "Unit/Satuan", "Harga Satuan"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(Tabel_HasilCari1);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField_CariNama1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Cari1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 667, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_CariNama1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Cari1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 497, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Data Harga Material", jPanel7);

        jButton_pilih.setText("Pilih");
        jButton_pilih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_pilihActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton_pilih, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 569, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_pilih, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 77, Short.MAX_VALUE))
        );

        jPanel5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jButton_ubah.setText("Ubah");
        jButton_ubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ubahActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Uraian Pekerjaan");

        jButton_hapus.setText("Hapus");
        jButton_hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_hapusActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Volume :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Unit/Set :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Harga Satuan :");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("/Jenis Material :");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(168, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jButton_ubah, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_hapus, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(116, 116, 116))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel1)
                            .addComponent(jLabel6)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextField_Volume, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_unit, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_hargasatuan, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_jnspekerjaan, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(157, 157, 157))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField_jnspekerjaan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField_Volume, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField_unit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField_hargasatuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_ubah, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_hapus, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(175, 175, 175))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jMenu3.setText("File");

        jMenuItem_Profil.setText("Profil");
        jMenuItem_Profil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_ProfilActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem_Profil);

        jMenuItem_Keluar.setText("Keluar");
        jMenuItem_Keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_KeluarActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem_Keluar);

        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit...");

        jMenuItem_eDataMaster.setText("Edit Data Master");
        jMenuItem_eDataMaster.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_eDataMasterActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem_eDataMaster);

        jMenuBar2.add(jMenu4);

        setJMenuBar(jMenuBar2);

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

    private void jButton_ubahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ubahActionPerformed
        //data yang lama di compare sama data yang ada di excel
        //kalau ketemu, replace semua datanya
        PengelolaData a = null;
        try {
            a = new PengelolaData(pili);
        } catch (IOException ex) {
            Logger.getLogger(EditDataMasterDeleteEditUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String v = jTextField_Volume.getText();
        v = v.replace(".0", "");
        
        String h = jTextField_hargasatuan.getText();
        h = h.replace(".", "");
        
        a.ubahData(this.material, this.volume, this.unit, this.harga, 
                jTextField_jnspekerjaan.getText(), Integer.parseInt(v), 
                jTextField_unit.getText(), Integer.parseInt(h));
        
        SHOWALLDATA();
    }//GEN-LAST:event_jButton_ubahActionPerformed

    private void jButton_hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_hapusActionPerformed
        int result = JOptionPane.showConfirmDialog(null,
                "Anda yakin akan menghapus ?", "",
                JOptionPane.YES_NO_CANCEL_OPTION);
        if (result == JOptionPane.YES_OPTION) {
            //cek data ada apa nggak
            PengelolaData a =  null;
            
            try {
                a = new PengelolaData(pili);
            } catch (IOException ex) {
                Logger.getLogger(EditDataMasterDeleteEditUI.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            boolean putusan = a.cariData(material, volume, unit, harga);
            if(putusan == true){
                //hapus datanya
                a.deleteData();
                SHOWALLDATA();
            }else{
                //kalau datanya nggak ketemu
                JOptionPane.showMessageDialog(null, "Data tidak ketemu","",JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButton_hapusActionPerformed

    private void jTextField_CariNamaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_CariNamaKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            //make a artificial button to creating actionevent
            Button buttone = new Button();
            //creating an actionevent
            ActionEvent e = new ActionEvent((Object) buttone, ActionEvent.ACTION_PERFORMED,"");
            //calling hitung fx
            jButton_CariActionPerformed(e);
        }
    }//GEN-LAST:event_jTextField_CariNamaKeyPressed

    private void jButton_CariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_CariActionPerformed
        if (jTextField_CariNama.getText().equals("")) {

            //menghapus data di tabel hasil pencarian kalau ada isinya
            if (model1.getRowCount() > 0) {
                while (model1.getRowCount() > 0) {
                    model1.removeRow(0);
                }
            }

            showalldata show = null;
            try {
                show = new showalldata(1);
            } catch (IOException ex) {
                Logger.getLogger(EditDataMasterDeleteEditUI.class.getName()).log(Level.SEVERE, null, ex);
            }

            String[][] data1 = show.show(show.getmySheet(), show.getmyWorkBook());
            for (int row = 0; row < data1.length; row++) {
                if (data1[row][0] != null) {
                    model1.addRow(data1[row]);
                    row++;
                }
            }
            JOptionPane.showMessageDialog(null, "MASUKAN KATA KUNCI PENCARIAN TERLEBIH DAHULU", " ", JOptionPane.WARNING_MESSAGE);
        }else{
            //mencari nama dr kotak Cari_Nama
            String nama = jTextField_CariNama.getText();
            Name_Searcher a = null;

            try {
                a = new Name_Searcher(1);
            } catch (IOException ex) {
                Logger.getLogger(Name_SearcherUI.class.getName()).log(Level.SEVERE, null, ex);
            }

            //ditampung di string ini
            String s[][] = a.Search_by_name(a.getmySheet(), a.getmyWorkBook(), nama);

            //menghapus data di tabel hasil pencarian kalau ada isinya
            if (model1.getRowCount() > 0) {
                while (model1.getRowCount() > 0) {
                    model1.removeRow(0);
                }
            }

            //mencoba menampilkan hasil pencarian
            if (s[0][0] == null) {
                JOptionPane.showMessageDialog(null, "TIDAK MENEMUKAN DATA YANG COCOK", " ", JOptionPane.WARNING_MESSAGE);
            } else {
                //tampilkan nama yang sesuai di tabel
                for (int row = 0; row < s.length; row++) {
                    if (s[row][0] != null) {
                        model1.addRow(s[row]);
                        row++;
                    }
                }
            }
        }
    }//GEN-LAST:event_jButton_CariActionPerformed

    private void jTextField_CariNama1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_CariNama1KeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            //make a artificial button to creating actionevent
            Button buttone = new Button();
            //creating an actionevent
            ActionEvent e = new ActionEvent((Object) buttone, ActionEvent.ACTION_PERFORMED,"");
            //calling hitung fx
            jButton_Cari1ActionPerformed(e);
        }
    }//GEN-LAST:event_jTextField_CariNama1KeyPressed

    private void jButton_Cari1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Cari1ActionPerformed
        if (jTextField_CariNama1.getText().equals("")) {

            //menghapus data di tabel hasil pencarian kalau ada isinya
            if (model3.getRowCount() > 0) {
                while (model3.getRowCount() > 0) {
                    model3.removeRow(0);
                }
            }

            showalldata show = null;
            try {
                show = new showalldata(2);
            } catch (IOException ex) {
                Logger.getLogger(Name_SearcherUI.class.getName()).log(Level.SEVERE, null, ex);
            }

            String[][] data1 = show.show(show.getmySheet(), show.getmyWorkBook());
            for (int row = 0; row < data1.length; row++) {
                if (data1[row][0] != null) {
                    model3.addRow(data1[row]);
                    row++;
                }
            }
            JOptionPane.showMessageDialog(null, "MASUKAN KATA KUNCI PENCARIAN TERLEBIH DAHULU", " ", JOptionPane.WARNING_MESSAGE);
        }else{
            //mencari nama dr kotak Cari_Nama
            String nama = jTextField_CariNama1.getText();
            Name_Searcher a = null;

            try {
                a = new Name_Searcher(2);
            } catch (IOException ex) {
                Logger.getLogger(Name_SearcherUI.class.getName()).log(Level.SEVERE, null, ex);
            }

            //ditampung di string ini
            String s[][] = a.Search_by_name(a.getmySheet(), a.getmyWorkBook(), nama);

            //menghapus data di tabel hasil pencarian kalau ada isinya
            if (model3.getRowCount() > 0) {
                while (model3.getRowCount() > 0) {
                    model3.removeRow(0);
                }
            }

            //mencoba menampilkan hasil pencarian
            if (s[0][0] == null) {
                JOptionPane.showMessageDialog(null, "TIDAK MENEMUKAN DATA YANG COCOK", " ", JOptionPane.WARNING_MESSAGE);
            } else {
                //tampilkan nama yang sesuai di tabel
                for (int row = 0; row < s.length; row++) {
                    if (s[row][0] != null) {
                        model3.addRow(s[row]);
                        row++;
                    }
                }
            }
        }
    }//GEN-LAST:event_jButton_Cari1ActionPerformed

    private void jMenuItem_ProfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_ProfilActionPerformed
        MenuUserUI ui = new MenuUserUI(this.Nama,this.Username,this.Pass);
        ui.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem_ProfilActionPerformed

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

    private void jMenuItem_eDataMasterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_eDataMasterActionPerformed
        EditDataMasterMenuUI ui = new EditDataMasterMenuUI(this.Nama, this.Username, this.Pass);
        ui.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem_eDataMasterActionPerformed

    private void jButton_pilihActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_pilihActionPerformed
        if (Tabel_HasilCari.getSelectedRow() != -1) {
            
            Vector pilihan = (Vector) model1.getDataVector().elementAt(Tabel_HasilCari.getSelectedRow());
            
            jTextField_jnspekerjaan.setText((String)pilihan.get(0));
            jTextField_Volume.setText((String)pilihan.get(1));
            jTextField_unit.setText((String)pilihan.get(2));
            jTextField_hargasatuan.setText((String)pilihan.get(3));
            
            this.material = (String)pilihan.get(0);
            String v = (String)pilihan.get(1); 
            if(v.equals("1.0")) v=v.replace(".0", "");
            this.volume = Integer.parseInt(v);
            this.unit = (String)pilihan.get(2);
            String h = (String)pilihan.get(3);
            this.harga = Integer.parseInt(h.replace(".", ""));
            if(jPanel6.isShowing()){
                pili = 0;
            }else if(jPanel7.isShowing()){
                pili = 1;
            }
        } else {
            JOptionPane.showMessageDialog(null, "SILAHKAN PILIH MATERIAL YANG AKAN DIUBAH", " ", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButton_pilihActionPerformed

    //menampilkan semua 
    private void SHOWALLDATA() {
        
        //menghapus data di tabel hasil pencarian kalau ada isinya
        if (model1.getRowCount() > 0 || model3.getRowCount() > 0) {
            while (model1.getRowCount() > 0) {
                model1.removeRow(0);
            }
            while (model3.getRowCount() > 0) {
                model3.removeRow(0);
            }
        }
        
        //menampilkan semua data di tab 1
        showalldata show = null;
        try {
            show = new showalldata(1);
        } catch (IOException ex) {
            Logger.getLogger(EditDataMasterDeleteEditUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        String[][] data1 = show.show(show.getmySheet(), show.getmyWorkBook());
        for (int row = 0; row < data1.length; row++) {
            if (data1[row][0] != null) {
                model1.addRow(data1[row]);
                row++;
            }
        }

        //menampilkan semua data di tab 2
        try {
            show = new showalldata(2);
        } catch (IOException ex) {
            Logger.getLogger(EditDataMasterDeleteEditUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        String[][] data2 = show.show(show.getmySheet(), show.getmyWorkBook());
        for (int row = 0; row < data2.length; row++) {
            if (data1[row][0] != null) {
                model3.addRow(data2[row]);
                row++;
            }
        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabel_HasilCari;
    private javax.swing.JTable Tabel_HasilCari1;
    private javax.swing.JButton jButton_Cari;
    private javax.swing.JButton jButton_Cari1;
    private javax.swing.JButton jButton_hapus;
    private javax.swing.JButton jButton_pilih;
    private javax.swing.JButton jButton_ubah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem_Keluar;
    private javax.swing.JMenuItem jMenuItem_Profil;
    private javax.swing.JMenuItem jMenuItem_eDataMaster;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTextField jTextField_CariNama;
    private javax.swing.JTextField jTextField_CariNama1;
    private javax.swing.JTextField jTextField_Volume;
    private javax.swing.JTextField jTextField_hargasatuan;
    private javax.swing.JTextField jTextField_jnspekerjaan;
    private javax.swing.JTextField jTextField_unit;
    // End of variables declaration//GEN-END:variables
}
