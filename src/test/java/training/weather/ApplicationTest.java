package training.weather;

import org.junit.Test;
import training.weather.client.MetaWeatherClientTest;
import training.weather.service.WeatherForecastTest;
import training.weather.util.DateUtilTest;
import training.weather.util.MetaWeatherUtilTest;

public class ApplicationTest {

    @Test
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
