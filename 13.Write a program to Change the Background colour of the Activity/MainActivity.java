package com.shaheerz.allinone;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.Color;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RelativeLayout;
public class MainActivity extends Activity {
        Button butn;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_main);

                final RelativeLayout r1 = (RelativeLayout)findViewById(R.id.rl);
                butn= (Button)findViewById(R.id.button1);
                butn.setOnClickListener(new OnClickListener() {

                        @Override
                        public void onClick(View arg0) {
                                r1.setBackgroundColor(Color.BLUE);
                        }
                });
        }
}