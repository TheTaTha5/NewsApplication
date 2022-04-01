package com.example.newsapplication;

import retrofit2.http.GET;

public interface RetrofitAPI {
    @GET
    Call<NewsModal> getAllNews(@Url String url);

    @GET
    Call<NewsModal>getNewsByCatergory(@Url String url);

}
