package com.example.android.zenonrental;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

      android.support.v7.widget.CardView prosedur, lenscatalog, btnAZenon, btnAus, camera, etc, pricelist, btnTOS, btnFAQ, btnRegister;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lenscatalog = findViewById(R.id.lvLensa);
        lenscatalog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent openLenspage = new Intent(MainActivity.this, LensaActivity.class);
                startActivity(openLenspage);
            }
        });


        camera = findViewById(R.id.btnMCamera);
        camera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent camera = new Intent(MainActivity.this, CameraActivity.class);
                startActivity(camera);
            }
        });

        prosedur = findViewById(R.id.prosedurSewa);
        prosedur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sewa = new Intent(MainActivity.this, Sewa.class);
                startActivity(sewa);
            }
            });


        btnAZenon = findViewById(R.id.btnAZenon);
        btnAZenon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent aboutz = new Intent(MainActivity.this, AboutZenonActivity.class);
                startActivity(aboutz);

            }
        });

        etc = findViewById(R.id.btnMetc);
        etc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent etcz = new Intent(MainActivity.this, EtcActivity.class);
                startActivity(etcz);
            }
        });

       btnAus = findViewById(R.id.btnAus);
       btnAus.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent abouts = new Intent(MainActivity.this, AboutUs.class);
               startActivity(abouts);
           }
       });

        pricelist = findViewById(R.id.btnPricelist);
        pricelist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent v = new Intent(MainActivity.this, PricelistActivity.class);
                startActivity(v);
            }
        });


        btnTOS = findViewById(R.id.btnTOS);
        btnTOS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent t = new Intent(MainActivity.this, TosActivity.class);
                startActivity(t);
            }
        });

        btnFAQ = findViewById(R.id.btnFAQ);
        btnFAQ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent f = new Intent(MainActivity.this, FaqActivity.class);
                startActivity(f);
            }
        });

        btnRegister = findViewById(R.id.btnRegister);
        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent r = new Intent(MainActivity.this, JadilahmemberActivity.class);
                startActivity(r);
            }
        });

    }

}