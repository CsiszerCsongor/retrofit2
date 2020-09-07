package com.example.retrofit.service;

import com.example.retrofit.dto.UserApiResponseDTO;
import okhttp3.OkHttpClient;
import retrofit2.Response;
import org.springframework.stereotype.Service;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Service
public class CallService {

    public String getUser(Long id){
        // Factory for calls, which can be used to send HTTP requests and read their responses.
        OkHttpClient.Builder httpClient = new OkHttpClient.Builder();

        // The Retrofit class generates an implementation of the
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://reqres.in/")
                .addConverterFactory(GsonConverterFactory.create())
                .client(httpClient.build())
                .build();

        UserServiceInterface serviceInterface = retrofit.create(UserServiceInterface.class);
        Call<UserApiResponseDTO> callSync = serviceInterface.getUser(id);
        try{
            Response<UserApiResponseDTO> response = callSync.execute();
            UserApiResponseDTO apiResponse = response.body();
            return apiResponse.toString();
        } catch (Exception e){
            System.out.println("Exception: " + e);
            return e.getMessage();
        }
    }

}
