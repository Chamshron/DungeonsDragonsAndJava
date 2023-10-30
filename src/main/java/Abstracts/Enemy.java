package Abstracts;

public abstract class Enemy {
    private int health;

    private void attackMethod(){
        System.out.println("The enemy is attacking");
    };
    private long id;

    public Enemy(int health) {
        this.health = health;
        this.attackMethod();
    }

    public Enemy(){

    };

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
