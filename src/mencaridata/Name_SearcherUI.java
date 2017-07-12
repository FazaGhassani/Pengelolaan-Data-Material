/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mencaridata;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Locale;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author lenovo
 */
public class Name_SearcherUI extends javax.swing.JFrame {

    /**
     * Creates new form Name_SearcherUI
     */
    DefaultTableModel model1;
    DefaultTableModel model2;
    DefaultTableModel model3;
    private String Username;
    private String Pass;
    private String Nama;

    public Name_SearcherUI(String nama, String username, String pass) throws IOException {
        initComponents();
        model1 = (DefaultTableModel) Tabel_HasilCari.getModel();
        model2 = (DefaultTableModel) jTable_materialpilihan.getModel();
        model3 = (DefaultTableModel) Tabel_HasilCari1.getModel();
        this.Username = username;
        this.Pass =pass;
        this.Nama = nama;

        //menampilkan semua data di tab 1
        showalldata show = new showalldata(1);
        String[][] data1 = show.show(show.getmySheet(), show.getmyWorkBook());
        for (int row = 0; row < data1.length; row++) {
            if (data1[row][0] != null) {
                model1.addRow(data1[row]);
                row++;
            }
        }
        //menampilkan semua data di tab 2
        showalldata show1 = new showalldata(2);
        String[][] data2 = show1.show(show1.getmySheet(), show1.getmyWorkBook());
        for (int row = 0; row < data2.length; row++) {
            if (data1[row][0] != null) {
                model3.addRow(data2[row]);
                row++;
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_hasil = new javax.swing.JPanel();
        jButton_simpankeexcel = new javax.swing.JButton();
        jButton_HapusPilihan = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable_materialpilihan = new javax.swing.JTable();
        jButton_hitung = new javax.swing.JButton();
        jPanel_Pencarian = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jTextField_CariNama = new javax.swing.JTextField();
        jButton_Cari = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabel_HasilCari = new javax.swing.JTable();
        jButton_input = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jTextField_CariNama1 = new javax.swing.JTextField();
        jButton_Cari1 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        Tabel_HasilCari1 = new javax.swing.JTable();
        jButton_input1 = new javax.swing.JButton();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem_Profil = new javax.swing.JMenuItem();
        jMenuItem_Keluar = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem_eDataMaster = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel_hasil.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Data Material", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        jPanel_hasil.setPreferredSize(new java.awt.Dimension(500, 500));

        jButton_simpankeexcel.setText("Simpan ke Excel");
        jButton_simpankeexcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_simpankeexcelActionPerformed(evt);
            }
        });

