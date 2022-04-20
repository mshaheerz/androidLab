package com.shaheerz.allinone;

import android.os.Bundle;
import android.content.Intent;
import android.net.Uri;
import android.provider.MediaStore;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import java.net.URL;

public class MainActivity extends AppCompatActivity {

        Uri imgurl;
        ImageView imageView;
        @Override
        protected void onActivityResult(int requestCode, int resultCode, Intent data) { super.onActivityResult(requestCode, resultCode, data); if(resultCode==RESULT_OK && requestCode==100){
                imgurl=data.getData();
                imageView.setImageURI(imgurl);
        }
        }
        @Override
        protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_main);
                imageView=(ImageView)findViewById(R.id.imgview);
                Button btnChooseImg=(Button)findViewById(R.id.btn_selectimage);
                btnChooseImg.setOnClickListener(new View.OnClickListener() {
                        @Override
                public void onClick(View v) {
                        Intent intentgallery=new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.INTERNAL_CONTENT_URI);
                        startActivityForResult(intentgallery,100);
                }
                });
        }
}
