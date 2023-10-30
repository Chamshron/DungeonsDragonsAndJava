package Room;

import EnemeyClasses.Dragon;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class DragonRoom extends Room{

    private ArrayList<Dragon> roomDragon;

    public DragonRoom(ArrayList<Exit> exits) {
        super(exits);
        this.roomDragon = new ArrayList<Dragon>();
        Dragon baby = new Dragon(100);
        roomDragon.add(baby);
    }

    public ArrayList<Dragon> getRoomDragon() {
        return roomDragon;
    }

    public void setRoomDragon(ArrayList<Dragon> roomDragon) {
        this.roomDragon = roomDragon;
    }
}




