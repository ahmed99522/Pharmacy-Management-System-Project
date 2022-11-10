/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pms;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

/**
 *
 * @author moham
 */
public class Reset_Password extends javax.swing.JFrame {

    /**
     * Creates new form Reset_Password
     */
    public Reset_Password() {
        initComponents();
        this.setLocationRelativeTo(null);
        Border roundedBorder = new LineBorder(new Color(204,204,204), 10, true);
         jUsername_Reset.setBorder(roundedBorder);
         jPasswordReset1.setBorder(roundedBorder);
         jPasswordReset2.setBorder(roundedBorder);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPasswordReset2 = new javax.swing.JPasswordField();
        jPasswordReset1 = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jBack = new javax.swing.JButton();
        jReset1 = new javax.swing.JButton();
        jUsername_Reset = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(33, 36, 41));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/reset_100px.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        jPasswordReset2.setBackground(new java.awt.Color(204, 204, 204));
        jPasswordReset2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPasswordReset2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordReset2ActionPerformed(evt);
            }
        });

        jPasswordReset1.setBackground(new java.awt.Color(204, 204, 204));
        jPasswordReset1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPasswordReset1.setName(""); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("New Password Again");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("New Password");

        jBack.setBackground(new java.awt.Color(153, 153, 153));
        jBack.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jBack.setForeground(new java.awt.Color(255, 255, 255));
        jBack.setText("Back");
        jBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBackActionPerformed(evt);
            }
        });

        jReset1.setBackground(new java.awt.Color(255, 165, 0));
        jReset1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jReset1.setForeground(new java.awt.Color(255, 255, 255));
        jReset1.setText("Reset");
        jReset1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jReset1ActionPerformed(evt);
            }
        });

        jUsername_Reset.setBackground(new java.awt.Color(204, 204, 204));
        jUsername_Reset.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jUsername_Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jUsername_ResetActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Username");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel3)
                        .addComponent(jPasswordReset2)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPasswordReset1)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jReset1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jBack, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jUsername_Reset)))
                .addGap(42, 42, 42))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jUsername_Reset, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPasswordReset1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPasswordReset2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBack)
                    .addComponent(jReset1))
                .addContainerGap(157, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPasswordReset2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordReset2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordReset2ActionPerformed

    private void jBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBackActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new Login().setVisible(true);

    }//GEN-LAST:event_jBackActionPerformed

    private void jReset1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jReset1ActionPerformed
        // if Fields Empty
        if(jUsername_Reset.getText().equals("") || jPasswordReset1.getText().equals("") || jPasswordReset2.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Please Enter Full Data");
        }
        // if the password1 and passowrd2 match
        else if (jPasswordReset1.getText().equals(jPasswordReset2.getText()))                
            
        {
       
            try {
                // open Connection
               Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + "PMS" + "?useSSL=false", "root", "ahmedroot");
               // Get username from textfield
               String username = jUsername_Reset.getText();
               String passwordReset1 = jPasswordReset1.getText();

                // Create statment
               Statement stm = con.createStatement();
               // update password
               String sql = "update users_signup "
                            + "set PASSWORD = '"+passwordReset1
                            + "'where USERNAME = '"+username+"'";
               stm.executeUpdate(sql);
               JOptionPane.showMessageDialog(null, "Password Reset Successfully !");

             
              
            


               
               

            } catch (Exception e) {
          JOptionPane.showMessageDialog(null, "Error" + e);

                
            }
        }
        else 
        {
            // if the passowrd1 and passowrd2 doesn't match
            JOptionPane.showMessageDialog(null, "Password Not Match");
        }
        
        
        
    }//GEN-LAST:event_jReset1ActionPerformed

    private void jUsername_ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jUsername_ResetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jUsername_ResetActionPerformed

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
            java.util.logging.Logger.getLogger(Reset_Password.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reset_Password.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reset_Password.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reset_Password.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
                new Reset_Password().setVisible(false);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordReset1;
    private javax.swing.JPasswordField jPasswordReset2;
    private javax.swing.JButton jReset1;
    private javax.swing.JTextField jUsername_Reset;
    // End of variables declaration//GEN-END:variables
}