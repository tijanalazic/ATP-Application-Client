package components;

import domain.Player;
import domain.PlayerStatistics;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author DELL
 */
public class TableModelPlayerStatistics extends AbstractTableModel{
    
    List<PlayerStatistics> statistics = new ArrayList<>();
    String columnNames[] = new String[]{"Player", "Aces", "Double Faults", "Winner", "Net Points Won", "Unforced Errors"};
    Class[] columnClass = new Class[]{Player.class, Integer.class, Integer.class, Integer.class, Integer.class, Integer.class};

    public TableModelPlayerStatistics(List<PlayerStatistics> statistics) {
        this.statistics = statistics;
    }

    @Override
    public int getRowCount() {
        return statistics.size();
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
        PlayerStatistics stat = statistics.get(rowIndex);
        
        switch(columnIndex){
            case 0:
                return stat.getPlayer();
            case 1:
                return stat.getAces();
            case 2:
                return stat.getDouble_faults();
            case 3:
                return stat.getWinners();
            case 4:
                return stat.getNet_points_won();
            case 5:
                return stat.getUnforced_errors();
                default: 
                    return "n/a";
        }
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        PlayerStatistics stat = statistics.get(rowIndex);
        
        switch(columnIndex){
            case 0:
                stat.setPlayer((Player) aValue);
                break;
            case 1:
                stat.setAces(Integer.parseInt(aValue.toString()));
                break;
            case 2:
                stat.setDouble_faults(Integer.parseInt(aValue.toString()));
                break;
            case 3:
                stat.setWinners(Integer.parseInt(aValue.toString()));
                break;
            case 4:
                stat.setNet_points_won(Integer.parseInt(aValue.toString()));
                break;
            case 5:
                stat.setUnforced_errors(Integer.parseInt(aValue.toString()));
                break;
        }
        
        this.fireTableRowsUpdated(rowIndex, columnIndex);
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        if(columnIndex == 1 || columnIndex == 2 || columnIndex == 3 || columnIndex == 4 || columnIndex == 5) {
            return true;
        }
        return false;
    }
    
    public void remove(PlayerStatistics playerStatistics) {
        statistics.remove(playerStatistics);
        fireTableDataChanged();
    }
}
