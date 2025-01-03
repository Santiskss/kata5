package ulpgc.dis.is2.control;

import ulpgc.dis.is2.model.Weather;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class LoadWeatherCommand implements Command{

    private final List<String> cities;
    private final List<Weather> weatherList = new ArrayList<>();

    public LoadWeatherCommand(List<String> cities) {
        this.cities = cities;
    }

    public List<Weather> getWeatherList() {
        return weatherList;
    }

    @Override
    public void execute() {
        weatherList.clear();
        WeatherProvider provider = new WeatherProvider();
        for (String city : cities) {
            try {
                weatherList.add(provider.provideWeather(city));
            } catch (IOException e) {
                Logger.getAnonymousLogger().severe(e.getMessage());
            }
        }
    }
}
