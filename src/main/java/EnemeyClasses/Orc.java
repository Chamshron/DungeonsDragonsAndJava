package EnemeyClasses;

import Abstracts.Enemy;

public class Orc extends Enemy {
    public Orc(int health) {
        super(health);
    }

    public String attack(){
        int damage = 54;
        return "Oh boy, I'm attacking";
    }

    public void orcSpecialAttack(Enemy enemy){
        int damage = 54;
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

    public Orc() {
    }
}
