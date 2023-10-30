package PlayersClasses;

import Abstracts.Enemy;

public class Familiar implements iDefend {
    private int health;
    private String name;

    public Familiar(int health, String name) {
        this.health = health;
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void defend(Enemy enemy) {

    }
}
