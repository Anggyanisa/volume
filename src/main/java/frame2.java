/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Smktelkom
 */
public class frame2 extends javax.swing.JFrame {

    /**
     * Creates new form frame2
     */
    public frame2( String enama , String eabsen , String ekelas , String ealamat, String jurusan) {
        initComponents();
        
        hasil1.setText(enama);
        hasil2.setText(eabsen);
        hasil3.setText(ekelas);
        hasil4.setText(ealamat);
        hasil5.setText(jurusan);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        hasil1 = new javax.swing.JLabel();
        hasil2 = new javax.swing.JLabel();
        hasil3 = new javax.swing.JLabel();
        hasil4 = new javax.swing.JLabel();
        hasil5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("HASIL BIODATA");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(130, 10, 120, 20);

        hasil1.setText("hasil 1");
        getContentPane().add(hasil1);
        hasil1.setBounds(50, 50, 30, 14);

        hasil2.setText("hasil2");
        getContentPane().add(hasil2);
        hasil2.setBounds(50, 80, 27, 14);

        hasil3.setText("hasil3");
        getContentPane().add(hasil3);
        hasil3.setBounds(50, 120, 27, 14);

        hasil4.setText("jLabel5");
        getContentPane().add(hasil4);
        hasil4.setBounds(50, 160, 34, 14);

        hasil5.setText("jLabel6");
        getContentPane().add(hasil5);
        hasil5.setBounds(50, 200, 34, 14);

        setBounds(0, 0, 416, 339);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(frame2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frame2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frame2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frame2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
              
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel hasil1;
    private javax.swing.JLabel hasil2;
    private javax.swing.JLabel hasil3;
    private javax.swing.JLabel hasil4;
    private javax.swing.JLabel hasil5;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
