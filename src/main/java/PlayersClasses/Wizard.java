package PlayersClasses;

import Abstracts.Enemy;
import Abstracts.Player;

import java.util.ArrayList;

public class Wizard extends Player implements iSpell {

    private ArrayList<String> spells;
    private String preparedSpell;

    private Familiar familiar;

    public Wizard(String name, int health){
        super(name, health);
        this.spells = new ArrayList<>();
        spells.add("Fireball");
        spells.add("Acid Splash");
        spells.add("Burning Hands");
        this.preparedSpell = spells.get(0);
        this.familiar = new Familiar(25, "Gregory");
    }

    public ArrayList<String> getSpells() {
        return spells;
    }

    public void setSpells(ArrayList<String> spells) {
        this.spells = spells;
    }

    public String getPreparedSpell() {
        return preparedSpell;
    }

    public void setPreparedSpell(String preparedSpell) {
        this.preparedSpell = preparedSpell;
    }

    public Familiar getFamiliar() {
        return familiar;
    }

    public void setFamiliar(Familiar familiar) {
        this.familiar = familiar;
    }

    @Override
    public void attack(Enemy enemy) {
        int damage;
        if (preparedSpell == "Burning Hands"){
            damage = 20;
        } else if (preparedSpell == "Acid Splash"){
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
