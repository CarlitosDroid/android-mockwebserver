package com.carlitosdroid.usingmockwebserver;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.carlitosdroid.usingmockwebserver.model.response.LoginResponse;
import com.carlitosdroid.usingmockwebserver.util.api.SampleApiManager;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Call<LoginResponse> loginResponseCall = SampleApiManager.apiManager().loginGet();
        loginResponseCall.enqueue(new Callback<LoginResponse>() {
            @Override
            public void onResponse(Call<LoginResponse> call, Response<LoginResponse> response) {



                //Log.e("VEAMO ","VEASMO " + response.body().toString());
                if (response.isSuccessful()) {
                    Toast.makeText(MainActivity.this, "quantity " +response.body().getSuccess().getTotal(), Toast.LENGTH_SHORT).show();
                } else {

                    Log.e("VEAMO ","VEASMO " + response.code());


                }
            }

            @Override
            public void onFailure(Call<LoginResponse> call, Throwable t) {
                Toast.makeText(MainActivity.this, t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
