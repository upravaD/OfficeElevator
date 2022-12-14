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
        while(floors < 21) {

            System.out.println();
            System.out.println(floors + " floor");
            System.out.println("======================");

            office.officeInit();
            office.officePrint();

            if (floors < 11) {
                elevator.elevatorMoveUp();
            } else {
                elevator.elevatorMoveDown();
            }
            floors++;
            if (floors == 20) {
                break;
            }
        }
    }
}
