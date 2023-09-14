package form.atplist;

import controller.Communication;
import domain.ATPList;
import form.player.FrmNewPlayer;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
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
public class FrmNewATPList extends javax.swing.JDialog {
    
    ATPList atpList;
    ATPList x;
    List<ATPList> atpLists = new ArrayList<>();
    IValidator validator = new RegularValidator();
    
    
    public FrmNewATPList(java.awt.Frame parent, boolean modal, ATPList atpList) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        this.atpList = atpList;
        setTitle("Create ATP List");
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
        lblName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtNumberOfPlayers = new javax.swing.JTextField();
        lblNumberOfPlayers = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        btnViewATPLists = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Insert data for ATP List"));

        lblName.setText("Name:");

        lblNumberOfPlayers.setText("Number of players:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblNumberOfPlayers, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtName, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                    .addComponent(txtNumberOfPlayers))
                .addGap(19, 19, 19))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumberOfPlayers)
                    .addComponent(txtNumberOfPlayers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnViewATPLists.setText("View All ATP lists");
        btnViewATPLists.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewATPListsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(btnViewATPLists, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(9, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnViewATPLists, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        try {
            try {
                validator.validateATPList(txtName.getText().trim(), txtNumberOfPlayers.getText().trim());
            } catch(ValidatorException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(), "", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            List<ATPList> atplists = Communication.getInstance().getAllATPLists();
            for (ATPList a : atplists) {
                if(a.getName().equals(txtName.getText().trim())) {
                    JOptionPane.showMessageDialog(this, "ATP List: " + txtName.getText().trim() + " already exists!", "", JOptionPane.WARNING_MESSAGE);
                    return;
                }
            }
            
            String name = txtName.getText();
            Integer numberOfPlayers = Integer.parseInt(txtNumberOfPlayers.getText());
            
            atpList.setName(name);
            atpList.setNumberOfPlayers(numberOfPlayers);
            
            int selected = JOptionPane.showConfirmDialog(this, "Are you sure you want to save ATP List " + atpList.getName(), "Save ATP List", JOptionPane.YES_NO_CANCEL_OPTION);
            
            if(selected == 0){
                x = Communication.getInstance().saveATPList(atpList);
                if(x == null) {
                   JOptionPane.showMessageDialog(this, "System cannot memorize ATP List.", "Error", JOptionPane.ERROR_MESSAGE); 
                } else {
                    JOptionPane.showMessageDialog(this, "System has memorized ATP List.", "Success", JOptionPane.INFORMATION_MESSAGE);
                    btnViewATPLists.setVisible(true);
                    txtName.setEnabled(false);
                    txtNumberOfPlayers.setEnabled(false);
                }
            } else if(selected == 1){
                return;
            } else {
                this.dispose();
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error: \n" + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnViewATPListsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewATPListsActionPerformed
        this.dispose();
        new FrmViewATPLists(null, true).setVisible(true);
    }//GEN-LAST:event_btnViewATPListsActionPerformed

    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnViewATPLists;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblNumberOfPlayers;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtNumberOfPlayers;
    // End of variables declaration//GEN-END:variables

    private void prepareForm() {
        btnViewATPLists.setVisible(false);
        
        this.addWindowListener(new WindowAdapter() {
            
            @Override
            public void windowClosing(WindowEvent e) {
                try {
                    Communication.getInstance().deleteATPList(atpList);
                } catch (Exception ex) {
                    Logger.getLogger(FrmNewPlayer.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
}
