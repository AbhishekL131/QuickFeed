package com.example.quickfeed;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {

    String Base_Url = "https://newsapi.org/v2/";

    @GET("top-headlines")
    Call<MainNews> getnews(
            @Query("country") String country,
            @Query("pageSize") int pagesize,
            @Query("apiKey") String apiKey
    );

    @GET("top-headlines")
    Call<MainNews> getCategorynews(
            @Query("country") String country,
            @Query("category") String category,
            @Query("pageSize") int pagesize,
            @Query("apiKey") String apiKey
    );
}
