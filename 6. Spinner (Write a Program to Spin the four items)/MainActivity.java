package com.shaheerz.allinone;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends Activity implements AdapterView.OnItemSelectedListener {
        TextView selection;
        String[] items = { "select", "COMPUTER", "MOUSE", "KEYBORD", "MONITOR",
        "HARD DISK", "LAPTOP", "PRINTER", "SCANNER", "SPEAKER" };

@Override
public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.activity_main);
        selection = (TextView) findViewById(R.id.selection);

        Spinner spin = (Spinner) findViewById(R.id.spinner);
        spin.setOnItemSelectedListener(this);

        ArrayAdapter aa = new ArrayAdapter(this,android.R.layout.simple_spinner_item,items);

        aa.setDropDownViewResource(
        android.R.layout.simple_spinner_dropdown_item);
        spin.setAdapter(aa);
        }

public void onItemSelected(AdapterView<?> parent, View v, int position,
        long id) {
        selection.setText(items[position]);
        }

public void onNothingSelected(AdapterView<?> parent) {
        selection.setText("");
        }
        }//class
