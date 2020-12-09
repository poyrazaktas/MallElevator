package mallelevator;

import java.util.Random;

public class ThreadAvmExit extends Thread {

    private Thread t;
    private String threadName;
    Mall[] mall;

    public ThreadAvmExit(String name, Mall[] mall) {
        this.threadName = name;
        this.mall = mall;
        System.out.println("Creating: " + threadName);
    }

    @Override
    public void run() {
        System.out.println("Running: " + threadName);
        try {
            Thread.sleep(4000);
            Random randFloor = new Random();
            Random randCustomer = new Random();
            while (true) {
                Thread.sleep(1000);
                switch (randFloor.nextInt(4) + 1) {
                    case 1:
                        if (mall[1].all > 0) {
                            int temp = (randCustomer.nextInt(mall[1].all) + 1);
                            mall[1].addCustomer(new Customer(temp % 10 > 5 ? 5 : temp % 10, 0));
                            mall[1].queue += mall[1].customers.getLast().bodyCount;
                            mall[1].all -= mall[1].customers.getLast().bodyCount;

                            System.out.println(mall[1]);
                        }
                        break;
                    case 2:
                        if (mall[2].all > 0) {
                            int temp = (randCustomer.nextInt(mall[2].all) + 1);
                            mall[2].addCustomer(new Customer(temp % 10 > 5 ? 5 : temp % 10, 0));
                            mall[2].queue += mall[2].customers.getLast().bodyCount;
                            mall[2].all -= mall[2].customers.getLast().bodyCount;

                            System.out.println(mall[2]);
                        }
                        break;
                    case 3:
                        if (mall[3].all > 0) {
                            int temp = (randCustomer.nextInt(mall[3].all) + 1);
                            mall[3].addCustomer(new Customer(temp % 10 > 5 ? 5 : temp % 10, 0));
                            mall[3].queue += mall[3].customers.getLast().bodyCount;
                            mall[3].all -= mall[3].customers.getLast().bodyCount;

                            System.out.println(mall[3]);
                        }
                        break;
                    case 4:
                        if (mall[4].all > 0) {
                            int temp = (randCustomer.nextInt(mall[4].all) + 1);
                            mall[4].addCustomer(new Customer(temp % 10 > 5 ? 5 : temp % 10, 0));
                            mall[4].queue += mall[4].customers.getLast().bodyCount;
                            mall[4].all -= mall[4].customers.getLast().bodyCount;

                            System.out.println(mall[4]);
                        }
                        break;

                    default:
                        break;
                }

            }

        } catch (InterruptedException ex) {
            System.out.println("Thread " + threadName + " interrupted.");
        }

        System.out.println("Exiting: " + threadName);
    }

    @Override
    public void start() {
        // System.out.println("Starting " + threadName);
        if (t == null) {
            t = new Thread(this, threadName);
            t.start();
        }

    }

}
