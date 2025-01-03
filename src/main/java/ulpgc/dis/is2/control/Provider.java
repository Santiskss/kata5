package ulpgc.dis.is2.control;

import ulpgc.dis.is2.model.Weather;

import java.io.IOException;

public interface Provider {
    Weather provideWeather(String city) throws IOException;
}
