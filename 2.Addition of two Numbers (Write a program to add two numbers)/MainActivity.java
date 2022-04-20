package com.shaheerz.allinone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;

import org.w3c.dom.Text;


public class MainActivity extends AppCompatActivity {
    Button btOne;
    EditText etOne,etTwo;
    TextView tvOne;
    double numOne,numTwo,result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btOne = findViewById(R.id.btOne);
        etTwo = findViewById(R.id.etTwo);
        etOne = findViewById(R.id.etOne);
        tvOne = findViewById(R.id.tvOne);
        btOne.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                numOne = Double.parseDouble(etOne.getText().toString());
                numTwo = Double.parseDouble(etTwo.getText().toString());
                result = numOne + numTwo;
                tvOne.setText(Double.toString(result));

            }
        });



    }
}
