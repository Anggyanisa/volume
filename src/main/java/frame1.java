/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Smktelkom
 */
public class frame1 extends javax.swing.JFrame {

    /**
     * Creates new form frame1
     */
    public frame1() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btngroup = new javax.swing.ButtonGroup();
        nama = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        absen = new javax.swing.JTextField();
        kelas = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        rdb1 = new javax.swing.JRadioButton();
        rdb2 = new javax.swing.JRadioButton();
        alamat = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        getContentPane().add(nama);
        nama.setBounds(140, 40, 120, 30);

        jLabel1.setText("BIODATA");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(140, 0, 140, 40);

        jLabel2.setText("Nama");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(60, 50, 50, 20);

        jLabel3.setText("absen");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(60, 74, 50, 20);
        getContentPane().add(absen);
        absen.setBounds(140, 70, 120, 30);

        kelas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "XIRPL1", "XIRPL2", "XIRPL3", "XIRPL4", "XIRPL5", "XIRPL6" }));
        kelas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kelasActionPerformed(evt);
            }
        });
        getContentPane().add(kelas);
        kelas.setBounds(140, 100, 110, 30);

        jLabel4.setText("kelas");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(60, 104, 50, 20);

        jLabel5.setText("Jurusan");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(60, 140, 50, 20);

        btngroup.add(rdb1);
        rdb1.setText("RPL");
        getContentPane().add(rdb1);
        rdb1.setBounds(110, 140, 43, 23);

        btngroup.add(rdb2);
        rdb2.setText("TKJ");
        getContentPane().add(rdb2);
        rdb2.setBounds(220, 140, 43, 23);
        getContentPane().add(alamat);
        alamat.setBounds(140, 170, 140, 30);

        jLabel6.setText("Alamat");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(60, 170, 40, 20);

        btn1.setText("SEND");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn1);
        btn1.setBounds(80, 210, 59, 23);

        btn2.setText("EXIT");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        getContentPane().add(btn2);
        btn2.setBounds(190, 210, 55, 23);
        getContentPane().add(jLabel7);
        jLabel7.setBounds(290, 4, 110, 130);

        setBounds(0, 0, 416, 339);
    }// </editor-fold>//GEN-END:initComponents

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        // TODO add your handling code here:
        String enama = nama.getText();
        String eabsen= absen.getText();
        String ekelas= kelas.getSelectedItem().toString();
        String ealamat= alamat.getText();
        String Jurusan;
        
        if (rdb1.isSelected())
        {
            Jurusan = "RPL";
        }
        else if (rdb2.isSelected())
        {
            Jurusan = "TKJ";
        }
        else
        {
            Jurusan = "";
        }
        
        if (kelas.getSelectedItem()== "XIRPL1"){
        }
         if (kelas.getSelectedItem()== "XIRPL2"){
        }
          if (kelas.getSelectedItem()== "XIRPL3"){
        }
           if (kelas.getSelectedItem()== "XIRPL4"){
        }
            if (kelas.getSelectedItem()== "XIRPL5"){
        }
             if (kelas.getSelectedItem()== "XIRPL6"){
        }
             new frame2(enama , eabsen , ekelas , ealamat , Jurusan).setVisible(true);       
    }//GEN-LAST:event_btn1ActionPerformed

    private void kelasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kelasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kelasActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn2ActionPerformed

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
            java.util.logging.Logger.getLogger(frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frame1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField absen;
    private javax.swing.JTextField alamat;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.ButtonGroup btngroup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JComboBox<String> kelas;
    private javax.swing.JTextField nama;
    private javax.swing.JRadioButton rdb1;
    private javax.swing.JRadioButton rdb2;
    // End of variables declaration//GEN-END:variables
}
