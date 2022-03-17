import java.util.Arrays;

public class Task01 {
    static double[] initDoubleArr(int length) {
        if (length <= 0) {
            return null;
        }

        double[] arr = new double[length];

        for (int i = 0; i < length; i++) {
            arr[i] = Math.random();
        }

        return arr;
    }

    static double minValue(double[] arr) throws NullPointerException {
        double min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        return min;
    }

    static double maxValue(double[] arr) throws NullPointerException {
        double max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }

    static double averageValue(double[] arr) throws NullPointerException {
        double avg = 0;

        for (double elem : arr) {
            avg += elem;
        }

        return avg / arr.length;
    }

    public static void main(String[] args) {
        double[] arr = initDoubleArr(6);

        try {
            System.out.println(averageValue(arr));
            System.out.println(maxValue(arr));
            System.out.println(minValue(arr));
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }
}
