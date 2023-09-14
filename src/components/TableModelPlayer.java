/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package components;

import domain.ATPList;
import domain.Player;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author DELL
 */
public class TableModelPlayer extends AbstractTableModel{
    
    List<Player> players = new ArrayList<>();
    String columnNames[] = new String[]{"Firstname", "Lastname", "Birthday", "State", "Points", "Height", "Weight", "ATPList"};
    Class[] columnClass = new Class[]{String.class, String.class, LocalDate.class, String.class, Integer.class, Double.class, Double.class, ATPList.class};

    public TableModelPlayer(List<Player> players) {
        this.players = players;
    }

    @Override
    public int getRowCount() {
        return players.size();
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
    public Class<?> getColumnClass(int columnIndex) {
        if(columnIndex > columnClass.length){
            return Object.class;
        } else {
            return columnClass[columnIndex];
        }
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Player player = players.get(rowIndex);
        
        switch(columnIndex){
            case 0:
                return player.getFirstName();
            case 1:
                return player.getLastName();
            case 2:
                return player.getBirthday();
            case 3:
                return player.getState();
            case 4:
                return player.getPoints();
            case 5:
                return player.getHeight();
            case 6:
                return player.getWeight();
            case 7:
                return player.getAtpList();
                default: 
                    return "n/a";
        }
    }
    
}
