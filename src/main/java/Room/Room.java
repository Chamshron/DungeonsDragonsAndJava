package Room;

import java.util.ArrayList;
import java.util.Random;

abstract public class Room {
    private ArrayList<Exit> exits;

    public Room(ArrayList<Exit> exits) {
        this.exits = exits;
    }

    public int getRandomNumber(int max){
        Random random = new Random();
        return random.nextInt(max);
    };
}
