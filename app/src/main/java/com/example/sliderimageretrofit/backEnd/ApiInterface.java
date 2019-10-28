package com.example.sliderimageretrofit.backEnd;

import com.example.sliderimageretrofit.Model.ImageModel;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {

    @GET("viewFlipper.php")
    Call<ImageModel> viewFlipperImage();

}
