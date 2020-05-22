package com.example.tomjerry;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView imageView1, imageView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView1 = (ImageView) findViewById(R.id.imgV1);
        imageView2 = (ImageView) findViewById(R.id.imgV2);

        imageView1.setOnClickListener(this);
        imageView2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.imgV1:
                Intent obj1 = new Intent(MainActivity.this, SecondActivity.class);
                obj1.putExtra("name", "Tom");
                obj1.putExtra("Mesg", "He is buddy of Jerry");
                startActivity(obj1);
                break;

            case R.id.imgV2:
                Intent obj2 = new Intent(MainActivity.this, SecondActivity.class);
                obj2.putExtra("name", "Jerry");
                obj2.putExtra("Mesg", "He is Smart...!!");
                startActivity(obj2);
                break;
        }

    }
}
