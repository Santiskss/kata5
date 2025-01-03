package ulpgc.dis.is2.control;

import ulpgc.dis.is2.model.Weather;

public interface Adapter {
    Weather adapt(OpenWeatherResponse response);
}
