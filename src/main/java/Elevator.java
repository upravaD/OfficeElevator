import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Elevator {
    public static List<Object> lift = new ArrayList<>();
    static int position;
    int maxHumanGet = 5;

    public Elevator() {
        Office.officeBuilding[2][9] = lift;
        position = Office.officeBuilding[0].length - 1;
    }

    public void takeHuman(List<String> level) {
        if (!(level.isEmpty())) {
            for (int i = 0; i < level.size(); i++) {
                lift.add(new Human().desiredLevel);
            }
            lift.sort(Collections.reverseOrder());
            level.clear();
            System.out.println("Lift take");
        }
    }
    public void elevatorMoveUp() {

        switch (position) {
            case 9 -> {
                takeHuman(Office.OfficeLevel.level1);
                if (lift.contains(1)) {
                    lift.removeIf(o -> o.equals(1));
                    System.out.println("Remove 1");
                }
                Office.officeBuilding[2][position] = ".";
                Office.officeBuilding[2][position - 1] = lift;
                position--;
            }
            case 8 -> {
                takeHuman(Office.OfficeLevel.level2);
                if (lift.contains(2)) {
                    lift.removeIf(o -> o.equals(2));
                    System.out.println("Remove 2");
                }
                Office.officeBuilding[2][position] = ".";
                Office.officeBuilding[2][position - 1] = lift;
                position--;
            }
            case 7 -> {
                takeHuman(Office.OfficeLevel.level3);
                if (lift.contains(3)) {
                    lift.removeIf(o -> o.equals(3));
                    System.out.println("Remove 3");
                }
                Office.officeBuilding[2][position] = ".";
                Office.officeBuilding[2][position - 1] = lift;
                position--;
            }
            case 6 -> {
                takeHuman(Office.OfficeLevel.level4);
                if (lift.contains(4)) {
                    lift.removeIf(o -> o.equals(4));
                    System.out.println("Remove 4");
                }
                Office.officeBuilding[2][position] = ".";
                Office.officeBuilding[2][position - 1] = lift;
                position--;
            }
            case 5 -> {
                takeHuman(Office.OfficeLevel.level5);
                if (lift.contains(5)) {
                    lift.removeIf(o -> o.equals(5));
                    System.out.println("Remove 5");
                }
                Office.officeBuilding[2][position] = ".";
                Office.officeBuilding[2][position - 1] = lift;
                position--;
            }
            case 4 -> {
                takeHuman(Office.OfficeLevel.level6);
                if (lift.contains(6)) {
                    lift.removeIf(o -> o.equals(6));
                    System.out.println("Remove 6");
                }
                Office.officeBuilding[2][position] = ".";
                Office.officeBuilding[2][position - 1] = lift;
                position--;
            }
            case 3 -> {
                takeHuman(Office.OfficeLevel.level7);
                if (lift.contains(7)) {
                    lift.removeIf(o -> o.equals(7));
                    System.out.println("Remove 7");
                }
                Office.officeBuilding[2][position] = ".";
                Office.officeBuilding[2][position - 1] = lift;
                position--;
            }
            case 2 -> {
                takeHuman(Office.OfficeLevel.level8);
                if (lift.contains(8)) {
                    lift.removeIf(o -> o.equals(8));
                    System.out.println("Remove 8");
                }
                Office.officeBuilding[2][position] = ".";
                Office.officeBuilding[2][position - 1] = lift;
                position--;
            }
            case 1 -> {
                takeHuman(Office.OfficeLevel.level9);
                if (lift.contains(9)) {
                    lift.removeIf(o -> o.equals(9));
                    System.out.println("Remove 9");
                }
                Office.officeBuilding[2][position] = ".";
                Office.officeBuilding[2][position - 1] = lift;
                position--;
            }
            case 0 -> {
                takeHuman(Office.OfficeLevel.level10);
                if (lift.contains(10)) {
                    lift.removeIf(o -> o.equals(10));
                    System.out.println("Remove 10");
                }
                Office.officeBuilding[2][position] = ".";
                elevatorMoveDown();
            }
        }
    }
    public void elevatorMoveDown() {
        switch (position) {
            case 9 -> {
                takeHuman(Office.OfficeLevel.level1);
                if (lift.contains(1)) {
                    lift.removeIf(o -> o.equals(1));
                    System.out.println("Remove 1");
                }
                Office.officeBuilding[2][position] = lift;
                elevatorMoveUp();
            }
            case 8 -> {
                takeHuman(Office.OfficeLevel.level2);
                if (lift.contains(2)) {
                    lift.removeIf(o -> o.equals(2));
                    System.out.println("Remove 2");
                }
                Office.officeBuilding[2][position] = ".";
                Office.officeBuilding[2][position + 1] = lift;
                position++;
            }
            case 7 -> {
                takeHuman(Office.OfficeLevel.level3);
                if (lift.contains(3)) {
                    lift.removeIf(o -> o.equals(3));
                    System.out.println("Remove 3");
                }
                Office.officeBuilding[2][position] = ".";
                Office.officeBuilding[2][position + 1] = lift;
                position++;
            }
            case 6 -> {
                takeHuman(Office.OfficeLevel.level4);
                if (lift.contains(4)) {
                    lift.removeIf(o -> o.equals(4));
                    System.out.println("Remove 4");
                }
                Office.officeBuilding[2][position] = ".";
                Office.officeBuilding[2][position + 1] = lift;
                position++;
            }
            case 5 -> {
                takeHuman(Office.OfficeLevel.level5);
                if (lift.contains(5)) {
                    lift.removeIf(o -> o.equals(5));
                    System.out.println("Remove 5");
                }
                Office.officeBuilding[2][position] = ".";
                Office.officeBuilding[2][position + 1] = lift;
                position++;
            }
            case 4 -> {
                takeHuman(Office.OfficeLevel.level6);
                if (lift.contains(6)) {
                    lift.removeIf(o -> o.equals(6));
                    System.out.println("Remove 6");
                }
                Office.officeBuilding[2][position] = ".";
                Office.officeBuilding[2][position + 1] = lift;
                position++;
            }
            case 3 -> {
                takeHuman(Office.OfficeLevel.level7);
                if (lift.contains(7)) {
                    lift.removeIf(o -> o.equals(7));
                    System.out.println("Remove 7");
                }
                Office.officeBuilding[2][position] = ".";
                Office.officeBuilding[2][position + 1] = lift;
                position++;
            }
            case 2 -> {
                takeHuman(Office.OfficeLevel.level8);
                if (lift.contains(8)) {
                    lift.removeIf(o -> o.equals(8));
                    System.out.println("Remove 8");
                }
                Office.officeBuilding[2][position] = ".";
                Office.officeBuilding[2][position + 1] = lift;
                position++;
            }
            case 1 -> {
                takeHuman(Office.OfficeLevel.level9);
                if (lift.contains(9)) {
                    lift.removeIf(o -> o.equals(9));
                    System.out.println("Remove 9");
                }
                Office.officeBuilding[2][position] = ".";
                Office.officeBuilding[2][position + 1] = lift;
                position++;
            }
            case 0 -> {
                takeHuman(Office.OfficeLevel.level10);
                if (lift.contains(10)) {
                    lift.removeIf(o -> o.equals(10));
                    System.out.println("Remove 10");
                }
                Office.officeBuilding[2][position] = ".";
                Office.officeBuilding[2][position + 1] = lift;
                position++;
            }
        }
    }
}
