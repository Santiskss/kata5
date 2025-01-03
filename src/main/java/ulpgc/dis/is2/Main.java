package ulpgc.dis.is2;

import ulpgc.dis.is2.control.LoadWeatherCommand;
import ulpgc.dis.is2.model.Weather;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        LoadWeatherCommand command = new LoadWeatherCommand(Arrays.asList("Madrid", "Berlin", "New York"));
        command.execute();
        for (Weather weather : command.getWeatherList()) {
            System.out.printf("City: %s, Temperature: %.2fºC, Description: %s%n",
                    weather.getCity(), weather.getTemperature(), weather.getDescription());
        }
    }
}
