package com.example.android.zenonrental;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class CameraActivity extends AppCompatActivity {
    ListView lvZenonRentalJogja;
    String[] cameraList;
    String[] cameraKeterangan;
    int[] cameraHarga;
    int[] cameraImage;

    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lensa);
        lvZenonRentalJogja = findViewById(R.id.lvZenonRentalJogja);

        cameraList = new String[]{
                "Canon 5D mark III",
                "Canon 6D",
                "Canon 5D mark II ",
                "Canon 60D ",
                "Canon 700D ",
                "Sony A5100 + 16-50mm",
                "Sony A6300",
                "Sony A7S ",

        };

        cameraHarga = new int[]{
                300000,
                250000,
                200000,
                100000,
                50000,

                100000,
                200000,
                300000

        };
        cameraKeterangan = new String[] {
                "SD Card 32GB x2, Battery x2, Charger",
                "SD Card 32GB x2, Battery x2, Charger",
                "SD Card 32GB x2, Battery x2, Charger",
                "SD Card 32GB x2, Battery x2, Charger",
                "SD Card 32GB x2, Battery x2, Charger",
                "SDXC 64GB+16GB, Battery x3, Charger",
                "SDXC 64GB+32GB, Battery x3,Charger, EF-E Converter",
                "SDXC 64GB+32GB, Battery x3,Charger, EF-E Converter"



        };
        cameraImage = new int[]{R.drawable.homecamera,
                R.drawable.homecamera,
                R.drawable.homecamera,
                R.drawable.homecamera,
                R.drawable.homecamera,
                R.drawable.homecamera,
                R.drawable.homecamera,
                R.drawable.homecamera,
                R.drawable.homecamera
              };




        MyListAdapter adapter = new MyListAdapter(this, cameraList, cameraHarga, cameraImage, cameraKeterangan);
        lvZenonRentalJogja.setAdapter(adapter);



        lvZenonRentalJogja.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Intent intent = new Intent(CameraActivity.this, DetailActivity.class);
                intent.putExtra("nama", cameraList[i] + "");
                intent.putExtra("harga", cameraHarga[i] + "");
                intent.putExtra("gambar", cameraImage[i] + "");
                intent.putExtra("keterangan", cameraKeterangan[i] +"");
                startActivity(intent);

            }
        });




    }




}