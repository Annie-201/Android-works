package com.example.asia_country;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RetrofitInterface {
    @GET("rest/v2/alpha/col")
    Call<Data> getAlpha();
}
