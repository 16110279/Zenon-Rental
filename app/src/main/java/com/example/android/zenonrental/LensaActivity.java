package com.example.android.zenonrental;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class LensaActivity extends AppCompatActivity {
    ListView lvZenonRentalJogja;
    String[] lensList;
    String[] lensKeterangan;
    int[] lensHarga;
    int[] lensImage;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lensa);
        lvZenonRentalJogja = findViewById(R.id.lvZenonRentalJogja);

        lensList = new String[]{

                "Canon EF 35mm F/1.4 L",
                "Canon EF 50mm  F/1.2 L",
                "Canon EF 50mm f/1.4",
                "Canon EF 85mm  F/1.2 L II",
                "Canon EF 85mm F/1.8",
                "Canon EF 100mm F/2.8 L Macro IS",
                "Canon EF 16-35mm F/2.8 L II ",
                "Canon EF 17-40mm F/4.0 L",
                "Canon EF 24-70mm F/2.8 L",
                "Canon EF 24-105mm F/4 L IS",
                "Canon EF 70-200mm F/2.8 L IS",
                "Canon EF 70-200mm F/2.8 L IS II",
                "Sony Zeiss FE 24-70mm F/4 ZA OSS",
                "Sony FE 70-200mm F/4 G OSS",
                "Sony E 50mm F/1.8 OSS",
                "Sony E 18-105mm F/4 G PZ OSS"

        };

        lensHarga = new int[]{100000, 100000,25000, 100000, 25000,75000, 100000, 75000, 100000, 75000, 100000, 100000, 125000,125000,50000,75000};
        lensKeterangan = new String[] {

                        "CANON FIX LENS (FULL FRAME)",
                        "CANON FIX LENS (FULL FRAME)",
                        "CANON FIX LENS (FULL FRAME)",
                        "CANON FIX LENS (FULL FRAME)",
                        "CANON FIX LENS (FULL FRAME)",
                        "CANON FIX LENS (FULL FRAME)",
                        "CANON ZOOM LENS (FULL FRAME)",
                        "CANON ZOOM LENS (FULL FRAME)",
                        "CANON ZOOM LENS (FULL FRAME)",
                        "CANON ZOOM LENS (FULL FRAME)",
                        "CANON ZOOM LENS (FULL FRAME)",
                        "CANON ZOOM LENS (FULL FRAME)",
                        "SONY FE LENS (FULL FRAME)",
                        "SONY FE LENS (FULL FRAME)",
                        "SONY E LENS (APS-C)",
                        "SONY E LENS (APS-C)"


        };
        lensImage = new int[]{R.drawable.l1,
                R.drawable.l2,
                R.drawable.l3,
                R.drawable.l4,
                R.drawable.l5,
                R.drawable.l6,
                R.drawable.l7,
                R.drawable.l8,
                R.drawable.l9,
                R.drawable.l10,
                R.drawable.l11,
                R.drawable.l12,
                R.drawable.l13,
                R.drawable.l14,
                R.drawable.l15
           };




        MyListAdapter adapter = new MyListAdapter(this, lensList, lensHarga, lensImage, lensKeterangan);
        lvZenonRentalJogja.setAdapter(adapter);






    }




}