package mallelevator;

import java.util.LinkedList;

import mallelevator.Elevator.Direction;
import mallelevator.Elevator.Mode;

public class ThreadElevator extends Thread {

    private Thread t;
    private String threadName;
    Mall[] mall; // avmdeki katlar
    Elevator elevator;
    public boolean isItWorking = false; // bunu isthreadalive gibi düşün , sadece elle veriyoruz değerini
    public boolean want2susp = false;

    public ThreadElevator(String name, Mall[] mall) {
        this.threadName = name;
        this.mall = mall;
        this.elevator = new Elevator(name);
        System.out.println("Creating: " + this.threadName);
    }

    public void getIn2Mall(int f) {
        synchronized (mall[f]) {
            if (mall[f].customers.size() > 0) {
                LinkedList<Customer> floor0Ptr = (LinkedList<Customer>) mall[f].customers.clone();
                for (Customer customer : floor0Ptr) {
                    if (elevator.countInside + customer.bodyCount <= elevator.capacity) {
                        elevator.inside.addLast(customer);
                        elevator.countInside += elevator.inside.getLast().bodyCount;

                        mall[f].customers.remove(customer);
                    } else { // kuyruk mantığında çalışması için
                        break;
                    }
                }

                mall[f].queue -= elevator.countInside;
                System.out.println(mall[f]);
                System.out.println(elevator.insideToString());
                elevator.floor++;
            } else {
                System.out.println("There is no customer in 0.floor");
            }
        }

    }

    public void getOff(int f) {
        synchronized (mall[f]) {
            if (elevator.inside.size() > 0) {
                LinkedList<Customer> insidePtr = (LinkedList<Customer>) elevator.inside.clone();
                for (Customer customer : insidePtr) {
                    if (customer.target == f) {
                        mall[f].all += customer.bodyCount;
                        elevator.countInside -= customer.bodyCount;
                        elevator.inside.remove(customer);
                    }
                }

                System.out.println(mall[f]);
                System.out.println(elevator.insideToString());
                if (f != 4 && elevator.countInside != 0)
                    elevator.floor++;

            } else {

                elevator.direction = Direction.DOWN;
            }
        }

    }

    public void getIn(int f) {
        synchronized (mall[f]) {
            if (mall[f].customers.size() > 0) {

                LinkedList<Customer> floor1Ptr = (LinkedList<Customer>) mall[f].customers.clone();
                for (Customer customer : floor1Ptr) {
                    if (elevator.countInside + customer.bodyCount <= elevator.capacity) {
                        elevator.inside.addLast(customer);
                        elevator.countInside += elevator.inside.getLast().bodyCount;
                        // mall[1].all -= elevator.inside.getLast().bodyCount;
                        mall[f].queue -= elevator.inside.getLast().bodyCount;
                        mall[f].customers.remove(customer);

                    } else {
                        break;
                    }
                }
                System.out.println(mall[f]);
                System.out.println(elevator.insideToString());
                elevator.floor--;
            } else {
                elevator.floor--;
            }
        }

    }

    @Override
    public void run() {
        System.out.println("Running: " + threadName);

        // int exitCount = 0;
        try {
            // Thread.sleep(2000);

            while (true) {

                while (want2susp == true) {
                    if (elevator.countInside != 0)
                        break;
                    Thread.sleep(100);
                }

                if (elevator.mode == Mode.WORKING) {
                    if (elevator.direction == Direction.UP) {
                        switch (elevator.floor) {
                            case 0:
                                Thread.sleep(200);

                                getIn2Mall(0);

                                break;

                            case 1:
                                Thread.sleep(200);

                                getOff(1);

                                break;
                            case 2:
                                Thread.sleep(200);

                                getOff(2);

                                break;
                            case 3:
                                Thread.sleep(200);

                                getOff(3);

                                break;
                            case 4:
                                Thread.sleep(200);

                                getOff(4);

                                break;

                            default:
                                break;
                        }
                    } else if (elevator.direction == Direction.DOWN) {
                        switch (elevator.floor) {
                            case 4:
                                synchronized (mall[4]) {
                                    Thread.sleep(200);
                                    getIn(4);
                                }

                                break;
                            case 3:
                                synchronized (mall[3]) {
                                    Thread.sleep(200);
                                    getIn(3);
                                }

                                break;
                            case 2:
                                synchronized (mall[2]) {
                                    Thread.sleep(200);
                                    getIn(2);
                                }

                                break;
                            case 1:
                                synchronized (mall[1]) {
                                    Thread.sleep(200);
                                    getIn(1);
                                }

                                break;
                            case 0:
                                // burada sync gerek yok çünkü boşluğa salıyoruz
                                mall[0].exitCount += elevator.countInside;
                                System.out.println("Exit Count: " + Integer.toString(mall[0].exitCount));
                                System.out.println("---------------------------------------------");
                                elevator.inside.clear();
                                elevator.countInside = 0;
                                elevator.direction = Direction.UP;
                                if (mall[0].customers.size() == 0) {
                                    elevator.mode = Mode.IDLE;
                                }
                                break;
                            default:
                                break;
                        }
                    }
                } else if (elevator.mode == Mode.IDLE) {
                    while (mall[0].customers.size() == 0) {
                        continue;
                    }
                    elevator.mode = Mode.WORKING;

                }

            }
        } catch (InterruptedException ex) {
            System.out.println("Thread " + threadName + " interrupted.");
        }

        System.out.println("Exiting: " + threadName);
    }

    @Override
    public void start() {
        System.out.println("Starting " + threadName);
        if (t == null) {
            t = new Thread(this, threadName);
            t.start();
        }

    }
}
