/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package components;

import domain.ATPList;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author DELL
 */
public class TableModelATPList extends AbstractTableModel{
    
    List<ATPList> atpLists = new ArrayList<>();
    String columNames[] = new String[]{"Name", "Number of seats"};
    Class columnClass[] = new Class[]{String.class, Integer.class};

    public TableModelATPList(List<ATPList> atpLists) {
        this.atpLists = atpLists;
    }

    @Override
    public int getRowCount() {
        return atpLists.size();
    }

    @Override
    public int getColumnCount() {
        return columNames.length;
    }

    @Override
    public String getColumnName(int column) {
        if(column > columNames.length){
            return "n/a";
        }
        return columNames[column];
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
        ATPList atplist = atpLists.get(rowIndex);
        
        switch(columnIndex){
            case 0:
                return atplist.getName();
            case 1:
                return atplist.getNumberOfPlayers();
                default:
                    return "n/a";
        }
    }
    
}
