package training.weather.service;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

import org.json.JSONArray;
import org.json.JSONObject;
import training.weather.client.MetaWeatherClient;
import training.weather.util.DateUtils;

public class WeatherForecast {

    private static final int _ONE_DAY = 1000 * 60 * 60 * 24 * 6;

    public String getCityWeather(String city, Date datetime) throws IOException {
        datetime = datetime != null ? datetime : new Date();

        if (DateUtils.isBeforeTodayInterval(datetime, _ONE_DAY)) {
            return MetaWeatherClient.getCityWeather(city, datetime);
        }
        return "";
    }


}
