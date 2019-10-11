package com.example.chattingapp.Fragments;

import com.example.chattingapp.Notifications.MyResponse;
import com.example.chattingapp.Notifications.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {
    @Headers(
            {
        "Content-type:application/json",
        "Authorization:key=AAAA8TPecHU:APA91bGHnfrwxFqQ8I_0qxC7ZisyZziUL6jpCzQ2IzGoxN6Isk__ilc8LYIDROx7xy_VWR77DGIqsAE5nA1ZWzaaoCK33ube9ZVmOULa65LfBVngZLm1Wi2brxVYRM60ZNFShKoSiMic"
    }
    )
    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);
}
