
public class Clock {

    public static void main(String[] args) {
        int seconds = getSecond(18, 32, 47);
        System.out.println(seconds);
    }

    public static int getSecond(int h, int m, int s) {
        int result = h * 3600 + m * 60 + s;
        return result;
    }

}
