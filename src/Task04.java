public class Task04 {
    public static int convertClockHandAngle(int hours, int minutes) {
        return -((hours + (minutes / 60)) * 30 - minutes * 6);
    }
}
