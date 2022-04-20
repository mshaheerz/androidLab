package com.shaheerz.allinone;

import android.content.Context;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.app.Activity;
import android.text.format.Formatter;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
public class MainActivity extends Activity {
        Button buttn;
        TextView txtview;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_main);

                buttn=(Button)findViewById(R.id.button1);
                buttn.setOnClickListener(new OnClickListener() {

                        @Override
                        public void onClick(View arg0) {
                                // TODO Auto-generated method stub
                                txtview = (TextView) findViewById(R.id.textView1);

                                WifiManager wifiManager = (WifiManager) getSystemService(WIFI_SERVICE);
                                String ipAddress= Formatter.formatIpAddress(wifiManager.getConnectionInfo().getIpAddress());
                                txtview.setText("Device IP Address: " + ipAddress);
                        }
                });
        }
}