package ulpgc.dis.is2.control;

import java.util.List;

public class OpenWeatherResponse {
    private String name;
    private Main main;
    private List<WeatherDescription> weather;

    public String getName() {
        return name;
    }

    public Main getMain() {
        return main;
    }

    public List<WeatherDescription> getWeather() {
        return weather;
    }


    public static class Main {
        private double temp;

        public double getTemp() {
            return temp;
        }
    }

    public static class WeatherDescription {
        private String Description;

        public String getDescription() {
            return Description;
        }
    }
}
