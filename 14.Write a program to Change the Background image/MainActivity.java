package com.shaheerz.allinone;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
public class MainActivity extends Activity implements View.OnClickListener{
        ImageView v1;
        Button btn1;
        Button btn2;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_main);

                btn1=(Button)findViewById(R.id.button1);
                btn2=(Button)findViewById(R.id.button2);
                v1=(ImageView)findViewById(R.id.imageView1);
                btn1.setOnClickListener(this);
                btn2.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
                // TODO Auto-generated method stub
                switch(v.getId()){
                        case R.id.button1:
                                v1.setImageResource(R.drawable.bg1);
                                break;
                        case R.id.button2:
                                v1.setImageResource(R.drawable.bg2);
                                break;
                }
        }
}
