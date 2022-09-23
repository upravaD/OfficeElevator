import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Office {
    static int numberOfficeLevel = 10;
    public static Object[][] officeBuilding = new Object[3][10];

    public Office() {
        OfficeLevel.levelInit();
    }

    public void officeInit() {

        officeBuilding[1][0] = OfficeLevel.level10;
        officeBuilding[1][1] = OfficeLevel.level9;
        officeBuilding[1][2] = OfficeLevel.level8;
        officeBuilding[1][3] = OfficeLevel.level7;
        officeBuilding[1][4] = OfficeLevel.level6;
        officeBuilding[1][5] = OfficeLevel.level5;
        officeBuilding[1][6] = OfficeLevel.level4;
        officeBuilding[1][7] = OfficeLevel.level3;
        officeBuilding[1][8] = OfficeLevel.level2;
        officeBuilding[1][9] = OfficeLevel.level1;

        for (int i = 0; i < officeBuilding[0].length; i++) {
            officeBuilding[0][i] = numberOfficeLevel;
            --numberOfficeLevel;
            if (numberOfficeLevel < 1) numberOfficeLevel = 10;
        }
    }

    public void officePrint() {
//        Elevator.takeHuman();

        for (int i = 0; i < officeBuilding[0].length; i++) {
            System.out.print(officeBuilding[0][i] + "  " + officeBuilding[1][i] + "  " + officeBuilding[2][i] + "\n");
        }
    }
    
    static class OfficeLevel {

        public static List<String> level1 = new ArrayList<>();
        public static List<String> level2 = new ArrayList<>();
        public static List<String> level3 = new ArrayList<>();
        public static List<String> level4 = new ArrayList<>();
        public static List<String> level5 = new ArrayList<>();
        public static List<String> level6 = new ArrayList<>();
        public static List<String> level7 = new ArrayList<>();
        public static List<String> level8 = new ArrayList<>();
        public static List<String> level9 = new ArrayList<>();
        public static List<String> level10 = new ArrayList<>();

        static void levelInit() {

            for (int i = 0; i < new Random().nextInt(10+1); i++) {
                level1.add(Human.humanIcon);
            }
            for (int i = 0; i < new Random().nextInt(10+1); i++) {
                level2.add(Human.humanIcon);
            }
            for (int i = 0; i < new Random().nextInt(10+1); i++) {
                level3.add(Human.humanIcon);
            }
            for (int i = 0; i < new Random().nextInt(10+1); i++) {
                level4.add(Human.humanIcon);
            }
            for (int i = 0; i < new Random().nextInt(10+1); i++) {
                level5.add(Human.humanIcon);
            }
            for (int i = 0; i < new Random().nextInt(10+1); i++) {
                level6.add(Human.humanIcon);
            }
            for (int i = 0; i < new Random().nextInt(10+1); i++) {
                level7.add(Human.humanIcon);
            }
            for (int i = 0; i < new Random().nextInt(10+1); i++) {
                level8.add(Human.humanIcon);
            }
            for (int i = 0; i < new Random().nextInt(10+1); i++) {
                level9.add(Human.humanIcon);
            }
            for (int i = 0; i < new Random().nextInt(10+1); i++) {
                level10.add(Human.humanIcon);
            }
        }
    }
    
}
