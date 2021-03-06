package training.weather.client;

import org.json.JSONArray;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.Date;


public class MetaWeatherClientTest {
    @Test
    public void MetaWeatherClientGetCityWeatherTest() throws IOException {
        MetaWeatherClient.getCityWeather("London", new Date());
        System.out.println("getCityWeatherTest method OK");
    }

    @Test
    public void getWoeidQueryTest() throws IOException {
        String woeid = MetaWeatherClient.getWoeidQuery("Madrid");
        Assert.assertEquals(woeid, "766273");
        Assert.assertTrue("766273", true);
        Assert.assertNotNull(woeid);
        System.out.println("getWoeidQueryTest method OK");
    }

    @Test
    public void getWeatherByWoeid() throws IOException {
        JSONArray weather = MetaWeatherClient.getWeatherByWoeid("766273");
        Assert.assertTrue(weather instanceof JSONArray);
        System.out.println("getWeatherByWoeid method OK");
    }


}
