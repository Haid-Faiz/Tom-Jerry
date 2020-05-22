package com.example.tomjerry;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Comparator;

public class SecondActivity extends AppCompatActivity {

    TextView  textView, textView2;
    ImageView imgView;
    String str1, str2;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        imgView= (ImageView) findViewById(R.id.imgView1);
        textView = (TextView) findViewById(R.id.tv1);
        textView2 = (TextView) findViewById(R.id.tv2);
        button = (Button) findViewById(R.id.btn0);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


        Bundle kabara = getIntent().getExtras();

        if (kabara != null){
            str1 = kabara.getString("name");
            str2 = kabara.getString("Mesg");
        }

        if (str1.equals("Tom")){
            textView.setText(str1);
            textView2.setText(str2);
            imgView.setImageDrawable(getResources().getDrawable(R.drawable.tom1));
        }
        else{
            textView.setText(str1);
            textView2.setText(str2);
            imgView.setImageDrawable(getResources().getDrawable(R.drawable.jerry2));
        }
    }
}
