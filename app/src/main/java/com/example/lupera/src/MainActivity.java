package com.example.lupera.src;

import android.content.Context;
import android.net.wifi.WifiManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnEnable, btnDisable;
    WifiManager wifiManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnEnable = (Button)findViewById(R.id.btn_enable);
        btnDisable = (Button)findViewById(R.id.btn_disable);
        wifiManager = (WifiManager)getApplicationContext().getSystemService(Context.WIFI_SERVICE);

        btnEnable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wifiManager.setWifiEnabled(true);
                Toast.makeText(MainActivity.this,"Habilitadp!",Toast.LENGTH_SHORT).show();
            }
        });
        btnDisable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wifiManager.setWifiEnabled(false);
                Toast.makeText(MainActivity.this,"Deshabilitadp!",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
