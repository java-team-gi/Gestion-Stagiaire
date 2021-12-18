/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package test;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

import java.util.regex.*;



/**
 *
 * @author hp
 */
public class login extends javax.swing.JFrame {
    static int i=4;
Connection cnx=null;
ResultSet Rs=null;
PreparedStatement ps=null;
    /**
     * Creates new form Accueil
     */
    public login() throws SQLException, ClassNotFoundException {
        initComponents();
         jbtn2.setVisible(false);
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        user = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btn1 = new javax.swing.JButton();
        pass = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jlabel2 = new javax.swing.JLabel();
        jbtn2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestion Des Vente De Société Global Energy System ");
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(560, 500));
        setPreferredSize(new java.awt.Dimension(560, 500));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel1.setBackground(java.awt.Color.white);
        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("Nom d'utilisateur");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(61, 187, 129, 21);

        user.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        user.setForeground(new java.awt.Color(0, 0, 255));
        user.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                userKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                userKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                userKeyTyped(evt);
            }
        });
        jPanel1.add(user);
        user.setBounds(249, 184, 166, 29);

        jLabel2.setBackground(java.awt.Color.white);
        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 255));
        jLabel2.setText("Mot De Pass");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(72, 240, 129, 27);

        btn1.setBackground(java.awt.Color.white);
        btn1.setFont(new java.awt.Font("Comic Sans MS", 1, 30)); // NOI18N
        btn1.setForeground(new java.awt.Color(0, 0, 255));
        btn1.setText("Login");
        btn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn1MouseClicked(evt);
            }
        });
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        jPanel1.add(btn1);
        btn1.setBounds(170, 311, 149, 52);

        pass.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        pass.setForeground(new java.awt.Color(0, 0, 255));
        jPanel1.add(pass);
        pass.setBounds(249, 240, 166, 30);

        jLabel7.setBackground(java.awt.Color.white);
        jLabel7.setText("mot de pass oublié ");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel7);
        jLabel7.setBounds(249, 283, 160, 16);

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 1, 30)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 0));
        jLabel6.setText("administration ");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(110, 26, 251, 116);

        jlabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlabel2.setForeground(new java.awt.Color(51, 51, 255));
        jlabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jlabel2);
        jlabel2.setBounds(1, 306, 510, 60);

        jbtn2.setFont(new java.awt.Font("Comic Sans MS", 1, 30)); // NOI18N
        jbtn2.setText("sortir");
        jbtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn2ActionPerformed(evt);
            }
        });
        jPanel1.add(jbtn2);
        jbtn2.setBounds(110, 380, 290, 50);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 10, 530, 450);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn1MouseClicked
// TODO add your handling code here:
       try
{
        String Sql = "Select * from utilisateur WHERE id_user ='" +user.getText()
                +"'and password='"+pass.getText()+"'";
        ps = cnx.prepareStatement(Sql);
        Rs = ps.executeQuery();
        if (Rs.next()){
            
            stagiaire2 s = new stagiaire2();
            s.setVisible(true);
            
        }else if (user.getText().equals("")||pass.getText().equals(""))
        {  //i=4;
            JOptionPane.showMessageDialog(null,"ecrire votre username et password !!!!!"); }
        
        else {
            JOptionPane.showMessageDialog(null, "invalide username or password  \n \n ");
            
            JOptionPane.showMessageDialog(null, "il vous reste :"+(i-1)+" tentative" );
            i--;
            if (i==1){
      JOptionPane.showMessageDialog(null,"NOMBRE DE TENTATIVES EPUISE !!!! \n \n \n Veuillez contacter l'administrateur"); 
   btn1.setVisible(false);
   jlabel2.setText(" svp Veuillez contacter l'administrateur!!!");
   jbtn2.setVisible(true);
   
   
   }
        }
}catch(Exception e){
    JOptionPane.showMessageDialog(null, e);
}
    }//GEN-LAST:event_btn1MouseClicked

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn1ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        try { //connection au base de donneé
            Class.forName("com.mysql.jdbc.Driver");
            cnx=DriverManager.getConnection("jdbc:mysql://localhost:3306/stg","root","estsb");
        } catch (Exception ex) {JOptionPane.showMessageDialog(null, ex);
            
        }
      
        
    }//GEN-LAST:event_formWindowOpened

    private void userKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_userKeyPressed

    }//GEN-LAST:event_userKeyPressed

    private void userKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_userKeyReleased

    }//GEN-LAST:event_userKeyReleased

    private void userKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_userKeyTyped


    }//GEN-LAST:event_userKeyTyped

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked


// TODO add your handling code here:
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jbtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn2ActionPerformed
dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jbtn2ActionPerformed


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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    try {
                        new login().setVisible(true);
                    } catch (SQLException ex) {
                        Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } catch ( ClassNotFoundException ex) {
                    Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
     
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbtn2;
    private javax.swing.JLabel jlabel2;
    private javax.swing.JPasswordField pass;
    private javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables
}