        jButton_HapusPilihan.setText("Hapus Pilihan");
        jButton_HapusPilihan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_HapusPilihanActionPerformed(evt);
            }
        });

        jTable_materialpilihan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Uraian Pekerjaan", "Volume", "Unit/Satuan", "Harga Satuan", "Sub Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable_materialpilihan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTable_materialpilihanKeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(jTable_materialpilihan);

        jButton_hitung.setText("Hitung");
        jButton_hitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_hitungActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_hasilLayout = new javax.swing.GroupLayout(jPanel_hasil);
        jPanel_hasil.setLayout(jPanel_hasilLayout);
        jPanel_hasilLayout.setHorizontalGroup(
            jPanel_hasilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_hasilLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_hasilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_hasilLayout.createSequentialGroup()
                        .addComponent(jButton_simpankeexcel)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 732, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_hasilLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton_HapusPilihan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_hitung, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel_hasilLayout.setVerticalGroup(
            jPanel_hasilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_hasilLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jButton_simpankeexcel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 565, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_hasilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_HapusPilihan)
                    .addComponent(jButton_hitung))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel_Pencarian.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pencarian", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        jPanel_Pencarian.setPreferredSize(new java.awt.Dimension(500, 500));

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

        jButton_input.setText("Pilih");
        jButton_input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_inputActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextField_CariNama, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_Cari)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 515, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 383, Short.MAX_VALUE)
                        .addComponent(jButton_input, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_CariNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Cari))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 526, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_input)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Data Harga PO", jPanel1);

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

        jButton_input1.setText("Pilih");
        jButton_input1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_input1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jTextField_CariNama1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_Cari1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 515, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton_input1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_CariNama1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Cari1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 522, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_input1)
                .addContainerGap(55, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Data Harga Material dan Pekerja", jPanel2);

        javax.swing.GroupLayout jPanel_PencarianLayout = new javax.swing.GroupLayout(jPanel_Pencarian);
        jPanel_Pencarian.setLayout(jPanel_PencarianLayout);
        jPanel_PencarianLayout.setHorizontalGroup(
            jPanel_PencarianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_PencarianLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel_PencarianLayout.setVerticalGroup(
            jPanel_PencarianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_PencarianLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
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
        jMenu4.add(jMenuItem_eDataMaster);

        jMenuBar2.add(jMenu4);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel_Pencarian, javax.swing.GroupLayout.PREFERRED_SIZE, 572, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel_hasil, javax.swing.GroupLayout.PREFERRED_SIZE, 764, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel_hasil, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
                    .addComponent(jPanel_Pencarian, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
                Logger.getLogger(Name_SearcherUI.class.getName()).log(Level.SEVERE, null, ex);
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

    private void jButton_inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_inputActionPerformed
        //INGAT!!! HASIL BERUBAH MENJADI VARIABLE VECTOR, (VECTOR = MIRIP DENGAN ARRAYLIST[])
        if (Tabel_HasilCari.getSelectedRow() != -1) {
            if (model2.getRowCount() != 0 && model2.getValueAt(model2.getRowCount() - 1, 3) == "Total: ") {
                model2.removeRow(model2.getRowCount() - 1);
            }
            
            Vector pilihan = (Vector) model1.getDataVector().elementAt(Tabel_HasilCari.getSelectedRow());
            model2.addRow(pilihan);

            //convert dari vector ke string ke int
            //untunk perhitungan
            String cleanedStringValue2 = String.valueOf(pilihan.get(3)).replace(".", "");
            Object intValue1 = String.format(Locale.US, "%,d", 1 * Long.parseLong(cleanedStringValue2)).replace(',', '.');
            model2.setValueAt(intValue1, model2.getRowCount() - 1, model2.getColumnCount() - 1);
            
            //memanggil button hitung
            jButton_hitungActionPerformed(evt);

        } else {
            JOptionPane.showMessageDialog(null, "SILAHKAN PILIH MATERIAL YANG AKAN DIMASUKAN", " ", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButton_inputActionPerformed

    private void jButton_HapusPilihanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_HapusPilihanActionPerformed
        if (jTable_materialpilihan.getSelectedRow() != -1) {            
            model2.removeRow(jTable_materialpilihan.getSelectedRow());
            //memanggil button hitung
            jButton_hitungActionPerformed(evt);
        } else {
            JOptionPane.showMessageDialog(null, "SILAHKAN PILIH MATERIAL YANG AKAN DIHAPUS", " ", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButton_HapusPilihanActionPerformed

    private void jButton_simpankeexcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_simpankeexcelActionPerformed
        if (model2.getRowCount() != 0) {
            write2class a = new write2class();
            String path = null;
            //ngambil data dari tabel 2 (atau model 2)
            Vector<String> vable1 = (Vector) model2.getDataVector();

            //poping up JOPtionPane to get excel name by user
            String name = JOptionPane.showInputDialog(null, "Masukan nama Excel: ", "");

            //to open JFileChooser so user can choose spesific path to save file
            JFileChooser chooser = new JFileChooser();
            chooser.setCurrentDirectory(new java.io.File("."));
            chooser.setDialogTitle("Simpan di ...");
            chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
            chooser.setAcceptAllFileFilterUsed(false);

            if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
                path = chooser.getSelectedFile().getAbsolutePath();
                //chooser.getSelectedFile(); //to get selected file
                //getCurrentDirectory() // to get current dir
            } else {
                System.out.println("");
            }

            try {
                a.write2excel(vable1, path, name);
                JOptionPane.showMessageDialog(null, "DATA BERHASIL DIMASUKAN", "", JOptionPane.INFORMATION_MESSAGE);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Name_SearcherUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "MASUKAN DATA TERLEBIH DAHULU", "", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButton_simpankeexcelActionPerformed

    private void jTable_materialpilihanKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable_materialpilihanKeyPressed
        //make a artificial button to creating actionevent
        Button buttone = new Button();
        //creating an actionevent
        ActionEvent e = new ActionEvent((Object) buttone, ActionEvent.ACTION_PERFORMED,"");
        //calling hitung fx
        jButton_hitungActionPerformed(e);
    }//GEN-LAST:event_jTable_materialpilihanKeyPressed

    private void jButton_hitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_hitungActionPerformed
        if (model2.getRowCount() != 0) {
            if (model2.getValueAt(model2.getRowCount() - 1, 3) == "Total: ") {
                model2.removeRow(model2.getRowCount() - 1);
            }

            Vector<String> vable = (Vector) model2.getDataVector();
            Vector vable2 = new Vector();
            int hit1 = 0;
            long hit2 = 0;
            long hasil = 0;
            long total = 0;

            for (Object v : vable) {
                Vector vecrow = (Vector) v;
                String scValue2 = String.valueOf(vecrow.get(3)).replace(".", "");
                hit2 = Long.parseLong(scValue2);

                //cek kalau dia 1.0 atau bukan lalu ubah ke int
                if ("1.0".equals(vecrow.get(1))) {
                    hit1 = 1;
                } else {
                    hit1 = (int) vecrow.get(1);
                }

                hasil = hit1 * hit2;
                total = total + hasil;
                vecrow.remove(4);
                Object intValue1 = String.format(Locale.US, "%,d", 1 * hasil).replace(',', '.');
                vecrow.add(intValue1);
                vable2.add(vecrow);
            }

            if (model2.getRowCount() > 0) {
                while (model2.getRowCount() > 0) {
                    model2.removeRow(0);
                }
            }

            for (Object v : vable2) {
                model2.addRow((Vector) v);
            }

            //menghitung total
            model2.addRow(new Object[]{null, null, null, "Total: ", String.format(Locale.US, "%,d", 1 * total).replace(',', '.')});
        } else {
            JOptionPane.showMessageDialog(null, "MASUKAN DATA TERLEBIH DAHULU", "", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButton_hitungActionPerformed
 
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

    private void jButton_input1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_input1ActionPerformed
        //INGAT!!! HASIL BERUBAH MENJADI VARIABLE VECTOR, (VECTOR = MIRIP DENGAN ARRAYLIST[])
        if (Tabel_HasilCari1.getSelectedRow() != -1) {
            if (model2.getRowCount() != 0 && model2.getValueAt(model2.getRowCount() - 1, 3) == "Total: ") {
                model2.removeRow(model2.getRowCount() - 1);
            }
            
            Vector pilihan = (Vector) model3.getDataVector().elementAt(Tabel_HasilCari1.getSelectedRow());
            model2.addRow(pilihan);

            //convert dari vector ke string ke int
            //untunk perhitungan
            String cleanedStringValue2 = String.valueOf(pilihan.get(3)).replace(".", "");
            Object intValue1 = String.format(Locale.US, "%,d", 1 * Long.parseLong(cleanedStringValue2)).replace(',', '.');
            model2.setValueAt(intValue1, model2.getRowCount() - 1, model2.getColumnCount() - 1);
            
            //memanggil button hitung
            jButton_hitungActionPerformed(evt);

        } else {
            JOptionPane.showMessageDialog(null, "SILAHKAN PILIH MATERIAL YANG AKAN DIMASUKAN", " ", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButton_input1ActionPerformed

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabel_HasilCari;
    private javax.swing.JTable Tabel_HasilCari1;
    private javax.swing.JButton jButton_Cari;
    private javax.swing.JButton jButton_Cari1;
    private javax.swing.JButton jButton_HapusPilihan;
    private javax.swing.JButton jButton_hitung;
    private javax.swing.JButton jButton_input;
    private javax.swing.JButton jButton_input1;
    private javax.swing.JButton jButton_simpankeexcel;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem_Keluar;
    private javax.swing.JMenuItem jMenuItem_Profil;
    private javax.swing.JMenuItem jMenuItem_eDataMaster;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel_Pencarian;
    private javax.swing.JPanel jPanel_hasil;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable_materialpilihan;
    private javax.swing.JTextField jTextField_CariNama;
    private javax.swing.JTextField jTextField_CariNama1;
    // End of variables declaration//GEN-END:variables
}