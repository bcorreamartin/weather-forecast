package training.weather.util;

import org.json.JSONArray;
import org.junit.Assert;
import org.junit.Test;

public class MetaWeatherUtilTest {

    @Test
    public void getConsolidatedWeatherFromStringResponseTest() {
        JSONArray jsonArray = MetaWeatherUtils.getConsolidatedWeatherJsonArrayFromStringResponse("{\"consolidated_weather\":[{\"id\":5898971954282496,\"weather_state_name\":\"Light Cloud\",\"weather_state_abbr\":\"lc\",\"wind_direction_compass\":\"W\",\"created\":\"2020-10-01T06:36:56.970545Z\",\"applicable_date\":\"2020-10-01\",\"min_temp\":12.74,\"max_temp\":22.68,\"the_temp\":22.854999999999997,\"wind_speed\":5.641282448368197,\"wind_direction\":267.0237501096316,\"air_pressure\":1011.0,\"humidity\":46,\"visibility\":14.94677334367295,\"predictability\":70},{\"id\":5838473048096768,\"weather_state_name\":\"Light Rain\",\"weather_state_abbr\":\"lr\",\"wind_direction_compass\":\"W\",\"created\":\"2020-10-01T06:36:59.427271Z\",\"applicable_date\":\"2020-10-02\",\"min_temp\":8.805,\"max_temp\":16.119999999999997,\"the_temp\":13.530000000000001,\"wind_speed\":14.777970887186827,\"wind_direction\":277.55007870733385,\"air_pressure\":996.5,\"humidity\":63,\"visibility\":8.240935437047641,\"predictability\":75},{\"id\":6041707410882560,\"weather_state_name\":\"Light Cloud\",\"weather_state_abbr\":\"lc\",\"wind_direction_compass\":\"WNW\",\"created\":\"2020-10-01T06:37:02.525242Z\",\"applicable_date\":\"2020-10-03\",\"min_temp\":6.775,\"max_temp\":16.15,\"the_temp\":15.864999999999998,\"wind_speed\":9.418171728282829,\"wind_direction\":286.8495449157978,\"air_pressure\":1008.0,\"humidity\":45,\"visibility\":12.74432315278772,\"predictability\":70},{\"id\":5881568615727104,\"weather_state_name\":\"Heavy Cloud\",\"weather_state_abbr\":\"hc\",\"wind_direction_compass\":\"W\",\"created\":\"2020-10-01T06:37:05.668205Z\",\"applicable_date\":\"2020-10-04\",\"min_temp\":6.505,\"max_temp\":16.695,\"the_temp\":16.939999999999998,\"wind_speed\":9.40010285560858,\"wind_direction\":274.32192997875893,\"air_pressure\":1008.5,\"humidity\":51,\"visibility\":13.334315099817069,\"predictability\":71},{\"id\":6626066970968064,\"weather_state_name\":\"Light Cloud\",\"weather_state_abbr\":\"lc\",\"wind_direction_compass\":\"WNW\",\"created\":\"2020-10-01T06:37:09.032357Z\",\"applicable_date\":\"2020-10-05\",\"min_temp\":7.945,\"max_temp\":18.355,\"the_temp\":17.35,\"wind_speed\":7.453426295503593,\"wind_direction\":285.2653345884289,\"air_pressure\":1016.0,\"humidity\":46,\"visibility\":15.09341694504096,\"predictability\":70},{\"id\":5747366185402368,\"weather_state_name\":\"Clear\",\"weather_state_abbr\":\"c\",\"wind_direction_compass\":\"WSW\",\"created\":\"2020-10-01T06:37:11.616433Z\",\"applicable_date\":\"2020-10-06\",\"min_temp\":8.965,\"max_temp\":22.18,\"the_temp\":19.89,\"wind_speed\":4.292062952358228,\"wind_direction\":255.5,\"air_pressure\":1018.0,\"humidity\":53,\"visibility\":9.999726596675416,\"predictability\":68}],\"time\":\"2020-10-01T10:32:14.319150+02:00\",\"sun_rise\":\"2020-10-01T08:11:33.609371+02:00\",\"sun_set\":\"2020-10-01T19:56:26.722161+02:00\",\"timezone_name\":\"LMT\",\"parent\":{\"title\":\"Spain\",\"location_type\":\"Country\",\"woeid\":23424950,\"latt_long\":\"39.894890,-2.988310\"},\"sources\":[{\"title\":\"BBC\",\"slug\":\"bbc\",\"url\":\"http://www.bbc.co.uk/weather/\",\"crawl_rate\":360},{\"title\":\"Forecast.io\",\"slug\":\"forecast-io\",\"url\":\"http://forecast.io/\",\"crawl_rate\":480},{\"title\":\"HAMweather\",\"slug\":\"hamweather\",\"url\":\"http://www.hamweather.com/\",\"crawl_rate\":360},{\"title\":\"Met Office\",\"slug\":\"met-office\",\"url\":\"http://www.metoffice.gov.uk/\",\"crawl_rate\":180},{\"title\":\"OpenWeatherMap\",\"slug\":\"openweathermap\",\"url\":\"http://openweathermap.org/\",\"crawl_rate\":360},{\"title\":\"Weather Underground\",\"slug\":\"wunderground\",\"url\":\"https://www.wunderground.com/?apiref=fc30dc3cd224e19b\",\"crawl_rate\":720},{\"title\":\"World Weather Online\",\"slug\":\"world-weather-online\",\"url\":\"http://www.worldweatheronline.com/\",\"crawl_rate\":360}],\"title\":\"Madrid\",\"location_type\":\"City\",\"woeid\":766273,\"latt_long\":\"40.420300,-3.705770\",\"timezone\":\"Europe/Madrid\"}");
        System.out.println("getConsolidatedWeatherFromStringResponseTest method OK");
    }

    @Test
    public void getWoeidFromStringResponseTest() {
        String woeid = MetaWeatherUtils.getWoeidFromStringResponse("[{\"title\":\"Madrid\",\"location_type\":\"City\",\"woeid\":766273,\"latt_long\":\"40.420300,-3.705770\"}]");
        Assert.assertEquals("766273", "766273", woeid);
        System.out.println("getWoeidFromStringResponseTest method OK");
    }
}
