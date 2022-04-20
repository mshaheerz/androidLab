package com.shaheerz.allinone;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends Activity {

        private CheckBox android, java, opencv, symbian;
        private Button Clickhere;

        @Override
        public void onCreate(Bundle savedInstanceState) {

                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_main);

                android = (CheckBox) findViewById(R.id.android);
                java = (CheckBox) findViewById(R.id.java);
                opencv = (CheckBox) findViewById(R.id.opencv);
                symbian = (CheckBox) findViewById(R.id.symbian);
                Clickhere = (Button) findViewById(R.id.Clickhere);


                Clickhere.setOnClickListener(new OnClickListener() {

                        @Override
                        public void onClick(View v) { StringBuffer OUTPUT = new StringBuffer();
                                OUTPUT.append("Android : ")
                                        .append(android.isChecked());

                                OUTPUT.append("\nJava : ").append(
                                        java.isChecked());

                                OUTPUT.append("\nOpenCV :").append(
                                        opencv.isChecked());

                                OUTPUT.append("\nSymbian :").append(
                                        symbian.isChecked());

                                Toast.makeText(MainActivity.this, OUTPUT.toString(),
                                        Toast.LENGTH_LONG).show();

                        }
                });

        }
}