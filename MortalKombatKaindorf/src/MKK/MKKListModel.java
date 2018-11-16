/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MKK;

import java.util.ArrayList;
import javax.swing.AbstractListModel;

/**
 *
 * @author Richard Hofmeister
 */
public class MKKListModel extends AbstractListModel{

    private ArrayList<Item> items = new ArrayList<>();
    
    public void add(Player p)
    {
        ArrayList<Item> items = p.getItems();
        for (int i = 0; i < p.getItems().size(); i++) {
            this.items.add(items.get(i));
        }
    }
    
    @Override
    public int getSize() {
        return items.size();
    }

    @Override
    public Object getElementAt(int index) {
        return items.get(index);
    }
    
}
