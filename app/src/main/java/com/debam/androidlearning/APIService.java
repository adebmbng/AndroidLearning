package com.debam.androidlearning;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Created by Debam on 12/19/17.
 */

public interface APIService {

    @FormUrlEncoded
    @POST("user/login")
    Call<ResponseLogin> doLogin(@Field("username") String username,
                           @Field("password") String password);
}
