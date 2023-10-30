package EnemeyClasses;

import Abstracts.Enemy;
import Abstracts.Player;
import PlayersClasses.Familiar;
import PlayersClasses.Warlock;
import PlayersClasses.Wizard;

public class Dragon extends Enemy {
    public Dragon(int health) {
        super(health);
    }

    public String attack(){
        int damage = 45;
        return "ROOOAR! GET READY FOR MY FLAMES!!!";
    }

    public void dragonSpecialAttack(Enemy enemy){
        int damage = 95;
        if (damage <= enemy.getHealth()){
            enemy.setHealth(enemy.getHealth()-damage);
            System.out.println("Enemy has " + enemy.getHealth() + " HP left, don't give up now!");
        }
        else{
            enemy.setHealth(0);
            System.out.println("The enemy is dead!");
        }
    }

    public void dragonPlayerAttack(Player player) {
        int damage = 95;
        if (player instanceof Wizard) {
            Wizard wizard = (Wizard) player;
            if (wizard.getFamiliar().getHealth() >= damage) {
                int famHealth = wizard.getFamiliar().getHealth();
                int updatedHealth = famHealth - damage;
                wizard.getFamiliar().setHealth(updatedHealth);
                System.out.println(wizard.getFamiliar().getName() + " has taken " + damage + " points of damage");
            } else {
                wizard.getFamiliar().setHealth(0);
                System.out.println(wizard.getFamiliar().getName() + " is dead!");
            }} else if (player instanceof Warlock) {
                Warlock warlock = (Warlock) player;
                if (warlock.getFamiliar().getHealth() >= damage) {
                    int famHealth = warlock.getFamiliar().getHealth();
                    int updatedHealth = famHealth - damage;
                    warlock.getFamiliar().setHealth(updatedHealth);
                    System.out.println(warlock.getFamiliar().getName() + " has taken " + damage + " points of damage");
                } else {
                    warlock.getFamiliar().setHealth(0);
                    System.out.println(warlock.getFamiliar().getName() + " is dead!");
                }} else if(player.getHealth() >= damage){
                    player.setHealth(getHealth()-damage);
                 } else{
            player.setHealth(0);
            System.out.println("Oh No! You died!");
        }
    }

    @Override
    public void setId(long id) {
        super.setId(id);
    }

    @Override
    public long getId() {
        return super.getId();
    }

    @Override
    public int getHealth() {
        return super.getHealth();
    }

    @Override
    public void setHealth(int health) {
        super.setHealth(health);
    }

    public Dragon() {
    }
}
