package com.example.coroutine.retrofit;

public class ApiUtils {

    public static ApiInterface getApi() {
        return RetrofitClient.getInstance().create(ApiInterface.class);
    }
}
