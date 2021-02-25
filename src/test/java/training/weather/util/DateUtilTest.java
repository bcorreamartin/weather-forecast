package training.weather.util;

import org.junit.Assert;
import org.junit.Test;
import training.weather.client.MetaWeatherClient;

import java.io.IOException;
import java.util.Date;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class DateUtilTest {

    @Test
    public void isBeforeTodayIntervalTest() {
        boolean isBeforeInterval = DateUtils.isBeforeTodayInterval(new Date(), 1000 * 60 * 60 * 24 * 6);
        Assert.assertTrue(isBeforeInterval);
        System.out.println("isBeforeTodayIntervalTest methoid OK");
    }

    @Test
    public void getWeatherStateNameFromStreamObjectTest() throws IOException {
        Stream<Object> streamObject = StreamSupport.stream(MetaWeatherClient.getWeatherByWoeid(MetaWeatherClient.getWoeidQuery("Madrid")).spliterator(), false);
        DateUtils.getWeatherStateNameFromStreamObject(streamObject, new Date());
        System.out.println("getWeatherStateNameFromStreamObjectTest methoid OK");
    }
}
