/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package corms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ianch
 */
public class ApprovalList extends javax.swing.JFrame {

    /**
     * Creates new form ApprovalList
     */
    public ApprovalList() {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1_title = new javax.swing.JLabel();
        jButton1_exit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listOfApprovalUsers = new javax.swing.JList<>();
        jButton2_view = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(153, 102, 0));

        jPanel2.setBackground(new java.awt.Color(255, 153, 0));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel1_title.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1_title.setText("Select User To Approve");

        jButton1_exit.setText("Exit");
        jButton1_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_exitActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(listOfApprovalUsers);

        jButton2_view.setText("View");
        jButton2_view.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2_viewMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jButton2_view)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1_exit))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1_title, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 32, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1_title, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1_exit)
                    .addComponent(jButton2_view))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_exitActionPerformed
//        this.setVisible(false);
//        new GUI_Trainee().setVisible(true);
    }//GEN-LAST:event_jButton1_exitActionPerformed

    private void jButton2_viewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2_viewMouseClicked
//        String topicName = listOfApprovalUsers.getSelectedValue();
//        if (listOfApprovalUsers.isSelectionEmpty()) {
//            JOptionPane.showMessageDialog(null, "Please select a topic!");
//            this.setVisible(false);
//            this.setVisible(true);
//        } else {
//            var trmaterial = GetTrMaterialContentByName(topicName);
//            trMaterial._trMaterial = trmaterial;
//            var program = GetTrProgramByTrMaterialName(trMaterial._trMaterial.topic);
//            trProgram._trProgram = program;
//
//            ViewTrainingMaterial2 vtm2 = new ViewTrainingMaterial2();
//            vtm2.setVisible(true);
//            this.setVisible(false);
//        }
    }//GEN-LAST:event_jButton2_viewMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        var list = GetAllApprove();
        var listModel = new DefaultListModel();
        for (int i = 0; i < list.size(); i++) {
            listModel.add(i, list.get(i));
        }
        listOfApprovalUsers.setModel(listModel);
    }//GEN-LAST:event_formWindowOpened

    public List<String> GetAllApprove() {

        List<String> list = new ArrayList<>();
        String databaseURL = "jdbc:mysql://127.0.0.1:3306/corms?serverTimezone=UTC";
        String username = "dbusername";
        String password = "dbpassword";
        try ( Connection conn = DriverManager.getConnection(databaseURL, username, password)) {
            Statement sta = conn.createStatement();

            if (conn != null) {
                ResultSet res = sta.executeQuery("Select * FROM tblNames where dbnames.tblnames.intid = 1");

                if (res != null) {
                    while (res.next()) {
                        String strid = Integer.toString(res.getInt("intid"));
                        String strfname = res.getString("chrfname");
                        String strlname = res.getString("chrlname");

                    }

                    res.close();
                    sta.close();
                    conn.close();
                    return null;
                }

                res.close();
                sta.close();
                conn.close();
                return null;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return null;
    }

//    public int GetProgramIDByTraineeID(int traineeID) {
//        String databaseURL = "jdbc:derby://localhost:1527/TMS";
//        List<String> list = new ArrayList<String>();
//        try ( Connection conn = DriverManager.getConnection(databaseURL, "root", "123123")) {
//            Statement sta = conn.createStatement();
//
//            if (conn != null) {
//                ResultSet res = sta.executeQuery(
//                        "SELECT ROOT.TRAINEE_TRAINING_PROGRAM.PROGRAM_ID\n"
//                        + "FROM ROOT.TRAINEE_TRAINING_PROGRAM \n"
//                        + "WHERE ROOT.TRAINEE_TRAINING_PROGRAM.TRAINEE_ID =" + traineeID);
//
//                if (res != null) {
//                    while (res.next()) {
//                        int id = res.getInt("PROGRAM_ID");;
//                        return id;
//                    }
//                    res.close();
//                    sta.close();
//                    conn.close();
//                    return 0;
//                }
//
//                res.close();
//                sta.close();
//                conn.close();
//                return 0;
//            }
//        } catch (SQLException ex) {
//            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return 0;
//    }
//
//    public List<String> GetAllTrainingMaterialByProgramID(int programID) {
//        String databaseURL = "jdbc:derby://localhost:1527/TMS";
//        List<String> list = new ArrayList<String>();
//        try ( Connection conn = DriverManager.getConnection(databaseURL, "root", "123123")) {
//            Statement sta = conn.createStatement();
//
//            if (conn != null) {
//                ResultSet res = sta.executeQuery(
//                        "SELECT ROOT.TRAINING_MATERIAL.TRMATERIAL_TOPIC\n"
//                        + "FROM ROOT.TRAINING_PROGRAM_TRAINING_MATERIAL\n"
//                        + "LEFT JOIN ROOT.TRAINING_MATERIAL\n"
//                        + "ON ROOT.TRAINING_MATERIAL.TRMATERIAL_ID = ROOT.TRAINING_PROGRAM_TRAINING_MATERIAL.TRMATERIAL_ID\n"
//                        + "WHERE ROOT.TRAINING_PROGRAM_TRAINING_MATERIAL.PROGRAM_ID = " + programID);
//
//                if (res != null) {
//                    while (res.next()) {
//                        var name = res.getString("TRMATERIAL_TOPIC");
//                        list.add(name);
//                    }
//                    res.close();
//                    sta.close();
//                    conn.close();
//                    return list;
//                }
//
//                res.close();
//                sta.close();
//                conn.close();
//                return null;
//            }
//        } catch (SQLException ex) {
//            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
//            return null;
//        }
//        return null;
//    }
//
//    public trMaterial GetTrMaterialContentByName(String topicName) {
//        String databaseURL = "jdbc:derby://localhost:1527/TMS";
//        try ( Connection conn = DriverManager.getConnection(databaseURL, "root", "123123")) {
//            Statement sta = conn.createStatement();
//
//            if (conn != null) {
//                ResultSet res = sta.executeQuery("Select * from  ROOT.TRAINING_MATERIAL where  TRMATERIAL_TOPIC = '" + topicName + "'");
//
//                if (res != null) {
//                    while (res.next()) {
//                        trMaterial trmaterial = new trMaterial();
//                        trmaterial.id = res.getInt("TRMATERIAL_ID");
//                        trmaterial.topic = res.getString("TRMATERIAL_TOPIC");
//                        trmaterial.desc = res.getString("TRMATERIAL_DESCRIPTION");
//                        res.close();
//                        sta.close();
//                        conn.close();
//                        return trmaterial;
//                    }
//                }
//
//                res.close();
//                sta.close();
//                conn.close();
//                return null;
//            }
//        } catch (SQLException ex) {
//            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
//            return null;
//        }
//        return null;
//    }
//
//    public trProgram GetTrProgramByTrMaterialName(String topicName) {
//        String databaseURL = "jdbc:derby://localhost:1527/TMS";
//        try ( Connection conn = DriverManager.getConnection(databaseURL, "root", "123123")) {
//            Statement sta = conn.createStatement();
//
//            if (conn != null) {
//                ResultSet res = sta.executeQuery("Select * \n"
//                        + "from  ROOT.TRAINING_PROGRAM\n"
//                        + "LEFT JOIN ROOT.TRAINING_PROGRAM_TRAINING_MATERIAL\n"
//                        + "ON ROOT.TRAINING_PROGRAM.PROGRAM_ID = ROOT.TRAINING_PROGRAM_TRAINING_MATERIAL.PROGRAM_ID\n"
//                        + "LEFT JOIN ROOT.TRAINING_MATERIAL\n"
//                        + "ON ROOT.TRAINING_PROGRAM_TRAINING_MATERIAL.TRMATERIAL_ID = ROOT.TRAINING_MATERIAL.TRMATERIAL_ID \n"
//                        + "WHERE ROOT.TRAINING_MATERIAL.TRMATERIAL_TOPIC = '" + topicName + "'");
//
//                if (res != null) {
//                    while (res.next()) {
//                        trProgram trprogram = new trProgram();
//                        trprogram.programID = res.getInt("PROGRAM_ID");
//                        trprogram.programName = res.getString("PROGRAM_NAME");
//                        trprogram.programCategory = res.getString("PROGRAM_CATEGORY");
//                        res.close();
//                        sta.close();
//                        conn.close();
//                        return trprogram;
//                    }
//                }
//
//                res.close();
//                sta.close();
//                conn.close();
//                return null;
//            }
//        } catch (SQLException ex) {
//            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
//            return null;
//        }
//        return null;
//    }
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
            java.util.logging.Logger.getLogger(ApprovalList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ApprovalList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ApprovalList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ApprovalList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ApprovalList().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1_exit;
    private javax.swing.JButton jButton2_view;
    private javax.swing.JLabel jLabel1_title;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> listOfApprovalUsers;
    // End of variables declaration//GEN-END:variables
}
