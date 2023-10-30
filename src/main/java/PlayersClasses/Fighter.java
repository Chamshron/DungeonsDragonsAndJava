package PlayersClasses;

import Abstracts.Enemy;
import Abstracts.Player;

import java.util.ArrayList;

public class Fighter extends Player implements iWeapon {

    private ArrayList<String> weapons;
    private String currentWeapon;

    public Fighter (String name, int health) {
        super(name, health);
        this.weapons = new ArrayList<>();
        weapons.add("Long sword");
        weapons.add("Broad sword");
        weapons.add("Short sword");
        this.currentWeapon = weapons.get(0);
    }

    public ArrayList<String> getWeapons() {
        return weapons;
    }

    public void setWeapons(ArrayList<String> weapons) {
        this.weapons = weapons;
    }

    public String getCurrentWeapon() {
        return currentWeapon;
    }

    public void setCurrentWeapon(String currentWeapon) {
        this.currentWeapon = currentWeapon;
    }

    @Override
    public void setHealth(int health) {
        super.setHealth(health);
    }

    @Override
    public int getHealth() {
        return super.getHealth();
    }

    public Fighter(){};

    @Override
    public void attack(Enemy enemy) {
        int damage;
        if (currentWeapon == "Short sword"){
            damage = 20;
        } else if (currentWeapon == "Broad sword"){
            damage = 35;
        } else{
            damage = 40;
        };
        if(damage <= enemy.getHealth()){
            enemy.setHealth(enemy.getHealth()-damage);
            System.out.println("Enemy has " + enemy.getHealth() + " HP left, don't give up now!");
        } else{
            enemy.setHealth(0);
            System.out.println("The enemy has been killed! HAZAH!");
        }

    }
}
