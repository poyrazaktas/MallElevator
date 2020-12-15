package mallelevator;

import java.util.LinkedList;

public class Elevator {

    public enum Mode {
        WORKING, IDLE;
    }

    public enum Direction {
        UP, DOWN
    }

    boolean active;
    Mode mode;
    int floor;
    int destination;
    Direction direction;
    int capacity;
    int countInside;
    LinkedList<Customer> inside;
    String name;

    public Elevator(String name) {
        this.name = name;
        this.active = false;
        this.mode = Mode.IDLE;
        this.floor = 0;
        this.destination = 0;
        this.direction = Direction.UP;
        this.capacity = 10;
        this.countInside = 0;
        this.inside = new LinkedList<Customer>();
    }

    @Override
    public String toString() {
        String insideStr = "";
        LinkedList<Customer> insidePtr = (LinkedList<Customer>) inside.clone();

        for (Customer customer : insidePtr) {
            insideStr += customer + " ";
        }

        String result = name + "\n" + "active : " + active + "\n" + "mode : " + mode.name() + "\n" + "floor : "
                + Integer.toString(floor) + "\n" + "direction : " + direction.name() + "\n" + "capacity : "
                + Integer.toString(capacity) + "\n" + "count_inside : " + Integer.toString(countInside) + "\n"
                + "inside : " + insideStr + "\n";
        return result;
    }

    public String insideToString() {
        String result = name + " : ";
        LinkedList<Customer> insidePtr = (LinkedList<Customer>) inside.clone();
        for (Customer customer : insidePtr) {
            result += customer + " ";
        }

        return result;
    }
}
