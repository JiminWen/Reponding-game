/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package getfast;

/**
 *
 * @author Jimin Wen
 * the main menu in the game
 */
public class Maininterface extends javax.swing.JFrame {

    /**
     * Creates new form form
     */
   // public object m;
    
    public Maininterface()  {
       initComponents();
       Sound.Sound1.loop();
      // Sound.Sound1.stop();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFocusable(false);
        setIconImages(null);
        setMinimumSize(new java.awt.Dimension(1366, 768));
        setPreferredSize(new java.awt.Dimension(1366, 786));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("宋体", 0, 48)); // NOI18N
        jButton1.setText("Hard mode");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 500, -1, -1));

        jButton2.setFont(new java.awt.Font("宋体", 0, 48)); // NOI18N
        jButton2.setText("Easy mode");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 250, -1, -1));

        jButton3.setFont(new java.awt.Font("宋体", 0, 48)); // NOI18N
        jButton3.setText("Medium mode");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 250, -1, -1));

        jButton4.setFont(new java.awt.Font("宋体", 0, 48)); // NOI18N
        jButton4.setText("Special mode");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 500, -1, -1));

        jLabel1.setFont(new java.awt.Font("宋体", 0, 48)); // NOI18N
        jLabel1.setText("Get fast");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 50, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
/**
 * Enter easy mode when the "easymode" button is pressed
 * @param evt 
 */
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Sound.Sound1.stop();
        Easymode uv=new Easymode();
        uv.setVisible(true);// TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed
/**
 * enter hard mode when the "hardmode" button is pressed
 * @param evt 
 */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Sound.Sound1.stop();
        Hardmode fe=new Hardmode();
        fe.setVisible(true);  
        dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed
/**
 * enter middle mode when the "middlemode" button is clicked
 * @param evt 
 */
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Sound.Sound1.stop();
        Mediummode un=new Mediummode();
        un.setVisible(true);// TODO add your handling code here:
        dispose();          // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed
/**
 * enter special mode when the "specialmode" button is pressed
 * @param evt 
 */
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Sound.Sound1.stop();
        Specialmode sp=new Specialmode();
        sp.setVisible(true);
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
    
       //  Sound.Sound1.play();
        java.awt.EventQueue.invokeLater(() -> {
            new Maininterface().setVisible(true);
             
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

    private void run() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void main() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}