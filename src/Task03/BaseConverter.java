package Task03;

public class BaseConverter {
    public static double convert(double celsiusDegrees, Temperature temperatureUnit) {
        switch (temperatureUnit) {
            case KELVIN:
                return celsiusDegrees + 273.15;
            case RANKINE:
                return celsiusDegrees * 9/5 + 491.67;
            case FAHRENHEIT:
                return (celsiusDegrees * 9/5) + 32;
            default:
                System.out.println("Конвертация не выполнена!");
                return celsiusDegrees;
        }
    }
}