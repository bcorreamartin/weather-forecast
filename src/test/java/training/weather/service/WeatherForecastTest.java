package training.weather.service;

import java.io.IOException;
import java.util.Date;

import org.junit.Test;


public class WeatherForecastTest {

    @Test
    public void WeatherForecastServiceTestGetCityWeatherTest() throws IOException {
        WeatherForecast weatherForecast = new WeatherForecast();
        String forecast = weatherForecast.getCityWeather("Atlanta", new Date());
        System.out.println("getCityWeatherTest method OK");
    }
}
