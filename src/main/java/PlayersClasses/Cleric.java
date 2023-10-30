package PlayersClasses;

import Abstracts.Player;

import java.util.ArrayList;

public class Cleric extends Player implements iHeal {
    private ArrayList<String> healingSpells;
    private String preparedHealingSpell;

    public Cleric(String name, int health){
        super(name, health);
        this.healingSpells = new ArrayList<>();
        healingSpells.add("Healing Word");
        healingSpells.add("Cure Wounds");
        healingSpells.add("Mass Cure Wounds");
        this.preparedHealingSpell = healingSpells.get(0);
    };

    public ArrayList<String> getHealingSpells() {
        return healingSpells;
    }

    public void setHealingSpells(ArrayList<String> healingSpells) {
        this.healingSpells = healingSpells;
    }

    public String getPreparedHealingSpell() {
        return preparedHealingSpell;
    }

    public void setPreparedHealingSpell(String preparedHealingSpell) {
        this.preparedHealingSpell = preparedHealingSpell;
    }

    @Override
    public void heal(Player player) {
        int health;
        if(preparedHealingSpell == "Healing Word"){
            health = 20;
        } else if (preparedHealingSpell == "Cure Wounds"){
            health = 40;
        }else{
            health = 50;
        }
        int updatedHealth = player.getHealth() + health;
        player.setHealth(updatedHealth);
    }
}
