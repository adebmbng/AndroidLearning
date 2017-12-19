package com.debam.androidlearning;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Debam on 12/19/17.
 */

public class BaseActivity extends AppCompatActivity {

    private APIService api;
    private static final String URL = "http://192.168.43.246/android-backend2/web/index.php/";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        //import okhttp3.OkHttpClient;
        //import okhttp3.logging.HttpLoggingInterceptor;
        //import retrofit2.Retrofit;
        //import retrofit2.converter.gson.GsonConverterFactory;

        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient.Builder client = new OkHttpClient.Builder();
        client.addInterceptor(interceptor);

        Retrofit base = new Retrofit.Builder()
                .baseUrl(URL)
                .addConverterFactory(GsonConverterFactory.create())
                .client(client.build())
                .build();
        api = base.create(APIService.class);


    }

    public APIService getApi() {
        return api;
    }
}
