
/**
 *
 * @author XFilesOno
 */

import java.io.File;
import java.io.FilenameFilter;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class DosyaIslemleri extends javax.swing.JFrame {

    public DosyaIslemleri() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jButton2 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList3 = new javax.swing.JList<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        jList4 = new javax.swing.JList<>();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jButton1.setBackground(new java.awt.Color(153, 204, 255));
        jButton1.setText("Dosyaları Listele");
        jButton1.setToolTipText("");
        jButton1.setEnabled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jList1.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Dosyalar", "Burada", "Listelenecek..." };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        jList2.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jList2.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Dosya Boyutları", "Burada", "Listelenecek" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList2);

        jButton2.setBackground(new java.awt.Color(153, 204, 255));
        jButton2.setText("Aynı Dosyaları Bul ve Sil");
        jButton2.setEnabled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jList3.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jList3.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Aynı dosyalar" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(jList3);

        jList4.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jList4.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Aynı dosyalar" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane4.setViewportView(jList4);

        jButton3.setBackground(new java.awt.Color(153, 204, 255));
        jButton3.setText("Klasör Seç");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 102, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Seçilen Klasör: YOK");
        jLabel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        File dosya = new File(klasor);
        dosyaTuru = JOptionPane.showInputDialog(null, "Dosya Türünü giriniz (Örn: .jpg , .png)");
        FilenameFilter fil = new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.endsWith(dosyaTuru);
            }
        };
        if(dosya.isDirectory()) {
            File[] liste = dosya.listFiles(fil);
            listModel1 = new DefaultListModel();
            listModel2 = new DefaultListModel();
            for(File dosya_nesne : liste){
                if(dosya_nesne.isFile()) {
                    String dosya_adi = dosya_nesne.getName();
                    listModel1.addElement("" + dosya_adi);
                    long buyukluk = dosya_nesne.length();
                    listModel2.addElement(Long.toString(buyukluk));
                }
            }
            if(!listModel1.isEmpty()) {
                jList1.setModel(listModel1);
                jList2.setModel(listModel2);
                jButton2.setEnabled(true);
            }
            else {
                listModel1.addElement("Klasörde, Belirtilen");
                listModel1.addElement("Türde Dosya");
                listModel1.addElement("Bulunamadı...");
                listModel2.addElement("Klasörde, Belirtilen");
                listModel2.addElement("Türde Dosya");
                listModel2.addElement("Bulunamadı...");
                jList1.setModel(listModel1);
                jList2.setModel(listModel2);
            }
            
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //JOptionPane.showMessageDialog(null, listModel1.size());
        //JOptionPane.showMessageDialog(null, listModel2.size());
        listModel3 = new DefaultListModel();
        listModel4 = new DefaultListModel();
        int dosyadakiElemanlar = 0 ;
        for(int i = 0 ; i < listModel1.size() ; i++) {
            if(listModel2.elementAt(i) != null) {
                //JOptionPane.showMessageDialog(null, i);
                for(int j = i+1 ; j < listModel1.size() ; j++) {
                    
                    int eleman1 = Integer.parseInt((String) listModel2.elementAt(i));
                    int eleman2 = Integer.parseInt((String) listModel2.elementAt(j));
                    
                    if(eleman1 == eleman2) {                        
                        listModel3.addElement(listModel1.elementAt(i));
                        listModel4.addElement(listModel1.elementAt(j));
                        DosyaSil yeni = new DosyaSil();
                        yeni.dosyalariSil((String) listModel1.elementAt(j)
                                , klasor + "\\" +(String)listModel1.elementAt(j));
                    }
                }
            }
            dosyadakiElemanlar = i+1;
        }
        if (listModel1.isEmpty()) {
            listModel5 = new DefaultListModel();
            listModel5.addElement("Klasörde Dosya");
            listModel5.addElement("Bulunamadı...");
            jList3.setModel(listModel5);
            jList4.setModel(listModel5);
        }
        else if(listModel3.isEmpty() && listModel4.isEmpty()) {
            listModel5 = new DefaultListModel();
            listModel5.addElement(dosyadakiElemanlar + " adet " + dosyaTuru);
            listModel5.addElement("dosyası arasında");
            listModel5.addElement("aynı boyutlara");
            listModel5.addElement("sahip hiçbir");
            listModel5.addElement("dosya bulunamadı...");
            
            jList3.setModel(listModel5);  
            jList4.setModel(listModel5);
            
        }
        else {
            jList3.setModel(listModel3);
            jList4.setModel(listModel4);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        JFileChooser dosyaSec = new JFileChooser();
        dosyaSec.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int sec = dosyaSec.showOpenDialog(null);
        klasor = dosyaSec.getSelectedFile().getAbsolutePath();
        //JOptionPane.showMessageDialog(null, klasor);
        jButton1.setEnabled(true);
        jLabel1.setText("Seçilen Klasör: " + klasor);
    }//GEN-LAST:event_jButton3ActionPerformed

    /*private void dosyaSil(String silinecekDosyaAdi, String tamYolu) {
        
        File silinecekDosya = new File(tamYolu);
        boolean sonuc = silinecekDosya.delete();
        if(sonuc) {
            JOptionPane.showMessageDialog(null, silinecekDosyaAdi + " isimli Resim Silindi ...");
        }
        else
            JOptionPane.showMessageDialog(null, silinecekDosyaAdi + " isimli Resim Silinemedi !!!\n" 
                    + "Klasör Yolu: " + klasor);
        
    }*/
        
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
            java.util.logging.Logger.getLogger(DosyaIslemleri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DosyaIslemleri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DosyaIslemleri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DosyaIslemleri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DosyaIslemleri().setVisible(true);
            }
        });
    }

    private DefaultListModel listModel1;
    private DefaultListModel listModel2;
    private DefaultListModel listModel3;
    private DefaultListModel listModel4;
    private DefaultListModel listModel5;
    public String klasor;
    private String dosyaTuru;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JList<String> jList3;
    private javax.swing.JList<String> jList4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    // End of variables declaration//GEN-END:variables
}