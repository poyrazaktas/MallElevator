package mallelevator;

import java.util.LinkedList;

import mallelevator.Elevator.Direction;
import mallelevator.Elevator.Mode;

public class ThreadElevator extends Thread {

    private Thread t;
    private String threadName;
    Mall[] mall; // avmdeki katlar
    Elevator elevator;

    public ThreadElevator(String name, Mall[] mall) {
        this.threadName = name;
        this.mall = mall;
        this.elevator = new Elevator(name);
        System.out.println("Creating: " + this.threadName);
    }

    @Override
    public void run() {
        System.out.println("Running: " + threadName);
        int exitCount = 0;
        try {
            // Thread.sleep(2000);
            while (elevator.active) {
                if (elevator.mode == Mode.WORKING) {
                    if (elevator.direction == Direction.UP) {
                        switch (elevator.floor) {
                            case 0:
                                Thread.sleep(200);
                                if (mall[0].customers.size() > 0) {
                                    LinkedList<Customer> floor0Ptr = (LinkedList<Customer>) mall[0].customers.clone();
                                    for (Customer customer : floor0Ptr) {
                                        if (elevator.countInside + customer.bodyCount <= elevator.capacity) {
                                            elevator.inside.addLast(customer);
                                            elevator.countInside += elevator.inside.getLast().bodyCount;

                                            mall[0].customers.remove(customer);
                                        } else { // kuyruk mantığında çalışması için
                                            break;
                                        }
                                    }
                                    /*
                                     * // while (elevator.countInside // + mall[0].customers.getFirst().bodyCount <=
                                     * elevator.capacity) { //
                                     * elevator.inside.addLast(mall[0].customers.getFirst()); //
                                     * elevator.countInside += elevator.inside.getLast().bodyCount; //
                                     * mall[0].customers.removeFirst(); // }
                                     */
                                    mall[0].queue -= elevator.countInside;
                                    System.out.println(mall[0]);
                                    System.out.println(elevator);
                                    elevator.floor++;
                                } else {
                                    System.out.println("There is no customer in 0.floor");
                                }
                                break;

                            case 1:
                                Thread.sleep(200);
                                if (elevator.inside.size() > 0) {
                                    LinkedList<Customer> insidePtr = (LinkedList<Customer>) elevator.inside.clone();
                                    for (Customer customer : insidePtr) {
                                        if (customer.target == 1) {
                                            mall[1].all += customer.bodyCount;
                                            elevator.countInside -= customer.bodyCount;
                                            elevator.inside.remove(customer);
                                        }
                                    }

                                    System.out.println(mall[1]);
                                    System.out.println(elevator);

                                    elevator.floor++;
                                } else {

                                    elevator.direction = Direction.DOWN;
                                }
                                break;
                            case 2:
                                Thread.sleep(200);
                                if (elevator.inside.size() > 0) {
                                    LinkedList<Customer> insidePtr = (LinkedList<Customer>) elevator.inside.clone();
                                    for (Customer customer : insidePtr) {
                                        if (customer.target == 2) {
                                            mall[2].all += customer.bodyCount;
                                            elevator.countInside -= customer.bodyCount;
                                            elevator.inside.remove(customer);
                                        }
                                    }
                                    System.out.println(mall[2]);
                                    System.out.println(elevator);

                                    elevator.floor++;
                                } else {

                                    elevator.direction = Direction.DOWN;
                                }
                                break;
                            case 3:
                                Thread.sleep(200);
                                if (elevator.inside.size() > 0) {
                                    LinkedList<Customer> insidePtr = (LinkedList<Customer>) elevator.inside.clone();
                                    for (Customer customer : insidePtr) {
                                        if (customer.target == 3) {
                                            mall[3].all += customer.bodyCount;
                                            elevator.countInside -= customer.bodyCount;
                                            elevator.inside.remove(customer);
                                        }
                                    }
                                    System.out.println(mall[3]);
                                    System.out.println(elevator);

                                    elevator.floor++;
                                } else {

                                    elevator.direction = Direction.DOWN;
                                }
                                break;
                            case 4:
                                Thread.sleep(200);
                                if (elevator.inside.size() > 0) {
                                    LinkedList<Customer> insidePtr = (LinkedList<Customer>) elevator.inside.clone();
                                    for (Customer customer : insidePtr) {
                                        if (customer.target == 4) {
                                            mall[4].all += customer.bodyCount;
                                            elevator.countInside -= customer.bodyCount;
                                            elevator.inside.remove(customer);
                                        }
                                    }
                                    System.out.println(mall[4]);
                                    System.out.println(elevator);

                                } else {

                                    elevator.direction = Direction.DOWN;
                                }
                                break;

                            default:
                                break;
                        }
                    } else if (elevator.direction == Direction.DOWN) {
                        switch (elevator.floor) {
                            case 4:

                                if (mall[4].customers.size() > 0) {
                                    Thread.sleep(200);
                                    LinkedList<Customer> floor4Ptr = (LinkedList<Customer>) mall[4].customers.clone();
                                    for (Customer customer : floor4Ptr) {
                                        if (elevator.countInside + customer.bodyCount <= elevator.capacity) {
                                            elevator.inside.addLast(customer);
                                            elevator.countInside += elevator.inside.getLast().bodyCount;
                                            // mall[4].all -= elevator.inside.getLast().bodyCount; // hatalı
                                            mall[4].queue -= elevator.inside.getLast().bodyCount;
                                            mall[4].customers.remove(customer);

                                        } else {
                                            break;
                                        }
                                    }

                                    System.out.println(mall[4]);
                                    System.out.println(elevator);
                                    elevator.floor--;
                                } else {
                                    elevator.floor--;
                                }
                                break;
                            case 3:
                                if (mall[3].customers.size() > 0) {
                                    Thread.sleep(200);
                                    LinkedList<Customer> floor3Ptr = (LinkedList<Customer>) mall[3].customers.clone();
                                    for (Customer customer : floor3Ptr) {
                                        if (elevator.countInside + customer.bodyCount <= elevator.capacity) {
                                            elevator.inside.addLast(customer);
                                            elevator.countInside += elevator.inside.getLast().bodyCount;
                                            // mall[3].all -= elevator.inside.getLast().bodyCount;
                                            mall[3].queue -= elevator.inside.getLast().bodyCount;
                                            mall[3].customers.remove(customer);

                                        } else {
                                            break;
                                        }
                                    }

                                    System.out.println(mall[3]);
                                    System.out.println(elevator);
                                    elevator.floor--;
                                } else {
                                    elevator.floor--;
                                }
                                break;
                            case 2:
                                if (mall[2].customers.size() > 0) {
                                    Thread.sleep(200);
                                    LinkedList<Customer> floor2Ptr = (LinkedList<Customer>) mall[2].customers.clone();
                                    for (Customer customer : floor2Ptr) {
                                        if (elevator.countInside + customer.bodyCount <= elevator.capacity) {
                                            elevator.inside.addLast(customer);
                                            elevator.countInside += elevator.inside.getLast().bodyCount;
                                            // mall[2].all -= elevator.inside.getLast().bodyCount;
                                            mall[2].queue -= elevator.inside.getLast().bodyCount;
                                            mall[2].customers.remove(customer);

                                        } else {
                                            break;
                                        }
                                    }
                                    System.out.println(mall[2]);
                                    System.out.println(elevator);
                                    elevator.floor--;
                                } else {
                                    elevator.floor--;
                                }
                                break;
                            case 1:
                                if (mall[1].customers.size() > 0) {
                                    Thread.sleep(200);
                                    LinkedList<Customer> floor1Ptr = (LinkedList<Customer>) mall[1].customers.clone();
                                    for (Customer customer : floor1Ptr) {
                                        if (elevator.countInside + customer.bodyCount <= elevator.capacity) {
                                            elevator.inside.addLast(customer);
                                            elevator.countInside += elevator.inside.getLast().bodyCount;
                                            // mall[1].all -= elevator.inside.getLast().bodyCount;
                                            mall[1].queue -= elevator.inside.getLast().bodyCount;
                                            mall[1].customers.remove(customer);

                                        } else {
                                            break;
                                        }
                                    }
                                    System.out.println(mall[1]);
                                    System.out.println(elevator);
                                    elevator.floor--;
                                } else {
                                    elevator.floor--;
                                }
                                break;
                            case 0:
                                exitCount += elevator.countInside;
                                System.out.println("Exit Count: " + Integer.toString(exitCount));
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
