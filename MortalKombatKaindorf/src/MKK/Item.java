/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MKK;

/**
 *
 * @author Richard Hofmeister
 */
public abstract class Item {

    private int deltaAttack;
    private int deltaDefense;

    public Item(int deltaAttack, int deltaDefense) {
        this.deltaAttack = deltaAttack;
        this.deltaDefense = deltaDefense;
    }
}
