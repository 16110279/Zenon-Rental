package com.example.android.zenonrental;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class DetailActivity extends AppCompatActivity {
    Button rent;
    EditText day, banyak ;
    TextView tvTampil;
    int a, b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detaillensa);


        banyak = findViewById(R.id.etLBanyakItem);
        rent = findViewById(R.id.btnLHitung);
        day = findViewById(R.id.btnLRentD);
        tvTampil = findViewById(R.id.tvTampil);


        a = 1;


        Intent intent = getIntent();
        final String nama = intent.getExtras().getString("nama");
        final int harga = Integer.parseInt(intent.getExtras().getString("harga"));

        final int gambar = Integer.parseInt(intent.getExtras().getString("gambar"));
        String keterangan = intent.getExtras().getString("Keterangan");
        final ImageView imgLGambar = findViewById(R.id.imgL);
        TextView tvLharga = findViewById(R.id.tvLHarga);
        TextView tvLNama = findViewById(R.id.tvLNama);

        imgLGambar.setImageResource(gambar);
        tvLNama.setText(nama);
        tvLharga.setText("Rp. " + harga +" /hari");

        tvTampil.setText(String.valueOf(harga));
        final   int b = harga+1-1;



        rent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                int hari = Integer.valueOf(day.getText().toString()).intValue();
                int jml = Integer.valueOf(banyak.getText().toString()).intValue();

                    Integer hasil = hari*b*jml;
                    Intent nilai1 = new Intent(DetailActivity.this, DetailRental.class);
                    nilai1.putExtra("hasil", hasil + "");
                    nilai1.putExtra("nama", nama +"");
                    nilai1.putExtra("hari", hari +"");
                    nilai1.putExtra("jml", jml + "");
                    startActivity(nilai1);


            }
        });

}
}




