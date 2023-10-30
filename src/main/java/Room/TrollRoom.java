package Room;

import EnemeyClasses.Troll;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class TrollRoom extends Room {

    private ArrayList <Troll> roomTroll;

    public TrollRoom(ArrayList<Exit> exits) {
        super(exits);
        this.roomTroll = new ArrayList<Troll>();
        Troll troy = new Troll(100);
        roomTroll.add(troy);
    }

    public ArrayList<Troll> getRoomTroll() {
        return roomTroll;
    }

    public void setRoomTroll(ArrayList<Troll> roomTroll) {
        this.roomTroll = roomTroll;
    }
}
