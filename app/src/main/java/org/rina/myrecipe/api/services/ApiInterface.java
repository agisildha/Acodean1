package org.rina.myrecipe.api.services;


import org.rina.myrecipe.api.models.AppVersion;
import org.rina.myrecipe.api.models.Envelope;
import org.rina.myrecipe.api.models.Rebrandly;
import org.rina.myrecipe.api.models.RebrandlyRequest;
import org.rina.myrecipe.api.models.ResponseData;

import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiInterface{
    @GET("/")
    Call<AppVersion> getAppVersion();

    @POST("/v1/links")
    Call<ResponseData> doRebrand(@Query("apikey") String apikey , @Body RebrandlyRequest destination);

    @GET("/v1/links")
    Call<List<ResponseData>> getRebrand(@Query("apikey") String data);


}
