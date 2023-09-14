/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package components;

import domain.Stadium;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author DELL
 */
public class TableModelStadium extends AbstractTableModel{
    
    List<Stadium> stadiums = new ArrayList<>();
    String columnNames[] = new String[]{"Name", "Seats", "City"};
    Class columnClass[] = new Class[]{String.class, Integer.class, String.class};

    public TableModelStadium(List<Stadium> stadiums) {
        this.stadiums = stadiums;
    }

    @Override
    public int getRowCount() {
        return stadiums.size();
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
        Stadium stadium = stadiums.get(rowIndex);
        
        switch(columnIndex){
            case 0:
                return stadium.getName();
            case 1:
                return stadium.getNumberOfSeats();
            case 2:
                return stadium.getCity();
                default:
                    return "n/a";
        }
    }
    
}
