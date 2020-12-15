package mallelevator;

import javax.swing.JLabel;
import javax.swing.JTextArea;

public class ThreadFloorController implements Runnable {

    Mall[] mall;
    JLabel[] labels;
    JTextArea[] textAreas;
    final String threadName = "Controller Thread";
    ThreadElevator threadFirstElevator;
    ThreadElevator threadSecondElevator;
    ThreadElevator threadThirdElevator;
    ThreadElevator threadFourthElevator;
    ThreadElevator threadFifthElevator;
    int sumQueues;

    public ThreadFloorController(Mall[] mall, JLabel[] labels, JTextArea[] textAreas,
            ThreadElevator threadFirstElevator, ThreadElevator threadSecondElevator, ThreadElevator threadThirdElevator,
            ThreadElevator threadFourthElevator, ThreadElevator threadFifthElevator) {
        this.mall = mall;
        this.labels = labels;
        this.textAreas = textAreas;
        this.threadFirstElevator = threadFirstElevator;
        this.threadSecondElevator = threadSecondElevator;
        this.threadThirdElevator = threadThirdElevator;
        this.threadFourthElevator = threadFourthElevator;
        this.threadFifthElevator = threadFifthElevator;
        this.sumQueues = 0;
    }

    @Override
    public void run() {

        try {
            threadFirstElevator.elevator.active = true;
            threadFirstElevator.isItWorking = true;
            threadFirstElevator.want2susp = false;
           
            
            threadFirstElevator.start();
            while (true) {
                Thread.sleep(100);
                labels[0].setText(mall[0].toString());
                labels[1].setText(mall[1].toString());
                labels[2].setText(mall[2].toString());
                labels[3].setText(mall[3].toString());
                labels[4].setText(mall[4].toString());

                textAreas[0].setText(threadFirstElevator.elevator.toString());
                textAreas[1].setText(threadSecondElevator.elevator.toString());
                textAreas[2].setText(threadThirdElevator.elevator.toString());
                textAreas[3].setText(threadFourthElevator.elevator.toString());
                textAreas[4].setText(threadFifthElevator.elevator.toString());

                labels[5].setText(mall[0].queueToString());
                labels[6].setText(mall[1].queueToString());
                labels[7].setText(mall[2].queueToString());
                labels[8].setText(mall[3].queueToString());
                labels[9].setText(mall[4].queueToString());
                labels[10].setText("Exit Count : " + Integer.toString(mall[0].exitCount));
                sumQueues = mall[0].queue + mall[1].queue + mall[2].queue + mall[3].queue + mall[4].queue;

                if (40 > sumQueues && sumQueues >= 20) {

                    if (!threadSecondElevator.isItWorking) {// ilk geliş

                        System.out.println("! Sum of people in queues:" + Integer.toString(sumQueues)
                                + " -> Elevator-2 Activated!");
                        threadSecondElevator.isItWorking = true;// bunu isAlive() gibi düşün
                        threadSecondElevator.elevator.active = true;
                        threadSecondElevator.want2susp = false;
                        threadSecondElevator.start();

                    } else if (threadSecondElevator.isItWorking && !threadSecondElevator.elevator.active) {

                        threadSecondElevator.elevator.active = true;
                        threadSecondElevator.want2susp = false;
                        System.out.println("                                   ->> Elevator-2 Working!");
                    }

                } else if (sumQueues < 20 && threadSecondElevator.elevator.active) {

                    threadSecondElevator.elevator.active = false;
                    threadSecondElevator.want2susp = true;

                    System.out.println("OOO ! Sum of people in queues:" + Integer.toString(sumQueues)
                            + " -> Elevator-2 Deactivated! OOO");

                }

                // ****************************
                if (60 > sumQueues && sumQueues >= 40) {

                    if (!threadThirdElevator.isItWorking) {// ilk geliş

                        System.out.println("! Sum of people in queues:" + Integer.toString(sumQueues)
                                + " -> Elevator-3 Activated!");
                        threadThirdElevator.isItWorking = true;
                        threadThirdElevator.elevator.active = true;
                        threadThirdElevator.want2susp = false;
                        threadThirdElevator.start();

                    } else if (threadThirdElevator.isItWorking && !threadThirdElevator.elevator.active) {

                        threadThirdElevator.elevator.active = true;
                        threadThirdElevator.want2susp = false;
                        System.out.println("                                   ->> Elevator-3 Working!");
                    }

                } else if (sumQueues < 30 && threadThirdElevator.elevator.active) {

                    threadThirdElevator.elevator.active = false;
                    threadThirdElevator.want2susp = true;

                    System.out.println("OOO ! Sum of people in queues:" + Integer.toString(sumQueues)
                            + " -> Elevator-3 Deactivated! OOO");

                }

                // ************************************************************
                if (80 > sumQueues && sumQueues >= 60) {

                    if (!threadFourthElevator.isItWorking) {// ilk geliş

                        System.out.println("! Sum of people in queues:" + Integer.toString(sumQueues)
                                + " -> Elevator-4 Activated!");
                        threadFourthElevator.isItWorking = true;
                        threadFourthElevator.elevator.active = true;
                        threadFourthElevator.want2susp = false;
                        threadFourthElevator.start();

                    } else if (threadFourthElevator.isItWorking && !threadFourthElevator.elevator.active) {

                        threadFourthElevator.elevator.active = true;
                        threadFourthElevator.want2susp = false;
                        System.out.println("                                   ->> Elevator-4 Working!!");
                    }

                } else if (sumQueues < 40 && threadFourthElevator.elevator.active) {

                    threadFourthElevator.elevator.active = false;
                    threadFourthElevator.want2susp = true;

                    System.out.println("OOO ! Sum of people in queues:" + Integer.toString(sumQueues)
                            + " -> Elevator-4 Deactivated! OOO");

                }
                // *****************************************************

                if (sumQueues >= 80) {

                    if (!threadFifthElevator.isItWorking) {// ilk geliş

                        System.out.println("! Sum of people in queues:" + Integer.toString(sumQueues)
                                + " -> Elevator-5 Activated!");
                        threadFifthElevator.isItWorking = true;
                        threadFifthElevator.elevator.active = true;
                        threadFifthElevator.want2susp = false;
                        threadFifthElevator.start();

                    } else if (threadFifthElevator.isItWorking && !threadFifthElevator.elevator.active) {

                        threadFifthElevator.elevator.active = true;
                        threadFifthElevator.want2susp = false;
                        System.out.println("                                   ->> Elevator-5 Working!");
                    }

                } else if (sumQueues < 50 && threadFifthElevator.elevator.active) {

                    threadFifthElevator.elevator.active = false;
                    threadFifthElevator.want2susp = true;

                    System.out.println("OOO ! Sum of people in queues:" + Integer.toString(sumQueues)
                            + " -> Elevator-5 Deactivated! OOO");

                }

            }

        } catch (InterruptedException ex) {
            System.out.println("Thread " + threadName + " interrupted.");
        }
        System.out.println("Exiting: " + threadName);
    }

}
