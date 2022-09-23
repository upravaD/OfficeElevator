import java.util.ArrayList;
import java.util.List;

public class Elevator {
    public static String elevatorIcon = "LIFT";
    public static List<Object> lift = new ArrayList<>();
    static int position = Office.officeBuilding[0].length-1;;

    public Elevator() {
        Office.officeBuilding[2][9] = Elevator.lift;
    }

    public void takeHuman() {
        if (!(Office.OfficeLevel.level1.isEmpty())) {
            for (int i = 0; i <= Office.OfficeLevel.level1.size(); i++) {
                lift.add(new Human().desiredLevel);
            }
            Office.OfficeLevel.level1.clear();
            System.out.println("Lift take");
            elevatorMove();
        } else {
            elevatorMove();
        }

    }

    public static void elevatorMove() {
        int x = 1;
        int y = position;
        Office.officeBuilding[2][y-x] = lift;
        Office.officeBuilding[2][y] = ".";
        System.out.println("Lift move");
        position = y-x;
    }
}
