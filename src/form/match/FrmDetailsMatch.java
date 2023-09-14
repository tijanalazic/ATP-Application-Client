package form.match;

import components.TableModelPlayerStatistics;
import controller.Communication;
import domain.Match;
import domain.Player;
import domain.PlayerStatistics;
import domain.Stadium;
import domain.Tournament;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultCellEditor;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.TableColumn;

/**
 *
 * @author DELL
 */
public class FrmDetailsMatch extends javax.swing.JDialog {
    
    Match match;
    List<Tournament> tournaments;
    List<Stadium> stadiums;
    List<Player> players;
    List<PlayerStatistics> statistics;
    Player player1;
    Player player2;
    Player player1New = null;
    Player player2New = null;
    PlayerStatistics statistics1;
    PlayerStatistics statistics2;
    PlayerStatistics statistics1New = null;
    PlayerStatistics statistics2New = null;
    int index = 0;

    public FrmDetailsMatch(java.awt.Frame parent, boolean modal, Match match) {
        super(parent, modal);
        this.match = match;
        this.player1 = match.getPlayer1();
        this.player2 = match.getPlayer2();
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Match Details");
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
        btnUpdate = new javax.swing.JButton();
        btnAllowChanges = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cmbPlayer2 = new javax.swing.JComboBox();
        cmbPlayer1 = new javax.swing.JComboBox();
        txtDate = new javax.swing.JTextField();
        cmbTournaments = new javax.swing.JComboBox();
        cmbStadium = new javax.swing.JComboBox();
        btnChangePlayer1 = new javax.swing.JButton();
        btnChangePlayer2 = new javax.swing.JButton();
        panelPlayersStatistics = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblStatistics = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnCreateStatisticsPlayer1 = new javax.swing.JButton();
        btnCreateStatisticsPlayer2 = new javax.swing.JButton();
        btnEditTable = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Insert match data:"));

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnAllowChanges.setText("Allow changes");
        btnAllowChanges.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAllowChangesActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnCancel.setText("Cancel");

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setText("Tournament:");

        jLabel3.setText("Date:");

        jLabel5.setText("Player 1:");

        jLabel6.setText("Player 2:");

        jLabel7.setText("Stadium:");

        cmbPlayer2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPlayer2ActionPerformed(evt);
            }
        });

        cmbPlayer1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPlayer1ActionPerformed(evt);
            }
        });

        btnChangePlayer1.setText("Change Player 1");
        btnChangePlayer1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangePlayer1ActionPerformed(evt);
            }
        });

        btnChangePlayer2.setText("Change Player 2");
        btnChangePlayer2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangePlayer2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(cmbPlayer1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnChangePlayer1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbTournaments, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbStadium, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(cmbPlayer2, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnChangePlayer2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(cmbTournaments, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbPlayer1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnChangePlayer1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbPlayer2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnChangePlayer2))
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbStadium, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelPlayersStatisticsLayout = new javax.swing.GroupLayout(panelPlayersStatistics);
        panelPlayersStatistics.setLayout(panelPlayersStatisticsLayout);
        panelPlayersStatisticsLayout.setHorizontalGroup(
            panelPlayersStatisticsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelPlayersStatisticsLayout.setVerticalGroup(
            panelPlayersStatisticsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 117, Short.MAX_VALUE)
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tblStatistics.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblStatistics);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Players Statistics:");

        btnCreateStatisticsPlayer1.setText("Create statistics for player 1");
        btnCreateStatisticsPlayer1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateStatisticsPlayer1ActionPerformed(evt);
            }
        });

        btnCreateStatisticsPlayer2.setText("Create statistics for player 2");
        btnCreateStatisticsPlayer2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateStatisticsPlayer2ActionPerformed(evt);
            }
        });

        btnEditTable.setText("Edit Table");
        btnEditTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditTableActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnEditTable, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                        .addComponent(btnCreateStatisticsPlayer1)
                        .addGap(36, 36, 36)
                        .addComponent(btnCreateStatisticsPlayer2, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCreateStatisticsPlayer1)
                    .addComponent(btnCreateStatisticsPlayer2)
                    .addComponent(btnEditTable))
                .addContainerGap(9, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAllowChanges, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(127, 127, 127)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelPlayersStatistics, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelPlayersStatistics, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDelete)
                    .addComponent(btnAllowChanges)
                    .addComponent(btnUpdate))
                .addGap(18, 18, 18)
                .addComponent(btnCancel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int option = JOptionPane.showConfirmDialog(this, "If you delete match, statistics for players will be deleted too/ Are you sure? ", "Delete", JOptionPane.OK_CANCEL_OPTION);
        if(option == 0) {
            try {
                Communication.getInstance().deleteMatch(match);
                JOptionPane.showMessageDialog(this, "System has deleted match.", "", JOptionPane.INFORMATION_MESSAGE);
                this.dispose();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "System cannot delete match.", "", JOptionPane.INFORMATION_MESSAGE);
                Logger.getLogger(FrmDetailsMatch.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            return;
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnAllowChangesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAllowChangesActionPerformed
        btnUpdate.setEnabled(true);
        if(match.getDate().isBefore(LocalDate.now(ZoneId.systemDefault()))) {
            txtDate.setEnabled(false);
            cmbTournaments.setEnabled(false);
            cmbStadium.setEnabled(false);
        } else {
            txtDate.setEnabled(true);
            cmbStadium.setEnabled(true);
        }
        btnEditTable.setVisible(true);
        
        panelPlayersStatistics.setEnabled(true);
        btnEditTable.setEnabled(true);
    }//GEN-LAST:event_btnAllowChangesActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        try {
            LocalDate matchDate = LocalDate.parse(txtDate.getText());
            Stadium stadium = (Stadium) cmbStadium.getSelectedItem();
            for (Tournament t : tournaments) {
                if(t.getName().equals(match.getTournament().getName())) {
                    LocalDate beninningDate = t.getBeginningDate();
                    LocalDate endingDate = t.getEndingDate();
                    if(matchDate.isBefore(beninningDate) || matchDate.isAfter(endingDate)) {
                        JOptionPane.showMessageDialog(this, "Tournament " + match.getTournament().getName() + " is held between " + beninningDate.toString() + " and " + endingDate.toString(), "Date Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                    if(!(t.getCity().equals(stadium.getCity()))) {
                        JOptionPane.showMessageDialog(this, "Stadium " + stadium.getName() + " isn't available for tournament " + match.getTournament().getName());
                        return;
                    }
                }
            }
            match.setDate(matchDate);
            match.setStadium(stadium);
            
            if(index == 1 && player1New != null && statistics1New == null) {
                JOptionPane.showMessageDialog(this, "Please create statistics for player " + player1New + " or cancel updating match!", "", JOptionPane.ERROR_MESSAGE);
                return;
            } 
            if(index == 2 && player2New != null && statistics2New == null) {
                JOptionPane.showMessageDialog(this, "Please create statistics for player " + player2New + " or cancel updating match!", "", JOptionPane.ERROR_MESSAGE);
                return;
            } 
            if(index == 1 && statistics1New != null && player1New != null) {
                try {
                    match.setPlayer1(player1New);
                    Communication.getInstance().deletePlayersStatistics(statistics1);
                    Communication.getInstance().createPlayersStatistics(statistics1New);
                    PlayerStatistics s2 = getUpdatedStatistics(1);
                    Communication.getInstance().updatePlayerStatistics(s2);
                } catch (Exception ex) {
                    Logger.getLogger(FrmDetailsMatch.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                    PlayerStatistics s1 = getUpdatedStatistics(0);
                    PlayerStatistics s2 = getUpdatedStatistics(1);
                try {
                    Communication.getInstance().updatePlayerStatistics(s1);
                    Communication.getInstance().updatePlayerStatistics(s2);
                } catch (Exception ex) {
                    Logger.getLogger(FrmDetailsMatch.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(index == 2 && statistics2New != null && player2New != null) {
                try {
                    match.setPlayer2(player2New);
                    Communication.getInstance().deletePlayersStatistics(statistics2);
                    Communication.getInstance().createPlayersStatistics(statistics2New);
                    PlayerStatistics s1 = getUpdatedStatistics(0);
                    Communication.getInstance().updatePlayerStatistics(s1);
                } catch (Exception ex) {
                    Logger.getLogger(FrmDetailsMatch.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                    PlayerStatistics s1 = getUpdatedStatistics(0);
                    PlayerStatistics s2 = getUpdatedStatistics(1);
                try {
                    Communication.getInstance().updatePlayerStatistics(s1);
                    Communication.getInstance().updatePlayerStatistics(s2);
                } catch (Exception ex) {
                    Logger.getLogger(FrmDetailsMatch.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            Communication.getInstance().saveMatch(match);
            disableFields();
            btnCreateStatisticsPlayer1.setVisible(false);
            btnCreateStatisticsPlayer2.setVisible(false);
            JOptionPane.showMessageDialog(this, "The system has memorized match.", "", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception ex) {
            Logger.getLogger(FrmDetailsMatch.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "The system cannot memorize match.", "", JOptionPane.ERROR_MESSAGE);
        }
        
        
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void cmbPlayer1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPlayer1ActionPerformed
        player1New = (Player) cmbPlayer1.getSelectedItem();
        btnCreateStatisticsPlayer1.setVisible(true);
        cmbPlayer1.setEnabled(false);
    }//GEN-LAST:event_cmbPlayer1ActionPerformed

    private void cmbPlayer2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPlayer2ActionPerformed
        player2New = (Player) cmbPlayer2.getSelectedItem();
        btnCreateStatisticsPlayer2.setVisible(true);
        cmbPlayer1.setEnabled(false);
    }//GEN-LAST:event_cmbPlayer2ActionPerformed

    private void btnChangePlayer1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangePlayer1ActionPerformed
        int option = JOptionPane.showConfirmDialog(this, "If you change player 1, previous statistics will be deleted. Are you sure?", "", JOptionPane.YES_NO_OPTION);
        if(option == 0) {
            cmbPlayer1.setEnabled(true);
            for (PlayerStatistics s : statistics) {
                if(s.getPlayer().equals(player1)) {
                    try {
                        statistics.remove(s);
                        index = 1;
                        tblStatistics.setModel(new TableModelPlayerStatistics(statistics));
                    } catch (Exception ex) {
                        Logger.getLogger(FrmDetailsMatch.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
            btnUpdate.setEnabled(true);
        }
    }//GEN-LAST:event_btnChangePlayer1ActionPerformed

    private void btnCreateStatisticsPlayer1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateStatisticsPlayer1ActionPerformed
        if(txtDate.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please enter date of the match!", "Data Entry Error", JOptionPane.ERROR_MESSAGE);
                return;
        }
        if(cmbPlayer1.getSelectedIndex()== -1) {
            JOptionPane.showMessageDialog(this, "Please select player 1!", "Data Entry Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if(cmbPlayer2.getSelectedIndex()== -1) {
            JOptionPane.showMessageDialog(this, "Please select player 2!", "Data Entry Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if(cmbStadium.getSelectedIndex()== -1) {
            JOptionPane.showMessageDialog(this, "Please select stadium!", "Data Entry Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if(player1.equals(player2)) {
            JOptionPane.showMessageDialog(this, "Please choose 2 different players!", "Data Entry Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if(!(player1.getAtpList().equals(player2.getAtpList()))) {
            JOptionPane.showMessageDialog(this, "Please choose players from the same ATP List!", "Data Entry Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        Player p = (Player) cmbPlayer1.getSelectedItem();
        if(p.equals(statistics.get(0).getPlayer())) {
            JOptionPane.showMessageDialog(this, "Please select 2 different players!", "", JOptionPane.ERROR_MESSAGE);
            return;
        }
        int option = JOptionPane.showConfirmDialog(this, "Do you want to create statistics for these players?", "", JOptionPane.YES_NO_OPTION);
        if(option == 0) {
            PlayerStatistics ps1 = new PlayerStatistics();
            ps1.setPlayer((Player) cmbPlayer1.getSelectedItem());
            ps1.setMatch(match);
            ps1.setAces(0);
            ps1.setDouble_faults(0);
            ps1.setWinners(0);
            ps1.setNet_points_won(0);
            ps1.setUnforced_errors(0);
            
            statistics1New = ps1;
            
            statistics.add(0, statistics1New);
            tblStatistics.setModel(new TableModelPlayerStatistics(statistics));
            
            btnCreateStatisticsPlayer1.setVisible(false);
            btnUpdate.setEnabled(true);
        }
    }//GEN-LAST:event_btnCreateStatisticsPlayer1ActionPerformed

    private void btnChangePlayer2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangePlayer2ActionPerformed
        int option = JOptionPane.showConfirmDialog(this, "If you change player 2, previous statistics will be deleted. Are you sure?", "", JOptionPane.YES_NO_OPTION);
        if(option == 0) {
           cmbPlayer2.setEnabled(true); 
            for (PlayerStatistics s : statistics) {
                if(s.getPlayer().equals(player2)) {
                    try {
                        statistics.remove(s);
                        index = 2;
                        tblStatistics.setModel(new TableModelPlayerStatistics(statistics));
                    } catch (Exception ex) {
                        Logger.getLogger(FrmDetailsMatch.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
           btnCreateStatisticsPlayer2.setVisible(true);
        }
    }//GEN-LAST:event_btnChangePlayer2ActionPerformed

    private void btnCreateStatisticsPlayer2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateStatisticsPlayer2ActionPerformed
        if(txtDate.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please enter date of the match!", "Data Entry Error", JOptionPane.ERROR_MESSAGE);
                return;
        }
        if(cmbPlayer1.getSelectedIndex()== -1) {
            JOptionPane.showMessageDialog(this, "Please select player 1!", "Data Entry Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if(cmbPlayer2.getSelectedIndex()== -1) {
            JOptionPane.showMessageDialog(this, "Please select player 2!", "Data Entry Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if(cmbStadium.getSelectedIndex()== -1) {
            JOptionPane.showMessageDialog(this, "Please select stadium!", "Data Entry Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if(player1.equals(player2)) {
            JOptionPane.showMessageDialog(this, "Please choose 2 different players!", "Data Entry Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if(!(player1.getAtpList().equals(player2.getAtpList()))) {
            JOptionPane.showMessageDialog(this, "Please choose players from the same ATP List!", "Data Entry Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        int option = JOptionPane.showConfirmDialog(this, "Do you want to create statistics for tplayer?", "", JOptionPane.YES_NO_OPTION);
        if(option == 0) {
            PlayerStatistics ps1 = new PlayerStatistics();
            ps1.setPlayer((Player) cmbPlayer2.getSelectedItem());
            ps1.setMatch(match);
            ps1.setAces(0);
            ps1.setDouble_faults(0);
            ps1.setWinners(0);
            ps1.setNet_points_won(0);
            ps1.setUnforced_errors(0);
            
            statistics2New = ps1;
            
            statistics.add(1, statistics2New);
            tblStatistics.setModel(new TableModelPlayerStatistics(statistics));
            
            btnCreateStatisticsPlayer2.setVisible(false);
        }
    }//GEN-LAST:event_btnCreateStatisticsPlayer2ActionPerformed

    private void btnEditTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditTableActionPerformed
        LocalDate matchDate = LocalDate.parse(txtDate.getText().trim());
        
        if(matchDate.isAfter(LocalDate.now(ZoneId.systemDefault()))) {
            JOptionPane.showMessageDialog(this, "This match has not been played yet, you can't edit players statistics.", "", JOptionPane.INFORMATION_MESSAGE);
            tblStatistics.setEnabled(false);
            btnChangePlayer1.setEnabled(true);
            btnChangePlayer2.setEnabled(true);
            return;
        } else {
            tblStatistics.setEnabled(true);
        }
    }//GEN-LAST:event_btnEditTableActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAllowChanges;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnChangePlayer1;
    private javax.swing.JButton btnChangePlayer2;
    private javax.swing.JButton btnCreateStatisticsPlayer1;
    private javax.swing.JButton btnCreateStatisticsPlayer2;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEditTable;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox cmbPlayer1;
    private javax.swing.JComboBox cmbPlayer2;
    private javax.swing.JComboBox cmbStadium;
    private javax.swing.JComboBox cmbTournaments;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelPlayersStatistics;
    private javax.swing.JTable tblStatistics;
    private javax.swing.JTextField txtDate;
    // End of variables declaration//GEN-END:variables

    private void prepareForm() {
        disableFields();
        txtDate.setText(match.getDate().toString());
        
        try {
            statistics = Communication.getInstance().getPlayerStatistics(match);
            if(!statistics.isEmpty()) {
                statistics.get(0).setPlayer(match.getPlayer1());
                statistics1 = statistics.get(0);
                statistics.get(1).setPlayer(match.getPlayer2());
                statistics2 = statistics.get(1);
            }
            
            tournaments = Communication.getInstance().getAllTournaments();
            for (Tournament t : tournaments) {
                cmbTournaments.addItem(t);
            }
            Tournament tournament = match.getTournament();
            cmbTournaments.setSelectedItem(tournament);
            
            stadiums = Communication.getInstance().getAllStadiums();
            for (Stadium s : stadiums) {
                cmbStadium.addItem(s);
            }
            Stadium stadium = match.getStadium();
            cmbStadium.setSelectedItem(stadium);
            
            players = Communication.getInstance().getAllPlayers();
            for (Player p : players) {
                cmbPlayer1.addItem(p);
                cmbPlayer2.addItem(p);
            }
            player1 = match.getPlayer1();
            cmbPlayer1.setSelectedItem(player1);
            player2 = match.getPlayer2();
            cmbPlayer2.setSelectedItem(player2);
            
            tblStatistics.setModel(new TableModelPlayerStatistics(statistics));
            JTextField jTextField = new JTextField();
            
            TableColumn t1 = tblStatistics.getColumnModel().getColumn(1);
            t1.setCellEditor(new DefaultCellEditor(jTextField));
            
            TableColumn t2 = tblStatistics.getColumnModel().getColumn(2);
            t2.setCellEditor(new DefaultCellEditor(jTextField));
            
            TableColumn t3 = tblStatistics.getColumnModel().getColumn(3);
            t3.setCellEditor(new DefaultCellEditor(jTextField));
            
            TableColumn t4 = tblStatistics.getColumnModel().getColumn(4);
            t4.setCellEditor(new DefaultCellEditor(jTextField));
            
            TableColumn t5 = tblStatistics.getColumnModel().getColumn(5);
            t5.setCellEditor(new DefaultCellEditor(jTextField));
        } catch (Exception ex) {
            Logger.getLogger(FrmDetailsMatch.class.getName()).log(Level.SEVERE, null, ex);
        }
        btnCreateStatisticsPlayer1.setVisible(false);
        btnCreateStatisticsPlayer2.setVisible(false);
    }

    private PlayerStatistics getUpdatedStatistics(int index) {
        PlayerStatistics ps = statistics.get(index);
        ps.setAces((Integer) tblStatistics.getValueAt(index, 1));
        ps.setDouble_faults((Integer) tblStatistics.getValueAt(index, 2));
        ps.setWinners((Integer) tblStatistics.getValueAt(index, 3));
        ps.setNet_points_won((Integer) tblStatistics.getValueAt(index, 4));
        ps.setUnforced_errors((Integer) tblStatistics.getValueAt(index, 5));
        
        return ps;
    }

    private void disableFields() {
        btnUpdate.setEnabled(false);
        cmbTournaments.setEnabled(false);
        cmbStadium.setEnabled(false);
        txtDate.setEnabled(false);
        cmbPlayer1.setEnabled(false);
        cmbPlayer2.setEnabled(false);
        tblStatistics.setEnabled(false);
        btnEditTable.setEnabled(false);
        btnChangePlayer1.setEnabled(false);
        btnChangePlayer2.setEnabled(false);
        
    }
}
