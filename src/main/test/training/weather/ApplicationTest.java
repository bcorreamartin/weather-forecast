package training.weather;

import training.weather.client.MetaWeatherClientTest;
import training.weather.service.WeatherForecast;
import training.weather.service.WeatherForecastTest;
import training.weather.util.DateUtilTest;
import training.weather.util.MetaWeatherUtilTest;
import training.weather.util.MetaWeatherUtils;

public class ApplicationTest {


    public static void main(String[] args) throws Exception {
        MetaWeatherUtilTest metaWeatherUtilTest = new MetaWeatherUtilTest();
        WeatherForecastTest weatherForecastTest = new WeatherForecastTest();
        DateUtilTest dateUtilTest = new DateUtilTest();
        MetaWeatherClientTest metaWeatherClientTest = new MetaWeatherClientTest();


        metaWeatherUtilTest.getConsolidatedWeatherFromStringResponseTest();
        metaWeatherUtilTest.getWoeidFromStringResponseTest();
        weatherForecastTest.WeatherForecastServiceTestGetCityWeatherTest();
        dateUtilTest.isBeforeTodayIntervalTest();
        dateUtilTest.getWeatherStateNameFromStreamObjectTest();
        metaWeatherClientTest.getWeatherByWoeid();
        metaWeatherClientTest.getWoeidQueryTest();
        metaWeatherClientTest.MetaWeatherClientGetCityWeatherTest();
    }

}
