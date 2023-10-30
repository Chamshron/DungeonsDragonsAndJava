package PlayersClasses;

import Abstracts.Enemy;
import Abstracts.Player;

import java.util.ArrayList;

public class Warlock extends Player implements iSpell {

    private ArrayList<String> spells;
    private String preparedSpell;

    private Familiar familiar;

    public Warlock(String name, int health) {
        super(name, health);
        this.spells = new ArrayList<>();
        spells.add("Eldritch Blast");
        spells.add("Hex");
        spells.add("Witch Bolt");
        this.preparedSpell = spells.get(0);
        this.familiar = new Familiar(25,"George");
    }

    public Familiar getFamiliar() {
        return familiar;
    }

    public void setFamiliar(Familiar familiar) {
        this.familiar = familiar;
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

    @Override
    public void attack(Enemy enemy) {
        int damage;
        if (preparedSpell == "Witch Bolt"){
            damage = 20;
        } else if (preparedSpell == "Eldritch Blast"){
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
