package hexlet.code;

public class Utils {
    public static final int RANGE_LIMIT_0 = 0;
    public static final int RANGE_LIMIT_100 = 100;

    public static int getRandom(int min, int max) {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }
}