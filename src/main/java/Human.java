import java.util.Random;

public class Human {
    public static String humanIcon = "\uD83D\uDEB6";

    int desiredLevel;

    public Human() {
        desiredLevel = new Random().nextInt(1,11);
    }
}
