package com.yundin.lifecycletest;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.show_window_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showWindow();
            }
        });

        Log.d("Lifecycle callback", "onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.d("Lifecycle callback", "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.d("Lifecycle callback", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.d("Lifecycle callback", "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.d("Lifecycle callback", "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.d("Lifecycle callback", "onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        Log.d("Lifecycle callback", "onRestart");
    }

    private void showWindow() {
        Intent intent = new Intent(getApplicationContext(), DialogActivity.class);
        startActivity(intent);
    }
}
