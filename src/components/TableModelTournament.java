/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package components;

import domain.Tournament;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author DELL
 */
public class TableModelTournament extends AbstractTableModel{
    
    private List<Tournament> tournaments = new ArrayList<>();
    private String columnNames[] = new String[]{"Name", "City", "Beginning date", "Ending date", "Number of players", "Type"};
    private Class columnClass[] = new Class[]{String.class, String.class, LocalDate.class, LocalDate.class, Integer.class, Integer.class};

    public TableModelTournament(List<Tournament> tournaments) {
        this.tournaments = tournaments;
    }

    @Override
    public int getRowCount() {
        return tournaments.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return columnClass[columnIndex];
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        if(columnIndex == 0 || columnIndex == 3 || columnIndex == 4){
            return false;
        }
        return true;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Tournament tournament = tournaments.get(rowIndex);
        
        switch(columnIndex){
            case 0:
                return tournament.getName();
            case 1:
                return tournament.getCity();
            case 2:
                return tournament.getBeginningDate();
            case 3:
                return tournament.getEndingDate();
            case 4:
                return tournament.getNumberOfPlayers();
            case 5:
                return tournament.getAtpType();
                default:
                    return "n/a";
        }
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        Tournament tournament = tournaments.get(rowIndex);
        
        switch(columnIndex){
            case 0:
                tournament.setTournamentID((Long)aValue);
                break;
            case 1:
                tournament.setName(aValue.toString());
                break;
            case 2:
                tournament.setCity(aValue.toString());
                break;
            case 3:
                tournament.setBeginningDate(LocalDate.parse(aValue.toString()));
                break;
            case 4:
                tournament.setEndingDate(LocalDate.parse(aValue.toString()));
                break;
            case 5:
                tournament.setNumberOfPlayers((Integer)aValue);
                break;
            case 6:
                tournament.setAtpType((Integer)aValue);
                break;
        }
    }
    
    public void add(Tournament tournament){
        tournaments.add(tournament);
        fireTableRowsInserted(tournaments.size()-1, tournaments.size()-1);
    }
    
    public void remove(int row){
        tournaments.remove(row);
        fireTableDataChanged();
    }
    
    public void update(Long id, String name, String city, Integer numberOfPlayers, Integer type){
        for (Tournament tournament : tournaments) {
            if(tournament.getTournamentID() == id){
                tournament.setName(name);
                tournament.setCity(city);
                tournament.setNumberOfPlayers(numberOfPlayers);
                tournament.setAtpType(type);
            }
        }
        fireTableDataChanged();
    }

    public List<Tournament> getTournaments() {
        return tournaments;
    }
    
}
