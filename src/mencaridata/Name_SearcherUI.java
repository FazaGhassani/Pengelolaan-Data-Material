/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mencaridata;

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

    public Name_SearcherUI() throws IOException {
        initComponents();
        model1 = (DefaultTableModel) Tabel_HasilCari.getModel();
        model2 = (DefaultTableModel) jTable_materialpilihan.getModel();
        
        //menampilkan semua data
        showalldata show = new showalldata();
        Vector<String> data1 = show.show(show.getmySheet(), show.getmyWorkBook());
        for(Object v : data1){
            model1.addRow((Vector) v);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabel_HasilCari = new javax.swing.JTable();
        jTextField_CariNama = new javax.swing.JTextField();
        jButton_Cari = new javax.swing.JButton();
        jButton_input = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel_hasil.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Data Material", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

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
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 478, Short.MAX_VALUE)
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
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_hasilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_HapusPilihan)
                    .addComponent(jButton_hitung))
                .addContainerGap())
        );

        jPanel_Pencarian.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pencarian", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

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

        jButton_Cari.setText("Cari");
        jButton_Cari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_CariActionPerformed(evt);
            }
        });

        jButton_input.setText("Pilih");
        jButton_input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_inputActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_PencarianLayout = new javax.swing.GroupLayout(jPanel_Pencarian);
        jPanel_Pencarian.setLayout(jPanel_PencarianLayout);
        jPanel_PencarianLayout.setHorizontalGroup(
            jPanel_PencarianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_PencarianLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_PencarianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_PencarianLayout.createSequentialGroup()
                        .addComponent(jTextField_CariNama, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_Cari)
                        .addGap(0, 174, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_PencarianLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton_input, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel_PencarianLayout.setVerticalGroup(
            jPanel_PencarianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_PencarianLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel_PencarianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_CariNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Cari))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton_input)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel_Pencarian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel_hasil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel_hasil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel_Pencarian, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_CariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_CariActionPerformed
        if (jTextField_CariNama.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "MASUKAN KATA KUNCI PENCARIAN TERLEBIH DAHULU", " ", JOptionPane.WARNING_MESSAGE);
        } else {
            //mencari nama dr kotak Cari_Nama
            String nama = jTextField_CariNama.getText();
            Name_Searcher a = null;

            try {
                a = new Name_Searcher();
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
            Vector pilihan = (Vector) model1.getDataVector().elementAt(Tabel_HasilCari.getSelectedRow());
            model2.addRow(pilihan);

            //convert dari vector ke string ke int
            //untunk perhitungan
            String cleanedStringValue2 = String.valueOf(pilihan.get(3)).replace(".", "");
            Object intValue1 = String.format(Locale.US, "%,d", 1 * Long.parseLong(cleanedStringValue2)).replace(',', '.');
            model2.setValueAt(intValue1, model2.getRowCount() - 1, model2.getColumnCount() - 1);

        } else {
            JOptionPane.showMessageDialog(null, "SILAHKAN PILIH MATERIAL YANG AKAN DIMASUKAN", " ", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButton_inputActionPerformed

    private void jButton_HapusPilihanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_HapusPilihanActionPerformed
        if (jTable_materialpilihan.getSelectedRow() != -1) {
            model2.removeRow(jTable_materialpilihan.getSelectedRow());
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
        // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(Name_SearcherUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Name_SearcherUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Name_SearcherUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Name_SearcherUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Name_SearcherUI().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(Name_SearcherUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabel_HasilCari;
    private javax.swing.JButton jButton_Cari;
    private javax.swing.JButton jButton_HapusPilihan;
    private javax.swing.JButton jButton_hitung;
    private javax.swing.JButton jButton_input;
    private javax.swing.JButton jButton_simpankeexcel;
    private javax.swing.JPanel jPanel_Pencarian;
    private javax.swing.JPanel jPanel_hasil;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable_materialpilihan;
    private javax.swing.JTextField jTextField_CariNama;
    // End of variables declaration//GEN-END:variables
}
