package avmasansor;

import java.util.LinkedList;

public class Elevator {

    public enum Mode {
        WORKING, IDLE
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
        String result = name+" : ";
        for (Customer customer : inside) {
            result += customer.toString() + " ";
        }
        return result;
    }
}