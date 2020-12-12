package mallelevator;

public class Main {

    public static void main(String[] args) {

        Mall[] mall = new Mall[5];
        mall[0] = new Mall("0. floor");
        mall[1] = new Mall("1. floor");
        mall[2] = new Mall("2. floor");
        mall[3] = new Mall("3. floor");
        mall[4] = new Mall("4. floor");
        ThreadAvmLogin threadAvmLogin = new ThreadAvmLogin("Avm Login Thread", mall);

        ThreadElevator threadFirstElevator = new ThreadElevator("Elevator-1", mall);
//        threadFirstElevator.elevator.active = true;

        ThreadElevator threadSecondElevator = new ThreadElevator("Elevator-2", mall);
        ThreadElevator threadThirdElevator = new ThreadElevator("Elevator-3", mall);
        ThreadElevator threadFourthElevator = new ThreadElevator("Elevator-4", mall);
        ThreadElevator threadFifthElevator = new ThreadElevator("Elevator-5", mall);

        // ThreadElevator threadSecondElevator = new ThreadElevator("Elevator-2", mall);
        // threadSecondElevator.elevator.active = true;

        ThreadAvmExit threadAvmExit = new ThreadAvmExit("Avm Exit Thread", mall);

        ThreadFloorController ThreadController = new ThreadFloorController(mall, threadFirstElevator,threadSecondElevator,
                threadThirdElevator, threadFourthElevator, threadFifthElevator);

        Thread t = new Thread(ThreadController);

        threadAvmLogin.start();
        // threadFirstElevator.start();
        // threadSecondElevator.start();
        // threadThirdElevator.start();
        // threadFourthElevator.start();
        // threadFifthElevator.start();

        // threadSecondElevator.start();//senkronizasyonu test etmek için bunu aç ,
        // kontrolleri kapat (t.startı yani)

        threadAvmExit.start();

        t.start(); // bu controller için
    }

}
