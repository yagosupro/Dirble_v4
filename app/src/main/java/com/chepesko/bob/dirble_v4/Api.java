package com.chepesko.bob.dirble_v4;

import com.chepesko.bob.dirble_v4.Shems.Model;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by bob on 03.10.2017.
 */

public interface Api {
    @GET("stations?token=5241cfa04a1afdd1a1248076de")
    Call<List<Model>> getData(@Query("page") int number_page, @Query("per_page") int count_per_page);

    @GET("stations/popular?token=5241cfa04a1afdd1a1248076de")
    Call<List<Model>> getDataPopular(@Query("page") int number_page, @Query("per_page") int count_per_page);
}
