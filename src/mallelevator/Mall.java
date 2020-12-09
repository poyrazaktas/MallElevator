package mallelevator;

import java.util.LinkedList;

public class Mall {

    int all;
    int queue;
    LinkedList<Customer> customers;
    String name;

    Mall(String name) {
        this.name = name;
        this.all = 0;
        this.queue = 0;
        this.customers = new LinkedList<Customer>();
    }

    public void addCustomer(Customer customer) {
        this.customers.addLast(customer);
    }

    public void removeCustomer() {
        this.customers.removeFirst();
    }

    public String toString() {
        if (name.equals("0. floor")) {
            this.all = queue;
            return name + ":\tqueue: " + Integer.toString(all);
        }
        return name + ":\tall : " + Integer.toString(all) + "\tqueue : " + Integer.toString(queue);

    }

    public String queueToString() {
        String result = name + " : ";
        for (Customer customer : customers) {
            result += customer.toString() + " ";
        }
        return result;
    }
}