public class Task04 {
    public static int convertClockHandAngle(int hours, int minutes) {
        return Math.abs((hours + (minutes / 60)) * 30 - minutes * 6);
    }

    public static void main(String[] args) {
        System.out.println(convertClockHandAngle(11, 57));
        System.out.println(convertClockHandAngle(12, 30));
    }
}
