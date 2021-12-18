package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class test extends javax.swing.JFrame {
    //declatartion des variables
    public int cin;
    public String nom,prenom,service,durree,sexe;
    public int i;  //indice de déplacement
    public DefaultTableModel dt;
    Connection cnx=null;
    ResultSet rs=null;
    Statement  st=null;
    /**
     * Creates new form test
     */
    public test() {
        initComponents();
    }
    public void afficher(){
        txtid.setEnabled(false);
        try {
            dt.setRowCount(0);
            rs=st.executeQuery("Select * from stagaire");
            while(rs.next()){
                cin=rs.getInt("cin");
                nom=rs.getString("nom");
                prenom=rs.getString("prenom");
                service=rs.getString("service");
                durree=rs.getString("duree");
                sexe=rs.getString("sexe");
                Object ss[]={id,mat,nom,prenom,service,duree,sexe};
                dt.addRow(ss);

            }

        }catch(Exception p){}
    }

    /**
     * This method is called from within the constructor to initialize the form.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgrp = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtdur = new javax.swing.JTextField();
        txtid = new javax.swing.JTextField();
        txtmat = new javax.swing.JTextField();
        txtnom = new javax.swing.JTextField();
        txtpre = new javax.swing.JTextField();
        combser = new javax.swing.JComboBox();
        jrb3 = new javax.swing.JCheckBox();
        jrb1 = new javax.swing.JCheckBox();
        jrb2 = new javax.swing.JCheckBox();
        btn2 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        combser1 = new javax.swing.JComboBox();
        txtdur1 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(900, 690));
        setPreferredSize(new java.awt.Dimension(900, 690));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("id:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(50, 164, 26, 17);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("mat :");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 200, 64, 17);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("nom:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(40, 240, 50, 17);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("recherche par :");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(420, 510, 110, 60);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Service:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(40, 310, 60, 17);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Sexe :");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(50, 390, 50, 17);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("dureé");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(50, 350, 50, 17);

        txtdur.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(txtdur);
        txtdur.setBounds(550, 560, 150, 30);

        txtid.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(txtid);
        txtid.setBounds(150, 160, 150, 23);

        txtmat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(txtmat);
        txtmat.setBounds(150, 200, 150, 22);

        txtnom.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(txtnom);
        txtnom.setBounds(150, 240, 150, 22);

        txtpre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(txtpre);
        txtpre.setBounds(150, 270, 150, 22);

        combser.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(combser);
        combser.setBounds(550, 500, 150, 30);

        jrb3.setText("autre");
        jrb3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrb3ActionPerformed(evt);
            }
        });
        getContentPane().add(jrb3);
        jrb3.setBounds(260, 390, 93, 25);

        jrb1.setText("masculin");
        jrb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrb1ActionPerformed(evt);
            }
        });
        getContentPane().add(jrb1);
        jrb1.setBounds(110, 390, 79, 25);

        jrb2.setText("féminin");
        jrb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrb2ActionPerformed(evt);
            }
        });
        getContentPane().add(jrb2);
        jrb2.setBounds(190, 390, 93, 25);

        btn2.setText("<<");
        getContentPane().add(btn2);
        btn2.setBounds(130, 430, 80, 25);

        btn4.setText(">");
        getContentPane().add(btn4);
        btn4.setBounds(320, 430, 79, 25);

        btn3.setText(">>");
        getContentPane().add(btn3);
        btn3.setBounds(230, 430, 79, 25);

        btn1.setText("<");
        getContentPane().add(btn1);
        btn1.setBounds(30, 430, 79, 25);

        tbl.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null}
                },
                new String [] {
                        "Title 1", "Title 2", "Title 3", "Title 4"
                }
        ));
        jScrollPane1.setViewportView(tbl);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(370, 170, 452, 230);

        jButton1.setText("rechercher");
        getContentPane().add(jButton1);
        jButton1.setBounds(720, 510, 150, 60);

        jButton2.setText("modifier");
        getContentPane().add(jButton2);
        jButton2.setBounds(230, 460, 150, 60);

        jButton3.setText("ajouter ");
        getContentPane().add(jButton3);
        jButton3.setBounds(50, 460, 150, 60);

        jButton4.setText("supprimer");
        getContentPane().add(jButton4);
        jButton4.setBounds(50, 540, 150, 60);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("prenom:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(40, 270, 60, 17);

        combser1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(combser1);
        combser1.setBounds(150, 310, 150, 22);

        txtdur1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(txtdur1);
        txtdur1.setBounds(150, 350, 150, 22);

        jButton5.setText("actualiser");
        getContentPane().add(jButton5);
        jButton5.setBounds(230, 540, 150, 60);

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ahmed\\Desktop\\java\\test.jpg")); // NOI18N
        jLabel9.setText("jLabel9");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(0, 0, 910, 650);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cnx=DriverManager.getConnection("jdbc:mysql://localhost:3306/stg","root","estsb");
            st=cnx.createStatement();
            dt=new DefaultTableModel();
            dt.addColumn("cin");
            dt.addColumn("nom");
            dt.addColumn("prenom");
            dt.addColumn("service");
            dt.addColumn("duree");
            dt.addColumn("sexe");
            tbl.setModel(dt);
        }catch(Exception p){javax.swing.JOptionPane.showMessageDialog(null,"erreur "+ p.getMessage());}
    }//GEN-LAST:event_formWindowOpened

    public void deplacement(int i){

    }

    private void jrb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrb1ActionPerformed
        jrb1.getText();    }//GEN-LAST:event_jrb1ActionPerformed

    private void jrb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrb2ActionPerformed
        jrb2.getText();    }//GEN-LAST:event_jrb2ActionPerformed

    private void jrb3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrb3ActionPerformed
        jrb3.getText();    }//GEN-LAST:event_jrb3ActionPerformed

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
            java.util.logging.Logger.getLogger(test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new test().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgrp;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JComboBox combser;
    private javax.swing.JComboBox combser1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JCheckBox jrb1;
    private javax.swing.JCheckBox jrb2;
    private javax.swing.JCheckBox jrb3;
    private javax.swing.JTable tbl;
    private javax.swing.JTextField txtdur;
    private javax.swing.JTextField txtdur1;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtmat;
    private javax.swing.JTextField txtnom;
    private javax.swing.JTextField txtpre;
    // End of variables declaration//GEN-END:variables
}