package com.example.praktikum_6mobile;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiService {
    @GET("api/users")
    Call<UserResponse> getUsers(@Query("per_page") int page);

    @GET("api/users/{id}")
    Call<UserResponse> getUserById(@Path("id") int userId);

}
