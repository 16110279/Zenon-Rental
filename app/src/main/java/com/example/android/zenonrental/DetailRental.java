package com.example.android.zenonrental;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailRental extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailrental);

        Intent nilai1 = getIntent();

        final int hasil = Integer.parseInt(nilai1.getExtras().getString("hasil"));
        final String nama = nilai1.getExtras().getString("nama");
        final  String jumlah = nilai1.getExtras().getString("jml");
        final  String hari = nilai1.getExtras().getString("hari");

        TextView rental = findViewById(R.id.tvTmp);
        rental.setText("Perkiraan biaya untuk menyewa " +jumlah +" item " +nama   +", selama " +hari  +" hari di Zenon Rental Jogja adalah Rp." +hasil);




    }}
