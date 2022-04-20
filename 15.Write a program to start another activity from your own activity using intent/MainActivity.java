package com.shaheerz.allinone;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
public class MainActivity extends Activity {
        Button jumpbtn;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_main);

                jumpbtn = (Button)findViewById(R.id.button1);
                jumpbtn.setOnClickListener(new View.OnClickListener() {

                        @Override
                        public void onClick(View v) {
                                // TODO Auto-generated method stub
                                Intent i = new Intent(MainActivity.this,Nextactivity.class);
                                startActivity(i);
                        } });
        }
}
