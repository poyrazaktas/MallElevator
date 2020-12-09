package avmasansor;

import avmasansor.Elevator.Mode;

public class Main {

    public static void main(String[] args) {

        Mall[] mall = new Mall[5];
        mall[0] = new Mall("0. floor", 0);
        mall[1] = new Mall("1. floor", 1);
        mall[2] = new Mall("2. floor", 2);
        mall[3] = new Mall("3. floor", 3);
        mall[4] = new Mall("4. floor", 4);
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
