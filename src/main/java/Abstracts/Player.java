package Abstracts;

public abstract class Player {
    private String name;
    private int health;
    private Long id;

    public Player(String name, int health) {
        this.name = name;
        this.health = health;
        this.id = id;
    }

    public Player(){

    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
