package com.example.android.zenonrental;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class EtcActivity extends AppCompatActivity {
    ListView lvZenonRentalJogja;
    String[] etcList;
    String[] etcKeterangan;
    int[] etcHarga;
    int[] etcImage;

    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lensa);
        lvZenonRentalJogja = findViewById(R.id.lvZenonRentalJogja);

        etcList = new String[]{
                "Zhiyun-Tech Crane v2",
                "Slider : Konova 80cm ",
                "Stabilizer : Glidecam HD2000",
                "Mic On-Camera Rode GO",
                "Mic Wireless : Clip On Sennheiser EW112-P G3",
                "Tripod : Manfrotto 055xprob + Head 701/MVH500AH",
                "Tripod :  Benro A2573FS4 / A2980F-S4",
                "Monopod : Benro A48TBS4",
                "Monopod : Manfrotto XPRO 500US",
                "Audio Recorder H4N", "Tripod : Beike 666"


        };

        etcHarga = new int[]{
                125000,
                50000,
                75000,
                10000,
                50000,
                25000,
                25000,
                25000,
                25000,
                50000,
                10000
        };
        etcKeterangan = new String[] {


                "Battery, Charger, Adapter", "Tripod, Head Video", "", "","Transmitter,Receiver,microphone lavalier,battery x4", "","","","","SD card 4gb, audio cable fullset",""

        };
        etcImage = new int[]{R.drawable.homelighting,
                R.drawable.homelighting,
                R.drawable.homelighting,
                R.drawable.homelighting,
                R.drawable.homelighting,
                R.drawable.homelighting,R.drawable.homelighting,
                R.drawable.homelighting,
                R.drawable.homelighting,
                R.drawable.homelighting,
                R.drawable.homelighting


              };




        MyListAdapter adapter = new MyListAdapter(this, etcList, etcHarga, etcImage, etcKeterangan);
        lvZenonRentalJogja.setAdapter(adapter);



        lvZenonRentalJogja.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Intent intent = new Intent(EtcActivity.this, DetailActivity.class);
                intent.putExtra("nama", etcList[i] + "");
                intent.putExtra("harga", etcHarga[i] + "");
                intent.putExtra("gambar", etcImage[i] + "");
                intent.putExtra("keterangan", etcKeterangan[i] +"");
                startActivity(intent);

            }
        });




    }




}