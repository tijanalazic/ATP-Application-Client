/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package form.tournament;

import controller.Communication;
import domain.ATPList;
import domain.Tournament;
import form.stadium.FrmDetailsStadium;
import java.time.LocalDate;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import validator.IValidator;
import validator.ValidatorException;
import validator.components.RegularValidator;

/**
 *
 * @author DELL
 */
public class FrmDetailsTournament extends javax.swing.JDialog {

    Tournament tournament;
    IValidator validator = new RegularValidator();
    
    /**
     * Creates new form FrmDetailsTournament
     */
    public FrmDetailsTournament(java.awt.Frame parent, boolean modal, Tournament tournament) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        this.tournament = tournament;
        setTitle("Tournament Details");
        prepareForm();
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
        txtName = new javax.swing.JTextField();
        lblName = new javax.swing.JLabel();
        lblCity = new javax.swing.JLabel();
        txtCity = new javax.swing.JTextField();
        lblBeginningDate = new javax.swing.JLabel();
        txtBeginningDate = new javax.swing.JTextField();
        txtEndingDate = new javax.swing.JTextField();
        lblEndingDate = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNumberOfPlayers = new javax.swing.JTextField();
        lblATPType = new javax.swing.JLabel();
        cmbATPType = new javax.swing.JComboBox<>();
        btnUpdate = new javax.swing.JButton();
        btnAllowChanges = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Insert tournament data:"));

        lblName.setText("Name:");

        lblCity.setText("City:");

        lblBeginningDate.setText("Beginning date:");

        lblEndingDate.setText("Ending date: ");

        jLabel6.setText("Number of players:");

        lblATPType.setText("ATP Type:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 2, Short.MAX_VALUE)
                        .addComponent(lblCity, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(txtName))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblBeginningDate)
                            .addComponent(lblEndingDate, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                            .addComponent(lblATPType, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNumberOfPlayers, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtEndingDate, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtBeginningDate)
                            .addComponent(cmbATPType, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCity))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBeginningDate)
                    .addComponent(txtBeginningDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEndingDate)
                    .addComponent(txtEndingDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtNumberOfPlayers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblATPType)
                    .addComponent(cmbATPType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnAllowChanges.setText("Allow Changes");
        btnAllowChanges.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAllowChangesActionPerformed(evt);
            }
        });

        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(btnAllowChanges)
                                .addGap(18, 18, 18)
                                .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdate)
                    .addComponent(btnAllowChanges)
                    .addComponent(btnDelete))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCancel)
                .addContainerGap(7, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        int option = JOptionPane.showConfirmDialog(null, "Are you sure you want to cancel updating torunament: " + tournament.getName());
        if(option == 0) {
            this.dispose();
        } else {
            return;
        }
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnAllowChangesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAllowChangesActionPerformed
        btnUpdate.setEnabled(true);
        txtCity.setEnabled(true);
        txtEndingDate.setEnabled(true);
        txtBeginningDate.setEnabled(true);
        txtName.setEnabled(true);
        txtNumberOfPlayers.setEnabled(true);
        cmbATPType.setEnabled(true);
    }//GEN-LAST:event_btnAllowChangesActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        try {
            validator.validateTournament(txtName.getText().trim(), txtCity.getText().trim(), txtBeginningDate.getText(), txtEndingDate.getText(), txtNumberOfPlayers.getText());
        } catch(ValidatorException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Data Entry Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        String name = txtName.getText().trim();
        String city = txtCity.getText().trim();
        LocalDate endingDate;
         try {
            endingDate = LocalDate.parse(txtEndingDate.getText().trim());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Please insert ending date in format YYYY/MM/DD", "", JOptionPane.ERROR_MESSAGE);
            return;
        }
        LocalDate beginningDate;
        try {
            beginningDate = LocalDate.parse(txtBeginningDate.getText().trim());
        } catch(Exception e) {
            JOptionPane.showMessageDialog(this, "Please insert start date in format YYYY/MM/DD", "", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if(beginningDate.isAfter(endingDate)) {
            JOptionPane.showMessageDialog(this, "The start date of the tournament must be before the end date of the tournament", "Data Entry Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        Integer numberOfPlayers = Integer.parseInt(txtNumberOfPlayers.getText());
        Integer type = (Integer) (cmbATPType.getSelectedItem());
        
        int option = JOptionPane.showConfirmDialog(null, "Are you sure you want to update tournament: " + tournament.getName());
        if(option == 0) {
            try {
                tournament.setName(name);
                tournament.setCity(city);
                tournament.setBeginningDate(beginningDate);
                tournament.setEndingDate(endingDate);
                tournament.setNumberOfPlayers(numberOfPlayers);
                tournament.setAtpType(type);
                System.out.println(tournament);
                tournament = Communication.getInstance().saveTournament(tournament);
                JOptionPane.showMessageDialog(this, "The system has memorized tournament.", "Update", JOptionPane.INFORMATION_MESSAGE);
                
                disableFields();
            } catch (Exception ex) {
                Logger.getLogger(FrmDetailsTournament.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(this, "The system cannot memorize tournament. ", "Update", JOptionPane.ERROR_MESSAGE);
            } 
        } else {
            return;
        }
        
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int option = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete tournament: " + tournament.getName());
        if(option == 0) {
            try {
                Communication.getInstance().deleteTournament(tournament);
                JOptionPane.showMessageDialog(this, "The system deleted stadium " + tournament.getName(), "Delete", JOptionPane.INFORMATION_MESSAGE);
                this.dispose();
            } catch (Exception ex) {
                Logger.getLogger(FrmDetailsStadium.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(this, "The system cannot delete stadium " + tournament.getName(), "Delete", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnDeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAllowChanges;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<Integer> cmbATPType;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblATPType;
    private javax.swing.JLabel lblBeginningDate;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblEndingDate;
    private javax.swing.JLabel lblName;
    private javax.swing.JTextField txtBeginningDate;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtEndingDate;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtNumberOfPlayers;
    // End of variables declaration//GEN-END:variables

    private void prepareForm() {
        txtCity.setEnabled(false);
        txtEndingDate.setEnabled(false);
        txtBeginningDate.setEnabled(false);
        txtName.setEnabled(false);
        txtNumberOfPlayers.setEnabled(false);
        
        cmbATPType.addItem(250);
        cmbATPType.addItem(500);
        cmbATPType.addItem(1000);
        cmbATPType.addItem(2000);
        cmbATPType.setEnabled(false);
        
        btnUpdate.setEnabled(false);
        
        fillForm(tournament);
    }

    private void fillForm(Tournament tournament) {
        txtName.setText(tournament.getName());
        txtCity.setText(tournament.getCity());
        txtBeginningDate.setText(String.valueOf(tournament.getBeginningDate()));
        txtEndingDate.setText(String.valueOf(tournament.getEndingDate()));
        txtNumberOfPlayers.setText(String.valueOf(tournament.getNumberOfPlayers()));
        cmbATPType.setSelectedItem(tournament.getAtpType());
    }

    private void disableFields() {
        txtCity.setEnabled(false);
        txtEndingDate.setEnabled(false);
        txtBeginningDate.setEnabled(false);
        txtName.setEnabled(false);
        txtNumberOfPlayers.setEnabled(false);
        cmbATPType.setEnabled(false);
        
        btnUpdate.setEnabled(false);
    }

}
