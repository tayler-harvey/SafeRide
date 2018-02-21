package com.example.ssilance.saferide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        configureDriverLoginBtn();
        configureRiderLoginBtn();
    }

    private void configureDriverLoginBtn(){
        Button driverLoginBtn = (Button) findViewById(R.id.driverLoginBtn);
        driverLoginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, DriverMainActivity.class));
            }
        });
    }

    private void configureRiderLoginBtn(){
        Button riderLoginBtn = (Button) findViewById(R.id.riderLoginBtn);
        riderLoginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, RiderMainActivity.class));
            }
        });
    }
}
