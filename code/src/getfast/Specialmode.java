/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package getfast;
import java.util.Timer;
import java.util.TimerTask;
/**
 *
 * @author Jimin Wen
 * The interface of special mode in the game
 */
public class Specialmode extends javax.swing.JFrame {

    /**
     * Creates new form Specialmode
     */
    public Specialmode() 
    {
        initComponents();
        jLabel1.setText("Health:"+Health);
        
       Sound.Sound2.play();
       mytimer1=new Timer();
        mytimer1.scheduleAtFixedRate(mytask1, 500, 500);
        
    }
     
   /* private void generate_gundam(int i)
    { 
        array[i].setIcon(new javax.swing.ImageIcon("C:\\Users\\Jimin Wen\\Documents\\NetBeansProjects\\getfast\\src\\getfast\\res\\gundam.png")); // NOI18N
        getContentPane().add(array[i], new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 140, 130));
    }*/
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        specialpenal1 = new getfast.Specialpenal();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        specialpenal1.setToolTipText("");
        specialpenal1.setOpaque(false);
        specialpenal1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                specialpenal1MousePressed(evt);
            }
        });

        javax.swing.GroupLayout specialpenal1Layout = new javax.swing.GroupLayout(specialpenal1);
        specialpenal1.setLayout(specialpenal1Layout);
        specialpenal1Layout.setHorizontalGroup(
            specialpenal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1370, Short.MAX_VALUE)
        );
        specialpenal1Layout.setVerticalGroup(
            specialpenal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 680, Short.MAX_VALUE)
        );

        getContentPane().add(specialpenal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 1370, 680));

        jLabel3.setFont(new java.awt.Font("宋体", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("Mark:0");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, -1, -1));

        jLabel1.setFont(new java.awt.Font("宋体", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Health:100");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 100));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("宋体", 0, 36)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 0, 0));
        jButton1.setText("Pause");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 20, -1, -1));

        jButton2.setFont(new java.awt.Font("宋体", 0, 36)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 0, 0));
        jButton2.setText("Main menu");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 20, -1, -1));

        jButton3.setFont(new java.awt.Font("宋体", 0, 36)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 0, 0));
        jButton3.setText("Restart");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 20, -1, -1));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Jimin Wen\\Documents\\NetBeansProjects\\getfast\\src\\getfast\\res\\newspace.png")); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 760));

        pack();
    }// </editor-fold>//GEN-END:initComponents
/**
 * Refresh the current mark in the game when mouse has been clicked
 * @param evt 
 */
    private void specialpenal1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_specialpenal1MousePressed
    Mark=specialpenal1.getmark();
    
    jLabel3.setText("Mark:"+Mark);        // TODO add your handling code here:        // TODO add your handling code here:
    }//GEN-LAST:event_specialpenal1MousePressed
/**
 * Restart the game when "restart" has been clicked
 * @param evt 
 */
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    mytimer1.cancel();
    Specialmode ano=new Specialmode();
    ano.setVisible(true);
    dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed
/**
 * Back to the main menu
 * @param evt 
 */
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    Sound.Sound2.stop();
    mytimer1.cancel();
    Maininterface ma=new Maininterface();
    ma.setVisible(true);
    dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed
/**
 * Enter the pause interface
 * @param evt 
 */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    Pause relax=new Pause();
    mytimer1.cancel();
    relax.set_mode(3);
    relax.storespecial(this);
    relax.setVisible(true);
    dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed
   /**
    * Restart the timer when resume from the pause
    */
    public void set_pause()
    {   mytimer1=new Timer();
        mytask1=new Timertask()
    {
     public void run()
     {
     System.out.print("refresh    ");
     count+=1;
     if (count!=0)
     {      
         specialpenal1.addgundam();
      }
      Health=specialpenal1.check(Health);
     if (Health==0)
     {
      Sound.Sound2.stop();
      showmark another=new showmark();  
      another.set_mark(Mark);
      another.setVisible(true);
      dispose();
      mytimer1.cancel();
     }
     jLabel1.setText("Health:"+Health);
     }
    };
       mytimer1.scheduleAtFixedRate(mytask1, 500, 500); 
        
    }
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
            java.util.logging.Logger.getLogger(Specialmode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Specialmode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Specialmode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Specialmode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Specialmode().setVisible(true);
            }
        });
    }
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private getfast.Specialpenal specialpenal1;
    // End of variables declaration//GEN-END:variables
    private int Health=100;//label 1
    public int Mark=0;//label 4
    private int count=0;
    Timer mytimer1;
    TimerTask mytask1=new Timertask()
    {
     public void run()
     {
     System.out.print("refresh    ");
     count+=1;
     if (count!=0)
     {      
         specialpenal1.addgundam();
      }
      Health=specialpenal1.check(Health);
     if (Health==0)
     {
      Sound.Sound2.stop();
      showmark another=new showmark();  
      another.set_mark(Mark);
      another.setVisible(true);
      dispose();
      mytimer1.cancel();
     }
     jLabel1.setText("Health:"+Health);
     }
    };
}
