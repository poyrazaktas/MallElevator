package avmasansor;

public class Customer {

    public int bodyCount;
    public int target;

    Customer(int bodyCount, int target) {
        this.bodyCount = bodyCount;
        this.target = target;
    }

    @Override
    public String toString() {
        return "[" + this.bodyCount + ", " + this.target + "]";
    }

}