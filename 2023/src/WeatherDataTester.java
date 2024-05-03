import java.lang.reflect.Array;
import java.util.ArrayList;

public class WeatherDataTester {
    public static void main(String[] args) {
        ArrayList<Double> temperatures = new ArrayList<Double>();
        temperatures.add(99.1);
        temperatures.add(142.0);
        temperatures.add(85.0);
        temperatures.add(85.1);
        temperatures.add(84.6);
        temperatures.add(94.3);
        temperatures.add(124.9);
        temperatures.add(98.0);
        temperatures.add(101.0);
        temperatures.add(102.5);
        WeatherData weather = new WeatherData(temperatures);
        weather.cleanData(85.0, 120.0);
        System.out.println(weather.toString());

        
    }
}
