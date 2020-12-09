package mallelevator;

public class ThreadAvmLogin extends Thread {

    Thread t;
    String threadName;
    Mall[] mall;

    public ThreadAvmLogin(String name, Mall[] mall) {
        this.threadName = name;
        this.mall = mall;
        System.out.println("Creating: " + this.threadName);
    }

    @Override
    public void run() {
        System.out.println("Running: " + threadName);
        try {
            for (int i = 0;; i++) {
                mall[0].addCustomer(new Customer((int) (Math.random() * 10) + 1, (int) (Math.random() * 4) + 1));
                System.out.println(mall[0].customers.getLast());// eklenen customer'i basar
                mall[0].queue += mall[0].customers.getLast().bodyCount;
                Thread.sleep(500);// 500 ms olucak
            }

        } catch (InterruptedException ex) {
            System.out.println("Thread " + threadName + " interrupted.");
        }
        // System.out.println("\n\n");
        // System.out.println(mall[0].toString());
        // System.out.println(mall[0].queueToString());
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
