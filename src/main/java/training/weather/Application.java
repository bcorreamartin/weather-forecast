package training.weather;


import training.weather.service.WeatherForecast;

public class Application {
    public static void main(String[] args) throws Exception {
        System.out.println(new WeatherForecast().getCityWeather("Madrid", null));
    }
}
