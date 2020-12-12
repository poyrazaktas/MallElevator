package mallelevator;

public class ThreadFloorController implements Runnable {

    Mall[] mall;
    final String threadName = "Controller Thread";
    ThreadElevator threadFirstElevator;
    ThreadElevator threadSecondElevator;
    ThreadElevator threadThirdElevator;
    ThreadElevator threadFourthElevator;
    ThreadElevator threadFifthElevator;

    int elevatorCount;
    int sumQueues;

    public ThreadFloorController(Mall[] mall, ThreadElevator threadFirstElevator, ThreadElevator threadSecondElevator,
            ThreadElevator threadThirdElevator, ThreadElevator threadFourthElevator,
            ThreadElevator threadFifthElevator) {
        this.mall = mall;
        this.threadFirstElevator = threadFirstElevator;
        this.threadSecondElevator = threadSecondElevator;
        this.threadThirdElevator = threadThirdElevator;
        this.threadFourthElevator = threadFourthElevator;
        this.threadFifthElevator = threadFifthElevator;
        this.elevatorCount = 1;
        this.sumQueues = 0;
    }

    @Override
    public void run() {

        try {
            threadFirstElevator.elevator.active = true;
            threadFirstElevator.start();
            while (true) {
                Thread.sleep(500);
                sumQueues = mall[0].queue + mall[1].queue + mall[2].queue + mall[3].queue + mall[4].queue;
                if (sumQueues >= 80) {

                    if (!threadFifthElevator.isAlive()) {
                        System.out.println("! Sum of people in queues:" + Integer.toString(sumQueues)
                                + " -> Elevator-5  Activated!");
                        // threadSecondElevator.elevator.active = true;
                        // threadThirdElevator.elevator.active = true;
                        // threadFourthElevator.elevator.active = true;
                        threadFifthElevator.elevator.active = true;
                        threadFifthElevator.start();

                    }

                } else if (80 > sumQueues && sumQueues >= 60) {

                    if (!threadFourthElevator.isAlive()) {
                        System.out.println("! Sum of people in queues:" + Integer.toString(sumQueues)
                                + " -> Elevator-4 Activated!");
                        // threadSecondElevator.elevator.active = true;
                        // threadThirdElevator.elevator.active = true;
                        threadFourthElevator.elevator.active = true;
                        // threadFifthElevator.elevator.active = false;
                        threadFourthElevator.start();
                    }

                } else if (60 > sumQueues && sumQueues >= 40) {

                    if (!threadThirdElevator.isAlive()) {
                        System.out.println("! Sum of people in queues:" + Integer.toString(sumQueues)
                                + " -> Elevator-3 Activated!");
                        // threadSecondElevator.elevator.active = true;
                        threadThirdElevator.elevator.active = true;
                        // threadFourthElevator.elevator.active = false;
                        // threadFifthElevator.elevator.active = false;
                        threadThirdElevator.start();

                    }

                } else if (40 > sumQueues && sumQueues >= 20) {
                    threadSecondElevator.elevator.active = true;
                    if (!threadSecondElevator.isAlive()) {
                        System.out.println("! Sum of people in queues:" + Integer.toString(sumQueues)
                                + " -> Elevator-2 Activated!");
                        threadSecondElevator.elevator.active = true;
                        // threadThirdElevator.elevator.active = false;
                        // threadFourthElevator.elevator.active = false;
                        // threadFifthElevator.elevator.active = false;
                        threadSecondElevator.start();

                    }

                }
                // else if (20 > sumQueues) {
                // threadFirstElevator.elevator.active = true;

                // if (!threadFirstElevator.isAlive()) {
                // System.out.println("! Sum of people in queues:" + Integer.toString(sumQueues)
                // + " -> Elevator-1 Activated!");
                // threadSecondElevator.elevator.active = false;
                // threadThirdElevator.elevator.active = false;
                // threadFourthElevator.elevator.active = false;
                // threadFifthElevator.elevator.active = false;

                // threadFirstElevator.start();
                // }

                // }

            }

        } catch (InterruptedException ex) {
            System.out.println("Thread " + threadName + " interrupted.");
        }
        System.out.println("Exiting: " + threadName);
    }

}
