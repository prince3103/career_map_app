package com.example.cvrecommendation;

import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;


public interface Api {
    //HTTP annotation providing request method and relative URL
    @POST("/auth")
    Call<ResponseBody> postUser(@Body RequestBody requestBody);

    @POST("/register")
    Call<ResponseBody> registerUser(@Body RequestBody requestBody);

    @Multipart
    @POST("/user_cv_upload")
    Call<ResponseBody> uploadcv(
//            @Part("access_token") RequestBody access_token,  add access token
            @Part("description") RequestBody description,
            @Part MultipartBody.Part file
    );
}
