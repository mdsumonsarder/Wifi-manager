package com.example.getipaddress_wifimanager;

import androidx.appcompat.app.AppCompatActivity;

import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.text.format.Formatter;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        t1 = findViewById(R.id.t1);

        //Wifi Code;
        WifiManager ip = (WifiManager) getApplicationContext().getSystemService(WIFI_SERVICE);
        String clintIp = Formatter.formatIpAddress(ip.getConnectionInfo().getIpAddress());
        //SetText;
        t1.setText(clintIp);


    }
}
