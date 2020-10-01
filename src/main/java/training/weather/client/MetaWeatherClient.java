package training.weather.client;

import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestFactory;
import com.google.api.client.http.javanet.NetHttpTransport;
import org.json.JSONArray;
import training.weather.util.DateUtils;
import training.weather.util.MetaWeatherUtils;

import java.io.IOException;
import java.util.Date;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class MetaWeatherClient {

    private static final String _GETWOEID_QUERY_URL = "https://www.metaweather.com/api/location/search/?query=";
    private static final String _GETWEATHERBYWOEID_QUERY_SCOPE = "https://www.metaweather.com/api/location/";
    private static final HttpRequestFactory _httpRequestFactory = new NetHttpTransport().createRequestFactory();

    public MetaWeatherClient() {
    }

    public static String getCityWeather(String city, Date date) throws IOException {
        Stream<Object> streamObject = StreamSupport.stream(getWeatherByWoeid(getWoeidQuery(city)).spliterator(), false);
        return DateUtils.getWeatherStateNameFromStreamObject(streamObject, date);
    }

    public static String getWoeidQuery(String city) throws IOException {
        HttpRequest httpRequest = _httpRequestFactory.buildGetRequest(new GenericUrl(_GETWOEID_QUERY_URL + city));
        String responseAsString = httpRequest.execute().parseAsString();
        return MetaWeatherUtils.getWoeidFromStringResponse(responseAsString);
    }

    public static JSONArray getWeatherByWoeid(String woe) throws IOException {
        HttpRequest httpRequest = _httpRequestFactory.buildGetRequest(new GenericUrl(_GETWEATHERBYWOEID_QUERY_SCOPE + woe));
        String responseAsString = httpRequest.execute().parseAsString();
        return MetaWeatherUtils.getConsolidatedWeatherJsonArrayFromStringResponse(responseAsString);
    }


}
