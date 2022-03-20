/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import ui.System.AdminWorkPanel;

import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.CreatePersonData;
import model.Patient;
import model.PatientDirectory;
import model.Person;
import model.PersonDirectory;
import model.Vitals;
import model.VitalsHistory;


/**
 *
 * @author somnathsolaskar
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    PersonDirectory person_directory;
    PatientDirectory patient_directory;
    VitalsHistory vitals;
    Vitals encou;
    
     private Patient patient;
    public MainFrame() {
        initComponents();
        person_directory = new PersonDirectory();
        patient_directory = new PatientDirectory();
        vitals = new VitalsHistory();
        encou = new Vitals();
        patient = new Patient();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        splitPane = new javax.swing.JSplitPane();
        controlPanel = new javax.swing.JPanel();
        btnAdmin = new javax.swing.JButton();
        loadData = new javax.swing.JButton();
        userProcessContainer = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Administrator Dashboard");

        splitPane.setDividerLocation(150);
        splitPane.setOpaque(false);

        btnAdmin.setText("Administrator");
        btnAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminActionPerformed(evt);
            }
        });

        loadData.setText("Load Patient Data");
        loadData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadDataActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout controlPanelLayout = new javax.swing.GroupLayout(controlPanel);
        controlPanel.setLayout(controlPanelLayout);
        controlPanelLayout.setHorizontalGroup(
            controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loadData, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        controlPanelLayout.setVerticalGroup(
            controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlPanelLayout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(btnAdmin)
                .addGap(26, 26, 26)
                .addComponent(loadData)
                .addContainerGap(112, Short.MAX_VALUE))
        );

        splitPane.setLeftComponent(controlPanel);

        userProcessContainer.setLayout(new java.awt.CardLayout());
        splitPane.setRightComponent(userProcessContainer);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPane, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPane)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminActionPerformed

        AdminWorkPanel admin = new AdminWorkPanel(userProcessContainer, patient_directory,person_directory,vitals,patient,encou );
        userProcessContainer.add("AdminWorkAreaJPanel",admin);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnAdminActionPerformed

    private void loadDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadDataActionPerformed
        CreatePersonData cd = new CreatePersonData();
        ArrayList<Person> list = new ArrayList<Person>();
        list.addAll(cd.CreatePersonData());
        person_directory.setPersonList(list);
        JOptionPane.showMessageDialog(this, "Person Data from configuration loaded");        // TODO add your handling code here:
    }//GEN-LAST:event_loadDataActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdmin;
    private javax.swing.JPanel controlPanel;
    private javax.swing.JButton loadData;
    private javax.swing.JSplitPane splitPane;
    private javax.swing.JPanel userProcessContainer;
    // End of variables declaration//GEN-END:variables
}
