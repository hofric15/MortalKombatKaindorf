/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MKK;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Richard Hofmeister
 */
public class MKKTableModel extends AbstractTableModel{

    private ArrayList<Player> players = new ArrayList<>();
    String[] names = {"Typ", "Name", "Atk", "Def", "HP", "Items"};
    
    public void add(Player p)
    {
        players.add(p);
        this.fireTableDataChanged();
    }
    
    public void remove(Player p)
    {
        players.remove(p);
        this.fireTableDataChanged();
    }

    @Override
    public int getRowCount() {
        return names.length;
    }

    @Override
    public String getColumnName(int column) {
        return names[column];
    }
    
    @Override
    public int getColumnCount() {
        return players.size();
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Player p = players.get(rowIndex);
        return p;
    }
    
}
