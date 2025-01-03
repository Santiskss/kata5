package ulpgc.dis.is2.control;

import ulpgc.dis.is2.model.Weather;

public class WeatherAdapter implements Adapter{
    @Override
    public Weather adapt(OpenWeatherResponse response) {
        return new Weather(
                response.getName(),
                response.getMain().getTemp(),
                response.getWeather().getFirst().getDescription()
        );
    }
}
