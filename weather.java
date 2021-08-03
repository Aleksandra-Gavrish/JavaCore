package Homework6;

import okhttp3.*;
import java.io.IOException;
import java.lang.*;



public class weather {
    public static final String API_KEY_PARAM = "apikey";
    public static final String API_KEY = "7JZ7zAh46bW3ksgbqTPMoIkrj0sobPWv";
    public static final String APP_ID = "295212";
    public static final String WEATHER_URL = "http://dataservice.accuweather.com/forecasts/v1/daily/5day/" + APP_ID;

    public static final MediaType JSON = MediaType.get("application/json; charset=utf-8");

    OkHttpClient client = new OkHttpClient();



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
        System.out.println(response.body().string());
    }
}