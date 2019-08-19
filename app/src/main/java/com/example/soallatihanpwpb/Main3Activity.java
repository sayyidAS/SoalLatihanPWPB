package com.example.soallatihanpwpb;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {
    public static String NAMA_EXTRA = "default",ALAMAT_EXTRA = "aaa",PESANAN_EXTRA = "ghghg";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        String nama = getIntent().getStringExtra(NAMA_EXTRA);
        String alamat = getIntent().getStringExtra(ALAMAT_EXTRA);
        String pesanan = getIntent().getStringExtra(PESANAN_EXTRA);

        TextView Tnama = findViewById(R.id.textView6);
        TextView Talamat = findViewById(R.id.textView7);
        TextView Tpesanan = findViewById(R.id.textView8);

        Tnama.setText(nama);
        Talamat.setText(alamat);
        Tpesanan.setText(pesanan);
    }
}
