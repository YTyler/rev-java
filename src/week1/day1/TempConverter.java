package week1.day1;

public class TempConverter {
    public static double toCelsius(double temperature) {
        return (temperature - 32.0) * (5.0/9.0);
    }
    public static double toFahrenheit(double temperature) {
        return (temperature * (9.0/5.0) + 32.0);
    }
}
