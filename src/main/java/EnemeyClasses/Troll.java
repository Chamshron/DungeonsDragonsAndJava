package EnemeyClasses;

import Abstracts.Enemy;

public class Troll extends Enemy {

    public Troll(int health) {
        super(health);
    }

    public String attack(){
        return "Get ready for my attack!";
    }

    public void trollSpecialAttack(Enemy enemy){
        int damage = 35;
        if (damage <= enemy.getHealth()){
            enemy.setHealth(enemy.getHealth()-damage);
            System.out.println("Enemy has " + enemy.getHealth() + " HP left, don't give up now!");
        }
        else{
            enemy.setHealth(0);
            System.out.println("The enemy is dead!");
        }
    }

    @Override
    public void setHealth(int health) {
        super.setHealth(health);
    }

    @Override
    public int getHealth() {
        return super.getHealth();
    }

    @Override
    public long getId() {
        return super.getId();
    }

    @Override
    public void setId(long id) {
        super.setId(id);
    }

    public Troll() {
    }

}
