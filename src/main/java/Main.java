import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        {
            System.out.println("==========================");
            System.out.println("OFFICE ELEVATOR SIMULATION");
            System.out.println("==========================\n");
        }

        Office office = new Office();
        Elevator elevator = new Elevator();

        int floors = 1;
//        while(floors < 11) {
//
//            System.out.println();
//            System.out.println(floors + " floor");
//            System.out.println("======================");
//
//            office.officeInit();
//            office.officePrint();
//            elevator.takeHuman();
//
//            floors++;
//        }

        for (int i = 0; i < new Random().nextInt(10); i++) {
            Elevator.lift.add(new Human().desiredLevel);
        }
        System.out.println(Elevator.lift);
    }
}
