package ulpgc.dis.is2.control;

import com.google.gson.Gson;
import org.jsoup.Jsoup;
import ulpgc.dis.is2.model.Weather;

import java.io.IOException;

public class WeatherProvider implements Provider{

    private static final String API_URL = "https://api.openweathermap.org/data/2.5/weather";
    private static final String API_KEY = "5f156e2a3e5a14d95086fda49c1b309f";

    @Override
    public Weather provideWeather(String city) throws IOException {
        String url = API_URL + "?q=" + city + "&appid=" + API_KEY + "&units=metric";
        String text = Jsoup.connect(url).ignoreContentType(true).get().text();
        OpenWeatherResponse response = new Gson().fromJson(text,OpenWeatherResponse.class);
        Adapter adapter = new WeatherAdapter();
        return adapter.adapt(response);
    }
}
