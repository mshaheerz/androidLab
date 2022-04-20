package com.shaheerz.allinone;

import android.os.Bundle;
import android.app.Activity;
import android.text.method.ScrollingMovementMethod;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
public class MainActivity extends Activity {
        Button butn;
        EditText text1;
        EditText text2;
        TextView txtview;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_main);
                butn=(Button)findViewById(R.id.button1);
                txtview=(TextView)findViewById(R.id.textView1);
                txtview.setMovementMethod(new ScrollingMovementMethod());

                butn.setOnClickListener(new View.OnClickListener() {

                        @Override
                        public void onClick(View arg0) {
                                // TODO Auto-generated method stub
                                text1= (EditText)findViewById(R.id.editText1);
                                text2= (EditText)findViewById(R.id.editText2);

                                txtview.setText(text1.getText().toString()+"\n"+text2.getText().toString());

                        }
                });
        }
}