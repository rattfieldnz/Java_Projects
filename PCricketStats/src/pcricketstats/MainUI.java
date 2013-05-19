/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pcricketstats;

import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;


/**
 *
 * @author interkiwiwebdev
 */
public class MainUI extends javax.swing.JFrame {

    /**
     * Creates new form MainUI
     */
    public MainUI() {
        initComponents();
        
        /*
         * Below code adapted from http://stackoverflow.com/questions/15867086/drag-undecorated-jdialog.
         */
        
        final Point point = new Point(0,0);        // Why 'final' and not simply Point point?     
    addMouseListener(new MouseAdapter() {  
        @Override
        public void mousePressed(MouseEvent e) {  
            if(!e.isMetaDown()){  
                point.x = e.getX();  
                point.y = e.getY();
            }  
        }  
    });
    
    addMouseMotionListener(new MouseMotionAdapter() {  
        @Override
        public void mouseDragged(MouseEvent e) {  
            if(!e.isMetaDown() &&  point.y <= 400){  //Coordinates of title bar, any X and up to 400px from the top border
                Point p = getLocation();  
                setLocation(p.x + e.getX() - point.x, p.y + e.getY() - point.y);
            }  
        }  
    }); 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        singlePlayerStatsBtn = new javax.swing.JButton();
        multiplePlayerStatsBtn = new javax.swing.JButton();
        exitBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setFocusable(false);
        setFocusableWindowState(false);
        setMaximumSize(new java.awt.Dimension(500, 400));
        setMinimumSize(new java.awt.Dimension(500, 400));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(500, 400));
        setResizable(false);
        getContentPane().setLayout(null);

        singlePlayerStatsBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        singlePlayerStatsBtn.setText("Single Player Stats");
        singlePlayerStatsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                singlePlayerStatsBtnActionPerformed(evt);
            }
        });
        getContentPane().add(singlePlayerStatsBtn);
        singlePlayerStatsBtn.setBounds(170, 170, 170, 25);

        multiplePlayerStatsBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        multiplePlayerStatsBtn.setText("Stats Involving Multiple Players");
        multiplePlayerStatsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplePlayerStatsBtnActionPerformed(evt);
            }
        });
        getContentPane().add(multiplePlayerStatsBtn);
        multiplePlayerStatsBtn.setBounds(130, 200, 247, 25);

        exitBtn.setText("Close");
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });
        getContentPane().add(exitBtn);
        exitBtn.setBounds(420, 370, 73, 23);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pcricketstats/ballClub.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jLabel2.setMaximumSize(new java.awt.Dimension(500, 400));
        jLabel2.setMinimumSize(new java.awt.Dimension(500, 400));
        jLabel2.setPreferredSize(new java.awt.Dimension(500, 400));
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 500, 400);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void singlePlayerStatsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_singlePlayerStatsBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_singlePlayerStatsBtnActionPerformed

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        if(evt.getSource() == exitBtn)
        {
            System.exit(0);
        }
    }//GEN-LAST:event_exitBtnActionPerformed

    private void multiplePlayerStatsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplePlayerStatsBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_multiplePlayerStatsBtnActionPerformed

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
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                
                new MainUI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exitBtn;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton multiplePlayerStatsBtn;
    private javax.swing.JButton singlePlayerStatsBtn;
    // End of variables declaration//GEN-END:variables
}