package com.example.retrofit.service;

import com.example.retrofit.dto.UserApiResponseDTO;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface UserServiceInterface {

    @GET("/api/users/{id}")
    Call<UserApiResponseDTO> getUser(@Path("id") Long id);
}
