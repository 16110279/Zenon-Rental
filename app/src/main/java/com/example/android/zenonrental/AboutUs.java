package com.example.android.zenonrental;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class AboutUs extends AppCompatActivity {

ImageView fb, ig, yt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aus);

        fb = findViewById(R.id.fb);
        yt = findViewById(R.id.yt);
        ig = findViewById(R.id.ig);

        fb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent fb = new Intent(AboutUs.this, AUfbActivity.class);
                startActivity(fb);
              }
        });

        yt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent yt = new Intent(AboutUs.this, AUytActivity.class);
                startActivity(yt);
            }
        });

        ig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ig = new Intent(AboutUs.this, AUigActivity.class);
                startActivity(ig);
            }
        });

    }
}