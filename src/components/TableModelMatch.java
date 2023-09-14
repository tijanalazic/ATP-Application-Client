/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package components;

import domain.Match;
import domain.Player;
import domain.Stadium;
import domain.Tournament;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author DELL
 */
public class TableModelMatch extends AbstractTableModel{
    
    List<Match> matches = new ArrayList<>();
    String columnNames[] = new String[]{"Tournament", "Player 1", "Player 2", "Date", "Stadium"};
    Class[] columnClass = new Class[]{Tournament.class, Player.class, Player.class, LocalDate.class, Stadium.class};

    public TableModelMatch(List<Match> matches) {
        this.matches = matches;
    }

    @Override
    public int getRowCount() {
        return matches.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }
    
    @Override
    public String getColumnName(int column) {
        if(column > columnNames.length){
            return "n/a";
        } else {
            return columnNames[column];
        }
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Match match = matches.get(rowIndex);
        
        switch(columnIndex){
            case 0:
                return match.getTournament();
            case 1:
                return match.getPlayer1();
            case 2:
                return match.getPlayer2();
            case 3:
                return match.getDate();
            case 4:
                return match.getStadium();
                default: 
                    return "n/a";
        }
    }
    
}
