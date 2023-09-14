package form.tournament;

import controller.Communication;
import domain.Tournament;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
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
public class FrmNewTournament extends javax.swing.JDialog {
    
    Tournament tournament;
    Tournament x;
    IValidator validator = new RegularValidator();
    
    public FrmNewTournament(java.awt.Frame parent, boolean modal, Tournament tournament) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Create Tournament");
        this.tournament = tournament;
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
        cmbATPType = new javax.swing.JComboBox();
        btnSave = new javax.swing.JButton();
        btnViewAllTournaments = new javax.swing.JButton();

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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNumberOfPlayers, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblEndingDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblBeginningDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblCity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtName, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                            .addComponent(txtCity)
                            .addComponent(txtBeginningDate)
                            .addComponent(txtEndingDate)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblATPType, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbATPType, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCity)
                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBeginningDate)
                    .addComponent(txtBeginningDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEndingDate)
                    .addComponent(txtEndingDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtNumberOfPlayers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblATPType)
                    .addComponent(cmbATPType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44))
        );

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnViewAllTournaments.setText("View All Tournaments");
        btnViewAllTournaments.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewAllTournamentsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnViewAllTournaments, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSave))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave)
                    .addComponent(btnViewAllTournaments))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        try {
            try {
                validator.validateTournament(txtName.getText().trim(), txtCity.getText().trim(), txtBeginningDate.getText().trim(), txtEndingDate.getText().trim(), txtNumberOfPlayers.getText());
            } catch(ValidatorException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(), "Data Entry Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
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
            if(cmbATPType.getSelectedIndex() == -1) {
                JOptionPane.showMessageDialog(this, "Please choose type of tournament!", "Data Entry Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            List<Tournament> tournaments = Communication.getInstance().getAllTournaments();
            for (Tournament t : tournaments) {
                if(t.getName().equals(txtName.getText().trim())) {
                    JOptionPane.showMessageDialog(this, "Tournament " + txtName.getText().trim() + " already exists!", "Data Entry Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            }
            
            String name = txtName.getText().trim();
            String city = txtCity.getText().trim();
            Integer numOfPlayers = Integer.parseInt(txtNumberOfPlayers.getText());
            Integer atpType = (Integer) cmbATPType.getSelectedItem();
           
            tournament.setName(name);
            tournament.setCity(city);
            tournament.setBeginningDate(beginningDate);
            tournament.setEndingDate(endingDate);
            tournament.setNumberOfPlayers(numOfPlayers);
            tournament.setAtpType(atpType);
            
            int selected = JOptionPane.showConfirmDialog(this, "Are you sure you want to save tournament " + tournament.getName(), "Save Tournament", JOptionPane.YES_NO_CANCEL_OPTION);
            
            if(selected == 0){
                x = Communication.getInstance().saveTournament(tournament);
                if(x == null) {
                   JOptionPane.showMessageDialog(this, "The system cannot memorize tournament.", "", JOptionPane.ERROR_MESSAGE); 
                } else {
                    JOptionPane.showMessageDialog(this, "The system has memorized tournament.", "", JOptionPane.INFORMATION_MESSAGE);
                    txtName.setEnabled(false);
                    txtCity.setEnabled(false);
                    txtBeginningDate.setEnabled(false);
                    txtEndingDate.setEnabled(false);
                    txtNumberOfPlayers.setEnabled(false);
                    cmbATPType.setEnabled(false);
                    btnViewAllTournaments.setVisible(true);
                }
            } else if(selected == 1){
                return;
            } else {
                this.dispose();
            }
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnViewAllTournamentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewAllTournamentsActionPerformed
        this.dispose();
        new FrmViewTournaments(null, true).setVisible(true);
    }//GEN-LAST:event_btnViewAllTournamentsActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnViewAllTournaments;
    private javax.swing.JComboBox cmbATPType;
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
        cmbATPType.addItem(250);
        cmbATPType.addItem(500);
        cmbATPType.addItem(1000);
        cmbATPType.addItem(2000);
        cmbATPType.setSelectedIndex(-1);
        btnViewAllTournaments.setVisible(false);
        
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                try {
                    Communication.getInstance().deleteTournament(tournament);
                } catch (Exception ex) {
                    Logger.getLogger(FrmNewTournament.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
}
