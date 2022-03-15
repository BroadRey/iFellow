import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.stream.Stream;

public class Task01 {
    public static void main(String[] args) {
        double[] randNumsArr = new double[6];

        for (int i = 0; i < 6; i++) {
            randNumsArr[i] = Math.random();
        }

        OptionalDouble min = Stream.of(randNumsArr)
                .flatMapToDouble(Arrays::stream)
                .min();

        OptionalDouble max = Stream.of(randNumsArr)
                .flatMapToDouble(Arrays::stream)
                .max();

        OptionalDouble average = Stream.of(randNumsArr)
                .flatMapToDouble(Arrays::stream)
                .average();

        if (min.isPresent()) {
            System.out.printf("Минимальное значение массива: %f\n", min.getAsDouble());
        }

        if (max.isPresent()) {
            System.out.printf("Максимальное значение массива: %f\n", max.getAsDouble());
        }

        if (average.isPresent()) {
            System.out.printf("Среднее значение массива: %f\n", average.getAsDouble());
        }
    }
}
