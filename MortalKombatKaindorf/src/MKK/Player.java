/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MKK;

import java.util.ArrayList;

/**
 *
 * @author Richard Hofmeister
 */
public abstract class Player {
    private String name;
    private int attack;
    private int defense;
    private int hp;
    private ArrayList<Item> items = new ArrayList<>();

    public Player(String name, int attack, int defense, int hp) {
        this.name = name;
        this.attack = attack;
        this.defense = defense;
        this.hp = hp;
    }
    
    public void fight(Player p)
    {
        if(p.getAttack()-defense > 0)
        {
            hp = hp-(p.getAttack()-defense);
            System.out.println("Boom Bich!");
        }
        else
        {
            System.out.println("Der Rüstungswert ist zu hoch !!!");
        }
    }

    public ArrayList<Item> getItems() {
        return items;
    }
    
    public void addItem(Item i)
    {
        items.add(i);
    }
    
    public void removeItem(Item i)
    {
        items.remove(i);
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
    
    
}