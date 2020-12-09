package mallelevator;

import mallelevator.Elevator.Mode;

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
        threadFirstElevator.elevator.active = true;
        threadFirstElevator.elevator.mode = Mode.WORKING;
        ThreadAvmExit threadAvmExit = new ThreadAvmExit("Avm Exit Thread", mall);

        threadAvmLogin.start();
        threadFirstElevator.start();
        threadAvmExit.start();

    }

}
