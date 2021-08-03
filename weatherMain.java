package Homework7;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import okhttp3.*;
import java.io.IOException;
import java.util.List;

public class weatherMain {
    public static final String API_KEY_PARAM = "apikey";
    public static final String API_KEY = "7JZ7zAh46bW3ksgbqTPMoIkrj0sobPWv";
    public static final String CURRENT_TOWN_KEY = "295212";
    public static final String WEATHER_URL = "https://dataservice.accuweather.com/currentconditions/v1/" + CURRENT_TOWN_KEY;

    public static void main(String[] args) throws IOException {
        HttpUrl.Builder urlBuilder = HttpUrl.parse(WEATHER_URL).newBuilder();
        urlBuilder.addQueryParameter(API_KEY_PARAM, API_KEY);

        HttpUrl httpUrl = urlBuilder.build();
        Request.Builder requestBuilder = new Request.Builder();
        Request request = requestBuilder
                .get()
                .url(httpUrl)
                .build();

        OkHttpClient client = new OkHttpClient();
        Call call = client.newCall(request);
        Response response = call.execute();
        String responseBody = response.body().string();
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        List<SPB> cities = objectMapper.readValue(responseBody, new TypeReference<List<SPB>>() {
        });
        SPB city = cities.get(0);
        System.out.println(city);
    }
}
