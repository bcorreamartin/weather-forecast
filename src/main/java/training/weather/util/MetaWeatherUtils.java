package training.weather.util;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class MetaWeatherUtils {


    public static String getWoeidFromStringResponse(String response) throws JSONException {
        JSONArray jsonArray = new JSONArray(response);
        return jsonArray.length() != 0 ? jsonArray.getJSONObject(0).get("woeid").toString() : "";
    }

    public static JSONArray getConsolidatedWeatherJsonArrayFromStringResponse(String response) throws JSONException {
        JSONArray results = new JSONObject(response).getJSONArray("consolidated_weather");
        return results;
    }


}
