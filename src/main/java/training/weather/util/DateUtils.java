package training.weather.util;

import org.json.JSONObject;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.stream.Stream;

public class DateUtils {


    public static boolean isBeforeTodayInterval(Date datetime, int interval) {
        return datetime.before(new Date(new Date().getTime() + interval));
    }

    public static String getWeatherStateNameFromStreamObject(Stream<Object> streamObject, Date date) {
        return streamObject.map(JSONObject.class::cast).filter(
                o -> o.get("applicable_date").equals(new SimpleDateFormat("yyyy-MM-dd").format(date)))
                .findFirst().get().get("weather_state_name").toString();
    }


}
